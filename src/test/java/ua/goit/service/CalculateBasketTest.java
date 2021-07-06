package ua.goit.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculateBasketTest {
    private CalculateBasket calculateBasket;

    @Before
    public void createGoods(){
        calculateBasket = new CalculateBasket();
    }

    @Test
    public void sumOfBasketTest() {
        String basket = "ABBCCCDDDDF";
        Assert.assertEquals(15.75D, calculateBasket.sumOfBasket(basket),0.0000000000001D);
    }

}
