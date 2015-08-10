package th.co.gosoft.tdd;

import java.util.ArrayList;

public class Calculator {

    private ArrayList<Books> books = new ArrayList<>();
    private double[] discount = new double[] { 0.00D, 1.00D, 0.95D, 0.90D, 0.80D, 0.75D };
    private int bookDifferent = 0;

    public void setBooks(ArrayList<Books> books) {
        this.books = books;
    }

    public double calculate() {
        return getLowPrice();
    }

    private double getLowPrice() {
//        ArrayList<Books> booksTemp = 
        double promotionTypeOne = getTotalPriceByPromotionTypeOne();
//        books = booksTemp;
//        double promotionTypeTwo = getTotalPriceByPromotionTypeTwo();
//        if (promotionTypeOne > promotionTypeTwo) {
//            return promotionTypeTwo;
//        } else {
            return promotionTypeOne;
//        }
    }

    private double getTotalPriceByPromotionTypeOne() {
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

    private int getDifferentBooks() {
        int bookDifferent = 0;
        for (int indexBooksEdition = 0; indexBooksEdition < books.size(); indexBooksEdition++) {
            if (books.get(indexBooksEdition).getNumberOfBook() != 0) {
                bookDifferent++;
                books.get(indexBooksEdition).setNumberOfBook(books.get(indexBooksEdition).getNumberOfBook()-1);
            }
        }
        return bookDifferent;
    }

    private double getTotalPriceByPromotionTypeTwo() {
        double totalPrice = 0.00D;
        for (int indexSeries = 0; indexSeries < books.size(); indexSeries++) {
            if (books.get(indexSeries).getNumberOfBook() != 0) {
                bookDifferent = getDifferentBooksForPromotionTypeTwo();
                totalPrice += books.get(indexSeries).getPrice() * bookDifferent * discount[bookDifferent];
                if (books.get(indexSeries).getNumberOfBook() != 0) {
                    indexSeries--;
                }
            }
        }
        return totalPrice;
    }

    private int getDifferentBooksForPromotionTypeTwo() {
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
