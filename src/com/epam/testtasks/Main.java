/**
 * 
 */
package com.epam.testtasks;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alexander_Gaptullin
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Item> itemListUI = new ArrayList<Item>();
		
		DataChecker dataChecker = new DataChecker();
		
		itemListUI.add(new Item(new Long(1), "name1", "desc1"));
		itemListUI.add(new Item(new Long(2), "name2", "desc2"));
		itemListUI.add(new Item(new Long(3), "name3", "desc3"));
		
		//itemListUI.forEach(e -> System.out.println(e.getItemId() + " " + e.getName() + " " + e.getDesc()));
		
		if (dataChecker.isDataChanged(itemListUI)) {
			System.out.println("true");
		}
		else {
			 System.out.println("false");
		}

	}

}
