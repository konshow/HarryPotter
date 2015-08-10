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
}
