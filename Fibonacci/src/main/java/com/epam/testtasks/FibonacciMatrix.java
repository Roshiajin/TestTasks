package com.epam.testtasks;

import java.math.BigInteger;

/**
 * Created by Alexander_Gaptullin on 9/6/2016.
 */
public class FibonacciMatrix implements Fibonacci {

    @Override
    public BigInteger generate(int nElement) {
        BigInteger[] matrix = {BigInteger.ONE, BigInteger.ONE, BigInteger.ONE, BigInteger.ZERO};
        return matrixPow(matrix, nElement)[1];
    }

    private static BigInteger[] matrixPow(BigInteger[] matrix, int nElement) {
        if (nElement < 0)
            throw new IllegalArgumentException();
        BigInteger[] result = {BigInteger.ONE, BigInteger.ZERO, BigInteger.ZERO, BigInteger.ONE};
        while (nElement != 0) {
            if (nElement % 2 != 0)
                result = matrixMultiply(result, matrix);
            nElement /= 2;
            matrix = matrixMultiply(matrix, matrix);
        }
        return result;
    }

    private static BigInteger[] matrixMultiply(BigInteger[] x, BigInteger[] y) {
        return new BigInteger[] {
                multiply(x[0], y[0]).add(multiply(x[1], y[2])),
                multiply(x[0], y[1]).add(multiply(x[1], y[3])),
                multiply(x[2], y[0]).add(multiply(x[3], y[2])),
                multiply(x[2], y[1]).add(multiply(x[3], y[3]))
        };
    }

    private static BigInteger multiply(BigInteger x, BigInteger y) {
        return x.multiply(y);
    }
}
