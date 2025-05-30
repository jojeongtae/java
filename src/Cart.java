public class Cart implements CartInterface{
    private CartItem[] mCart = new CartItem[3];
    private int mCartItemCount = 0;
@Override
    public boolean isCartInItem(String bookId) {
        for (int i = 0; i < mCartItemCount; i++) {
            if (bookId.equals(mCart[i].getBook().getItemId())) {
                return true;
            }
        }
        return false;
    }
    @Override
    public void appendItem(Item book) {
        this.mCart[this.mCartItemCount++] = new CartItem((Book) book); //다운 캐스팅
    }
@Override
    public void inCreaseItemCount(String bookId) {
        for (int i = 0; i < this.mCartItemCount; i++) {
            if (bookId.equals(this.mCart[i].getBook().getItemId())) {
                this.mCart[i].setCount(this.mCart[i].getCount() + 1);
            }
        }
    }
    @Override
    public void clearCart() {
//        for (int i = 0; i < this.mCartItemCount; i++) {
//            mCart[i] = null;
//        }
        this.mCart = new CartItem[3];
        mCartItemCount = 0;
    }
@Override
    public Item deCreaseItemCount(String bookId) {
        Book book = null;  //지역변수는 초기 값을 null이라도 안넣어주면 안에 뭐가 들어있는지 알 수 없음
        for (int i = 0; i < this.mCartItemCount; i++) {
            if (this.mCart[i].getBook().getItemId().equals(bookId)) {
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
@Override
    public void removeCartItem(int index){
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
    @Override
    public Item removeCartItem(String bookId){
        Book book = null;
        for (int i =0 ;i<mCartItemCount ;i++){
            if (bookId.equals(mCart[i].getBook().getItemId())){
               book = mCart[i].getBook();
                removeCartItem(i);

            }
        }
        return book;
    }
    @Override
    public void printCart(){
        System.out.println("-----------------------------------------------");
        System.out.println("도서 ID \t |수량\t|총가격");
        for (int i = 0; i < mCartItemCount; i++) {
            System.out.print((i+1)+" "+ this.mCart[i].getBook().getItemId()+"\t |");
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


