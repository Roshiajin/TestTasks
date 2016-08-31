package epam.testtasks;

import java.util.ArrayList;
import java.util.List;

public class Repo implements ItemRepo {
	
	@Override
	public List getItems() {
		
		List<Item> itemList = new ArrayList<Item>();
		
		itemList.add(new Item(new Long(1), "name1", "desc1"));
		itemList.add(new Item(new Long(2), "name2", "desc2"));
		itemList.add(new Item(new Long(3), "name3", "desc3"));
		
		return itemList;
		
	}

}
