// Generated from .\MCLang.g4 by ANTLR 4.13.0
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
	 * Enter a parse tree produced by the {@code assignmentExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(MCLangParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(MCLangParser.AssignmentExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link MCLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment(MCLangParser.VariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment(MCLangParser.VariableAssignmentContext ctx);
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
	 * Enter a parse tree produced by {@link MCLangParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(MCLangParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCLangParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(MCLangParser.BodyContext ctx);
}