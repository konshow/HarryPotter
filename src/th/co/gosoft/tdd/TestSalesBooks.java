package th.co.gosoft.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSalesBooks {

    @Test
    public void calculateEmptyBaskets(){
        Baskets baskets = new Baskets();
        assertEquals(0.00D, baskets.calculate(),0);
    }
    
    @Test
    public void calculateOneBookInBaskets(){
        Baskets baskets = new Baskets();
        baskets.add(Books.HARRY_POTTER_1);
        assertEquals(8.00D, baskets.calculate(),0);
    }
    
    @Test
    public void calculateTwoBookInBaskets(){
        Baskets baskets = new Baskets();
        baskets.add(Books.HARRY_POTTER_1);
        baskets.add(Books.HARRY_POTTER_1);
        assertEquals(16.00D, baskets.calculate(),0);
    }
}
