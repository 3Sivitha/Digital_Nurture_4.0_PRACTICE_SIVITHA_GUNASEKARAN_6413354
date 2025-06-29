import org.junit.*;
import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calc;

    @Before  // Runs before each test
    public void setUp() {
        System.out.println("Initializing calculator...");
        calc = new Calculator();
    }

    @After  // Runs after each test
    public void tearDown() {
        System.out.println("Test completed");
    }

    @Test
    public void testAdd_AAA() {
        // Arrange
        int a = 2, b = 3;
        int expected = 5;

        // Act
        int result = calc.add(a, b);

        // Assert
        assertEquals(expected, result);  // Fixed: Using assertEquals instead of assertArrayEquals
    }
}