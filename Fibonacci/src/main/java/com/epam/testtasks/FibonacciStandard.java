package com.epam.testtasks;

import java.math.BigInteger;

/**
 * Created by Alexander_Gaptullin on 9/6/2016.
 */
public class FibonacciStandard implements Fibonacci{

    @Override
    public BigInteger generate(int nElement) {
        BigInteger result = BigInteger.ZERO;;
        BigInteger first = BigInteger.ONE;
        BigInteger second = BigInteger.ZERO;

        if (nElement < 0)
            throw new IllegalArgumentException();

        if (nElement == 0) {
            return result;
        }
        else
        {
            for (int i = 1; i <= nElement; i++) {
                result = first.add(second);
                first = second;
                second = result;
            }
        }

        return result;
    }
}
