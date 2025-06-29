import org.junit.Test;
import static org.junit.Assert.*;

public class SetupVerificationTest {

    @Test
    public void testJUnitIsWorking() {
        System.out.println("JUnit is properly configured!");
        assertTrue(true); // Simple passing assertion
    }

    @Test
    public void testBasicMath() {
        assertEquals(4, 2 + 2); // Verify basic calculations
    }

    @Test
    public void testStringOperations() {
        String hello = "Hello";
        assertNotNull(hello);
        assertEquals("Hello", hello);
    }
}