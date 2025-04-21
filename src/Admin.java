public class Admin extends Person{
    private String id = "Admin";
    private String pw = "Admin1234";
    public Admin(String name, String phone){
        super(name,phone);
    }
    public String getId(){
        return this.id;
    }
    public String getPw(){
        return this.pw;
    }
}
