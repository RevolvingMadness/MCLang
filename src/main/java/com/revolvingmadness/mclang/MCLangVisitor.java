package com.revolvingmadness.mclang;


import com.revolvingmadness.mclang.types.*;
import generated.MCLangBaseVisitor;
import generated.MCLangParser;

import java.util.HashMap;
import java.util.Map;

public class MCLangVisitor extends MCLangBaseVisitor<Type> {
    Map<String, Type> variables = new HashMap<>();

    @Override
    public NumberType visitNumberExpression(MCLangParser.NumberExpressionContext ctx) {
        return NumberType.parseNumber(ctx.NUMBER().getText());
    }

    @Override
    public StringType visitStringExpression(MCLangParser.StringExpressionContext context) {
        String wholeString = context.STRING().getText();
        return new StringType(wholeString.substring(1, wholeString.length() - 1));
    }

    @Override
    public BooleanType visitBooleanExpression(MCLangParser.BooleanExpressionContext context) {
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
        Object left = visit(context.expr(0));
        Object right = visit(context.expr(1));

        if (!NumberType.bothNumbers(left, right))
            MCLangInterpreter.throwBinOpException("**", left, right);

        double result = Math.pow(((NumberType) left).value.doubleValue(), ((NumberType) right).value.doubleValue());
        if (left instanceof FloatType || right instanceof FloatType)
            return new FloatType(result);
        return new IntegerType(result);
    }

    @Override
    public Type visitMultiplyExpression(MCLangParser.MultiplyExpressionContext ctx) {
        Object left = visit(ctx.expr(0));
        Object right = visit(ctx.expr(1));

        if (StringType.canMultiply(left, right))
            return StringType.multiply(left, right);

        if (!NumberType.bothNumbers(left, right))
            MCLangInterpreter.throwBinOpException("*", left, right);

        return NumberType.multiply((NumberType) left, (NumberType) right);
    }

    @Override
    public Type visitDivideExpression(MCLangParser.DivideExpressionContext context) {
        Object left = visit(context.expr(0));
        Object right = visit(context.expr(1));

        if (!NumberType.bothNumbers(left, right))
            MCLangInterpreter.throwBinOpException("/", left, right);

        return NumberType.divide((NumberType) left, (NumberType) right);
    }

    @Override
    public Type visitFloorDivideExpression(MCLangParser.FloorDivideExpressionContext context) {
        Object left = visit(context.expr(0));
        Object right = visit(context.expr(1));

        if (!NumberType.bothNumbers(left, right))
            MCLangInterpreter.throwBinOpException("//", left, right);

        return new IntegerType(Math.floorDiv(((NumberType) left).value.longValue(), ((NumberType) right).value.longValue()));
    }

    @Override
    public Type visitModuloExpression(MCLangParser.ModuloExpressionContext context) {
        Object left = visit(context.expr(0));
        Object right = visit(context.expr(1));

        if (!NumberType.bothNumbers(left, right))
            MCLangInterpreter.throwBinOpException("%", left, right);

        long result = Math.floorMod(((NumberType) left).value.longValue(), ((NumberType) right).value.longValue());

        if (NumberType.isFloatAndInteger((NumberType) left, (NumberType) right))
            return new FloatType(result);

        return new IntegerType(result);
    }

    @Override
    public Type visitAddExpression(MCLangParser.AddExpressionContext ctx) {
        Object left = visit(ctx.expr(0));
        Object right = visit(ctx.expr(1));

        if (left instanceof StringType && right instanceof StringType)
            return ((StringType) left).concat((StringType) right);

        if (!NumberType.bothNumbers(left, right))
            MCLangInterpreter.throwBinOpException("+", left, right);

        return NumberType.add((NumberType) left, (NumberType) right);
    }

    @Override
    public Type visitSubtractExpression(MCLangParser.SubtractExpressionContext ctx) {
        Object left = visit(ctx.expr(0));
        Object right = visit(ctx.expr(1));

        if (!NumberType.bothNumbers(left, right))
            MCLangInterpreter.throwBinOpException("-", left, right);

        return NumberType.subtract((NumberType) left, (NumberType) right);
    }

    @Override
    public Type visitLessThanExpression(MCLangParser.LessThanExpressionContext context) {
        Object left = visit(context.expr(0));
        Object right = visit(context.expr(1));

        if (!NumberType.bothNumbers(left, right))
            MCLangInterpreter.throwBinOpException("<", left, right);

        return new BooleanType(((NumberType) left).value.doubleValue() < ((NumberType) right).value.doubleValue());
    }

