package ua.goit.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculateBasketTest {
    private CalculateBasket calculateBasket;

    @Before
    public void createCalculator() {
        calculateBasket = new CalculateBasket();
    }

    @Test
    public void testIfPromoCountIsZero(){

    }

    @Test
    public void sumOfGoodA(){
        Double sum = calculateBasket.sumOfGood('A', 1);
        Assert.assertEquals(1.25D,  sum, 0.0000000000001D);
    }
    @Test
    public void sumOfGoodAPromo(){
        Double sum = calculateBasket.sumOfGood('A', 5);
        Assert.assertEquals(5.50D,  sum, 0.0000000000001D);
    }
    @Test
    public void sumOfGoodB(){
        Double sum = calculateBasket.sumOfGood('B', 1);
        Assert.assertEquals(4.25D,  sum, 0.0000000000001D);
    }
    @Test
    public void sumOfGoodC(){
        Double sum = calculateBasket.sumOfGood('C', 1);
        Assert.assertEquals(1.00D,  sum, 0.0000000000001D);
    }
    @Test
    public void sumOfGoodCPromo(){
        Double sum = calculateBasket.sumOfGood('C', 8);
        Assert.assertEquals(7.00D,  sum, 0.0000000000001D);
    }
    @Test
    public void sumOfGoodD(){
        Double sum = calculateBasket.sumOfGood('D', 1);
        Assert.assertEquals(0.75D,  sum, 0.0000000000001D);
    }
}
