package th.co.gosoft.tdd;

public class Calculator {

    private double pricePerBook = 8.00D;
    private int books[] = new int[6];
    private double[] discount = new double[] { 0.00D, 1.00D, 0.95D, 0.90D, 0.80D, 0.75D };
    private int bookDifferent = 0;

    public void setBooks(int books[]) {
        this.books = books;
    }

    public double calculate() {
        return getLowPrice();
    }

    private double getLowPrice() {
        int booksTemp[] = books.clone();
        double promotionTypeOne = getTotalPriceByPromotionTypeOne();
        books = booksTemp;
        double promotionTypeTwo = getTotalPriceByPromotionTypeTwo();
        if (promotionTypeOne > promotionTypeTwo) {
            return promotionTypeTwo;
        } else {
            return promotionTypeOne;
        }
    }

    private double getTotalPriceByPromotionTypeOne() {
        double totalPrice = 0.00D;
        for (int indexSeries = 0; indexSeries < books.length; indexSeries++) {
            if (books[indexSeries] != 0) {
                bookDifferent = getDifferentBooks();
                totalPrice += pricePerBook * bookDifferent * discount[bookDifferent];
                if (books[indexSeries] != 0) {
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

    private double getTotalPriceByPromotionTypeTwo() {
        double totalPrice = 0.00D;
        for (int indexSeries = 0; indexSeries < books.length; indexSeries++) {
            if (books[indexSeries] != 0) {
                bookDifferent = getDifferentBooksForPromotionTypeTwo();
                totalPrice += pricePerBook * bookDifferent * discount[bookDifferent];
                if (books[indexSeries] != 0) {
                    indexSeries--;
                }
            }
        }
        return totalPrice;
    }

    private int getDifferentBooksForPromotionTypeTwo() {
        int bookDifferent = 0;
        for (int indexBooksEdition = 0; indexBooksEdition < books.length; indexBooksEdition++) {
            if (books[indexBooksEdition] != 0 && bookDifferent < 4) {
                bookDifferent++;
                books[indexBooksEdition]--;
            }
        }
        return bookDifferent;
    }
}
