package com.revolvingmadness.mclang;


import com.revolvingmadness.mclang.types.*;
import generated.MCLangBaseVisitor;
import generated.MCLangParser;

import java.util.HashMap;
import java.util.Map;

public class MCLangVisitor extends MCLangBaseVisitor<Type> {
    Map<String, Type> variables = new HashMap<>();

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
        String name = context.IDENTIFIER().getText();
        if (!variables.containsKey(name))
            throw new RuntimeException("Variable '" + name + "' does not exist.");

        return variables.get(name);
    }

    @Override
    public Type visitParenthesisExpression(MCLangParser.ParenthesisExpressionContext context) {
        return visit(context.expr());
    }

    @Override
    public Type visitExponentiationExpression(MCLangParser.ExponentiationExpressionContext context) {
        Type left = visit(context.expr(0));
        Type right = visit(context.expr(1));

        return NumberType.exponentiate((NumberType) left, (NumberType) right);
    }

    @Override
    public Type visitMultiplyExpression(MCLangParser.MultiplyExpressionContext context) {
        Type left = visit(context.expr(0));
        Type right = visit(context.expr(1));

        if (StringType.canMultiply(left, right))
            return StringType.multiply(left, right);

        return NumberType.multiply((NumberType) left, (NumberType) right);
    }

    @Override
    public Type visitDivideExpression(MCLangParser.DivideExpressionContext context) {
        Type left = visit(context.expr(0));
        Type right = visit(context.expr(1));

        if (!NumberType.bothNumbers(left, right))
            MCLangInterpreter.throwBinOpException("/", left, right);

        return NumberType.divide((NumberType) left, (NumberType) right);
    }

    @Override
    public Type visitFloorDivideExpression(MCLangParser.FloorDivideExpressionContext context) {
        Type left = visit(context.expr(0));
        Type right = visit(context.expr(1));

        return NumberType.floorDivide((NumberType) left, (NumberType) right);
    }

    @Override
    public Type visitModuloExpression(MCLangParser.ModuloExpressionContext context) {
        Type left = visit(context.expr(0));
        Type right = visit(context.expr(1));

        return NumberType.modulo((NumberType) left, (NumberType) right);
    }

    @Override
    public Type visitAddExpression(MCLangParser.AddExpressionContext context) {
        Type left = visit(context.expr(0));
        Type right = visit(context.expr(1));

        if (left instanceof StringType && right instanceof StringType)
            return ((StringType) left).concat((StringType) right);

        if (!NumberType.bothNumbers(left, right))
            MCLangInterpreter.throwBinOpException("+", left, right);

        return NumberType.add((NumberType) left, (NumberType) right);
    }

    @Override
    public Type visitSubtractExpression(MCLangParser.SubtractExpressionContext context) {
        Type left = visit(context.expr(0));
        Type right = visit(context.expr(1));

        if (!NumberType.bothNumbers(left, right))
            MCLangInterpreter.throwBinOpException("-", left, right);

        return NumberType.subtract((NumberType) left, (NumberType) right);
    }

    @Override
    public Type visitLessThanExpression(MCLangParser.LessThanExpressionContext context) {
        Type left = visit(context.expr(0));
        Type right = visit(context.expr(1));

        return BooleanType.lessThan((NumberType) left, (NumberType) right);
    }

    @Override
    public Type visitLessThanOrEqualToExpression(MCLangParser.LessThanOrEqualToExpressionContext context) {
        Type left = visit(context.expr(0));
        Type right = visit(context.expr(1));

        return BooleanType.lessThanOrEqualTo((NumberType) left, (NumberType) right);

    }

    @Override
    public Type visitGreaterThanExpression(MCLangParser.GreaterThanExpressionContext context) {
        Type left = visit(context.expr(0));
        Type right = visit(context.expr(1));

        return BooleanType.greaterThan((NumberType) left, (NumberType) right);

    }

    @Override
    public Type visitGreaterThanOrEqualToExpression(MCLangParser.GreaterThanOrEqualToExpressionContext context) {
        Type left = visit(context.expr(0));
        Type right = visit(context.expr(1));

        return BooleanType.greaterThanOrEqualTo((NumberType) left, (NumberType) right);

    }

    @Override
    public Type visitNotEqualToExpression(MCLangParser.NotEqualToExpressionContext context) {
        Type left = visit(context.expr(0));
        Type right = visit(context.expr(1));

        return BooleanType.notEqualTo((NumberType) left, (NumberType) right);
    }

    @Override
    public Type visitEqualToExpression(MCLangParser.EqualToExpressionContext context) {
        Type left = visit(context.expr(0));
        Type right = visit(context.expr(1));

        return BooleanType.equalTo((NumberType) left, (NumberType) right);
    }

    @Override
    public Type visitBitwiseAndExpression(MCLangParser.BitwiseAndExpressionContext context) {
        Type left = visit(context.expr(0));
        Type right = visit(context.expr(1));

        return NumberType.bitwiseAnd((IntegerType) left, (IntegerType) right);
    }

    @Override
    public Type visitBooleanAndExpression(MCLangParser.BooleanAndExpressionContext context) {
        Type left = visit(context.expr(0));
        Type right = visit(context.expr(1));

        return BooleanType.booleanAnd(BooleanType.valueOf(left), BooleanType.valueOf(right));
    }

    @Override
    public Type visitBitwiseXorExpression(MCLangParser.BitwiseXorExpressionContext context) {
        Type left = visit(context.expr(0));
        Type right = visit(context.expr(1));

        return NumberType.bitwiseXor((NumberType) left, (NumberType) right);
    }

    @Override
    public Type visitBitwiseOrExpression(MCLangParser.BitwiseOrExpressionContext context) {
        Type left = visit(context.expr(0));
        Type right = visit(context.expr(1));

        return NumberType.bitwiseOr((NumberType) left, (NumberType) right);
    }

    @Override
    public Type visitBooleanOrExpression(MCLangParser.BooleanOrExpressionContext context) {
        Type left = visit(context.expr(0));
        Type right = visit(context.expr(1));

        return BooleanType.booleanOr(BooleanType.valueOf(left), BooleanType.valueOf(right));
    }

    @Override
    public Type visitBooleanNotExpression(MCLangParser.BooleanNotExpressionContext context) {
        Type input = visit(context.expr());

        return BooleanType.booleanNot(BooleanType.valueOf(input));
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
        Type value = visit(context.expr());
        variables.put(name, value);

        return null;
    }

    @Override
    public Type visitExponentiationVariableAssignment(MCLangParser.ExponentiationVariableAssignmentContext context) {
        String name = context.IDENTIFIER().getText();
        Type oldValue = variables.get(name);
        Type newValue = visit(context.expr());

        variables.put(name, NumberType.exponentiate((NumberType) oldValue, (NumberType) newValue));

        return null;
    }

    @Override
    public Type visitMultiplyVariableAssignment(MCLangParser.MultiplyVariableAssignmentContext context) {
        String name = context.IDENTIFIER().getText();
        Type oldValue = variables.get(name);
        Type newValue = visit(context.expr());

        variables.put(name, NumberType.multiply((NumberType) oldValue, (NumberType) newValue));

        return null;
    }

    @Override
    public Type visitDivideVariableAssignment(MCLangParser.DivideVariableAssignmentContext context) {
        String name = context.IDENTIFIER().getText();
        Type oldValue = variables.get(name);
        Type newValue = visit(context.expr());

        variables.put(name, NumberType.divide((NumberType) oldValue, (NumberType) newValue));

        return null;
    }

    @Override
    public Type visitFloorDivideVariableAssignment(MCLangParser.FloorDivideVariableAssignmentContext context) {
        String name = context.IDENTIFIER().getText();
        Type oldValue = variables.get(name);
        Type newValue = visit(context.expr());

        variables.put(name, NumberType.floorDivide((NumberType) oldValue, (NumberType) newValue));

        return null;
    }

    @Override
    public Type visitModuloVariableAssignment(MCLangParser.ModuloVariableAssignmentContext context) {
        String name = context.IDENTIFIER().getText();
        Type oldValue = variables.get(name);
        Type newValue = visit(context.expr());

        variables.put(name, NumberType.modulo((NumberType) oldValue, (NumberType) newValue));

        return null;
    }

    @Override
    public Type visitAddVariableAssignment(MCLangParser.AddVariableAssignmentContext context) {
        String name = context.IDENTIFIER().getText();
        Type oldValue = variables.get(name);
        Type newValue = visit(context.expr());

        variables.put(name, NumberType.add((NumberType) oldValue, (NumberType) newValue));

        return null;
    }

    @Override
    public Type visitSubtractVariableAssignment(MCLangParser.SubtractVariableAssignmentContext context) {
        String name = context.IDENTIFIER().getText();
        Type oldValue = variables.get(name);
        Type newValue = visit(context.expr());

        variables.put(name, NumberType.subtract((NumberType) oldValue, (NumberType) newValue));

        return null;
    }

    @Override
    public Type visitBitwiseAndVariableAssignment(MCLangParser.BitwiseAndVariableAssignmentContext context) {
        String name = context.IDENTIFIER().getText();
        Type oldValue = variables.get(name);
        Type newValue = visit(context.expr());

        variables.put(name, NumberType.bitwiseAnd((NumberType) oldValue, (NumberType) newValue));

        return null;
    }

    @Override
    public Type visitBitwiseXorVariableAssignment(MCLangParser.BitwiseXorVariableAssignmentContext context) {
        String name = context.IDENTIFIER().getText();
        Type oldValue = variables.get(name);
        Type newValue = visit(context.expr());

        variables.put(name, NumberType.bitwiseXor((NumberType) oldValue, (NumberType) newValue));

        return null;
    }

    @Override
    public Type visitBitwiseOrVariableAssignment(MCLangParser.BitwiseOrVariableAssignmentContext context) {
        String name = context.IDENTIFIER().getText();
        Type oldValue = variables.get(name);
        Type newValue = visit(context.expr());

        variables.put(name, NumberType.bitwiseOr((NumberType) oldValue, (NumberType) newValue));

        return null;
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
}
