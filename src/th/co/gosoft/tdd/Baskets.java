package th.co.gosoft.tdd;

import java.util.ArrayList;

public class Baskets {

    private Calculator calculator = new Calculator();
    private ArrayList<Books> books = new ArrayList<>();

    public double calculate() {
        calculator.setBooks(books);
        return calculator.calculate();
    }

    public void add(Books book) {
        books.add(book);
    }

}
