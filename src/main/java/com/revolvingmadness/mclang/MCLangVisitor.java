package com.revolvingmadness.mclang;


import generated.MCLangBaseVisitor;
import generated.MCLangParser;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MCLangVisitor extends MCLangBaseVisitor<Object> {
    Map<String, Object> variables = new HashMap<>();

    @Override
    public Object visitIdentifierExpression(MCLangParser.IdentifierExpressionContext context) {
        String name = context.IDENTIFIER().getText();
        if (!variables.containsKey(name))
            throw new RuntimeException("Variable '" + name + "' does not exist.");

        return variables.get(name);
    }

    @Override
    public Object visitNumberExpression(MCLangParser.NumberExpressionContext ctx) {
        return parseNumber(ctx.NUMBER().getText());
    }

    @Override
    public Object visitParenthesisExpression(MCLangParser.ParenthesisExpressionContext context) {
        return visit(context.expr());
    }

    @Override
    public Object visitPowerExpression(MCLangParser.PowerExpressionContext context) {
        Object left = visit(context.expr(0));
        Object right = visit(context.expr(1));
        double result = Math.pow(((Number) left).doubleValue(), ((Number) right).doubleValue());
        if (left instanceof Float || right instanceof Float)
            return (float) result;
        return (int) result;
    }

    @Override
    public Object visitBooleanExpression(MCLangParser.BooleanExpressionContext context) {
        return Objects.equals(context.BOOLEAN().getText(), "true") ? 1 : 0;
    }

    @Override
    public Object visitAddExpression(MCLangParser.AddExpressionContext ctx) {
        Object left = visit(ctx.expr(0));
        Object right = visit(ctx.expr(1));
        if (left instanceof String && right instanceof String)
            return ((String) left).concat((String) right);

        if (left instanceof Float || right instanceof Float)
            return ((Number) left).floatValue() + ((Number) right).floatValue();
        if (left instanceof Integer || right instanceof Integer)
            return ((Number) left).intValue() + ((Number) right).intValue();

        throw new RuntimeException("Cannot add types '" + left.getClass().getName() + "' and '" + right.getClass().getName() + "'.");
    }

    @Override
    public Object visitVariableAssignment(MCLangParser.VariableAssignmentContext context) {
        String name = context.IDENTIFIER().getText();
        Object value = visit(context.expr());
        variables.put(name, value);

        return null;
    }

    public Number parseNumber(String numberString) {
        try {
            return Integer.parseInt(numberString);
        } catch (NumberFormatException e1) {
            try {
                return Float.parseFloat(numberString);
            } catch (NumberFormatException e2) {
                throw new RuntimeException("Invalid number: " + numberString);
            }
        }
    }
}
