package th.co.gosoft.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSalesBooks {

    @Test
    public void calculateEmptyBaskets(){
        Baskets baskets = new Baskets();
        assertEquals(0.00D, baskets.calculate(),0);
    }
}
