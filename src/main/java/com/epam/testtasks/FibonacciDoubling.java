package com.epam.testtasks;

import java.math.BigInteger;

/**
 * Created by Alexander_Gaptullin on 9/6/2016.
 */
public class FibonacciDoubling implements Fibonacci{

    @Override
    public BigInteger generate(int nElement) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        int m = 0;
        Fibonacci fibonacciStandard = new FibonacciStandard();

        for (int i = 31 - Integer.numberOfLeadingZeros(nElement); i >= 0; i--) {
            assert a.equals(fibonacciStandard.generate(m));
            assert b.equals(fibonacciStandard.generate(m+1));

            // Double it
            BigInteger d = a.multiply(b.shiftLeft(1).subtract(a));
            BigInteger e = a.multiply(a).add(b.multiply(b));
            a = d;
            b = e;
            m *= 2;
            assert a.equals(fibonacciStandard.generate(m));
            assert b.equals(fibonacciStandard.generate(m+1));

            // Advance by one conditionally
            if (((nElement >>> i) & 1) != 0) {
                BigInteger c = a.add(b);
                a = b;
                b = c;
                m++;
                assert a.equals(fibonacciStandard.generate(m));
                assert b.equals(fibonacciStandard.generate(m+1));
            }
        }
        return a;
    }
}
