// Generated from .\MCLang.g4 by ANTLR 4.13.0
package generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MCLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MCLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MCLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MCLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MCLangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powerExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerExpression(MCLangParser.PowerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpression(MCLangParser.StringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpression(MCLangParser.AddExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subtractExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractExpression(MCLangParser.SubtractExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpression(MCLangParser.NumberExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(MCLangParser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesisExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisExpression(MCLangParser.ParenthesisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplyExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyExpression(MCLangParser.MultiplyExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floorDivideExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloorDivideExpression(MCLangParser.FloorDivideExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpression(MCLangParser.BooleanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divideExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivideExpression(MCLangParser.DivideExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignment(MCLangParser.VariableAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCLangParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(MCLangParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCLangParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(MCLangParser.BodyContext ctx);
}