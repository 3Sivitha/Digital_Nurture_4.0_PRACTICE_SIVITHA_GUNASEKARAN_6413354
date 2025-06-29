import org.junit.Test;
import static org.junit.Assert.*;
public class CalculatorTest {
    Calculator calc = new Calculator();
    @Test
    public void testAdd() {
        assertEquals(5, calc.add(2, 3));
    }
    @Test
    public void testIsEven() {
        assertTrue(calc.isEven(4));
        assertFalse(calc.isEven(5));
    }
    @Test
    public void testAssertions() {
        // Equality
        assertEquals(10, calc.add(7, 3));
        // Boolean conditions
        assertTrue(calc.isEven(0));
        assertFalse(calc.isEven(1));
        // Null checks
        String nullStr = null;
        assertNull(nullStr);
        assertNotNull(calc);        // Array equality
        assertArrayEquals(new int[]{1, 2, 3}, new int[]{1, 2, 3});
    }
}