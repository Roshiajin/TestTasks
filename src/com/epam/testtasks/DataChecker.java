package com.epam.testtasks;

import java.util.List;

public class DataChecker {
	private ItemRepo itemRepo = new Repo();
	
	public boolean isDataChanged(List itemsFromUI) {
	/* Implement me*/

        if (itemsFromUI.size() != itemRepo.getItems().size()) {
            return false;
        }
        else return itemsFromUI.containsAll(itemRepo.getItems());

	}
	
}
