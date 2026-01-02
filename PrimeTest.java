package lab11;

import static org.junit.Assert.*;
import org.junit.Test;

public class PrimeTest {

    NumberUtils obj = new NumberUtils();

    @Test
    public void test() {
        // Replace the default fail() line with actual test
        assertTrue(obj.isPrime(7));  // 7 is prime, test should pass
    }
}
