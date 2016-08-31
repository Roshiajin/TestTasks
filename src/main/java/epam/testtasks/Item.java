package epam.testtasks;

import java.util.List;

public class Item {

    private Long itemId;
    private String name;
    private String desc;

    Item(Long itemId, String name, String desc) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        return itemId.equals(item.itemId) &&
                (name != null ? name.equals(item.name) : item.name == null) &&
                (desc != null ? desc.equals(item.desc) : item.desc == null);

    }

    @Override
    public int hashCode() {
        int result = itemId.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (desc != null ? desc.hashCode() : 0);
        return result;
    }


}
