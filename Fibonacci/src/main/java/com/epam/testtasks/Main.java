/**
 * 
 */
package com.epam.testtasks;

/**
 * @author Alexander_Gaptullin
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int nFiboElement = 1000;
		long startTime;
		Fibonacci fibonacci = new FibonacciStandard();

		startTime = System.nanoTime();
		System.out.println(nFiboElement + " элемент последовательности Фибоначчи(Standard Method) = " + fibonacci.generate(nFiboElement).toString());
		System.out.printf("Время: %d ms%n", (System.nanoTime() - startTime) / 1000000);

		fibonacci = new FibonacciMatrix();
		startTime = System.nanoTime();
		System.out.println(nFiboElement + " элемент последовательности Фибоначчи(Matrix Method) = " + fibonacci.generate(nFiboElement).toString());
		System.out.printf("Время: %d ms%n", (System.nanoTime() - startTime) / 1000000);

		fibonacci = new FibonacciDoubling();
		startTime = System.nanoTime();
		System.out.println(nFiboElement + " элемент последовательности Фибоначчи(Doubling Method) = " + fibonacci.generate(nFiboElement).toString());
		System.out.printf("Время: %d ms%n", (System.nanoTime() - startTime) / 1000000);


	}

}
