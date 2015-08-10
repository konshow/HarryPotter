package th.co.gosoft.tdd;

public class Baskets {

    private double pricePerBook = 8.00D;
    private int books[] = new int[6];
    double[] discount = new double[]{0.00D, 1.00D, 0.95D, 0.90D, 0.80D, 0.75D};

    public double calculate() {
        double totalPrice = 0.00D;
        int bookDifferent = 0;
        for (int indexSeries = 0; indexSeries < books.length; indexSeries++) {
            if(books[indexSeries] != 0){
                bookDifferent = 0;
                for (int indexBooksEdition = 0; indexBooksEdition < books.length; indexBooksEdition++) {
                    if (books[indexBooksEdition] != 0) {
                        bookDifferent++;
                        books[indexBooksEdition]--;
                    }
                }
                totalPrice += pricePerBook * bookDifferent * discount[bookDifferent];
                if(books[indexSeries] != 0){
                    indexSeries--;
                }
            }
        }
        return totalPrice;
    }

    public void add(int book) {
        books[book]++;
    }

}
