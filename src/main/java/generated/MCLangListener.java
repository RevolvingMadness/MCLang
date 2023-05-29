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
	 * Enter a parse tree produced by the {@code powerExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpression(MCLangParser.PowerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powerExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpression(MCLangParser.PowerExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link MCLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment(MCLangParser.VariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MCLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment(MCLangParser.VariableAssignmentContext ctx);
}