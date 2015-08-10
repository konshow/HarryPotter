package th.co.gosoft.tdd;


public class CalculatorBestPrice extends Calculator {

    public CalculatorBestPrice() {
        super();
    }

    protected double getTotalPrice() {
        double totalPrice = 0.00D;
        for (int indexSeries = 0; indexSeries < books.size(); indexSeries++) {
            if (books.get(indexSeries).getNumberOfBook() != 0) {
                bookDifferent = getDifferentBooks();
                totalPrice += books.get(indexSeries).getPrice() * bookDifferent * discount[bookDifferent];
                if (books.get(indexSeries).getNumberOfBook() != 0) {
                    indexSeries--;
                }
            }
        }
        return totalPrice;
    }

    protected int getDifferentBooks() {
        int bookDifferent = 0;
        for (int indexBooksEdition = 0; indexBooksEdition < books.size(); indexBooksEdition++) {
            if (books.get(indexBooksEdition).getNumberOfBook() != 0 && bookDifferent < 4) {
                bookDifferent++;
                books.get(indexBooksEdition).setNumberOfBook(books.get(indexBooksEdition).getNumberOfBook()-1);
            }
        }
        return bookDifferent;
    }

}