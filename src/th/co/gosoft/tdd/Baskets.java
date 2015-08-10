package th.co.gosoft.tdd;

public class Baskets {

    private Calculator calculator = new Calculator();
    private int books[] = new int[6];

    public double calculate() {
        calculator.setBooks(books);
        return calculator.calculate();
    }

    public void add(int book) {
        books[book]++;
    }

}
