package ua.goit.repository;

import java.util.Map;

public interface BasketMapIntf <K,V>{

    Map<K,V>  getBasketMap(String basket);

    static BasketMap of(){
        return new BasketMap();
    }
}
