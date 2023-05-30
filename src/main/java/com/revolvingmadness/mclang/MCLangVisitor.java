package com.revolvingmadness.mclang;


import generated.MCLangBaseVisitor;
import generated.MCLangParser;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static com.revolvingmadness.mclang.NumberUtil.*;

public class MCLangVisitor extends MCLangBaseVisitor<Object> {
    Map<String, Object> variables = new HashMap<>();

    @Override
    public Number visitNumberExpression(MCLangParser.NumberExpressionContext ctx) {
        return parseNumber(ctx.NUMBER().getText());
    }

    @Override
    public String visitStringExpression(MCLangParser.StringExpressionContext context) {
        String wholeString = context.STRING().getText();
        return wholeString.substring(1, wholeString.length() - 1);
    }

    @Override
    public Integer visitBooleanExpression(MCLangParser.BooleanExpressionContext context) {
        return Objects.equals(context.BOOLEAN().getText(), "true") ? 1 : 0;
    }


    @Override
    public Object visitIdentifierExpression(MCLangParser.IdentifierExpressionContext context) {
        String name = context.IDENTIFIER().getText();
        if (!variables.containsKey(name))
            throw new RuntimeException("Variable '" + name + "' does not exist.");

        return variables.get(name);
    }

    @Override
    public Object visitParenthesisExpression(MCLangParser.ParenthesisExpressionContext context) {
        return visit(context.expr());
    }

    @Override
    public Number visitPowerExpression(MCLangParser.PowerExpressionContext context) {
        Object left = visit(context.expr(0));
        Object right = visit(context.expr(1));

        if (!bothNumbers(left, right))
            throwBinOpException("exponentiate", left, right);

        double result = Math.pow(((Number) left).doubleValue(), ((Number) right).doubleValue());
        if (left instanceof Float || right instanceof Float)
            return (float) result;
        return (int) result;
    }

    @Override
    public Object visitMultiplyExpression(MCLangParser.MultiplyExpressionContext ctx) {
        Object left = visit(ctx.expr(0));
        Object right = visit(ctx.expr(1));
        if (left instanceof String && right instanceof Integer)
            return ((String) left).repeat((Integer) right);
        if (left instanceof Integer && right instanceof String)
            return ((String) right).repeat((Integer) left);

        if (!(right instanceof Integer) && left instanceof String)
            throw new RuntimeException("Cannot multiply string with type '" + right.getClass().getName() + "'.");
        if (!(left instanceof Integer) && right instanceof String)
            throw new RuntimeException("Cannot multiply string with type '" + left.getClass().getName() + "'.");

        if ((left instanceof Float || right instanceof Float) && (left instanceof Integer || right instanceof Integer))
            return ((Number) left).floatValue() * ((Number) right).floatValue();
        if (left instanceof Integer && right instanceof Integer)
            return ((Number) left).intValue() * ((Number) right).intValue();

        throwBinOpException("multiply", left, right);
        return null;
    }

    @Override
    public Float visitDivideExpression(MCLangParser.DivideExpressionContext context) {
        Object left = visit(context.expr(0));
        Object right = visit(context.expr(1));

        if (!bothNumbers(left, right))
            throwBinOpException("divide", left, right);

        return (float) (((Number) left).doubleValue() / ((Number) right).doubleValue());
    }

    @Override
    public Integer visitFloorDivideExpression(MCLangParser.FloorDivideExpressionContext context) {
        Object left = visit(context.expr(0));
        Object right = visit(context.expr(1));

        if (!bothNumbers(left, right))
            throwBinOpException("floor divide", left, right);

        return (int) Math.floorDiv(((Number) left).longValue(), ((Number) right).longValue());
    }

    @Override
    public Object visitAddExpression(MCLangParser.AddExpressionContext ctx) {
        Object left = visit(ctx.expr(0));
        Object right = visit(ctx.expr(1));
        if (left instanceof String && right instanceof String)
            return ((String) left).concat((String) right);

        if (isFloatAndInteger(left, right))
            return ((Number) left).floatValue() + ((Number) right).floatValue();
        if (left instanceof Integer && right instanceof Integer)
            return ((Number) left).intValue() + ((Number) right).intValue();

        throwBinOpException("add", left, right);
        return null;
    }

    @Override
    public Object visitSubtractExpression(MCLangParser.SubtractExpressionContext ctx) {
        Object left = visit(ctx.expr(0));
        Object right = visit(ctx.expr(1));

        if (isFloatAndInteger(left, right))
            return ((Number) left).floatValue() - ((Number) right).floatValue();
        if (left instanceof Integer && right instanceof Integer)
            return ((Number) left).intValue() - ((Number) right).intValue();

        throwBinOpException("subtract", left, right);
        return null;
    }

    @Override
    public Void visitVariableAssignment(MCLangParser.VariableAssignmentContext context) {
        String name = context.IDENTIFIER().getText();
        Object value = visit(context.expr());
        variables.put(name, value);

        return null;
    }

    @Override
    public Object visitIfStatement(MCLangParser.IfStatementContext context) {
        boolean cond = checkCondition(visit(context.expr()));
        if (cond)
            visit(context.body(0));
        else
            visit(context.body(1));

        return null;
    }

    @Override
    public Object visitBody(MCLangParser.BodyContext ctx) {
        ctx.statement().forEach(this::visitStatement);
        return null;
    }

    public boolean checkCondition(Object cond) {
        if (cond instanceof Boolean)
            return (boolean) cond;

        if (cond instanceof String)
            return cond != "";

        if (cond instanceof Number)
            return ((Number) cond).floatValue() != (float) 0.0;

        throw new RuntimeException("Invalid condition type '" + cond.getClass().getName() + "'");
    }

    public void throwBinOpException(String type, Object left, Object right) {
        throw new RuntimeException("Cannot " + type + " types '" + left.getClass().getName() + "' and '" + right.getClass().getName() + "'");
    }
}
