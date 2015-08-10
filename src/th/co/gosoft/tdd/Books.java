package th.co.gosoft.tdd;

public class Books {

    public static final String HARRY_POTTER_1 = "HARRY_POTTER_1";
    public static final String HARRY_POTTER_2 = "HARRY_POTTER_2";
    public static final String HARRY_POTTER_3 = "HARRY_POTTER_3";
    public static final String HARRY_POTTER_4 = "HARRY_POTTER_4";
    public static final String HARRY_POTTER_5 = "HARRY_POTTER_5";

    private String bookName = "";
    private int numberOfBook = 0;
    private double price = 8.00D;

    public Books(String bookName, double price, int numberOfBook){
        this.bookName = bookName;
        this.price = price;
        this.numberOfBook = numberOfBook;
    }

    public String getBookName() {
        return bookName;
    }
    
    public void setNumberOfBook(int numberOfBook) {
        this.numberOfBook = numberOfBook;
    }
    
    public int getNumberOfBook() {
        return numberOfBook;
    }

    public double getPrice() {
        return price;
    }
}
