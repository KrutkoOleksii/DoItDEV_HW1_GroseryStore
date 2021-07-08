package ua.goit.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.stubbing.OngoingStubbing;

public class CalculateBasketTest {
    private CalculateBasket calculateBasket;

    @Before
    public void createGoods(){
        calculateBasket = new CalculateBasket();
    }

    @Test
    public void testSumOfBasket() {

        String basket = "ABBCCCDDDDF";

        CalculateBasketIntf calculateBasketIntf = Mockito.mock(CalculateBasketIntf.class);

        Mockito.when(calculateBasketIntf.sumOfBasket("A")).thenReturn(1.25);
        Mockito.when(calculateBasketIntf.sumOfBasket("AAA")).thenReturn(3.0);
        Mockito.when(calculateBasketIntf.sumOfBasket("B")).thenReturn(4.25);
        Mockito.when(calculateBasketIntf.sumOfBasket("C")).thenReturn(1.0);
        Mockito.when(calculateBasketIntf.sumOfBasket("CCCCC")).thenReturn(5.0);
        Mockito.when(calculateBasketIntf.sumOfBasket("D")).thenReturn(0.75);
        Mockito.when(calculateBasketIntf.sumOfBasket("C")).thenReturn(1.0);
        Mockito.when(calculateBasketIntf.sumOfBasket(basket)).thenReturn(15.75);

    }

}
