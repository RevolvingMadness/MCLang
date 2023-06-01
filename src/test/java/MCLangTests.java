import com.revolvingmadness.mclang.MCLangInterpreter;
import com.revolvingmadness.mclang.types.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MCLangTests {
    MCLangInterpreter interpreter = new MCLangInterpreter();

    @Test
    @DisplayName("Literal Expressions")
    public void literalExpressions() {
        // Numbers
        interpreter.run("a = 1;");
        Assertions.assertEquals(new IntegerType(1), interpreter.variables.get("a"));
        interpreter.run("a = -1;");
        Assertions.assertEquals(new IntegerType(-1), interpreter.variables.get("a"));

        // Null types
        interpreter.run("a = null;");
        Assertions.assertEquals(new NullType(), interpreter.variables.get("a"));

        // Strings
        interpreter.run("a = \"1\";");
        Assertions.assertEquals(new StringType("1"), interpreter.variables.get("a"));
        interpreter.run("a = \"1\" * 3;");
        Assertions.assertEquals(new StringType("111"), interpreter.variables.get("a"));

        // Booleans
        interpreter.run("a = true;");
        Assertions.assertEquals(new BooleanType(true), interpreter.variables.get("a"));
        interpreter.run("a = false;");
        Assertions.assertEquals(new BooleanType(false), interpreter.variables.get("a"));

        // Identifiers / Variables
        interpreter.run("""
                a = 1;
                b = 1;
                c = a + b;
                """);
        Assertions.assertEquals(new IntegerType(2), interpreter.variables.get("c"));
    }

    @Test
    @DisplayName("Arithmetic Expressions")
    public void arithmeticExpressions() {
        // Parenthesis
        interpreter.run("a = 1 + 2 * 3;");
        Assertions.assertEquals(new IntegerType(7), interpreter.variables.get("a"));
        interpreter.run("a = (1 + 2) * 3;");
        Assertions.assertEquals(new IntegerType(9), interpreter.variables.get("a"));

        // Exponentiation
        interpreter.run("a = 2 ** 2;");
        Assertions.assertEquals(new IntegerType(4), interpreter.variables.get("a"));
        interpreter.run("a = 2 ** 2.1;");
        Assertions.assertEquals(new FloatType(4.2870936), interpreter.variables.get("a"));
        Assertions.assertThrows(RuntimeException.class, () -> interpreter.run("a= 2 ** \"\";"));

        // Multiplication
        interpreter.run("a = 2 * 5;");
        Assertions.assertEquals(new IntegerType(10), interpreter.variables.get("a"));
        interpreter.run("a = \"0\" * 2;");
        Assertions.assertEquals(new StringType("00"), interpreter.variables.get("a"));

        // Division
        interpreter.run("a = 1 / 3;");
        Assertions.assertEquals(new FloatType(0.33333334), interpreter.variables.get("a"));

        // Floor division
        interpreter.run("a = 1 // 3;");
        Assertions.assertEquals(new IntegerType(0), interpreter.variables.get("a"));

        // Modulo
        interpreter.run("a = 10 % 3;");
        Assertions.assertEquals(new IntegerType(1), interpreter.variables.get("a"));

        // Addition
        interpreter.run("a = 5 + 5;");
        Assertions.assertEquals(new IntegerType(10), interpreter.variables.get("a"));

        // Subtraction
        interpreter.run("a = 10 - 5;");
        Assertions.assertEquals(new IntegerType(5), interpreter.variables.get("a"));
    }

    @Test
    @DisplayName("Comparison Expressions")
    public void comparisonExpressions() {
        // Less than
        interpreter.run("a = 1 < 2;");
        Assertions.assertEquals(new BooleanType(true), interpreter.variables.get("a"));
        interpreter.run("a = 2 < 1;");
        Assertions.assertEquals(new BooleanType(false), interpreter.variables.get("a"));

        // Less than or equal to
        interpreter.run("a = 1 <= 2;");
        Assertions.assertEquals(new BooleanType(true), interpreter.variables.get("a"));
        interpreter.run("a = 1 <= 1;");
        Assertions.assertEquals(new BooleanType(true), interpreter.variables.get("a"));
        interpreter.run("a = 2 <= 1;");
        Assertions.assertEquals(new BooleanType(false), interpreter.variables.get("a"));

        // Greater than
        interpreter.run("a = 2 > 1;");
        Assertions.assertEquals(new BooleanType(true), interpreter.variables.get("a"));
        interpreter.run("a = 1 > 2;");
        Assertions.assertEquals(new BooleanType(false), interpreter.variables.get("a"));

        // Greater than or equal to
        interpreter.run("a = 2 >= 1;");
        Assertions.assertEquals(new BooleanType(true), interpreter.variables.get("a"));
        interpreter.run("a = 1 >= 1;");
        Assertions.assertEquals(new BooleanType(true), interpreter.variables.get("a"));
        interpreter.run("a = 1 >= 2;");
        Assertions.assertEquals(new BooleanType(false), interpreter.variables.get("a"));

        // Not equal to
        interpreter.run("a = 1 != 2;");
        Assertions.assertEquals(new BooleanType(true), interpreter.variables.get("a"));
        interpreter.run("a = 1 != 1;");
        Assertions.assertEquals(new BooleanType(false), interpreter.variables.get("a"));

        // Equal to
        interpreter.run("a = 1 == 1;");
        Assertions.assertEquals(new BooleanType(true), interpreter.variables.get("a"));
        interpreter.run("a = 1 == 2;");
        Assertions.assertEquals(new BooleanType(false), interpreter.variables.get("a"));
    }

    @Test
    @DisplayName("Bitwise Expressions")
    public void bitwiseExpressions() {
        // Bitwise and
        interpreter.run("a = 1 & 1;");
        Assertions.assertEquals(new IntegerType(1), interpreter.variables.get("a"));
        interpreter.run("a = 1 & 2;");
        Assertions.assertEquals(new IntegerType(0), interpreter.variables.get("a"));

        // Bitwise xor
        interpreter.run("a = 0 ^ 0;");
        Assertions.assertEquals(new IntegerType(0), interpreter.variables.get("a"));
        interpreter.run("a = 0 ^ 1;");
        Assertions.assertEquals(new IntegerType(1), interpreter.variables.get("a"));
        interpreter.run("a = 1 ^ 0;");
        Assertions.assertEquals(new IntegerType(1), interpreter.variables.get("a"));
        interpreter.run("a = 1 ^ 1;");
        Assertions.assertEquals(new IntegerType(0), interpreter.variables.get("a"));

        // Bitwise or
        interpreter.run("a = 0 | 0;");
        Assertions.assertEquals(new IntegerType(0), interpreter.variables.get("a"));
        interpreter.run("a = 0 | 1;");
        Assertions.assertEquals(new IntegerType(1), interpreter.variables.get("a"));
        interpreter.run("a = 1 | 0;");
        Assertions.assertEquals(new IntegerType(1), interpreter.variables.get("a"));
        interpreter.run("a = 1 | 1;");
        Assertions.assertEquals(new IntegerType(1), interpreter.variables.get("a"));
    }

    @Test
    @DisplayName("Boolean Expressions")
    public void booleanExpressions() {
        // Boolean and
        interpreter.run("a = true && true;");
        Assertions.assertEquals(new BooleanType(true), interpreter.variables.get("a"));
        interpreter.run("a = true && false;");
        Assertions.assertEquals(new BooleanType(false), interpreter.variables.get("a"));

        // Boolean or
        interpreter.run("a = false || false;");
        Assertions.assertEquals(new BooleanType(false), interpreter.variables.get("a"));
        interpreter.run("a = true || false;");
        Assertions.assertEquals(new BooleanType(true), interpreter.variables.get("a"));
        interpreter.run("a = false || true;");
        Assertions.assertEquals(new BooleanType(true), interpreter.variables.get("a"));
        interpreter.run("a = true || true;");
        Assertions.assertEquals(new BooleanType(true), interpreter.variables.get("a"));

        // Boolean not
        interpreter.run("a = !true;");
        Assertions.assertEquals(new BooleanType(false), interpreter.variables.get("a"));
        interpreter.run("a = !false;");
        Assertions.assertEquals(new BooleanType(true), interpreter.variables.get("a"));
    }

    @Test
    @DisplayName("Other Expressions")
    public void otherExpressions() {
        // List expression
        interpreter.run("a = [1, \"2\", null];");
        List<Type> list = new ArrayList<>();
        list.add(new IntegerType(1));
        list.add(new StringType("2"));
        list.add(new NullType());
        Assertions.assertEquals(new ListType(list), interpreter.variables.get("a"));

        // Dict expression
        interpreter.run("""
                a = {
                    "a": 1,
                    "b": 2
                };
                """);
        Map<StringType, Type> dict = new HashMap<>();
        dict.put(new StringType("a"), new IntegerType(1));
        dict.put(new StringType("b"), new IntegerType(2));
        Assertions.assertEquals(new DictType(dict), interpreter.variables.get("a"));

        // Assignment expression
        interpreter.run("a = b := 1;");
        Assertions.assertEquals(new IntegerType(1), interpreter.variables.get("a"));
        Assertions.assertEquals(new IntegerType(1), interpreter.variables.get("b"));
    }

    @Test
    @DisplayName("Regular Variable Assignment")
    public void regularVariableAssignment() {
        // Regular variable assignment
        interpreter.run("a = 1;");
        Assertions.assertTrue(interpreter.variables.containsKey("a"));
    }

    @Test
    @DisplayName("Arithmetic Variable Assignment")
    public void variableVariableAssignment() {
        // Exponentiate variable assignment
        interpreter.run("""
                a = 2;
                a **= 5;
                """);
        Assertions.assertEquals(new IntegerType(32), interpreter.variables.get("a"));

        // Multiplication variable assignment
        interpreter.run("""
                a = 2;
                a *= 5;
                """);
        Assertions.assertEquals(new IntegerType(10), interpreter.variables.get("a"));

        // Division variable assignment
        interpreter.run("""
                a = 10;
                a /= 2;
                """);
        Assertions.assertEquals(new FloatType(5.0), interpreter.variables.get("a"));

        // Floor division variable assignment
        interpreter.run("""
                a = 1;
                a //= 3;
                """);
        Assertions.assertEquals(new IntegerType(0), interpreter.variables.get("a"));

        // Modulo variable assignment
        interpreter.run("""
                a = 10;
                a %= 3;
                """);
        Assertions.assertEquals(new IntegerType(1), interpreter.variables.get("a"));

        // Addition variable assignment
        interpreter.run("""
                a = 1;
                a += 1;
                """);
        Assertions.assertEquals(new IntegerType(2), interpreter.variables.get("a"));

        // Subtraction variable assignment
        interpreter.run("""
                a = 2;
                a -= 1;
                """);
        Assertions.assertEquals(new IntegerType(1), interpreter.variables.get("a"));
    }

    @Test
    @DisplayName("Bitwise Variable Assignment")
    public void bitwiseVariableAssignment() {
        // Bitwise and variable assignment
        interpreter.run("""
                a = 1;
                a &= 1;
                """);
        Assertions.assertEquals(new IntegerType(1), interpreter.variables.get("a"));
        interpreter.run("""
                a = 1;
                a &= 2;
                """);
        Assertions.assertEquals(new IntegerType(0), interpreter.variables.get("a"));

        // Bitwise xor variable assignment
        interpreter.run("""
                a = 0;
                a ^= 0;
                """);
        Assertions.assertEquals(new IntegerType(0), interpreter.variables.get("a"));
        interpreter.run("""
                a = 1;
                a ^= 0;
                """);
        Assertions.assertEquals(new IntegerType(1), interpreter.variables.get("a"));
        interpreter.run("""
                a = 0;
                a ^= 1;
                """);
        Assertions.assertEquals(new IntegerType(1), interpreter.variables.get("a"));
        interpreter.run("""
                a = 1;
                a ^= 1;
                """);
        Assertions.assertEquals(new IntegerType(0), interpreter.variables.get("a"));

        // Bitwise or variable assignment
        interpreter.run("""
                a = 0;
                a |= 0;
                """);
        Assertions.assertEquals(new IntegerType(0), interpreter.variables.get("a"));
        interpreter.run("""
                a = 1;
                a |= 0;
                """);
        Assertions.assertEquals(new IntegerType(1), interpreter.variables.get("a"));
        interpreter.run("""
                a = 0;
                a |= 1;
                """);
        Assertions.assertEquals(new IntegerType(1), interpreter.variables.get("a"));
        interpreter.run("""
                a = 1;
                a |= 1;
                """);
        Assertions.assertEquals(new IntegerType(1), interpreter.variables.get("a"));
    }

    @Test
    @DisplayName("Statements")
    public void statements() {
        // If statement
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
        
        // While loops
        interpreter.run("""
                i = 0;
                while (i < 5) {
                    i = i + 1;
                }
                """);
        Assertions.assertEquals(new IntegerType(5), interpreter.variables.get("i"));
        
        // Functions
        interpreter.run("""
                function add(a, b) {
                    return a + b;
                    return 1;
                }
                result = add(1, 1);
                """);
        Assertions.assertEquals(new IntegerType(2), interpreter.variables.get("result"));
    }

    @Test
    @DisplayName("Utility Functions")
    public void utilityFunctions() {
        // Parse number
        NumberType intResult = NumberType.parseNumber("1");
        Assertions.assertTrue(intResult instanceof IntegerType);
        NumberType floatResult = NumberType.parseNumber("1.0");
        Assertions.assertTrue(floatResult instanceof FloatType);
    }
}
