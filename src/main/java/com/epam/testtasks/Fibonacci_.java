package com.epam.testtasks;

import java.math.BigInteger;

/**
 * Created by Alexander_Gaptullin on 9/1/2016.
 */
public class Fibonacci_ {

    //Standard method
    public static BigInteger standardN(int nElement) {
        BigInteger result = BigInteger.ZERO;
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

    //Matrix method
    public static BigInteger MatrixN(int nElement) {
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

    //Doubling Method
    public static BigInteger DoublingN(int n) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        int m = 0;
        for (int i = 31 - Integer.numberOfLeadingZeros(n); i >= 0; i--) {
            assert a.equals(standardN(m));
            assert b.equals(standardN(m+1));

            // Double it
            BigInteger d = multiply(a, b.shiftLeft(1).subtract(a));
            BigInteger e = multiply(a, a).add(multiply(b, b));
            a = d;
            b = e;
            m *= 2;
            assert a.equals(standardN(m));
            assert b.equals(standardN(m+1));

            // Advance by one conditionally
            if (((n >>> i) & 1) != 0) {
                BigInteger c = a.add(b);
                a = b;
                b = c;
                m++;
                assert a.equals(standardN(m));
                assert b.equals(standardN(m+1));
            }
        }
        return a;
    }


}
