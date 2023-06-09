package com.revolvingmadness.mclang;


import com.revolvingmadness.mclang.builtins.MathLibrary;
import com.revolvingmadness.mclang.builtins.StdioLibrary;
import com.revolvingmadness.mclang.types.*;
import generated.MCLangBaseVisitor;
import generated.MCLangLexer;
import generated.MCLangParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.*;

public class MCLangVisitor extends MCLangBaseVisitor<Type> {
	Stack<List<Variable>> variableScopes = new Stack<>();
	List<String> dataTypes = List.of("bool", "dict", "float", "func", "int", "list", "null", "number", "str");
	List<String> keywords = List.of("this");
	Type functionReturnValue = new NullType();
	Stack<ClassType> workingClasses = new Stack<>();
	Map<String, ClassType> builtins = new HashMap<>();
	
	public MCLangVisitor() {
		List<Variable> variables = new ArrayList<>();
		variableScopes.push(variables);
		
		ClassType stdioLibrary = new ClassType("stdio");
		stdioLibrary.assignMember("print", new FunctionType("print", List.of(StringType.class), NullType.class, StdioLibrary.class));
		stdioLibrary.assignMember("input", new FunctionType("input", List.of(StringType.class), StringType.class, StdioLibrary.class));
		builtins.put("stdio", stdioLibrary);
		
		ClassType mathLibrary = new ClassType("math");
		mathLibrary.assignMember("abs", new FunctionType("abs", List.of(NumberType.class), NumberType.class, MathLibrary.class));
		mathLibrary.assignMember("max", new FunctionType("max", List.of(NumberType.class, NumberType.class), NumberType.class, MathLibrary.class));
		mathLibrary.assignMember("min", new FunctionType("min", List.of(NumberType.class, NumberType.class), NumberType.class, MathLibrary.class));
		mathLibrary.assignMember("PI", new FloatType(Math.PI));
		builtins.put("math", mathLibrary);
	}
	
	@Override
	public Type visitNumberExpression(MCLangParser.NumberExpressionContext context) {
		return NumberType.parseNumber(context.getText());
	}
	
	@Override
	public Type visitStringExpression(MCLangParser.StringExpressionContext context) {
		String wholeString = context.STRING().getText();
		return new StringType(wholeString.substring(1, wholeString.length() - 1));
	}
	
	@Override
	public Type visitBooleanExpression(MCLangParser.BooleanExpressionContext context) {
		return BooleanType.getBoolean(context.BOOLEAN().getText());
	}
	
	@Override
	public Type visitIdentifierExpression(MCLangParser.IdentifierExpressionContext context) {
		return visitPropertyClassMemberAccess(context.propertyClassMemberAccess());
	}
	
	@Override
	public Type visitNullExpression(MCLangParser.NullExpressionContext context) {
		return new NullType();
	}
	
	@Override
	public Type visitParenthesisExpression(MCLangParser.ParenthesisExpressionContext context) {
		return visit(context.expr());
	}
	
	@Override
	public Type visitExponentiationExpression(MCLangParser.ExponentiationExpressionContext context) {
		Type left = visit(context.expr(0));
		Type right = visit(context.expr(1));
		
		return left.exponentiate(right);
	}
	
	@Override
	public Type visitMultiplyExpression(MCLangParser.MultiplyExpressionContext context) {
		Type left = visit(context.expr(0));
		Type right = visit(context.expr(1));
		
		if (StringType.isStringMultiplication(left, right))
			return StringType.multiply(left, right);
		
		return left.multiply(right);
	}
	
	@Override
	public Type visitDivideExpression(MCLangParser.DivideExpressionContext context) {
		Type left = visit(context.expr(0));
		Type right = visit(context.expr(1));
		
		return left.divide(right);
	}
	
	@Override
	public Type visitFloorDivideExpression(MCLangParser.FloorDivideExpressionContext context) {
		Type left = visit(context.expr(0));
		Type right = visit(context.expr(1));
		
		return left.floorDivide(right);
	}
	
