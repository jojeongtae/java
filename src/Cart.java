public class Cart {
    private CartItem[] mCart = new CartItem[3];
    private int mCartItemCount = 0;
    private int mCartListCount = 0;
    public boolean isCartInBook(String bookId) {
        for (int i = 0; i < mCartItemCount; i++) {
            if (bookId.equals(mCart[i].getBook().getId())) {
                return true;
            }
        }
        return false;
    }
    public void appendBook(Book book){
        this.mCart[this.mCartItemCount++] = new CartItem(book);
    }
    public void inCreaseBookCount(String bookId){
        for (int i = 0 ;i<this.mCartItemCount ;i++){
            if (bookId.equals(this.mCart[i].getBook().getId())){
                this.mCart[i].setCount(this.mCart[i].getCount()+1);
                mCartListCount++;
            }
        }
    }
    public void cartInbookList(){
        for (int i =0 ;i<mCartItemCount ;i++){

        }
    }

}
