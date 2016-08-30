package com.epam.testtasks;

import java.util.List;

public class Item {
	
	private Long itemId; 
	private String name; 
	private String desc;

	public Item (Long itemId, String name, String desc) {
		this.itemId = itemId;
		this.name = name;
		this.desc = desc;
	}
	
	public Long getItemId() {
		return itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean isEqual = false;
		
		if (this.getClass() == obj.getClass()) {
			Item item = (Item) obj;
			isEqual = (item.itemId != null ? item.itemId.equals(this.itemId) : item.itemId == null) &&
					(item.name != null ? item.name.equals(this.name) : item.name == null) &&
					(item.desc != null ? item.desc.equals(this.desc) : item.desc == null);
		}
		
		return isEqual;
	}

}
