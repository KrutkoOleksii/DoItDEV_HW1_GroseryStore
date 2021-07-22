package ua.goit.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class CalculateBasketTest {
    private CalculateBasketIntf calculateBasketIntf;

    @Before
    public void createGoods(){
        calculateBasketIntf = Mockito.mock(CalculateBasketIntf.class);
        Mockito.when(calculateBasketIntf.sumOfBasket("A")).thenReturn(1.25);
        Mockito.when(calculateBasketIntf.sumOfBasket("AAA")).thenReturn(3.0);
        Mockito.when(calculateBasketIntf.sumOfBasket("B")).thenReturn(4.25);
        Mockito.when(calculateBasketIntf.sumOfBasket("C")).thenReturn(1.0);
        Mockito.when(calculateBasketIntf.sumOfBasket("CCCCC")).thenReturn(5.0);
        Mockito.when(calculateBasketIntf.sumOfBasket("D")).thenReturn(0.75);
        Mockito.when(calculateBasketIntf.sumOfBasket("C")).thenReturn(1.0);
        Mockito.when(calculateBasketIntf.sumOfBasket("ABBCCCDDDDF")).thenReturn(15.75);
    }

    @Test
    public void testSumOfBasket() {

        Assert.assertEquals(1.25, calculateBasketIntf.sumOfBasket("A"), 0.0000000001);
        Assert.assertEquals(4.25, calculateBasketIntf.sumOfBasket("B"), 0.0000000001);
        Assert.assertEquals(1.0, calculateBasketIntf.sumOfBasket("C"), 0.0000000001);
        Assert.assertEquals(0.75, calculateBasketIntf.sumOfBasket("D"), 0.0000000001);
        Assert.assertEquals(3.0, calculateBasketIntf.sumOfBasket("AAA"), 0.0000000001);

    }

}