	@Override
	public Type visitModuloExpression(MCLangParser.ModuloExpressionContext context) {
		Type left = visit(context.expr(0));
		Type right = visit(context.expr(1));
		
		return left.modulo(right);
	}
	
	@Override
	public Type visitAddExpression(MCLangParser.AddExpressionContext context) {
		Type left = visit(context.expr(0));
		Type right = visit(context.expr(1));
		
		return left.add(right);
	}
	
	@Override
	public Type visitSubtractExpression(MCLangParser.SubtractExpressionContext context) {
		Type left = visit(context.expr(0));
		Type right = visit(context.expr(1));
		
		return left.subtract(right);
	}
	
	@Override
	public Type visitLessThanExpression(MCLangParser.LessThanExpressionContext context) {
		Type left = visit(context.expr(0));
		Type right = visit(context.expr(1));
		
		return left.lessThan(right);
	}
	
	@Override
	public Type visitLessThanOrEqualToExpression(MCLangParser.LessThanOrEqualToExpressionContext context) {
		Type left = visit(context.expr(0));
		Type right = visit(context.expr(1));
		
		return left.lessThanOrEqualTo(right);
		
	}
	
	@Override
	public Type visitGreaterThanExpression(MCLangParser.GreaterThanExpressionContext context) {
		Type left = visit(context.expr(0));
		Type right = visit(context.expr(1));
		
		return left.greaterThan(right);
		
	}
	
	@Override
	public Type visitGreaterThanOrEqualToExpression(MCLangParser.GreaterThanOrEqualToExpressionContext context) {
		Type left = visit(context.expr(0));
		Type right = visit(context.expr(1));
		
		return left.greaterThanOrEqualTo(right);
		
	}
	
	@Override
	public Type visitNotEqualToExpression(MCLangParser.NotEqualToExpressionContext context) {
		Type left = visit(context.expr(0));
		Type right = visit(context.expr(1));
		
		return new BooleanType(!left.equals(right));
	}
	
	@Override
	public Type visitEqualToExpression(MCLangParser.EqualToExpressionContext context) {
		Type left = visit(context.expr(0));
		Type right = visit(context.expr(1));
		
		return new BooleanType(left.equals(right));
	}
	
	@Override
	public Type visitBitwiseAndExpression(MCLangParser.BitwiseAndExpressionContext context) {
		Type left = visit(context.expr(0));
		Type right = visit(context.expr(1));
		
		return left.bitwiseAnd(right);
	}
	
	@Override
	public Type visitBooleanAndExpression(MCLangParser.BooleanAndExpressionContext context) {
		Type left = visit(context.expr(0));
		Type right = visit(context.expr(1));
		
		return left.booleanAnd(right);
	}
	
	@Override
	public Type visitBitwiseXorExpression(MCLangParser.BitwiseXorExpressionContext context) {
		Type left = visit(context.expr(0));
		Type right = visit(context.expr(1));
		
		return left.bitwiseXor(right);
	}
	
	@Override
	public Type visitBitwiseOrExpression(MCLangParser.BitwiseOrExpressionContext context) {
		Type left = visit(context.expr(0));
		Type right = visit(context.expr(1));
		
		return left.bitwiseOr(right);
	}
	
	@Override
	public Type visitBooleanOrExpression(MCLangParser.BooleanOrExpressionContext context) {
		Type left = visit(context.expr(0));
		Type right = visit(context.expr(1));
		
		return left.booleanOr(right);
	}
	
	@Override
	public Type visitBooleanNotExpression(MCLangParser.BooleanNotExpressionContext context) {
		Type input = visit(context.expr());
		
		return input.booleanNot();
	}
	
	@Override
	public Type visitWalrusOperatorExpression(MCLangParser.WalrusOperatorExpressionContext context) {
		String name = context.propertyClassMemberAccess().getText();
		Type value = visit(context.expr());
		assignVariable(name, value, value.type);
		
		return value;
	}
	
