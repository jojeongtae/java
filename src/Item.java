public class Item {
    String itemId;
    String names;
    int price;

    public Item(String itemId, String name, int price) {
        this.itemId = itemId;
        this.names = name;
        this.price = price;
    }

    public String getItemId() {
        return itemId;
    }

    public String getNames() {
        return names;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
