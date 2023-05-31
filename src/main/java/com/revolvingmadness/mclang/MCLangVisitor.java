package com.revolvingmadness.mclang;


import com.revolvingmadness.mclang.types.*;
import generated.MCLangBaseVisitor;
import generated.MCLangParser;

import java.util.*;

public class MCLangVisitor extends MCLangBaseVisitor<Type> {
    Map<String, Type> variables = new HashMap<>();
    List<String> expressionKeywords = List.of("true", "false", "null");

    @Override
    public Type visitNumberExpression(MCLangParser.NumberExpressionContext context) {
        return NumberType.parseNumber(context.NUMBER().getText());
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
        return getVariable(context.IDENTIFIER().getText());
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

        return Type.notEqualTo(left, right);
    }

    @Override
    public Type visitEqualToExpression(MCLangParser.EqualToExpressionContext context) {
        Type left = visit(context.expr(0));
        Type right = visit(context.expr(1));

        return Type.equalTo(left, right);
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
    public Type visitAssignmentExpression(MCLangParser.AssignmentExpressionContext context) {
        String name = context.IDENTIFIER().getText();
        Type value = visit(context.expr());
        variables.put(name, value);

        return value;
    }

    @Override
    public Type visitRegularVariableAssignment(MCLangParser.RegularVariableAssignmentContext context) {
        String name = context.IDENTIFIER().getText();
        if (expressionKeywords.contains(name))
            throw new RuntimeException("Variable name cannot be named keyword '" + name + "'");
        Type value = visit(context.expr());
        variables.put(name, value);

        return null;
    }

    @Override
    public Type visitExponentiationVariableAssignment(MCLangParser.ExponentiationVariableAssignmentContext context) {
        String name = context.IDENTIFIER().getText();
        Type oldValue = variables.get(name);
        Type newValue = visit(context.expr());

        variables.put(name, oldValue.exponentiate(newValue));

        return null;
    }

    @Override
    public Type visitMultiplyVariableAssignment(MCLangParser.MultiplyVariableAssignmentContext context) {
        String name = context.IDENTIFIER().getText();
        Type oldValue = variables.get(name);
        Type newValue = visit(context.expr());

        variables.put(name, oldValue.multiply(newValue));

        return null;
    }

    @Override
    public Type visitDivideVariableAssignment(MCLangParser.DivideVariableAssignmentContext context) {
        String name = context.IDENTIFIER().getText();
        Type oldValue = variables.get(name);
        Type newValue = visit(context.expr());

        variables.put(name, oldValue.divide(newValue));

        return null;
    }

    @Override
    public Type visitFloorDivideVariableAssignment(MCLangParser.FloorDivideVariableAssignmentContext context) {
        String name = context.IDENTIFIER().getText();
        Type oldValue = variables.get(name);
        Type newValue = visit(context.expr());

        variables.put(name, oldValue.floorDivide(newValue));

        return null;
    }

    @Override
    public Type visitModuloVariableAssignment(MCLangParser.ModuloVariableAssignmentContext context) {
        String name = context.IDENTIFIER().getText();
        Type oldValue = variables.get(name);
        Type newValue = visit(context.expr());

        variables.put(name, oldValue.modulo(newValue));

        return null;
    }

    @Override
    public Type visitAddVariableAssignment(MCLangParser.AddVariableAssignmentContext context) {
        String name = context.IDENTIFIER().getText();
        Type oldValue = variables.get(name);
        Type newValue = visit(context.expr());

        variables.put(name, oldValue.add(newValue));

        return null;
    }

    @Override
    public Type visitSubtractVariableAssignment(MCLangParser.SubtractVariableAssignmentContext context) {
        String name = context.IDENTIFIER().getText();
        Type oldValue = variables.get(name);
        Type newValue = visit(context.expr());

        variables.put(name, oldValue.subtract(newValue));

        return null;
    }

    @Override
    public Type visitBitwiseAndVariableAssignment(MCLangParser.BitwiseAndVariableAssignmentContext context) {
        String name = context.IDENTIFIER().getText();
        Type oldValue = variables.get(name);
        Type newValue = visit(context.expr());

        variables.put(name, oldValue.bitwiseAnd(newValue));

        return null;
    }

    @Override
    public Type visitBitwiseXorVariableAssignment(MCLangParser.BitwiseXorVariableAssignmentContext context) {
        String name = context.IDENTIFIER().getText();
        Type oldValue = variables.get(name);
        Type newValue = visit(context.expr());

        variables.put(name, oldValue.bitwiseXor(newValue));

        return null;
    }

    @Override
    public Type visitBitwiseOrVariableAssignment(MCLangParser.BitwiseOrVariableAssignmentContext context) {
        String name = context.IDENTIFIER().getText();
        Type oldValue = variables.get(name);
        Type newValue = visit(context.expr());

        variables.put(name, oldValue.bitwiseOr(newValue));

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
            visit(context.body(0));
        else
            visit(context.body(1));

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
    public Type visitBody(MCLangParser.BodyContext context) {
        for (MCLangParser.StatementContext context1 : context.statement()) {
            visitStatement(context1);
        }
        return null;
    }

    public Type getVariable(String name) {
        if (!variables.containsKey(name))
            throw new RuntimeException("Variable '" + name + "' does not exist.");

        return variables.get(name);
    }
}
