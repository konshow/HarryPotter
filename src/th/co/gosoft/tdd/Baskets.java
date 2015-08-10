package th.co.gosoft.tdd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Baskets {

    private Calculator calculator = new Calculator();
    private CalculatorBestPrice calculatorBestPrice = new CalculatorBestPrice();
    private ArrayList<Books> books = new ArrayList<Books>();
    private Map<Books, Integer> booksMap = new HashMap<Books, Integer>();

    public double calculate() {
        calculator.setBooks(books);
        return calculator.calculate();
    }

    public void add(Books book) {
        books.add(book);
    }

    public double calculateBestPrice() {
        calculatorBestPrice.setBooks(books);
        return calculatorBestPrice.calculate();
    }

    public double totalPrices() {
        calculator.setBooksMap(booksMap);
        return calculator.getTotalPrices();
    }

    public void add(Books book, int numberOfBook) {
        booksMap.put(book, numberOfBook);
    }

}
