package ua.goit.repository;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class BasketMapTest {
    BasketMap basketMap;

    @Before
    public void createGoods(){
        basketMap = new BasketMap();
    }

    @Test
    public void sumOfBasketTest() {
        String basket = "67890ABBCCCDDDDF12345qwerty";
        Map<Character,Integer> testMap = new HashMap<>();
        testMap.put('A',1);
        testMap.put('B',2);
        testMap.put('C',3);
        testMap.put('D',4);
        Assert.assertEquals(testMap, basketMap.getBasketMap(basket));
    }
}
