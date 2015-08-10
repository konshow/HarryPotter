package th.co.gosoft.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

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
        baskets.add(Books.HARRY_POTTER_1);
        assertEquals(expectedTotalPrice, baskets.calculate(),0);
    }
    
    @Test
    public void calculateTwoBookInBaskets(){
        expectedTotalPrice = 16.00D;
        baskets.add(Books.HARRY_POTTER_1);
        baskets.add(Books.HARRY_POTTER_1);
        assertEquals(expectedTotalPrice, baskets.calculate(),0);
    }
    
    @Test
    public void calculateThreeBookInBaskets(){
        expectedTotalPrice = 24.00D;
        baskets.add(Books.HARRY_POTTER_1);
        baskets.add(Books.HARRY_POTTER_1);
        baskets.add(Books.HARRY_POTTER_1);
        assertEquals(expectedTotalPrice, baskets.calculate(),0);
    }
    
    @Test
    public void calculateTwoDifferentBookInBaskets(){
        expectedTotalPrice = 15.20D;
        baskets.add(Books.HARRY_POTTER_1);
        baskets.add(Books.HARRY_POTTER_2);
        assertEquals(expectedTotalPrice, baskets.calculate(),0);
    }
    
    @Test
    public void calculateThreeDifferentBookInBaskets(){
        expectedTotalPrice = 21.60D;
        baskets.add(Books.HARRY_POTTER_1);
        baskets.add(Books.HARRY_POTTER_2);
        baskets.add(Books.HARRY_POTTER_3);
        assertEquals(expectedTotalPrice, baskets.calculate(),0);
    }
    
    @Test
    public void calculateFourDifferentBookInBaskets(){
        expectedTotalPrice = 25.60D;
        baskets.add(Books.HARRY_POTTER_1);
        baskets.add(Books.HARRY_POTTER_2);
        baskets.add(Books.HARRY_POTTER_3);
        baskets.add(Books.HARRY_POTTER_4);
        assertEquals(expectedTotalPrice, baskets.calculate(),0);
    }
    
    @Test
    public void calculateFiveDifferentBookInBaskets(){
        expectedTotalPrice = 30.00D;
        baskets.add(Books.HARRY_POTTER_1);
        baskets.add(Books.HARRY_POTTER_2);
        baskets.add(Books.HARRY_POTTER_3);
        baskets.add(Books.HARRY_POTTER_4);
        baskets.add(Books.HARRY_POTTER_5);
        assertEquals(expectedTotalPrice, baskets.calculate(),0);
    }
    
    @Test
    public void calculateFiveDifferentBookandTwoDifferentBookInBaskets(){
        expectedTotalPrice = 45.20D;
        baskets.add(Books.HARRY_POTTER_1);
        baskets.add(Books.HARRY_POTTER_2);
        baskets.add(Books.HARRY_POTTER_3);
        baskets.add(Books.HARRY_POTTER_4);
        baskets.add(Books.HARRY_POTTER_5);
        baskets.add(Books.HARRY_POTTER_1);
        baskets.add(Books.HARRY_POTTER_2);
        assertEquals(expectedTotalPrice, baskets.calculate(),0);
    }
    
    @Test
    public void calculateFiveDifferentBookandThreeDifferentBookInBaskets(){
        expectedTotalPrice = 51.20D;
        baskets.add(Books.HARRY_POTTER_1);
        baskets.add(Books.HARRY_POTTER_2);
        baskets.add(Books.HARRY_POTTER_3);
        baskets.add(Books.HARRY_POTTER_4);
        baskets.add(Books.HARRY_POTTER_5);
        baskets.add(Books.HARRY_POTTER_1);
        baskets.add(Books.HARRY_POTTER_2);
        baskets.add(Books.HARRY_POTTER_3);
        assertEquals(expectedTotalPrice, baskets.calculate(),0);
    }
}
