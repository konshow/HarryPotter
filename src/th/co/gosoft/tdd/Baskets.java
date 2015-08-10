package th.co.gosoft.tdd;

import java.util.ArrayList;

public class Baskets {

    private ArrayList<Integer> booksList = new ArrayList<>();
    
    public double calculate() {
        if(booksList.size() == 1)
            return 8.00D;
        return 0.00D;
    }

    public void add(int book) {
        booksList.add(book);
    }

}
