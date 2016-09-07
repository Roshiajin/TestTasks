package com.epam.testtasks;

import java.util.List;

public class DataChecker {
	private ItemRepo itemRepo = new Repo();

    private List<Item> itemsFromRepo = itemRepo.getItems();
	
	public boolean isDataChanged(List itemsFromUI) {
	/* Implement me*/

        if (itemsFromUI.size() != itemsFromRepo.size()) {
            return true;
        }
        else return !itemsFromUI.containsAll(itemsFromRepo);

	}
}