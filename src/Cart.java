public class Cart {
    private CartItem[] mCart = new CartItem[3];
    private int mCartItemCount = 0;
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
            }
        }
    }
    public void clearCart(){
        mCartItemCount = 0;
    }
    public void removeCartItem(int count){
        for(int i = 0 ;i<mCartItemCount ;i++){
            mCart[i] = mCart[i+1];
        }
        mCart[mCartItemCount-1] = null;
        mCartItemCount--;
    }
    public int getmCartItemCount(){
        return mCartItemCount;
    }
    public CartItem[] getCartItems(){
        return mCart;
    }
}
