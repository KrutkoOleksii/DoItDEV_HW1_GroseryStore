package ua.goit.service;

import java.util.Map;

public interface CountingGoodsInBasketIntf<ID,T>{

    Map<ID,T> countingGoods(String basket);

    static CountingGoodsInBasketIntf of(){
        return new CountingGoodsInBasket();
    }
}
