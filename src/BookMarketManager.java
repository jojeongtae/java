import java.util.Scanner;

public class BookMarketManager {
    private Book[] mBook = new Book[3];
    Cart mCart = new Cart();

    public BookMarketManager() {
        this.mBook[0] = new Book("ISBN1234", "쉽게 배우는 JSP 웹프로그래밍", 27000, "송미영", "단계별로 쇼핑몰을 구현하며 배우는 JSP 웹프로그래밍 ", "IT전문서", "2018/10/08");
        this.mBook[1] = new Book("ISBN1235", "안드로이드 프로그래밍", 33000, "우재남", "실습 단계별 명쾌한 멘토링! ", "IT전문서", "2022/01/22");
        this.mBook[2] = new Book("ISBN1235", "스크래치", 22000, "고광일", "컴퓨팅 사고력을 키우는 블록 코딩", "컴퓨터 입문", "2019/06/10");
    }

    public void run() {
        Scanner input = new Scanner(System.in);
        System.out.print("당신의 이름을 입력하세요 : ");
        String name = input.nextLine();
        System.out.print("연락처를 입력하세요 : ");
        String phone = input.nextLine();
        Person user = new Person(name, phone);
        while (true) {
            boolean endflag = false;
            menuIntroduction();
            System.out.print("메뉴 번호를 선택하세요: ");
            int select = input.nextInt();
            switch (select) {
                case MenuManager.MENUGUESTINFO:
                    menuGuestInfo(user);
                    break;
                case MenuManager.MENUCARTITEMLIST:
                    menuCartItemList();
                    break;
                case MenuManager.MENUCARTCLEAR:
                    menuCartClear();
                    break;
                case MenuManager.MENUCARTADDITEM:
                    menuCartAddItem();
                    break;
                case MenuManager.MENUCARTREMOVEITEMCOUNT:
                    menuCartRemoveItemCount();
                    break;
                case MenuManager.MENUCARTREMOVEITEM:
                    menuCartRemoveItem();
                    break;
                case MenuManager.MENUCARTBILL:
                    menuCartBill();
                    break;
                case 8:
                    endflag = true;
                    System.out.println("종료");
                    break;
            }

            if (endflag) {
                break;
            }
        }
    }

    public void menuIntroduction() {
        String greeting = "Welcome to Shopping Mall";
        String tagline = "Welcome to Book Market!";

        System.out.println("***********************************************");
        System.out.println("\t" + greeting);
        System.out.println("\t" + tagline);
        System.out.println("***********************************************");
        System.out.println("1. 고객정보 확인하기 \t\t\t4. 장바구니에 항목 추가하기");
        System.out.println("2. 장바구니 상품 목록 보기\t\t5. 장바구니의 항목 수량 줄이기");
        System.out.println("3. 장바구니 비우기\t\t\t\t6. 장바구니의 항목 삭제하기");
        System.out.println("7. 영수증 표시하기\t\t\t\t8. 종료");
        System.out.println("***********************************************");
    }

    public void menuGuestInfo(Person user) {
        System.out.println("현재 고객 정보 : ");
        System.out.println("이름 " + user.getName() + " 전화번호 " + user.getPhone());
    }

    public void menuCartItemList() {
        System.out.println("장바구니 상품 목록 보기");
        System.out.println("-----------------------------------------------");
        System.out.println("도서 ID \t |수량\t|총가격");
        for (int i =0 ;i<mBook.length ;i++) {
            if (mCart.)
        }
    }

    public void menuCartClear() {
        System.out.println("장바구니 비우기");
    }

    public void menuCartAddItem() {
        System.out.println("장바구니 항목 추가하기 ");

        for (int i = 0; i < this.mBook.length; i++) {
            System.out.print(this.mBook[i].getId() + " | ");
            System.out.print(this.mBook[i].getTitle() + " | ");
            System.out.print(this.mBook[i].getPrice() + " | ");
            System.out.print(this.mBook[i].getName() + " | ");
            System.out.print(this.mBook[i].getDescription() + " | ");
            System.out.print(this.mBook[i].getCategory() + " | ");
            System.out.print(this.mBook[i].getPublicationDate() + " | ");
            System.out.println();
        }

        while (true) {
            boolean exit = false;
            System.out.print("장바구니에 추가할 도서의 ID를 입력하세요 : ");

            Scanner input = new Scanner(System.in);
            String bookId = input.nextLine();

            int index = -1;
            for (int i = 0; i < mBook.length; i++) {
                if (bookId.equals(mBook[i].getId())) {
                    index = i;
                    break;
                }
            }

            if (index != -1) {
                System.out.println("장바구니에 추가하겠습니까? Y|N");
                String yn = input.nextLine();

                if (yn.toUpperCase().equals("Y")) {
                    if (this.mCart.isCartInBook(bookId)) {
                        this.mCart.inCreaseBookCount(bookId);
                    }
                    else {
                        this.mCart.appendBook(mBook[index]);
                    }
                    System.out.println(mBook[index].getTitle() + "가 장바구니에 추가 되었습니다.");
                }
                exit = true;
            } else {
                System.out.println("도서가 존재하지 않습니다.");
            }

            if (exit) {
                break;
            }

        }
    }



    public void menuCartRemoveItemCount() {
        System.out.println("장바구니에 항목 수량 줄이기");
    }

    public void menuCartRemoveItem() {
        System.out.println("장바구니의 항목 삭제하기");
    }

    public void menuCartBill() {
        System.out.println("영수증 표시하기");
    }

}
