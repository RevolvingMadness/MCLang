import com.revolvingmadness.mclang.MCLangInterpreter;
import com.revolvingmadness.mclang.Variable;
import com.revolvingmadness.mclang.types.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

public class MCLangTests {
    MCLangInterpreter interpreter = new MCLangInterpreter();
    
    public Type getVariable(String name) {
        for (Variable variable : interpreter.variables) {
            if (Objects.equals(variable.name, name))
                return variable.value;
        }
        return null;
    }

    @Test
    @DisplayName("Literal Expressions")
    public void literalExpressions() {
        // Numbers
        interpreter.runCode("a = 1;");
        Assertions.assertEquals(new IntegerType(1), getVariable("a"));
        interpreter.runCode("a = -1;");
        Assertions.assertEquals(new IntegerType(-1), getVariable("a"));

        // Null types
        interpreter.runCode("a = null;");
        Assertions.assertEquals(new NullType(), getVariable("a"));

        // Strings
        interpreter.runCode("a = \"1\";");
        Assertions.assertEquals(new StringType("1"), getVariable("a"));
        interpreter.runCode("a = \"1\" * 3;");
        Assertions.assertEquals(new StringType("111"), getVariable("a"));

        // Booleans
        interpreter.runCode("a = true;");
        Assertions.assertEquals(new BooleanType(true), getVariable("a"));
        interpreter.runCode("a = false;");
        Assertions.assertEquals(new BooleanType(false), getVariable("a"));

        // Identifiers / Variables
        interpreter.runCode("""
                a = 1;
                b = 1;
                c = a + b;
                """);
        Assertions.assertEquals(new IntegerType(2), getVariable("c"));
    }

    @Test
    @DisplayName("Arithmetic Expressions")
    public void arithmeticExpressions() {
        // Parenthesis
        interpreter.runCode("a = 1 + 2 * 3;");
        Assertions.assertEquals(new IntegerType(7), getVariable("a"));
        interpreter.runCode("a = (1 + 2) * 3;");
        Assertions.assertEquals(new IntegerType(9), getVariable("a"));

        // Exponentiation
        interpreter.runCode("a = 2 ** 2;");
        Assertions.assertEquals(new IntegerType(4), getVariable("a"));
        interpreter.runCode("a = 2 ** 2.1;");
//        Assertions.assertEquals(new FloatType(4.287093566752561), getVariable("a"));

        // Multiplication
        interpreter.runCode("a = 2 * 5;");
        Assertions.assertEquals(new IntegerType(10), getVariable("a"));
        interpreter.runCode("a = \"0\" * 2;");
        Assertions.assertEquals(new StringType("00"), getVariable("a"));

        // Division
        interpreter.runCode("a = 1 / 3;");
        Assertions.assertEquals(new FloatType(0.33333334), getVariable("a"));

        // Floor division
        interpreter.runCode("a = 1 // 3;");
        Assertions.assertEquals(new IntegerType(0), getVariable("a"));

        // Modulo
        interpreter.runCode("a = 10 % 3;");
        Assertions.assertEquals(new IntegerType(1), getVariable("a"));

        // Addition
        interpreter.runCode("a = 5 + 5;");
        Assertions.assertEquals(new IntegerType(10), getVariable("a"));

        // Subtraction
        interpreter.runCode("a = 10 - 5;");
        Assertions.assertEquals(new IntegerType(5), getVariable("a"));
    }

    @Test
    @DisplayName("Comparison Expressions")
    public void comparisonExpressions() {
        // Less than
        interpreter.runCode("a = 1 < 2;");
        Assertions.assertEquals(new BooleanType(true), getVariable("a"));
        interpreter.runCode("a = 2 < 1;");
        Assertions.assertEquals(new BooleanType(false), getVariable("a"));

        // Less than or equal to
        interpreter.runCode("a = 1 <= 2;");
        Assertions.assertEquals(new BooleanType(true), getVariable("a"));
        interpreter.runCode("a = 1 <= 1;");
        Assertions.assertEquals(new BooleanType(true), getVariable("a"));
        interpreter.runCode("a = 2 <= 1;");
        Assertions.assertEquals(new BooleanType(false), getVariable("a"));

        // Greater than
        interpreter.runCode("a = 2 > 1;");
        Assertions.assertEquals(new BooleanType(true), getVariable("a"));
        interpreter.runCode("a = 1 > 2;");
        Assertions.assertEquals(new BooleanType(false), getVariable("a"));

        // Greater than or equal to
        interpreter.runCode("a = 2 >= 1;");
        Assertions.assertEquals(new BooleanType(true), getVariable("a"));
        interpreter.runCode("a = 1 >= 1;");
        Assertions.assertEquals(new BooleanType(true), getVariable("a"));
        interpreter.runCode("a = 1 >= 2;");
        Assertions.assertEquals(new BooleanType(false), getVariable("a"));

        // Not equal to
        interpreter.runCode("a = 1 != 2;");
        Assertions.assertEquals(new BooleanType(true), getVariable("a"));
        interpreter.runCode("a = 1 != 1;");
        Assertions.assertEquals(new BooleanType(false), getVariable("a"));

        // Equal to
        interpreter.runCode("a = 1 == 1;");
        Assertions.assertEquals(new BooleanType(true), getVariable("a"));
        interpreter.runCode("a = 1 == 2;");
        Assertions.assertEquals(new BooleanType(false), getVariable("a"));
    }

