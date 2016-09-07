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
		//DataChecker
		/*
		List<Item> itemListUI = new ArrayList<Item>();
		
		DataChecker dataChecker = new DataChecker();
		
		itemListUI.add(new Item(new Long(2), "name2", "desc2"));
		itemListUI.add(new Item(new Long(1), "name1", "desc1"));
		itemListUI.add(new Item(new Long(3), "name3", "desc3"));
		
		//itemListUI.forEach(e -> System.out.println(e.getItemId() + " " + e.getName() + " " + e.getDesc()));
		
		if (dataChecker.isDataChanged(itemListUI)) {
			System.out.println("Data changed");
		}
		else {
			 System.out.println("Data not changed");
		}
		*/
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
