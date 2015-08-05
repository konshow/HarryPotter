package com.harrypotter;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestShoppingBooks {

    @Test
    public void shouldCalculateCostOfZeroBooks(){
        Basket basket = new Basket();
        assertEquals(0.00D, basket.calculate(),0);
    }

    @Test
    public void oneBooks1stShouldBeCalculate8EUR(){
        Basket basket = new Basket();
        basket.add(Books.HARRY_POTTER_BOOK_1);
        assertEquals(8.00D, basket.calculate(),0);
    }

    @Test
    public void twoSameBooks1stShouldBeCalculate16EUR(){
        Basket basket = new Basket();
        basket.add(Books.HARRY_POTTER_BOOK_1);
        basket.add(Books.HARRY_POTTER_BOOK_1);
        assertEquals(16.00D, basket.calculate(),0);
    }

    @Test
    public void threeSameBooks1stShouldBeCalculate24EUR(){
        Basket basket = new Basket();
        basket.add(Books.HARRY_POTTER_BOOK_1);
        basket.add(Books.HARRY_POTTER_BOOK_1);
        basket.add(Books.HARRY_POTTER_BOOK_1);
        assertEquals(24.00D, basket.calculate(),0);
    }

    @Test
    public void twoDifferentBooksShouldBeCalculate15point2EUR(){
        Basket basket = new Basket();
        basket.add(Books.HARRY_POTTER_BOOK_1);
        basket.add(Books.HARRY_POTTER_BOOK_2);
        assertEquals(15.20D, basket.calculate(),0);
    }

    @Test
    public void threeDifferentBooksShouldBeCalculate21point6EUR(){
        Basket basket = new Basket();
        basket.add(Books.HARRY_POTTER_BOOK_1);
        basket.add(Books.HARRY_POTTER_BOOK_2);
        basket.add(Books.HARRY_POTTER_BOOK_3);
        assertEquals(21.60D, basket.calculate(),0);
    }

    @Test
    public void fourDifferentBooksShouldBeCalculate25point6EUR(){
        Basket basket = new Basket();
        basket.add(Books.HARRY_POTTER_BOOK_1);
        basket.add(Books.HARRY_POTTER_BOOK_2);
        basket.add(Books.HARRY_POTTER_BOOK_3);
        basket.add(Books.HARRY_POTTER_BOOK_4);
        assertEquals(25.60D, basket.calculate(),0);
    }

    @Test
    public void fiveDifferentBooksShouldBeCalculate30EUR(){
        Basket basket = new Basket();
        basket.add(Books.HARRY_POTTER_BOOK_1);
        basket.add(Books.HARRY_POTTER_BOOK_2);
        basket.add(Books.HARRY_POTTER_BOOK_3);
        basket.add(Books.HARRY_POTTER_BOOK_4);
        basket.add(Books.HARRY_POTTER_BOOK_5);
        assertEquals(30.0D, basket.calculate(),0);
    }

    @Test
    public void eightBooksShouldBeCalculate51point6EUR(){
        Basket basket = new Basket();
        basket.add(Books.HARRY_POTTER_BOOK_1);
        basket.add(Books.HARRY_POTTER_BOOK_1);
        basket.add(Books.HARRY_POTTER_BOOK_2);
        basket.add(Books.HARRY_POTTER_BOOK_2);
        basket.add(Books.HARRY_POTTER_BOOK_3);
        basket.add(Books.HARRY_POTTER_BOOK_3);
        basket.add(Books.HARRY_POTTER_BOOK_4);
        basket.add(Books.HARRY_POTTER_BOOK_5);
        assertEquals(51.6D, basket.calculate(),0);
    }
}
