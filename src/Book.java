public class Book {
    private String id;
    private String title;
    private int price;
    private String name;
    private String description;
    private String category;
    private String publicationDate;

    public Book(String id, String title, int price, String name, String description, String category, String publicationDate) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.name = name;
        this.description = description;
        this.category = category;
        this.publicationDate = publicationDate;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public String getPublicationDate() {
        return publicationDate;
    }
    public void setDescription(String description){
                this.description = description;
    }
    public void setCategory(String category){
        this.category= category;
    }
    public void setPublicationDate(String publicationDate){
        this.publicationDate = publicationDate;
    }
//    mBook[0][0] = "ISBN1234";
//    mBook[0][1] = "쉽게 배우는 JSP 웹프로그래밍";
//    mBook[0][2] = "27000";
//    mBook[0][3] = "송미영";
//    mBook[0][4] = "단계별로 쇼핑몰을 구현하며 배우는 JSP 웹프로그래밍 ";
//    mBook[0][5] = "IT전문서";
//    mBook[0][6] = "2018/10/08";
//
//    mBook[1][0] = "ISBN1235";
//    mBook[1][1] = "안드로이드 프로그래밍";
//    mBook[1][2] = "33000";
//    mBook[1][3] = "우재남";
//    mBook[1][4] = "실습 단계별 명쾌한 멘토링!";
//    mBook[1][5] = "IT전문서";
//    mBook[1][6] = "2022/01/22";
//
//    mBook[2][0] = "ISBN1236";
//    mBook[2][1] = "스크래치";
//    mBook[2][2] = "22000";
//    mBook[2][3] = "고광일";
//    mBook[2][4] = "컴퓨팅 사고력을 키우는 블록 코딩";
//    mBook[2][5] = "컴퓨터 입문";
//    mBook[2][6] = "2019/06/10";

}