	@Override
	public Type visitRegularVariableAssignment(MCLangParser.RegularVariableAssignmentContext context) {
		boolean hasType = context.IDENTIFIER() != null;
		// Get the type of the variable
		Class<? extends Type> type = null;
		String name;
		
		if (hasType) {
			type = Type.of(context.IDENTIFIER().getText());
		}
		
		name = context.propertyClassMemberAccess().getText();
		
		// Check if the variable name is a reserved keyword
		if (dataTypes.contains(name) || keywords.contains(name)) {
			throw new RuntimeException("Variable name cannot be named '" + name + "'");
		}
		
		// Get the value of the expression assigned to the variable
		Type value = visit(context.expr());
		
		// Check if the assigned value has the correct data type
		if (type != null && !type.isInstance(value)) {
			throw new RuntimeException("Invalid data type (got '" + value.typeName + "', expected '" + type.getSimpleName() + "')");
		}
		
		// Assign the value to the variable
		assignVariable(name, value, type);
		
		return null;
	}
	
	@Override
	public Type visitExponentiationVariableAssignment(MCLangParser.ExponentiationVariableAssignmentContext context) {
		String name = context.propertyClassMemberAccess().getText();
		Type oldValue = getVariable(name).value;
		Type newValue = visit(context.expr());
		
		assignVariable(name, oldValue.exponentiate(newValue), oldValue.type);
		
		return null;
	}
	
	@Override
	public Type visitMultiplyVariableAssignment(MCLangParser.MultiplyVariableAssignmentContext context) {
		String name = context.propertyClassMemberAccess().getText();
		Type oldValue = getVariable(name).value;
		Type newValue = visit(context.expr());
		
		assignVariable(name, oldValue.multiply(newValue), oldValue.type);
		
		return null;
	}
	
	@Override
	public Type visitDivideVariableAssignment(MCLangParser.DivideVariableAssignmentContext context) {
		String name = context.propertyClassMemberAccess().getText();
		Type oldValue = getVariable(name).value;
		Type newValue = visit(context.expr());
		
		assignVariable(name, oldValue.divide(newValue), oldValue.type);
		
		return null;
	}
	
	@Override
	public Type visitFloorDivideVariableAssignment(MCLangParser.FloorDivideVariableAssignmentContext context) {
		String name = context.propertyClassMemberAccess().getText();
		Type oldValue = getVariable(name).value;
		Type newValue = visit(context.expr());
		
		assignVariable(name, oldValue.floorDivide(newValue), oldValue.type);
		
		return null;
	}
	
	@Override
	public Type visitModuloVariableAssignment(MCLangParser.ModuloVariableAssignmentContext context) {
		String name = context.propertyClassMemberAccess().getText();
		Type oldValue = getVariable(name).value;
		Type newValue = visit(context.expr());
		
		assignVariable(name, oldValue.modulo(newValue), oldValue.type);
		
		return null;
	}
	
	@Override
	public Type visitAddVariableAssignment(MCLangParser.AddVariableAssignmentContext context) {
		String name = context.propertyClassMemberAccess().getText();
		Type oldValue = getVariable(name).value;
		Type newValue = visit(context.expr());
		
		assignVariable(name, oldValue.add(newValue), oldValue.type);
		
		return null;
	}
	
	@Override
	public Type visitIncrementVariableAssignment(MCLangParser.IncrementVariableAssignmentContext context) {
		String name = context.propertyClassMemberAccess().getText();
		
		Type value = getVariable(name).value.increment();
		
		assignVariable(name, value, value.type);
		
		return value;
	}
	
	@Override
	public Type visitSubtractVariableAssignment(MCLangParser.SubtractVariableAssignmentContext context) {
		String name = context.propertyClassMemberAccess().getText();
		Type oldValue = getVariable(name).value;
		Type newValue = visit(context.expr());
		
		assignVariable(name, oldValue.subtract(newValue), oldValue.type);
		
		return null;
	}
	