    @Override
    public Type visitLessThanOrEqualToExpression(MCLangParser.LessThanOrEqualToExpressionContext context) {
        Object left = visit(context.expr(0));
        Object right = visit(context.expr(1));

        if (!NumberType.bothNumbers(left, right))
            MCLangInterpreter.throwBinOpException("<=", left, right);

        return new BooleanType(((NumberType) left).value.doubleValue() <= ((NumberType) right).value.doubleValue());
    }

    @Override
    public Type visitGreaterThanExpression(MCLangParser.GreaterThanExpressionContext context) {
        Object left = visit(context.expr(0));
        Object right = visit(context.expr(1));

        if (!NumberType.bothNumbers(left, right))
            MCLangInterpreter.throwBinOpException(">", left, right);

        return BooleanType.valueOf(((NumberType) left).value.doubleValue() > ((NumberType) right).value.doubleValue());
    }

    @Override
    public Type visitGreaterThanOrEqualToExpression(MCLangParser.GreaterThanOrEqualToExpressionContext context) {
        Object left = visit(context.expr(0));
        Object right = visit(context.expr(1));

        if (!NumberType.bothNumbers(left, right))
            MCLangInterpreter.throwBinOpException(">=", left, right);

        return new BooleanType(((NumberType) left).value.doubleValue() >= ((NumberType) right).value.doubleValue());
    }

    @Override
    public Type visitNotEqualToExpression(MCLangParser.NotEqualToExpressionContext context) {
        Object left = visit(context.expr(0));
        Object right = visit(context.expr(1));

        if (!NumberType.bothNumbers(left, right))
            MCLangInterpreter.throwBinOpException("!=", left, right);

        return new BooleanType(((NumberType) left).value.doubleValue() != ((NumberType) right).value.doubleValue());
    }

    @Override
    public Type visitEqualToExpression(MCLangParser.EqualToExpressionContext context) {
        Object left = visit(context.expr(0));
        Object right = visit(context.expr(1));

        if (!NumberType.bothNumbers(left, right))
            MCLangInterpreter.throwBinOpException("==", left, right);

        return NumberType.equalTo((NumberType) left, (NumberType) right);
    }

    @Override
    public Type visitBitwiseAndExpression(MCLangParser.BitwiseAndExpressionContext context) {
        Object left = visit(context.expr(0));
        Object right = visit(context.expr(1));

        return NumberType.bitwiseAnd((IntegerType) left, (IntegerType) right);
    }

    @Override
    public Type visitBooleanAndExpression(MCLangParser.BooleanAndExpressionContext context) {
        Object left = visit(context.expr(0));
        Object right = visit(context.expr(1));

        return BooleanType.booleanAnd(BooleanType.valueOf(left), BooleanType.valueOf(right));
    }

    @Override
    public Type visitBitwiseXorExpression(MCLangParser.BitwiseXorExpressionContext context) {
        Object left = visit(context.expr(0));
        Object right = visit(context.expr(1));

        return BooleanType.bitwiseXor(BooleanType.valueOf(left), BooleanType.valueOf(right));
    }

    @Override
    public Type visitBitwiseOrExpression(MCLangParser.BitwiseOrExpressionContext context) {
        Object left = visit(context.expr(0));
        Object right = visit(context.expr(1));

        return BooleanType.bitwiseOr(BooleanType.valueOf(left), BooleanType.valueOf(right));
    }

    @Override
    public Type visitBooleanOrExpression(MCLangParser.BooleanOrExpressionContext context) {
        Object left = visit(context.expr(0));
        Object right = visit(context.expr(1));

        return BooleanType.booleanOr(BooleanType.valueOf(left), BooleanType.valueOf(right));
    }

    @Override
    public Type visitBooleanNotExpression(MCLangParser.BooleanNotExpressionContext context) {
        Object input = visit(context.expr());

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
    public Type visitVariableAssignment(MCLangParser.VariableAssignmentContext context) {
        String name = context.IDENTIFIER().getText();
        Type value = visit(context.expr());
        variables.put(name, value);

        return null;
    }

    @Override
    public Type visitIfStatement(MCLangParser.IfStatementContext context) {
        BooleanType cond = BooleanType.valueOf(visit(context.expr()));
        if (cond.booleanValue)
            visit(context.body(0));
        else
            visit(context.body(1));

        return null;
    }

    @Override
    public Type visitBody(MCLangParser.BodyContext ctx) {
        ctx.statement().forEach(this::visitStatement);
        return null;
    }
}
