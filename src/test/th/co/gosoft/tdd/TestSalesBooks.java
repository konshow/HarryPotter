package test.th.co.gosoft.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

import th.co.gosoft.tdd.Baskets;
import th.co.gosoft.tdd.Books;

public class TestSalesBooks {

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
        assertEquals(expectedTotalPrice, baskets.calculate(), 0);
    }

    @Test
    public void calculateOneBookInBaskets() {
        expectedTotalPrice = 8.00D;
        baskets.add(new Books(Books.HARRY_POTTER_1, pricePerBook, oneBook));
        assertEquals(expectedTotalPrice, baskets.calculate(), 0);
    }

    @Test
    public void calculateTwoBookInBaskets() {
        expectedTotalPrice = 16.00D;
        baskets.add(new Books(Books.HARRY_POTTER_1, pricePerBook, twoBook));
        assertEquals(expectedTotalPrice, baskets.calculate(), 0);
    }

    @Test
    public void calculateThreeBookInBaskets() {
        expectedTotalPrice = 24.00D;
        baskets.add(new Books(Books.HARRY_POTTER_1, pricePerBook, threeBook));
        assertEquals(expectedTotalPrice, baskets.calculate(), 0);
    }

    @Test
    public void calculateTwoDifferentBookInBaskets() {
        expectedTotalPrice = 15.20D;
        baskets.add(new Books(Books.HARRY_POTTER_1, pricePerBook, oneBook));
        baskets.add(new Books(Books.HARRY_POTTER_2, pricePerBook, oneBook));
        assertEquals(expectedTotalPrice, baskets.calculate(), 0);
    }

    @Test
    public void calculateThreeDifferentBookInBaskets() {
        expectedTotalPrice = 21.60D;
        baskets.add(new Books(Books.HARRY_POTTER_1, pricePerBook, oneBook));
        baskets.add(new Books(Books.HARRY_POTTER_2, pricePerBook, oneBook));
        baskets.add(new Books(Books.HARRY_POTTER_3, pricePerBook, oneBook));
        assertEquals(expectedTotalPrice, baskets.calculate(), 0);
    }

    @Test
    public void calculateFourDifferentBookInBaskets() {
        expectedTotalPrice = 25.60D;
        baskets.add(new Books(Books.HARRY_POTTER_1, pricePerBook, oneBook));
        baskets.add(new Books(Books.HARRY_POTTER_2, pricePerBook, oneBook));
        baskets.add(new Books(Books.HARRY_POTTER_3, pricePerBook, oneBook));
        baskets.add(new Books(Books.HARRY_POTTER_4, pricePerBook, oneBook));
        assertEquals(expectedTotalPrice, baskets.calculate(), 0);
    }

    @Test
    public void calculateFiveDifferentBookInBaskets() {
        expectedTotalPrice = 30.00D;
        baskets.add(new Books(Books.HARRY_POTTER_1, pricePerBook, oneBook));
        baskets.add(new Books(Books.HARRY_POTTER_2, pricePerBook, oneBook));
        baskets.add(new Books(Books.HARRY_POTTER_3, pricePerBook, oneBook));
        baskets.add(new Books(Books.HARRY_POTTER_4, pricePerBook, oneBook));
        baskets.add(new Books(Books.HARRY_POTTER_5, pricePerBook, oneBook));
        assertEquals(expectedTotalPrice, baskets.calculate(), 0);
    }

    @Test
    public void calculateFiveDifferentBookandTwoDifferentBookInBaskets() {
        expectedTotalPrice = 45.20D;
        baskets.add(new Books(Books.HARRY_POTTER_1, pricePerBook, twoBook));
        baskets.add(new Books(Books.HARRY_POTTER_2, pricePerBook, twoBook));
        baskets.add(new Books(Books.HARRY_POTTER_3, pricePerBook, oneBook));
        baskets.add(new Books(Books.HARRY_POTTER_4, pricePerBook, oneBook));
        baskets.add(new Books(Books.HARRY_POTTER_5, pricePerBook, oneBook));
        assertEquals(expectedTotalPrice, baskets.calculate(), 0);
    }

    @Test
    public void calculateFiveDifferentBookandThreeDifferentBookInBaskets() {
        expectedTotalPrice = 51.60D;
        baskets.add(new Books(Books.HARRY_POTTER_1, pricePerBook, twoBook));
        baskets.add(new Books(Books.HARRY_POTTER_2, pricePerBook, twoBook));
        baskets.add(new Books(Books.HARRY_POTTER_3, pricePerBook, twoBook));
        baskets.add(new Books(Books.HARRY_POTTER_4, pricePerBook, oneBook));
        baskets.add(new Books(Books.HARRY_POTTER_5, pricePerBook, oneBook));
        assertEquals(expectedTotalPrice, baskets.calculate(), 0);
    }

    @Test
    public void calculateBestPriceFiveDifferentBookandThreeDifferentBookInBaskets() {
        expectedTotalPrice = 51.20D;
        baskets.add(new Books(Books.HARRY_POTTER_1, pricePerBook, twoBook));
        baskets.add(new Books(Books.HARRY_POTTER_2, pricePerBook, twoBook));
        baskets.add(new Books(Books.HARRY_POTTER_3, pricePerBook, twoBook));
        baskets.add(new Books(Books.HARRY_POTTER_4, pricePerBook, oneBook));
        baskets.add(new Books(Books.HARRY_POTTER_5, pricePerBook, oneBook));
        assertEquals(expectedTotalPrice, baskets.calculateBestPrice(), 0);
    }
}
