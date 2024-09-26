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
        assertEquals(2, Main.squareRoot(4), 0.001); // √4 = 2
        assertEquals(0, Main.squareRoot(0), 0.001); // √0 = 0
        assertTrue(Double.isNaN(Main.squareRoot(-1))); // √-1 is undefined (NaN)
    }

    // Test for natural logarithm function
    @Test
    public void testNaturalLogarithm() {
        assertEquals(0, Main.naturalLogarithm(1), 0.001); // ln(1) = 0
        assertEquals(1.609, Main.naturalLogarithm(5), 0.001); // ln(5) = 1.609
        assertTrue(Double.isNaN(Main.naturalLogarithm(-1))); // ln(-1) is undefined (NaN)
    }

    // Test for power function
    @Test
    public void testPower() {
        assertEquals(8, Main.power(2, 3), 0.001); // 2^3 = 8
        assertEquals(1, Main.power(2, 0), 0.001); // 2^0 = 1
        assertEquals(0.25, Main.power(2, -2), 0.001); // 2^-2 = 0.25
        assertEquals(1, Main.power(0, 0), 0.001); // 0^0 = 1
    }
}