	@Override
	public Type visitBitwiseAndVariableAssignment(MCLangParser.BitwiseAndVariableAssignmentContext context) {
		String name = context.propertyClassMemberAccess().getText();
		Type oldValue = getVariable(name).value;
		Type newValue = visit(context.expr());
		
		assignVariable(name, oldValue.bitwiseAnd(newValue), oldValue.type);
		
		return null;
	}
	
	@Override
	public Type visitBitwiseXorVariableAssignment(MCLangParser.BitwiseXorVariableAssignmentContext context) {
		String name = context.propertyClassMemberAccess().getText();
		Type oldValue = getVariable(name).value;
		Type newValue = visit(context.expr());
		
		assignVariable(name, oldValue.bitwiseXor(newValue), oldValue.type);
		
		return null;
	}
	
	@Override
	public Type visitBitwiseOrVariableAssignment(MCLangParser.BitwiseOrVariableAssignmentContext context) {
		String name = context.propertyClassMemberAccess().getText();
		Type oldValue = getVariable(name).value;
		Type newValue = visit(context.expr());
		
		assignVariable(name, oldValue.bitwiseOr(newValue), oldValue.type);
		
		return null;
	}
	
	@Override
	public Type visitList(MCLangParser.ListContext context) {
		List<Type> list = new ArrayList<>();
		context.expr().forEach(context1 -> list.add(visit(context1)));
		
		return new ListType(list);
	}
	
	@Override
	public Type visitDict(MCLangParser.DictContext context) {
		List<MCLangParser.ExprContext> expressions = context.expr();
		
		HashMap<StringType, Type> dict = new HashMap<>();
		
		for (int index = 0; index < expressions.size(); index++) {
			String wholeString = context.STRING(index).getText();
			StringType key = new StringType(wholeString.substring(1, wholeString.length() - 1));
			Type value = visit(expressions.get(index));
			
			dict.put(key, value);
		}
		
		return new DictType(dict);
	}
	
	@Override
	public Type visitIfStatement(MCLangParser.IfStatementContext context) {
		BooleanType cond = BooleanType.valueOf(visit(context.expr()));
		if (cond.value)
			visitBody(context.body(0));
		else if (context.body(1) != null)
			visitBody(context.body(1));
		
		return null;
	}
	
	@Override
	public Type visitWhileStatement(MCLangParser.WhileStatementContext context) {
		while (BooleanType.valueOf(visit(context.expr())).value) {
			visitBody(context.body());
		}
		
		return null;
	}
	
	@Override
	public Type visitFunctionCall(MCLangParser.FunctionCallContext context) {
		Type variable = visitPropertyClassMemberAccess(context.propertyClassMemberAccess());
		
		// Check if the variable is actually a function
		if (!(variable instanceof FunctionType function)) {
			throw new RuntimeException("Variable '" + context.propertyClassMemberAccess().getText() + "' is not a function");
		}
		
		// Create a new scope for the function variables
		List<Variable> functionVariables = new ArrayList<>();
		if (function.clazz != null) {
			functionVariables.addAll(function.clazz.variables);
		}
		variableScopes.push(functionVariables);
		
		// Process the function call arguments
		List<Type> functionCallArguments = getExprArguments(context.exprArgument());
		
		// Check if the number of arguments matches the function's expected number of arguments
		if (function.runnableBody == null) {
			if (function.arguments.size() != functionCallArguments.size()) {
				throw new RuntimeException("Invalid number of arguments for function '" + function.name + "' (got " + functionCallArguments.size() + ", expected " + function.arguments.size() + ")");
			}
			
			// Bind the function call arguments to the function variables
			for (int i = 0; i < context.exprArgument().size(); i++) {
				String actualName = function.arguments.keySet().stream().toList().get(i);
				Type actualValue = functionCallArguments.get(i);
				Class<? extends Type> expectedType = function.arguments.get(actualName);
				
				if (expectedType != null && !expectedType.isInstance(actualValue))
					throw new RuntimeException("Invalid data type (got '" + actualValue.typeName + "', expected '" + expectedType.getSimpleName() + "')");
				assignVariable(actualName, actualValue, null);
			}
		}
		
		// Execute the function body statements if available
		if (function.body != null) {
			for (MCLangParser.StatementContext statement : function.body) {
				visit(statement);
				
				// Break the loop if a non-null function return value is encountered
				if (!Objects.equals(functionReturnValue, new NullType())) {
					break;
				}
			}
		} else if (function.shorthandBody != null) {
			functionReturnValue = visit(function.shorthandBody);
		} else {
			try {
				functionReturnValue = (Type) function.runnableBody.invoke(this, functionCallArguments.toArray());
			} catch (Exception e) {
				e.printStackTrace();
				System.exit(-1);
			}
		}
		
		// Retrieve the return value of the function
		Type returnValue = functionReturnValue;
		
		// Remove the function variable scope
		if (function.clazz != null) {
			function.clazz.variables = variableScopes.pop();
		} else {
			variableScopes.pop();
		}
		
		// Reset the function return value to null
		functionReturnValue = new NullType();
		
		if (function.returnType != NullType.class && !function.returnType.isInstance(returnValue))
			throw new RuntimeException("Invalid data type (got '" + returnValue.typeName + "', expected '" + function.returnType.getSimpleName() + "')");
		
		return returnValue;
	}
	
