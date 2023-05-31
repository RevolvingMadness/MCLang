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
	 * Visit a parse tree produced by the {@code moduloExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuloExpression(MCLangParser.ModuloExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpression(MCLangParser.NumberExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalToExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualToExpression(MCLangParser.EqualToExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(MCLangParser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplyExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyExpression(MCLangParser.MultiplyExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterThanExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanExpression(MCLangParser.GreaterThanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpression(MCLangParser.StringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessThanOrEqualToExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanOrEqualToExpression(MCLangParser.LessThanOrEqualToExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullExpression(MCLangParser.NullExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitwiseAndExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseAndExpression(MCLangParser.BitwiseAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessThanExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanExpression(MCLangParser.LessThanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListExpression(MCLangParser.ListExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanNotExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanNotExpression(MCLangParser.BooleanNotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitwiseXorExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseXorExpression(MCLangParser.BitwiseXorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesisExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisExpression(MCLangParser.ParenthesisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(MCLangParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanOrExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanOrExpression(MCLangParser.BooleanOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpression(MCLangParser.BooleanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dictExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictExpression(MCLangParser.DictExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divideExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivideExpression(MCLangParser.DivideExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitwiseOrExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseOrExpression(MCLangParser.BitwiseOrExpressionContext ctx);
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
	 * Visit a parse tree produced by the {@code greaterThanOrEqualToExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanOrEqualToExpression(MCLangParser.GreaterThanOrEqualToExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exponentiationExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponentiationExpression(MCLangParser.ExponentiationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floorDivideExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloorDivideExpression(MCLangParser.FloorDivideExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notEqualToExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqualToExpression(MCLangParser.NotEqualToExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanAndExpression}
	 * labeled alternative in {@link MCLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAndExpression(MCLangParser.BooleanAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code regularVariableAssignment}
	 * labeled alternative in {@link MCLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularVariableAssignment(MCLangParser.RegularVariableAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exponentiationVariableAssignment}
	 * labeled alternative in {@link MCLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponentiationVariableAssignment(MCLangParser.ExponentiationVariableAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplyVariableAssignment}
	 * labeled alternative in {@link MCLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyVariableAssignment(MCLangParser.MultiplyVariableAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divideVariableAssignment}
	 * labeled alternative in {@link MCLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivideVariableAssignment(MCLangParser.DivideVariableAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floorDivideVariableAssignment}
	 * labeled alternative in {@link MCLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloorDivideVariableAssignment(MCLangParser.FloorDivideVariableAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moduloVariableAssignment}
	 * labeled alternative in {@link MCLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuloVariableAssignment(MCLangParser.ModuloVariableAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addVariableAssignment}
	 * labeled alternative in {@link MCLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddVariableAssignment(MCLangParser.AddVariableAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subtractVariableAssignment}
	 * labeled alternative in {@link MCLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractVariableAssignment(MCLangParser.SubtractVariableAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitwiseAndVariableAssignment}
	 * labeled alternative in {@link MCLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseAndVariableAssignment(MCLangParser.BitwiseAndVariableAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitwiseXorVariableAssignment}
	 * labeled alternative in {@link MCLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseXorVariableAssignment(MCLangParser.BitwiseXorVariableAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitwiseOrVariableAssignment}
	 * labeled alternative in {@link MCLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseOrVariableAssignment(MCLangParser.BitwiseOrVariableAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCLangParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(MCLangParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCLangParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(MCLangParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCLangParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(MCLangParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCLangParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(MCLangParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCLangParser#dict}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDict(MCLangParser.DictContext ctx);
}