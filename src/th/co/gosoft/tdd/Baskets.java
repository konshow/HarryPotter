package th.co.gosoft.tdd;

import java.util.ArrayList;

public class Baskets {

    private ArrayList<Integer> booksList = new ArrayList<>();
    private double pricePerBook = 8.00D;
    
    public double calculate() {
        return pricePerBook * booksList.size();
    }

    public void add(int book) {
        booksList.add(book);
    }

}
