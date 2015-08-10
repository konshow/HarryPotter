package th.co.gosoft.tdd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Calculator  {

    Map<Books, Integer> booksMap = new HashMap<Books, Integer>();
    ArrayList<Books> books = new ArrayList<>();
    double[] discount = new double[] { 0.00D, 1.00D, 0.95D, 0.90D, 0.80D, 0.75D };
    int bookDifferent = 0;

    public void setBooks(ArrayList<Books> books) {
        this.books = books;
    }

    public double calculate() {
        return getTotalPrice();
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
            if (books.get(indexBooksEdition).getNumberOfBook() != 0) {
                bookDifferent++;
                books.get(indexBooksEdition).setNumberOfBook(books.get(indexBooksEdition).getNumberOfBook()-1);
            }
        }
        return bookDifferent;
    }

    public void setBooksMap(Map<Books, Integer> booksMap) {
        this.booksMap = booksMap;
    }

    public double getTotalPrices() {
        double totalPrice = 0.00;
        Iterator<Books> iteratorBooks = booksMap.keySet().iterator();
        while (iteratorBooks.hasNext()) {
            Books book = iteratorBooks.next();
            totalPrice += book.getPrice() * booksMap.get(book);
        }
        return totalPrice;
    }
}
