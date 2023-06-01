package com.revolvingmadness.mclang;


import com.revolvingmadness.mclang.types.*;
import generated.MCLangBaseVisitor;
import generated.MCLangLexer;
import generated.MCLangParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class MCLangVisitor extends MCLangBaseVisitor<Type> {
	Stack<Map<String, Type>> variableScopes = new Stack<>();
	List<String> expressionKeywords = List.of("true", "false", "null");
	Type functionReturnValue = new NullType();
	
	public MCLangVisitor() {
		variableScopes.add(new HashMap<>());
	}
	
	@Override
	public Type visitNumberExpression(MCLangParser.NumberExpressionContext context) {
		return visitNumber(context.number());
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
		String name = context.IDENTIFIER().getText();
		return getVariable(name);
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
		String name = context.IDENTIFIER().getText();
		Type value = visit(context.expr());
		assignVariable(name, value);
		
		return value;
	}
	
	@Override
	public Type visitRegularVariableAssignment(MCLangParser.RegularVariableAssignmentContext context) {
		String name = context.IDENTIFIER().getText();
		if (expressionKeywords.contains(name))
			throw new RuntimeException("Variable name cannot be named keyword '" + name + "'");
		Type value = visit(context.expr());
		assignVariable(name, value);
		
		return null;
	}
	
	@Override
	public Type visitExponentiationVariableAssignment(MCLangParser.ExponentiationVariableAssignmentContext context) {
		String name = context.IDENTIFIER().getText();
		Type oldValue = getVariable(name);
		Type newValue = visit(context.expr());
		
		assignVariable(name, oldValue.exponentiate(newValue));
		
		return null;
	}
	
	@Override
	public Type visitMultiplyVariableAssignment(MCLangParser.MultiplyVariableAssignmentContext context) {
		String name = context.IDENTIFIER().getText();
		Type oldValue = getVariable(name);
		Type newValue = visit(context.expr());
		
		assignVariable(name, oldValue.multiply(newValue));
		
		return null;
	}
	
	@Override
	public Type visitDivideVariableAssignment(MCLangParser.DivideVariableAssignmentContext context) {
		String name = context.IDENTIFIER().getText();
		Type oldValue = getVariable(name);
		Type newValue = visit(context.expr());
		
		assignVariable(name, oldValue.divide(newValue));
		
		return null;
	}
	
	@Override
	public Type visitFloorDivideVariableAssignment(MCLangParser.FloorDivideVariableAssignmentContext context) {
		String name = context.IDENTIFIER().getText();
		Type oldValue = getVariable(name);
		Type newValue = visit(context.expr());
		
		assignVariable(name, oldValue.floorDivide(newValue));
		
		return null;
	}
	
	@Override
	public Type visitModuloVariableAssignment(MCLangParser.ModuloVariableAssignmentContext context) {
		String name = context.IDENTIFIER().getText();
		Type oldValue = getVariable(name);
		Type newValue = visit(context.expr());
		
		assignVariable(name, oldValue.modulo(newValue));
		
		return null;
	}
	
	@Override
	public Type visitAddVariableAssignment(MCLangParser.AddVariableAssignmentContext context) {
		String name = context.IDENTIFIER().getText();
		Type oldValue = getVariable(name);
		Type newValue = visit(context.expr());
		
		assignVariable(name, oldValue.add(newValue));
		
		return null;
	}
	
	@Override
	public Type visitSubtractVariableAssignment(MCLangParser.SubtractVariableAssignmentContext context) {
		String name = context.IDENTIFIER().getText();
		Type oldValue = getVariable(name);
		Type newValue = visit(context.expr());
		
		assignVariable(name, oldValue.subtract(newValue));
		
		return null;
	}
	
	@Override
	public Type visitBitwiseAndVariableAssignment(MCLangParser.BitwiseAndVariableAssignmentContext context) {
		String name = context.IDENTIFIER().getText();
		Type oldValue = getVariable(name);
		Type newValue = visit(context.expr());
		
		assignVariable(name, oldValue.bitwiseAnd(newValue));
		
		return null;
	}
	
	@Override
	public Type visitBitwiseXorVariableAssignment(MCLangParser.BitwiseXorVariableAssignmentContext context) {
		String name = context.IDENTIFIER().getText();
		Type oldValue = getVariable(name);
		Type newValue = visit(context.expr());
		
		assignVariable(name, oldValue.bitwiseXor(newValue));
		
		return null;
	}
	
	@Override
	public Type visitBitwiseOrVariableAssignment(MCLangParser.BitwiseOrVariableAssignmentContext context) {
		String name = context.IDENTIFIER().getText();
		Type oldValue = getVariable(name);
		Type newValue = visit(context.expr());
		
		assignVariable(name, oldValue.bitwiseOr(newValue));
		
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
		else
			if (context.body(1) != null)
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
		String name = context.IDENTIFIER().getText();
		Type variable = getVariable(name);
		if (!(variable instanceof FunctionType function))
			throw new RuntimeException("Variable '" + name + "' is not a function");
		
		Map<String, Type> functionVariables = new HashMap<>();
		variableScopes.push(functionVariables);
		
		List<Type> functionCallArguments = new ArrayList<>();
		for (MCLangParser.ArgumentContext context1 : context.argument()) {
			functionCallArguments.add(visitArgument(context1));
		}
		
		if (function.arguments.size() != functionCallArguments.size())
			throw new RuntimeException("Invalid number of arguments for function '" + function.name + "' (got " + functionCallArguments.size() + ", expected " + function.arguments.size() + ")");
		
		for (int i = 0; i < context.argument().size(); i++) {
			functionVariables.put(function.arguments.get(i), functionCallArguments.get(i));
		}
		
		
		if (function.body != null)
			for (MCLangParser.StatementContext statement : function.body) {
				visit(statement);
				
				if (!Objects.equals(functionReturnValue, new NullType())) {
					break;
				}
			}
		if (function.shorthandBody != null)
			functionReturnValue = visit(function.shorthandBody);
		
		
		Type returnValue = functionReturnValue;
		variableScopes.pop();
		functionReturnValue = new NullType();
		
		return returnValue;
	}
	
	@Override
	public Type visitFunctionDeclarationStatement(MCLangParser.FunctionDeclarationStatementContext context) {
		String name = context.IDENTIFIER(0).getText();
		List<String> arguments = new ArrayList<>();
		List<TerminalNode> identifierArguments = context.IDENTIFIER();
		identifierArguments.remove(0);
		identifierArguments.forEach(identifierNode -> arguments.add(identifierNode.getText()));
		
		if (context.body() != null)
			assignVariable(name, new FunctionType(name, arguments, context.body()));
		if (context.expr() != null)
			assignVariable(name, new FunctionType(name, arguments, context.expr()));
		
		return null;
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
	public Type visitNumber(MCLangParser.NumberContext context) {
		return NumberType.parseNumber(context.getText());
	}
	
	@Override
	public Type visitArgument(MCLangParser.ArgumentContext context) {
		return visit(context.expr());
	}
	
	@Override
	public Type visitReturnStatement(MCLangParser.ReturnStatementContext context) {
		functionReturnValue = visit(context.expr());
		return null;
	}
	
	@Override
	public Type visitImportStatement(MCLangParser.ImportStatementContext context) {
		String wholeName = context.STRING().toString();
		String name = wholeName.substring(1, wholeName.length() - 1);
		StringBuilder content = new StringBuilder();
		try {
			Files.readAllLines(Path.of(name)).forEach(content::append);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		MCLangLexer lexer = new MCLangLexer(CharStreams.fromString(content.toString()));
		MCLangParser parser = new MCLangParser(new CommonTokenStream(lexer));
		MCLangParser.ProgramContext program = parser.program();
		visit(program);
		
		return null;
	}
	
	@Override
	public Type visitBody(MCLangParser.BodyContext context) {
		for (MCLangParser.StatementContext context1 : context.statement()) {
			visitStatement(context1);
		}
		return null;
	}
	
	public Type getVariable(String name) {
		Type variable = null;
		
		for (Map<String, Type> variableScope : variableScopes) {
			if (variableScope.containsKey(name)) {
				variable = variableScope.get(name);
			}
		}
		
		if (variable == null)
			throw new RuntimeException("Variable '" + name + "' is not defined");
		
		return variable;
	}
	
	public void assignVariable(String name, Type value) {
		variableScopes.lastElement().put(name, value);
	}
}