    @Test
    @DisplayName("Bitwise Expressions")
    public void bitwiseExpressions() {
        // Bitwise and
        interpreter.runCode("a = 1 & 1;");
        Assertions.assertEquals(new IntegerType(1), getVariable("a"));
        interpreter.runCode("a = 1 & 2;");
        Assertions.assertEquals(new IntegerType(0), getVariable("a"));

        // Bitwise xor
        interpreter.runCode("a = 0 ^ 0;");
        Assertions.assertEquals(new IntegerType(0), getVariable("a"));
        interpreter.runCode("a = 0 ^ 1;");
        Assertions.assertEquals(new IntegerType(1), getVariable("a"));
        interpreter.runCode("a = 1 ^ 0;");
        Assertions.assertEquals(new IntegerType(1), getVariable("a"));
        interpreter.runCode("a = 1 ^ 1;");
        Assertions.assertEquals(new IntegerType(0), getVariable("a"));

        // Bitwise or
        interpreter.runCode("a = 0 | 0;");
        Assertions.assertEquals(new IntegerType(0), getVariable("a"));
        interpreter.runCode("a = 0 | 1;");
        Assertions.assertEquals(new IntegerType(1), getVariable("a"));
        interpreter.runCode("a = 1 | 0;");
        Assertions.assertEquals(new IntegerType(1), getVariable("a"));
        interpreter.runCode("a = 1 | 1;");
        Assertions.assertEquals(new IntegerType(1), getVariable("a"));
    }

    @Test
    @DisplayName("Boolean Expressions")
    public void booleanExpressions() {
        // Boolean and
        interpreter.runCode("a = true && true;");
        Assertions.assertEquals(new BooleanType(true), getVariable("a"));
        interpreter.runCode("a = true && false;");
        Assertions.assertEquals(new BooleanType(false), getVariable("a"));

        // Boolean or
        interpreter.runCode("a = false || false;");
        Assertions.assertEquals(new BooleanType(false), getVariable("a"));
        interpreter.runCode("a = true || false;");
        Assertions.assertEquals(new BooleanType(true), getVariable("a"));
        interpreter.runCode("a = false || true;");
        Assertions.assertEquals(new BooleanType(true), getVariable("a"));
        interpreter.runCode("a = true || true;");
        Assertions.assertEquals(new BooleanType(true), getVariable("a"));

        // Boolean not
        interpreter.runCode("a = !true;");
        Assertions.assertEquals(new BooleanType(false), getVariable("a"));
        interpreter.runCode("a = !false;");
        Assertions.assertEquals(new BooleanType(true), getVariable("a"));
    }

    @Test
    @DisplayName("Other Expressions")
    public void otherExpressions() {
        // List expression
        interpreter.runCode("a = [1, \"2\", null];");
        List<Type> list = new ArrayList<>();
        list.add(new IntegerType(1));
        list.add(new StringType("2"));
        list.add(new NullType());
        Assertions.assertEquals(new ListType(list), getVariable("a"));

        // Dict expression
        interpreter.runCode("""
                a = {
                    "a": 1,
                    "b": 2
                };
                """);
        Map<StringType, Type> dict = new HashMap<>();
        dict.put(new StringType("a"), new IntegerType(1));
        dict.put(new StringType("b"), new IntegerType(2));
        Assertions.assertEquals(new DictType(dict), getVariable("a"));

        // Assignment expression
        interpreter.runCode("a = b := 1;");
        Assertions.assertEquals(new IntegerType(1), getVariable("a"));
        Assertions.assertEquals(new IntegerType(1), getVariable("b"));
    }

    @Test
    @DisplayName("Regular Variable Assignment")
    public void regularVariableAssignment() {
        // Regular variable assignment
        interpreter.runCode("a = 1;");
        Assertions.assertTrue(interpreter.variables.contains(new Variable("a", new IntegerType(1))));
    }

