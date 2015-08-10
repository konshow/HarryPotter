package test.th.co.gosoft.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import th.co.gosoft.tdd.Baskets;
import th.co.gosoft.tdd.Books;

public class TestBasket {

    Baskets baskets = new Baskets();
    double expectedTotalPrice = 0.00D;
    double pricePerBook = 8.00D;
    int oneBook = 1;
    int twoBook = 2;
    int threeBook = 3;
    int fourBook = 4;
    int fiveBook = 5;
    
    @Test
    public void calculateEmptyBaskets() {
        expectedTotalPrice = 0.00D;
        assertEquals(expectedTotalPrice, baskets.totalPrices(), 0);
    }
    
    @Test
    public void addOneBooksShouldBeCalculate8EUR() {
        expectedTotalPrice = 8.00D;
        baskets.add(new Books(Books.HARRY_POTTER_1,pricePerBook), oneBook);
        assertEquals(expectedTotalPrice, baskets.totalPrices(), 0);
    }
}
