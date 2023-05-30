import com.revolvingmadness.mclang.MCLangInterpreter;
import com.revolvingmadness.mclang.types.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MCLangTests {
    MCLangInterpreter interpreter = new MCLangInterpreter();
    @Test
    @DisplayName("Numbers")
    public void numbers() {
        interpreter.run("a = 1;");
        Assertions.assertEquals(new IntegerType(1), interpreter.variables.get("a"));
        interpreter.run("a = -1;");
        Assertions.assertEquals(new IntegerType(-1), interpreter.variables.get("a"));
    }

    @Test
    @DisplayName("Strings")
    public void strings() {
        interpreter.run("a = \"1\";");
        Assertions.assertEquals(new StringType("1"), interpreter.variables.get("a"));
    }

    @Test
    @DisplayName("Booleans")
    public void booleans() {
        interpreter.run("a = true;");
        Assertions.assertEquals(new BooleanType(true), interpreter.variables.get("a"));
        interpreter.run("a = false;");
        Assertions.assertEquals(new BooleanType(false), interpreter.variables.get("a"));
    }

    @Test
    @DisplayName("Variables")
    public void variables() {
        interpreter.run("""
                a = 1;
                b = 1;
                c = a + b;
                """);
        Assertions.assertEquals(new IntegerType(2), interpreter.variables.get("c"));
    }

    @Test
    @DisplayName("Parenthesis")
    public void parenthesis() {
        interpreter.run("a = 1 + 2 * 3;");
        Assertions.assertEquals(new IntegerType(7), interpreter.variables.get("a"));
        interpreter.run("a = (1 + 2) * 3;");
        Assertions.assertEquals(new IntegerType(9), interpreter.variables.get("a"));
    }

    @Test
    @DisplayName("Exponentiation")
    public void exponentiation() {
        interpreter.run("a = 2 ** 2;");
        Assertions.assertEquals(new IntegerType(4), interpreter.variables.get("a"));
        interpreter.run("a = 2 ** 2.1;");
        Assertions.assertEquals(new FloatType(4.2870936), interpreter.variables.get("a"));
    }

    @Test
    @DisplayName("Multiplication")
    public void multiplication() {
        interpreter.run("a = 2 * 5;");
        Assertions.assertEquals(new IntegerType(10), interpreter.variables.get("a"));
    }

    @Test
    @DisplayName("Floor Division")
    public void floorDivision() {
        interpreter.run("a = 1 // 3;");
        Assertions.assertEquals(new IntegerType(0), interpreter.variables.get("a"));
    }

    @Test
    @DisplayName("Modulo")
    public void modulo() {
        interpreter.run("a = 1 % 3;");
        Assertions.assertEquals(new IntegerType(1), interpreter.variables.get("a"));
    }

    @Test
    @DisplayName("Less Than")
    public void lessThan() {
        interpreter.run("a = 1 < 2;");
        Assertions.assertEquals(new BooleanType(true), interpreter.variables.get("a"));
        interpreter.run("a = 2 < 1;");
        Assertions.assertEquals(new BooleanType(false), interpreter.variables.get("a"));
    }

    @Test
    @DisplayName("Less Than Or Equal To")
    public void lessThanOrEqualTo() {
        interpreter.run("a = 1 <= 2;");
        Assertions.assertEquals(new BooleanType(true), interpreter.variables.get("a"));
        interpreter.run("a = 1 <= 1;");
        Assertions.assertEquals(new BooleanType(true), interpreter.variables.get("a"));
        interpreter.run("a = 2 <= 1;");
        Assertions.assertEquals(new BooleanType(false), interpreter.variables.get("a"));
    }

    @Test
    @DisplayName("Greater Than")
    public void greaterThan() {
        interpreter.run("a = 2 > 1;");
        Assertions.assertEquals(new BooleanType(true), interpreter.variables.get("a"));
        interpreter.run("a = 1 > 2;");
        Assertions.assertEquals(new BooleanType(false), interpreter.variables.get("a"));
    }

    @Test
    @DisplayName("Greater Than Or Equal To")
    public void greaterThanOrEqualTo() {
        interpreter.run("a = 2 >= 1;");
        Assertions.assertEquals(new BooleanType(true), interpreter.variables.get("a"));
        interpreter.run("a = 1 >= 1;");
        Assertions.assertEquals(new BooleanType(true), interpreter.variables.get("a"));
        interpreter.run("a = 1 >= 2;");
        Assertions.assertEquals(new BooleanType(false), interpreter.variables.get("a"));
    }

    @Test
    @DisplayName("Not Equal To")
    public void notEqualTo() {
        interpreter.run("a = 1 != 2;");
        Assertions.assertEquals(new BooleanType(true), interpreter.variables.get("a"));
        interpreter.run("a = 1 != 1;");
        Assertions.assertEquals(new BooleanType(false), interpreter.variables.get("a"));
    }

    @Test
    @DisplayName("Equal To")
    public void equalTo() {
        interpreter.run("a = 1 == 1;");
        Assertions.assertEquals(new BooleanType(true), interpreter.variables.get("a"));
        interpreter.run("a = 1 == 2;");
        Assertions.assertEquals(new BooleanType(false), interpreter.variables.get("a"));
    }

    @Test
    @DisplayName("Bitwise And")
    public void bitwiseAnd() {
        interpreter.run("a = 1 & 1;");
        Assertions.assertEquals(new IntegerType(1), interpreter.variables.get("a"));
        interpreter.run("a = 1 & 2;");
        Assertions.assertEquals(new IntegerType(0), interpreter.variables.get("a"));
    }

    @Test
    @DisplayName("Boolean And")
    public void booleanAnd() {
        interpreter.run("a = 1 && 1;");
        Assertions.assertEquals(new BooleanType(true), interpreter.variables.get("a"));
        interpreter.run("a = 1 && 0;");
        Assertions.assertEquals(new BooleanType(false), interpreter.variables.get("a"));
    }

    @Test
    @DisplayName("Boolean Or")
    public void booleanOr() {
        interpreter.run("a = 0 || 0;");
        Assertions.assertEquals(new BooleanType(false), interpreter.variables.get("a"));
        interpreter.run("a = 1 || 0;");
        Assertions.assertEquals(new BooleanType(true), interpreter.variables.get("a"));
        interpreter.run("a = 0 || 1;");
        Assertions.assertEquals(new BooleanType(true), interpreter.variables.get("a"));
        interpreter.run("a = 1 || 1;");
        Assertions.assertEquals(new BooleanType(true), interpreter.variables.get("a"));
    }

    @Test
    @DisplayName("Boolean Not")
    public void booleanNot() {
        interpreter.run("a = !1;");
        Assertions.assertEquals(new BooleanType(false), interpreter.variables.get("a"));
        interpreter.run("a = !0;");
        Assertions.assertEquals(new BooleanType(true), interpreter.variables.get("a"));
    }

    @Test
    @DisplayName("Assignment")
    public void assignment() {
        interpreter.run("a = b := 1;");
        Assertions.assertEquals(new IntegerType(1), interpreter.variables.get("a"));
        Assertions.assertEquals(new IntegerType(1), interpreter.variables.get("b"));
    }

    @Test
    @DisplayName("Bitwise Or")
    public void bitwiseOr() {
        interpreter.run("a = 0 | 0;");
        Assertions.assertEquals(new BooleanType(false), interpreter.variables.get("a"));
        interpreter.run("a = 0 | 1;");
        Assertions.assertEquals(new BooleanType(true), interpreter.variables.get("a"));
        interpreter.run("a = 1 | 0;");
        Assertions.assertEquals(new BooleanType(true), interpreter.variables.get("a"));
        interpreter.run("a = 1 | 1;");
        Assertions.assertEquals(new BooleanType(true), interpreter.variables.get("a"));
    }

    @Test
    @DisplayName("Bitwise Xor")
    public void bitwiseXor() {
        interpreter.run("a = 0 ^ 0;");
        Assertions.assertEquals(new BooleanType(false), interpreter.variables.get("a"));
        interpreter.run("a = 0 ^ 1;");
        Assertions.assertEquals(new BooleanType(true), interpreter.variables.get("a"));
        interpreter.run("a = 1 ^ 0;");
        Assertions.assertEquals(new BooleanType(true), interpreter.variables.get("a"));
        interpreter.run("a = 1 ^ 1;");
        Assertions.assertEquals(new BooleanType(false), interpreter.variables.get("a"));
    }

    @Test
    @DisplayName("Division")
    public void division() {
        interpreter.run("a = 1 / 3;");
        Assertions.assertEquals(new FloatType(0.33333334), interpreter.variables.get("a"));
    }

    @Test
    @DisplayName("Addition")
    public void addition() {
        interpreter.run("a = 5 + 5;");
        Assertions.assertEquals(new IntegerType(10), interpreter.variables.get("a"));
    }

    @Test
    @DisplayName("Subtraction")
    public void subtraction() {
        interpreter.run("a = 10 - 5;");
        Assertions.assertEquals(new IntegerType(5), interpreter.variables.get("a"));
    }

    @Test
    @DisplayName("Variable Assignments")
    public void variableAssignments() {
        interpreter.run("a = 1;");
        Assertions.assertTrue(interpreter.variables.containsKey("a"));
    }

    @Test
    @DisplayName("If Statements")
    public void ifStatements() {
        interpreter.run("""
                a = true;
                if (a) {
                    b = true;
                } else {
                    b = false;
                }
                """);
        Assertions.assertEquals(new BooleanType(true), interpreter.variables.get("b"));
        interpreter.run("""
                a = false;
                if (a) {
                    b = true;
                } else {
                    b = false;
                }
                """);
        Assertions.assertEquals(new BooleanType(false), interpreter.variables.get("b"));
        interpreter.run("""
                a = 1;
                if (a) {
                    b = true;
                } else {
                    b = false;
                }
                """);
        Assertions.assertEquals(new BooleanType(true), interpreter.variables.get("b"));
        interpreter.run("""
                a = 0;
                if (a) {
                    b = true;
                } else {
                    b = false;
                }
                """);
        Assertions.assertEquals(new BooleanType(false), interpreter.variables.get("b"));
        interpreter.run("""
                a = -1;
                if (a) {
                    b = true;
                } else {
                    b = false;
                }
                """);
        Assertions.assertEquals(new BooleanType(true), interpreter.variables.get("b"));
        interpreter.run("""
                a = "a";
                if (a) {
                    b = true;
                } else {
                    b = false;
                }
                """);
        Assertions.assertEquals(new BooleanType(true), interpreter.variables.get("b"));
        interpreter.run("""
                a = "";
                if (a) {
                    b = true;
                } else {
                    b = false;
                }
                """);
        Assertions.assertEquals(new BooleanType(false), interpreter.variables.get("b"));
    }

    @Test
    @DisplayName("While Loops")
    public void whileLoops() {
        interpreter.run("""
                i = 0;
                while (i < 5) {
                    i = i + 1;
                }
                """);
        Assertions.assertEquals(new IntegerType(5), interpreter.variables.get("i"));
    }

    @Test
    @DisplayName("Both Numbers")
    public void bothNumbers() {
        Assertions.assertTrue(NumberType.bothNumbers(new IntegerType(0), new IntegerType(0)));
        Assertions.assertFalse(NumberType.bothNumbers(new IntegerType(0), new StringType("")));
        Assertions.assertFalse(NumberType.bothNumbers(new StringType(""), new IntegerType(0)));
        Assertions.assertFalse(NumberType.bothNumbers(new StringType(""), new StringType("")));
    }

    @Test
    @DisplayName("Has Float And Integer")
    public void hasFloatAndInteger() {
        Assertions.assertTrue(NumberType.isFloatAndInteger(new FloatType(0.0), new IntegerType(0)));
        Assertions.assertTrue(NumberType.isFloatAndInteger(new IntegerType(0), new FloatType(0.0)));
        Assertions.assertFalse(NumberType.isFloatAndInteger(new IntegerType(0), new IntegerType(0)));
        Assertions.assertFalse(NumberType.isFloatAndInteger(new FloatType(0.0), new FloatType(0.0)));
    }

    @Test
    @DisplayName("Parse Number")
    public void parseNumber() {
        NumberType intResult = NumberType.parseNumber("1");
        Assertions.assertTrue(intResult instanceof IntegerType);
        Assertions.assertFalse(intResult instanceof FloatType);
        NumberType floatResult = NumberType.parseNumber("1.0");
        Assertions.assertTrue(floatResult instanceof FloatType);
        Assertions.assertFalse(floatResult instanceof IntegerType);
    }
}