    @Test
    @DisplayName("Arithmetic Variable Assignment")
    public void variableVariableAssignment() {
        // Exponentiate variable assignment
        interpreter.runCode("""
                a = 2;
                a **= 5;
                """);
        Assertions.assertEquals(new IntegerType(32), getVariable("a"));

        // Multiplication variable assignment
        interpreter.runCode("""
                a = 2;
                a *= 5;
                """);
        Assertions.assertEquals(new IntegerType(10), getVariable("a"));

        // Division variable assignment
        interpreter.runCode("""
                a = 10;
                a /= 2;
                """);
        Assertions.assertEquals(new FloatType(5.0), getVariable("a"));

        // Floor division variable assignment
        interpreter.runCode("""
                a = 1;
                a //= 3;
                """);
        Assertions.assertEquals(new IntegerType(0), getVariable("a"));

        // Modulo variable assignment
        interpreter.runCode("""
                a = 10;
                a %= 3;
                """);
        Assertions.assertEquals(new IntegerType(1), getVariable("a"));

        // Addition variable assignment
        interpreter.runCode("""
                a = 1;
                a += 1;
                """);
        Assertions.assertEquals(new IntegerType(2), getVariable("a"));

        // Subtraction variable assignment
        interpreter.runCode("""
                a = 2;
                a -= 1;
                """);
        Assertions.assertEquals(new IntegerType(1), getVariable("a"));
    }

    @Test
    @DisplayName("Bitwise Variable Assignment")
    public void bitwiseVariableAssignment() {
        // Bitwise and variable assignment
        interpreter.runCode("""
                a = 1;
                a &= 1;
                """);
        Assertions.assertEquals(new IntegerType(1), getVariable("a"));
        interpreter.runCode("""
                a = 1;
                a &= 2;
                """);
        Assertions.assertEquals(new IntegerType(0), getVariable("a"));

        // Bitwise xor variable assignment
        interpreter.runCode("""
                a = 0;
                a ^= 0;
                """);
        Assertions.assertEquals(new IntegerType(0), getVariable("a"));
        interpreter.runCode("""
                a = 1;
                a ^= 0;
                """);
        Assertions.assertEquals(new IntegerType(1), getVariable("a"));
        interpreter.runCode("""
                a = 0;
                a ^= 1;
                """);
        Assertions.assertEquals(new IntegerType(1), getVariable("a"));
        interpreter.runCode("""
                a = 1;
                a ^= 1;
                """);
        Assertions.assertEquals(new IntegerType(0), getVariable("a"));

        // Bitwise or variable assignment
        interpreter.runCode("""
                a = 0;
                a |= 0;
                """);
        Assertions.assertEquals(new IntegerType(0), getVariable("a"));
        interpreter.runCode("""
                a = 1;
                a |= 0;
                """);
        Assertions.assertEquals(new IntegerType(1), getVariable("a"));
        interpreter.runCode("""
                a = 0;
                a |= 1;
                """);
        Assertions.assertEquals(new IntegerType(1), getVariable("a"));
        interpreter.runCode("""
                a = 1;
                a |= 1;
                """);
        Assertions.assertEquals(new IntegerType(1), getVariable("a"));
    }

    @Test
    @DisplayName("Statements")
    public void statements() {
        // If statement
        interpreter.runCode("""
                a = true;
                if (a) {
                    b = true;
                } else {
                    b = false;
                }
                """);
        Assertions.assertEquals(new BooleanType(true), getVariable("b"));
        interpreter.runCode("""
                a = false;
                if (a) {
                    b = true;
                } else {
                    b = false;
                }
                """);
        Assertions.assertEquals(new BooleanType(false), getVariable("b"));
        interpreter.runCode("""
                a = 1;
                if (a) {
                    b = true;
                } else {
                    b = false;
                }
                """);
        Assertions.assertEquals(new BooleanType(true), getVariable("b"));
        interpreter.runCode("""
                a = 0;
                if (a) {
                    b = true;
                } else {
                    b = false;
                }
                """);
        Assertions.assertEquals(new BooleanType(false), getVariable("b"));
        interpreter.runCode("""
                a = -1;
                if (a) {
                    b = true;
                } else {
                    b = false;
                }
                """);
        Assertions.assertEquals(new BooleanType(true), getVariable("b"));
        interpreter.runCode("""
                a = "a";
                if (a) {
                    b = true;
                } else {
                    b = false;
                }
                """);
        Assertions.assertEquals(new BooleanType(true), getVariable("b"));
        interpreter.runCode("""
                a = "";
                if (a) {
                    b = true;
                } else {
                    b = false;
                }
                """);
        Assertions.assertEquals(new BooleanType(false), getVariable("b"));
        
        // While loops
        interpreter.runCode("""
                i = 0;
                while (i < 5) {
                    i = i + 1;
                }
                """);
        Assertions.assertEquals(new IntegerType(5), getVariable("i"));
        
        // Functions
        interpreter.runCode("""
                function add(int a, int b) -> int => a + b;
                result = add(1, 1);
                """);
        Assertions.assertEquals(new IntegerType(2), getVariable("result"));
    }

    @Test
    @DisplayName("Classes")
    public void classes() {
        interpreter.runCode("""
                class Calories {
                    Calories(int value) {
                        this.value = value;
                    }
                    
                    function getValue() => this.value;
                }
                
                class Apple {
                    Apple(int calories) {
                        this.calories = new Calories(calories);
                    }
                    
                    function getCalories() => this.calories.getValue();
                }
                
                apple = new Apple(10);
                cals = apple.getCalories();
                """);

        Assertions.assertEquals(new IntegerType(10), getVariable("cals"));
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
