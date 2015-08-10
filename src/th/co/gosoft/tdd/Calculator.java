package th.co.gosoft.tdd;

public class Calculator {

    private double pricePerBook = 8.00D;
    private int books[] = new int[6];
    private double[] discount = new double[]{0.00D, 1.00D, 0.95D, 0.90D, 0.80D, 0.75D};
    private double totalPrice = 0.00D;
    private int bookDifferent = 0;

    public double calculate(int books[]){
        this.books = books;
        for (int indexSeries = 0; indexSeries < books.length; indexSeries++) {
            if(books[indexSeries] != 0){
                bookDifferent = getDifferentBooks();
                totalPrice += pricePerBook * bookDifferent * discount[bookDifferent];
                if(books[indexSeries] != 0){
                    indexSeries--;
                }
            }
        }
        return totalPrice;
    }

    private int getDifferentBooks() {
        int bookDifferent = 0;
        for (int indexBooksEdition = 0; indexBooksEdition < books.length; indexBooksEdition++) {
            if (books[indexBooksEdition] != 0) {
                bookDifferent++;
                books[indexBooksEdition]--;
            }
        }
        return bookDifferent;
    }
}
