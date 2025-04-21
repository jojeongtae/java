public interface CartInterface {
    boolean isCartInItem(String id);
    void clearCart();
    Item removeCartItem(String id);
    void appendItem(Item item);
    void inCreaseItemCount(String id);
    Item deCreaseItemCount(String id);
    void removeCartItem(int index);
    void printCart();
}
//Item으로 사용하는이유는 범용성을 위해서 item으로 바꿔놓음
//Book이면 사용하는게 book만가능하니까ㅇㅇ