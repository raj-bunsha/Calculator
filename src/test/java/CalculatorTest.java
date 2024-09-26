import org.junit.Test;
import org.example.Main;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class CalculatorTest {

    // Test for factorial function
    @Test
    public void testFactorial() {
        assertEquals(1, Main.factorial(0)); // 0! = 1
        assertEquals(1, Main.factorial(1)); // 1! = 1
        assertEquals(120, Main.factorial(5)); // 5! = 120
        assertEquals(720, Main.factorial(6)); // 6! = 720
        assertEquals(1, Main.factorial(1)); // Edge case, 1! = 1
    }

    // Test for square root function
    @Test
    public void testSquareRoot() {
        assertEquals(4, Math.sqrt(16), 0.001); // √16 = 4
        assertEquals(0, Math.sqrt(0), 0.001);  // √0 = 0
        assertEquals(1, Math.sqrt(1), 0.001);  // √1 = 1
        assertEquals(1.414, Math.sqrt(2), 0.001); // √2 = approx 1.414
    }

    // Test for natural logarithm function
    @Test
    public void testNaturalLogarithm() {
        assertEquals(0, Math.log(1), 0.001); // ln(1) = 0
        assertEquals(1, Math.log(Math.E), 0.001); // ln(e) = 1
        assertTrue(Double.isInfinite(Math.log(0))); // ln(0) is undefined (negative infinity)
    }

    // Test for power function
    @Test
    public void testPower() {
        assertEquals(8, Math.pow(2, 3), 0.001);  // 2^3 = 8
        assertEquals(1, Math.pow(5, 0), 0.001);  // 5^0 = 1
        assertEquals(0.125, Math.pow(2, -3), 0.001); // 2^-3 = 0.125
        assertEquals(1, Math.pow(1, 100), 0.001); // 1^100 = 1
    }
}
