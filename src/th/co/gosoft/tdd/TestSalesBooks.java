package th.co.gosoft.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSalesBooks {

    Baskets baskets = new Baskets();
    
    @Test
    public void calculateEmptyBaskets(){
        assertEquals(0.00D, baskets.calculate(),0);
    }
    
    @Test
    public void calculateOneBookInBaskets(){
        baskets.add(Books.HARRY_POTTER_1);
        assertEquals(8.00D, baskets.calculate(),0);
    }
    
    @Test
    public void calculateTwoBookInBaskets(){
        baskets.add(Books.HARRY_POTTER_1);
        baskets.add(Books.HARRY_POTTER_1);
        assertEquals(16.00D, baskets.calculate(),0);
    }
    
    @Test
    public void calculateThreeBookInBaskets(){
        baskets.add(Books.HARRY_POTTER_1);
        baskets.add(Books.HARRY_POTTER_1);
        baskets.add(Books.HARRY_POTTER_1);
        assertEquals(24.00D, baskets.calculate(),0);
    }
    
    @Test
    public void calculateTwoDifferentBookInBaskets(){
        baskets.add(Books.HARRY_POTTER_1);
        baskets.add(Books.HARRY_POTTER_2);
        assertEquals(15.20D, baskets.calculate(),0);
    }
    
    @Test
    public void calculateThreeDifferentBookInBaskets(){
        baskets.add(Books.HARRY_POTTER_1);
        baskets.add(Books.HARRY_POTTER_2);
        baskets.add(Books.HARRY_POTTER_3);
        assertEquals(21.60D, baskets.calculate(),0);
    }
    
    @Test
    public void calculateFourDifferentBookInBaskets(){
        baskets.add(Books.HARRY_POTTER_1);
        baskets.add(Books.HARRY_POTTER_2);
        baskets.add(Books.HARRY_POTTER_3);
        baskets.add(Books.HARRY_POTTER_4);
        assertEquals(25.60D, baskets.calculate(),0);
    }
    
    @Test
    public void calculateFiveDifferentBookInBaskets(){
        baskets.add(Books.HARRY_POTTER_1);
        baskets.add(Books.HARRY_POTTER_2);
        baskets.add(Books.HARRY_POTTER_3);
        baskets.add(Books.HARRY_POTTER_4);
        baskets.add(Books.HARRY_POTTER_5);
        assertEquals(30.00D, baskets.calculate(),0);
    }
    
    @Test
    public void calculateFiveDifferentBookandThreeDifferentBookInBaskets(){
        baskets.add(Books.HARRY_POTTER_1);
        baskets.add(Books.HARRY_POTTER_2);
        baskets.add(Books.HARRY_POTTER_3);
        baskets.add(Books.HARRY_POTTER_4);
        baskets.add(Books.HARRY_POTTER_5);
        baskets.add(Books.HARRY_POTTER_1);
        baskets.add(Books.HARRY_POTTER_2);
        baskets.add(Books.HARRY_POTTER_3);
        assertEquals(51.60D, baskets.calculate(),0);
    }
}
