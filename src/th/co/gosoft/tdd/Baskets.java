package th.co.gosoft.tdd;

import java.util.ArrayList;

public class Baskets {

    private Calculator calculator = new Calculator();
    private CalculatorBestPrice calculatorBestPrice = new CalculatorBestPrice();
    private ArrayList<Books> books = new ArrayList<Books>();

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

}