	@Override
	public Type visitFunctionDeclarationStatement(MCLangParser.FunctionDeclarationStatementContext context) {
		String name = context.IDENTIFIER(0).getText();
		boolean hasType = context.IDENTIFIER().size() == 2;
		Class<? extends Type> returnType = NullType.class;
		if (hasType)
			returnType = Type.of(context.IDENTIFIER(1).getText());
		Map<String, Class<? extends Type>> arguments = getIdentifierArguments(context.identifierArgument());
		
		FunctionType function = null;
		ClassType clazz = null;
		
		if (!workingClasses.isEmpty()) {
			clazz = workingClasses.lastElement();
		}
		
		if (context.body() != null) {
			function = new FunctionType(name, arguments, returnType, clazz, context.body());
		}
		
		if (context.expr() != null) {
			function = new FunctionType(name, arguments, returnType, clazz, context.expr());
		}
		
		if (!workingClasses.isEmpty()) {
			workingClasses.lastElement().variables.add(new Variable(name, function, FunctionType.class));
		} else {
			assignVariable(name, function, FunctionType.class);
		}
		
		return null;
	}
	
	@Override
	public Type visitFunctionDeclarationExpression(MCLangParser.FunctionDeclarationExpressionContext context) {
		return visitVariableFunctionDeclaration(context.variableFunctionDeclaration());
	}
	
	@Override
	public Type visitVariableFunctionDeclaration(MCLangParser.VariableFunctionDeclarationContext context) {
		boolean hasType = context.IDENTIFIER() != null;
		Class<? extends Type> returnType = NullType.class;
		if (hasType)
			returnType = Type.of(context.IDENTIFIER().getText());
		Map<String, Class<? extends Type>> arguments = getIdentifierArguments(context.identifierArgument());
		
		FunctionType function = null;
		ClassType clazz = null;
		
		if (!workingClasses.isEmpty()) {
			clazz = workingClasses.lastElement();
		}
		
		if (context.body() != null) {
			function = new FunctionType("", arguments, returnType, clazz, context.body());
		}
		
		if (context.expr() != null) {
			function = new FunctionType("", arguments, returnType, clazz, context.expr());
		}
		
		return function;
	}
	
	@Override
	public Type visitClassDeclarationStatement(MCLangParser.ClassDeclarationStatementContext context) {
		String name = context.IDENTIFIER().getText();
		
		workingClasses.push(new ClassType(name));
		visitBody(context.body());
		ClassType workingClass = workingClasses.pop();
		
		assignVariable(name, workingClass, ClassType.class);
		return null;
	}
	
	@Override
	public Type visitClassInitExpression(MCLangParser.ClassInitExpressionContext context) {
		return visitClassInit(context.classInit());
	}
	
