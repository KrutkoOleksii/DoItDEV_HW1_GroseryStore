package ua.goit.repository;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ua.goit.service.CountingGoodsInBasket;

import java.util.HashMap;
import java.util.Map;

public class CountingGoodsInBasketTest {
    CountingGoodsInBasket<String,Integer> countingGoodsInBasket;

    @Before
    public void createGoods(){
        countingGoodsInBasket = new CountingGoodsInBasket();
    }

    @Test
    public void testSumOfBasket() {
        String basket = "67890ABBCCCDDDDF12345qwerty";
        Map<String,Integer> testMap = new HashMap<>();
        testMap.put("A",1);
        testMap.put("B",2);
        testMap.put("C",3);
        testMap.put("D",4);
        Assert.assertEquals(testMap, countingGoodsInBasket.countingGoods(basket));
    }
}
