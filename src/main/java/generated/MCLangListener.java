// Generated from MCLang.g4 by ANTLR 4.13.0
package generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MCLangParser}.
 */
public interface MCLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MCLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MCLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MCLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MCLangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MCLangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code moduloExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterModuloExpression(MCLangParser.ModuloExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code moduloExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitModuloExpression(MCLangParser.ModuloExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpression(MCLangParser.NumberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpression(MCLangParser.NumberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalToExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualToExpression(MCLangParser.EqualToExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalToExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualToExpression(MCLangParser.EqualToExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(MCLangParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(MCLangParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplyExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExpression(MCLangParser.MultiplyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplyExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExpression(MCLangParser.MultiplyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterThanExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanExpression(MCLangParser.GreaterThanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterThanExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanExpression(MCLangParser.GreaterThanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ternaryOperatorExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTernaryOperatorExpression(MCLangParser.TernaryOperatorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ternaryOperatorExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTernaryOperatorExpression(MCLangParser.TernaryOperatorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStringExpression(MCLangParser.StringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStringExpression(MCLangParser.StringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code walrusOperatorExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterWalrusOperatorExpression(MCLangParser.WalrusOperatorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code walrusOperatorExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitWalrusOperatorExpression(MCLangParser.WalrusOperatorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessThanOrEqualToExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLessThanOrEqualToExpression(MCLangParser.LessThanOrEqualToExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessThanOrEqualToExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLessThanOrEqualToExpression(MCLangParser.LessThanOrEqualToExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNullExpression(MCLangParser.NullExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNullExpression(MCLangParser.NullExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitwiseAndExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseAndExpression(MCLangParser.BitwiseAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitwiseAndExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseAndExpression(MCLangParser.BitwiseAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessThanExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLessThanExpression(MCLangParser.LessThanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessThanExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLessThanExpression(MCLangParser.LessThanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(MCLangParser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(MCLangParser.FunctionCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classInitExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterClassInitExpression(MCLangParser.ClassInitExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classInitExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitClassInitExpression(MCLangParser.ClassInitExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterListExpression(MCLangParser.ListExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitListExpression(MCLangParser.ListExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanNotExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanNotExpression(MCLangParser.BooleanNotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanNotExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanNotExpression(MCLangParser.BooleanNotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitwiseXorExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseXorExpression(MCLangParser.BitwiseXorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitwiseXorExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseXorExpression(MCLangParser.BitwiseXorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesisExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExpression(MCLangParser.ParenthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesisExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExpression(MCLangParser.ParenthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanOrExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanOrExpression(MCLangParser.BooleanOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanOrExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanOrExpression(MCLangParser.BooleanOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(MCLangParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(MCLangParser.BooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dictExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDictExpression(MCLangParser.DictExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dictExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDictExpression(MCLangParser.DictExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divideExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDivideExpression(MCLangParser.DivideExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divideExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDivideExpression(MCLangParser.DivideExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryOperatorExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperatorExpression(MCLangParser.UnaryOperatorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryOperatorExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperatorExpression(MCLangParser.UnaryOperatorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitwiseOrExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseOrExpression(MCLangParser.BitwiseOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitwiseOrExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseOrExpression(MCLangParser.BitwiseOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(MCLangParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(MCLangParser.AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subtractExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSubtractExpression(MCLangParser.SubtractExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subtractExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSubtractExpression(MCLangParser.SubtractExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterThanOrEqualToExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanOrEqualToExpression(MCLangParser.GreaterThanOrEqualToExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterThanOrEqualToExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanOrEqualToExpression(MCLangParser.GreaterThanOrEqualToExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exponentiationExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExponentiationExpression(MCLangParser.ExponentiationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exponentiationExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExponentiationExpression(MCLangParser.ExponentiationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floorDivideExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFloorDivideExpression(MCLangParser.FloorDivideExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floorDivideExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFloorDivideExpression(MCLangParser.FloorDivideExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notEqualToExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotEqualToExpression(MCLangParser.NotEqualToExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notEqualToExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotEqualToExpression(MCLangParser.NotEqualToExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanAndExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAndExpression(MCLangParser.BooleanAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAndExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAndExpression(MCLangParser.BooleanAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code regularVariableAssignment}
	 * labeled alternative in {@link MCLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterRegularVariableAssignment(MCLangParser.RegularVariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code regularVariableAssignment}
	 * labeled alternative in {@link MCLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitRegularVariableAssignment(MCLangParser.RegularVariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exponentiationVariableAssignment}
	 * labeled alternative in {@link MCLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterExponentiationVariableAssignment(MCLangParser.ExponentiationVariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exponentiationVariableAssignment}
	 * labeled alternative in {@link MCLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitExponentiationVariableAssignment(MCLangParser.ExponentiationVariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplyVariableAssignment}
	 * labeled alternative in {@link MCLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyVariableAssignment(MCLangParser.MultiplyVariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplyVariableAssignment}
	 * labeled alternative in {@link MCLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyVariableAssignment(MCLangParser.MultiplyVariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divideVariableAssignment}
	 * labeled alternative in {@link MCLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterDivideVariableAssignment(MCLangParser.DivideVariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divideVariableAssignment}
	 * labeled alternative in {@link MCLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitDivideVariableAssignment(MCLangParser.DivideVariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floorDivideVariableAssignment}
	 * labeled alternative in {@link MCLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterFloorDivideVariableAssignment(MCLangParser.FloorDivideVariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floorDivideVariableAssignment}
	 * labeled alternative in {@link MCLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitFloorDivideVariableAssignment(MCLangParser.FloorDivideVariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code moduloVariableAssignment}
	 * labeled alternative in {@link MCLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterModuloVariableAssignment(MCLangParser.ModuloVariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code moduloVariableAssignment}
	 * labeled alternative in {@link MCLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitModuloVariableAssignment(MCLangParser.ModuloVariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addVariableAssignment}
	 * labeled alternative in {@link MCLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterAddVariableAssignment(MCLangParser.AddVariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addVariableAssignment}
	 * labeled alternative in {@link MCLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitAddVariableAssignment(MCLangParser.AddVariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code incrementVariableAssignment}
	 * labeled alternative in {@link MCLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterIncrementVariableAssignment(MCLangParser.IncrementVariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code incrementVariableAssignment}
	 * labeled alternative in {@link MCLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitIncrementVariableAssignment(MCLangParser.IncrementVariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subtractVariableAssignment}
	 * labeled alternative in {@link MCLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterSubtractVariableAssignment(MCLangParser.SubtractVariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subtractVariableAssignment}
	 * labeled alternative in {@link MCLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitSubtractVariableAssignment(MCLangParser.SubtractVariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decrementVariableAssignment}
	 * labeled alternative in {@link MCLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterDecrementVariableAssignment(MCLangParser.DecrementVariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decrementVariableAssignment}
	 * labeled alternative in {@link MCLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitDecrementVariableAssignment(MCLangParser.DecrementVariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitwiseAndVariableAssignment}
	 * labeled alternative in {@link MCLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseAndVariableAssignment(MCLangParser.BitwiseAndVariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitwiseAndVariableAssignment}
	 * labeled alternative in {@link MCLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseAndVariableAssignment(MCLangParser.BitwiseAndVariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitwiseXorVariableAssignment}
	 * labeled alternative in {@link MCLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseXorVariableAssignment(MCLangParser.BitwiseXorVariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitwiseXorVariableAssignment}
	 * labeled alternative in {@link MCLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseXorVariableAssignment(MCLangParser.BitwiseXorVariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitwiseOrVariableAssignment}
	 * labeled alternative in {@link MCLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseOrVariableAssignment(MCLangParser.BitwiseOrVariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitwiseOrVariableAssignment}
	 * labeled alternative in {@link MCLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseOrVariableAssignment(MCLangParser.BitwiseOrVariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCLangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(MCLangParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCLangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(MCLangParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCLangParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(MCLangParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCLangParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(MCLangParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCLangParser#functionDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclarationStatement(MCLangParser.FunctionDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCLangParser#functionDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclarationStatement(MCLangParser.FunctionDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCLangParser#classDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclarationStatement(MCLangParser.ClassDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCLangParser#classDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclarationStatement(MCLangParser.ClassDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCLangParser#classConstructorStatement}.
	 * @param ctx the parse tree
	 */
	void enterClassConstructorStatement(MCLangParser.ClassConstructorStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCLangParser#classConstructorStatement}.
	 * @param ctx the parse tree
	 */
	void exitClassConstructorStatement(MCLangParser.ClassConstructorStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCLangParser#classInit}.
	 * @param ctx the parse tree
	 */
	void enterClassInit(MCLangParser.ClassInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCLangParser#classInit}.
	 * @param ctx the parse tree
	 */
	void exitClassInit(MCLangParser.ClassInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCLangParser#propertyClassMemberAccess}.
	 * @param ctx the parse tree
	 */
	void enterPropertyClassMemberAccess(MCLangParser.PropertyClassMemberAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCLangParser#propertyClassMemberAccess}.
	 * @param ctx the parse tree
	 */
	void exitPropertyClassMemberAccess(MCLangParser.PropertyClassMemberAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCLangParser#identifierArgument}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierArgument(MCLangParser.IdentifierArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCLangParser#identifierArgument}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierArgument(MCLangParser.IdentifierArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCLangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(MCLangParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCLangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(MCLangParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCLangParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(MCLangParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCLangParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(MCLangParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCLangParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(MCLangParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCLangParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(MCLangParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCLangParser#importFromStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportFromStatement(MCLangParser.ImportFromStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCLangParser#importFromStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportFromStatement(MCLangParser.ImportFromStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCLangParser#exprArgument}.
	 * @param ctx the parse tree
	 */
	void enterExprArgument(MCLangParser.ExprArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCLangParser#exprArgument}.
	 * @param ctx the parse tree
	 */
	void exitExprArgument(MCLangParser.ExprArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCLangParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(MCLangParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCLangParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(MCLangParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCLangParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(MCLangParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCLangParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(MCLangParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCLangParser#dict}.
	 * @param ctx the parse tree
	 */
	void enterDict(MCLangParser.DictContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCLangParser#dict}.
	 * @param ctx the parse tree
	 */
	void exitDict(MCLangParser.DictContext ctx);
	/**
	 * Enter a parse tree produced by {@link MCLangParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(MCLangParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCLangParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(MCLangParser.NumberContext ctx);
}