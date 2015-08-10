package test.th.co.gosoft.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

import th.co.gosoft.tdd.Baskets;
import th.co.gosoft.tdd.Books;

public class TestSalesBooks {

    Baskets baskets = new Baskets();
    double expectedTotalPrice = 0.00D;
    
    @Test
    public void calculateEmptyBaskets(){
        expectedTotalPrice = 0.00D;
        assertEquals(expectedTotalPrice, baskets.calculate(),0);
    }
    
    @Test
    public void calculateOneBookInBaskets(){
        expectedTotalPrice = 8.00D;
        baskets.add(new Books(Books.HARRY_POTTER_1, 1));
        assertEquals(expectedTotalPrice, baskets.calculate(),0);
    }
    
    @Test
    public void calculateTwoBookInBaskets(){
        expectedTotalPrice = 16.00D;
        baskets.add(new Books(Books.HARRY_POTTER_1, 2));
        assertEquals(expectedTotalPrice, baskets.calculate(),0);
    }
    
    @Test
    public void calculateThreeBookInBaskets(){
        expectedTotalPrice = 24.00D;
        baskets.add(new Books(Books.HARRY_POTTER_1, 3));
        assertEquals(expectedTotalPrice, baskets.calculate(),0);
    }
    
    @Test
    public void calculateTwoDifferentBookInBaskets(){
        expectedTotalPrice = 15.20D;
        baskets.add(new Books(Books.HARRY_POTTER_1, 1));
        baskets.add(new Books(Books.HARRY_POTTER_2, 1));
        assertEquals(expectedTotalPrice, baskets.calculate(),0);
    }
    
    @Test
    public void calculateThreeDifferentBookInBaskets(){
        expectedTotalPrice = 21.60D;
        baskets.add(new Books(Books.HARRY_POTTER_1, 1));
        baskets.add(new Books(Books.HARRY_POTTER_2, 1));
        baskets.add(new Books(Books.HARRY_POTTER_3, 1));
        assertEquals(expectedTotalPrice, baskets.calculate(),0);
    }
    
    @Test
    public void calculateFourDifferentBookInBaskets(){
        expectedTotalPrice = 25.60D;
        baskets.add(new Books(Books.HARRY_POTTER_1, 1));
        baskets.add(new Books(Books.HARRY_POTTER_2, 1));
        baskets.add(new Books(Books.HARRY_POTTER_3, 1));
        baskets.add(new Books(Books.HARRY_POTTER_4, 1));
        assertEquals(expectedTotalPrice, baskets.calculate(),0);
    }
    
    @Test
    public void calculateFiveDifferentBookInBaskets(){
        expectedTotalPrice = 30.00D;
        baskets.add(new Books(Books.HARRY_POTTER_1, 1));
        baskets.add(new Books(Books.HARRY_POTTER_2, 1));
        baskets.add(new Books(Books.HARRY_POTTER_3, 1));
        baskets.add(new Books(Books.HARRY_POTTER_4, 1));
        baskets.add(new Books(Books.HARRY_POTTER_5, 1));
        assertEquals(expectedTotalPrice, baskets.calculate(),0);
    }
    
    @Test
    public void calculateFiveDifferentBookandTwoDifferentBookInBaskets(){
        expectedTotalPrice = 45.20D;
        baskets.add(new Books(Books.HARRY_POTTER_1, 2));
        baskets.add(new Books(Books.HARRY_POTTER_2, 2));
        baskets.add(new Books(Books.HARRY_POTTER_3, 1));
        baskets.add(new Books(Books.HARRY_POTTER_4, 1));
        baskets.add(new Books(Books.HARRY_POTTER_5, 1));
        assertEquals(expectedTotalPrice, baskets.calculate(),0);
    }
//    
//    @Test
//    public void calculateFiveDifferentBookandThreeDifferentBookInBaskets(){
//        expectedTotalPrice = 51.20D;
//        baskets.add(Books.HARRY_POTTER_1);
//        baskets.add(Books.HARRY_POTTER_2);
//        baskets.add(Books.HARRY_POTTER_3);
//        baskets.add(Books.HARRY_POTTER_4);
//        baskets.add(Books.HARRY_POTTER_5);
//        baskets.add(Books.HARRY_POTTER_1);
//        baskets.add(Books.HARRY_POTTER_2);
//        baskets.add(Books.HARRY_POTTER_3);
//        assertEquals(expectedTotalPrice, baskets.calculate(),0);
//    }
}
