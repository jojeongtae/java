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

    public void appendBook(Book book) {
        this.mCart[this.mCartItemCount++] = new CartItem(book);
    }

    public void inCreaseBookCount(String bookId) {
        for (int i = 0; i < this.mCartItemCount; i++) {
            if (bookId.equals(this.mCart[i].getBook().getId())) {
                this.mCart[i].setCount(this.mCart[i].getCount() + 1);
            }
        }
    }

    public void clearCart() {
//        for (int i = 0; i < this.mCartItemCount; i++) {
//            mCart[i] = null;
//        }
        this.mCart = new CartItem[3];
        mCartItemCount = 0;
    }

    public Book deCreaseBookCount(String bookId) {
        Book book = null;  //지역변수는 초기 값을 null이라도 안넣어주면 안에 뭐가 들어있는지 알 수 없음
        for (int i = 0; i < this.mCartItemCount; i++) {
            if (this.mCart[i].getBook().getId().equals(bookId)) {
                this.mCart[i].setCount(this.mCart[i].getCount() - 1);
                book = this.mCart[i].getBook(); //여기에 getId하면 안됨 물어보기
                if (this.mCart[i].getCount() == 0) {
                    System.out.println("수량이 없어서 장바구니에서 삭제되었습니다.");
                    this.removeCartItem(i);
                    break;
                }
            }
        }
        return book;
    }
    private void removeCartItem(int index){
        for (int i =index;i<this.mCartItemCount-1 ;i++){
            this.mCart[i] = this.mCart[i+1];
        }
        this.mCart[mCartItemCount-1] =null;
        this.mCartItemCount--;
//자바스크립트에서 filter방식 둘의 차이는 기존배열을 건드냐 새 배열을 만드냐 차이
//    CartItem[] newCartItemList = new CartItem[3];
//    int number =0;
//    for (int i = 0 ;i<this.mCartItemCount ;i++){
//        if (i !=index){
//            newCartItemList[number++] = this.mCart[i];
//        }
//    }
//    this.mCart = newCartItemList;
//    this.mCartItemCount--;
    }
    public Book removeCartItem(String bookId){
        Book book = null;
        for (int i =0 ;i<mCartItemCount ;i++){
            if (bookId.equals(mCart[i].getBook().getId())){
               book = mCart[i].getBook();
                removeCartItem(i);

            }
        }
        return book;
    }
    public void printCart(){
        System.out.println("-----------------------------------------------");
        System.out.println("도서 ID \t |수량\t|총가격");
        for (int i = 0; i < mCartItemCount; i++) {
            System.out.print((i+1)+" "+ this.mCart[i].getBook().getId()+"\t |");
            System.out.println(this.mCart[i].getCount()+"\t |"+this.mCart[i].getTotalPrice());
        }
        System.out.println("-----------------------------------------------");

    }
    public int cartBill(){
        int totalPrice = 0;
        for (int i = 0 ;i<mCartItemCount ;i++){
          totalPrice += mCart[i].getTotalPrice();
        }
        return totalPrice;
    }

}


