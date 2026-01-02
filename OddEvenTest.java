package lab11;

import static org.junit.Assert.*;
import org.junit.Test;

public class OddEvenTest {

    NumberUtils obj = new NumberUtils();

    @Test
    public void testOdd() {
        assertTrue(obj.isOdd(5));
    }

    @Test
    public void testEven() {
        assertTrue(obj.isEven(4));
    }
}
