package ua.goit.repository;

import java.util.Map;

public interface CountingGoodsInBasketIntf<K,V>{

    Map<K,V> countingGoods(String basket);

    static CountingGoodsInBasket of(){
        return new CountingGoodsInBasket();
    }
}
