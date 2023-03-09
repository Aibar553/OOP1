public class Basket {
    private String soldItemname;

    public String getsoldItemname() {
        return soldItemname;
    }

    public void setsoldItemname(String soldItemname) {
        this.soldItemname = soldItemname;
    }

    static Category[] soldItems = new Category[6];
}
