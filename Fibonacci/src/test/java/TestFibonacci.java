/**
 * Created by Alexander_Gaptullin on 9/5/2016.
 */

import com.epam.testtasks.*;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;

public class TestFibonacci extends Assert{

    BigInteger expected = new BigInteger("55");
    Fibonacci fibonacci;

    @Test
    public void testStandartN() {
        fibonacci = new FibonacciStandard();
        BigInteger result = fibonacci.generate(10);
        assertEquals(expected, result);
    }

    @Test
    public void testMatrixN() {
        fibonacci = new FibonacciMatrix();
        BigInteger result = fibonacci.generate(10);
        assertEquals(expected, result);
    }

    @Test
    public void testDoublingN() {
        fibonacci = new FibonacciDoubling();
        BigInteger result = fibonacci.generate(10);
        assertEquals(expected, result);
    }

}
