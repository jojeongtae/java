public class Book extends Item{
    private String name;
    private String description;
    private String category;
    private String publicationDate;

    public Book(String id, String title, int price, String name, String description, String category, String publicationDate) {
        super(id,title,price);
        this.name = name;
        this.description = description;
        this.category = category;
        this.publicationDate = publicationDate;
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


}
