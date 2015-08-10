package th.co.gosoft.tdd;

public class Baskets {

    private Calculator calculator = new Calculator();
    private int books[] = new int[6];

    public double calculate() {
        return calculator.calculate(books);
    }

    public void add(int book) {
        books[book]++;
    }

}
