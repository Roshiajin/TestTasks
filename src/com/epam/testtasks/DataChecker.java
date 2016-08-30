package com.epam.testtasks;

import java.util.List;

public class DataChecker {
	private ItemRepo itemRepo;
	
	public boolean isDataChanged(List itemsFromUI) {
	/* Implement me*/
	itemRepo = new Repo();
	
	return itemsFromUI.containsAll(itemRepo.getItems()) && itemRepo.getItems().containsAll(itemsFromUI);
		
	//return true;
	}
	
	
}