	@Override
	public Type visitClassInit(MCLangParser.ClassInitContext context) {
		String name = context.IDENTIFIER().getText();
		
		Type variable = getVariable(name).value;
		
		if (!(variable instanceof ClassType)) {
			throw new RuntimeException("Variable '" + name + "' is not a class");
		}
		
		ClassType clazz = new ClassType((ClassType) variable);
		
		List<Type> classInitArguments = getExprArguments(context.exprArgument());
		
		if (classInitArguments.size() > 0 && clazz.constructor == null) {
			throw new RuntimeException("Invalid number of arguments for class '" + name + "' (got " + classInitArguments.size() + ", expected 0)");
		}
		
		if (clazz.constructor != null && classInitArguments.size() != clazz.constructor.arguments.size()) {
			throw new RuntimeException("Invalid number of arguments for class '" + name + "' (got " + classInitArguments.size() + ", expected " + clazz.constructor.arguments.size() + ")");
		}
		
		if (clazz.constructor == null) {
			return clazz;
		}
		
		List<Variable> constructorVariables = new ArrayList<>(clazz.variables);
		variableScopes.push(constructorVariables);
		
		for (int i = 0; i < context.exprArgument().size(); i++) {
			String paramName = clazz.constructor.arguments.keySet().stream().toList().get(i);
			Type paramValue = classInitArguments.get(i);
			Class<? extends Type> expectedParamType = clazz.constructor.arguments.get(paramName);
			
			if (expectedParamType != null && !expectedParamType.isInstance(paramValue))
				throw new RuntimeException("Invalid data type (got '" + paramValue.typeName + "', expected '" + expectedParamType.getSimpleName() + "')");
			assignVariable(paramName, paramValue, null);
		}
		
		for (MCLangParser.StatementContext statement : clazz.constructor.body) {
			visit(statement);
			
			// Break the loop if a non-null function return value is encountered
			if (!Objects.equals(functionReturnValue, new NullType())) {
				break;
			}
		}
		
		
		clazz.variables = variableScopes.pop();
		
		return clazz;
	}
	
	@Override
	public Type visitClassConstructorStatement(MCLangParser.ClassConstructorStatementContext context) {
		if (workingClasses == null)
			throw new RuntimeException("Cannot use a class constructor outside a class");
		
		String name = context.IDENTIFIER().getText();
		
		workingClasses.lastElement().constructor = new FunctionType(name, getIdentifierArguments(context.identifierArgument()), NullType.class, workingClasses.lastElement(), context.body());
		
		return null;
	}
	
	@Override
	public Type visitPropertyClassMemberAccess(MCLangParser.PropertyClassMemberAccessContext context) {
		return getVariable(context.getText()).value;
	}
	
	public Map<String, Class<? extends Type>> getIdentifierArguments(List<MCLangParser.IdentifierArgumentContext> listContext) {
		Map<String, Class<? extends Type>> result = new LinkedHashMap<>();
		boolean hasType = false;
		for (MCLangParser.IdentifierArgumentContext context : listContext) {
			if (context.IDENTIFIER().size() == 2) {
				Class<? extends Type> type = Type.of(context.IDENTIFIER(0).getText());
				if (type == NullType.class)
					throw new RuntimeException("Parameter cannot be type 'null'");
				String name = context.IDENTIFIER(1).getText();
				if (dataTypes.contains(name)) {
					throw new RuntimeException("Parameter cannot be named '" + name + "'");
				}
				result.put(name, type);
				hasType = true;
			} else {
				result.put(context.IDENTIFIER(0).getText(), null);
			}
		}
		if (hasType) {
			for (Class<? extends Type> clazz : result.values()) {
				if (clazz == null) {
					throw new RuntimeException("All parameters have to have specified types if at least one other parameter has a specified type");
				}
			}
		}
		return result;
	}
	
	public List<Type> getExprArguments(List<MCLangParser.ExprArgumentContext> listContext) {
		List<Type> result = new ArrayList<>();
		listContext.forEach(context -> result.add(visit(context)));
		return result;
	}
	
