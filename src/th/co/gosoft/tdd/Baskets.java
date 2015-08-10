package th.co.gosoft.tdd;

public class Baskets {

    private double pricePerBook = 8.00D;
    private int books[] = new int[5];
    double[] discount = new double[]{0.00D, 1.00D, 0.95D, 0.90D, 0.80D, 0.75D};

    public double calculate() {
        int numberOfBooks = 0;
        for (int indexSeries = 0; indexSeries < books.length; indexSeries++) {
            numberOfBooks += books[indexSeries];
        }
        int bookDifferent = 0;
        for (int indexSeries = 0; indexSeries < books.length; indexSeries++) {
            if(books[indexSeries] > 0){
                bookDifferent++;
            }
        }
        return pricePerBook * numberOfBooks * discount[bookDifferent];
    }

    public void add(int book) {
        books[book]++;
    }

}