	@Override
	public Type visitFunctionCallExpression(MCLangParser.FunctionCallExpressionContext context) {
		return visitFunctionCall(context.functionCall());
	}
	
	@Override
	public Type visitTernaryOperatorExpression(MCLangParser.TernaryOperatorExpressionContext context) {
		BooleanType cond = BooleanType.valueOf(visit(context.expr(0)));
		
		if (cond.value)
			return visit(context.expr(1));
		else
			return visit(context.expr(2));
	}
	
	@Override
	public Type visitUnaryOperatorExpression(MCLangParser.UnaryOperatorExpressionContext context) {
		Type input = visit(context.expr());
		
		return input.unary();
	}
	
	@Override
	public Type visitExprArgument(MCLangParser.ExprArgumentContext context) {
		return visit(context.expr());
	}
	
	@Override
	public Type visitIdentifierArgument(MCLangParser.IdentifierArgumentContext context) {
		if (context.IDENTIFIER().size() == 2)
			return visit(context.IDENTIFIER(1));
		return visit(context.IDENTIFIER(0));
	}
	
	@Override
	public Type visitReturnStatement(MCLangParser.ReturnStatementContext context) {
		functionReturnValue = visit(context.expr());
		return null;
	}
	
	public List<Variable> getVariablesFromFile(String fileName) {
		StringBuilder content = new StringBuilder();
		if (!fileName.endsWith(".mclang")) {
			fileName = fileName + ".mclang";
		}
		try {
			Files.readAllLines(Path.of(fileName)).forEach(content::append);
		} catch (IOException e) {
			if (e instanceof NoSuchFileException) {
				System.out.println("Cannot find file '" + fileName + "'");
				System.exit(-1);
			}
			e.printStackTrace();
			System.exit(-1);
		}
		if (!fileName.endsWith(".mclang")) {
			throw new RuntimeException("Import files must end with a .mclang extension");
		}
		
		MCLangLexer lexer = new MCLangLexer(CharStreams.fromString(content.toString()));
		MCLangParser parser = new MCLangParser(new CommonTokenStream(lexer));
		MCLangParser.ProgramContext program = parser.program();
		List<Variable> importVariables = new ArrayList<>();
		variableScopes.push(importVariables);
		visit(program);
		variableScopes.pop();
		
		return importVariables;
	}
	
	@Override
	public Type visitRegularImportStatement(MCLangParser.RegularImportStatementContext context) {
		String wholeName = context.STRING().toString();
		String fileName = wholeName.substring(1, wholeName.length() - 1);
		String name = context.IDENTIFIER().getText();
		ClassType importClass = new ClassType(name);
		importClass.variables = getVariablesFromFile(fileName);
		variableScopes.lastElement().add(new Variable(name, importClass, ClassType.class));
		
		return null;
	}
	
	@Override
	public Type visitBuiltinImportStatement(MCLangParser.BuiltinImportStatementContext context) {
		String wholeImportName = context.STRING().getText();
		String importName = wholeImportName.substring(1, wholeImportName.length() - 1);
		String name = context.IDENTIFIER().getText();
		if (builtins.containsKey(importName)) {
			assignVariable(name, builtins.get(importName), ClassType.class);
		}
		
		return null;
	}
	
	@Override
	public Type visitRegularImportFromStatement(MCLangParser.RegularImportFromStatementContext context) {
		String wholeFileName = context.STRING().toString();
		String fileName = wholeFileName.substring(1, wholeFileName.length() - 1);
		List<Variable> importedVariables = new ArrayList<>();
		List<String> items = new ArrayList<>();
		context.IDENTIFIER().forEach(identifierNode -> items.add(identifierNode.getText()));
		List<String> variableNames = items.stream().distinct().toList();
		List<Variable> variables = getVariablesFromFile(fileName);
		if (context.IDENTIFIER().size() != 0) {
			for (String variableName : variableNames) {
				Variable variable = getVariableFromList(variables, variableName);
				if (variable != null) {
					importedVariables.add(variable);
				} else {
					throw new RuntimeException("Variable '" + variableName + "' is not defined in file '" + fileName + "'");
				}
			}
		} else {
			importedVariables.addAll(variables);
		}
		
		variableScopes.lastElement().addAll(importedVariables);
		
		return null;
	}
	
	@Override
	public Type visitBuiltinImportFromStatement(MCLangParser.BuiltinImportFromStatementContext context) {
		String wholeLibraryName = context.STRING().toString();
		String libraryName = wholeLibraryName.substring(1, wholeLibraryName.length() - 1);
		
		List<String> allVariableNames = new ArrayList<>();
		context.IDENTIFIER().forEach(identifierNode -> allVariableNames.add(identifierNode.getText()));
		List<String> variableNames = allVariableNames.stream().distinct().toList();
		
		List<Variable> importedVariables = new ArrayList<>();
		
		ClassType library = builtins.get(libraryName);
		
		if (context.IDENTIFIER().size() != 0) {
			for (String variableName : variableNames) {
				Variable variable = library.getMember(variableName);
				if (variable != null) {
					importedVariables.add(variable);
				} else {
					throw new RuntimeException("Variable '" + variableName + "' is not in builtin library '" + libraryName + "'");
				}
			}
		} else {
			List<Variable> variables = library.variables;
			variables.remove(library.getMember("this"));
			importedVariables.addAll(variables);
		}
		
		variableScopes.lastElement().addAll(importedVariables);
		
		return null;
	}
	
	@Override
	public Type visitBody(MCLangParser.BodyContext context) {
		for (MCLangParser.StatementContext context1 : context.statement()) {
			visitStatement(context1);
		}
		return null;
	}
	
	public Variable getVariable(String name) {
		Variable variableToGet = null;
		for (List<Variable> variableScope : variableScopes) {
			Variable variable = getVariableFromList(variableScope, name);
			if (variable != null) {
				variableToGet = variable;
			}
		}
		
		if (variableToGet == null) {
			throw new RuntimeException("Variable '" + name + "' is not defined");
		}
		
		return variableToGet;
	}
	
	public static Variable getVariableFromList(List<Variable> variables, String name) {
		Variable variableToGet = null;
		boolean isProperty = name.contains(".");
		if (isProperty) {
			String[] allMembers = name.split("\\.");
			String[] members = Arrays.copyOfRange(allMembers, 1, allMembers.length);
			
			Variable currentVariable = getVariableFromList(variables, allMembers[0]);
			
			for (String member : members) {
				if (currentVariable == null) {
					return null;
				}
				
				currentVariable = currentVariable.value.getMember(member);
			}
			
			return currentVariable;
		}
		
		for (Variable variable : variables) {
			if (Objects.equals(variable.name, name)) {
				variableToGet = variable;
			}
		}
		
		return variableToGet;
	}
	
	public static Variable assignVariableFromList(List<Variable> variables, String name, Type value, Class<? extends Type> type) {
		Variable variableToAssign = null;
		boolean isProperty = name.contains(".");
		if (isProperty) {
			String[] allMembers = name.split("\\.");
			String[] members = Arrays.copyOfRange(allMembers, 1, allMembers.length);
			Variable variable = getVariableFromList(variables, allMembers[0]);
			String member = String.join(".", members);
			variables.add(variable.value.assignMember(member, value));
			return null;
		}
		
		for (Variable variable : variables) {
			if (Objects.equals(variable.name, name)) {
				variableToAssign = variable;
			}
		}
		
		if (variableToAssign != null) {
			variableToAssign.value = value;
			return variableToAssign;
		} else {
			Variable variable = new Variable(name, value, type);
			variables.add(variable);
			return variable;
		}
	}
	
	public void assignVariable(String name, Type value, Class<? extends Type> type) {
		assignVariableFromList(variableScopes.lastElement(), name, value, type);
	}
}
