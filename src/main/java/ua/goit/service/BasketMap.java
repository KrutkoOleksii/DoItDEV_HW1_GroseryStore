package ua.goit.service;

import ua.goit.repository.Goods;
import ua.goit.repository.GoodsIntf;

import java.util.HashMap;
import java.util.Map;

public class BasketMap implements BasketMapIntf<Character,Integer>{

    private final Goods goods = GoodsIntf.of();

    @Override
    public Map<Character, Integer> getBasketMap(String basket) {
        Map<Character,Integer> basketMap = new HashMap<>();
        for (Character id: basket.toUpperCase().toCharArray()){
            if (goods.getById(id) == null){
                System.out.println("No good with id '"+id+"' in the store");
            }
            else {
                Integer count = basketMap.get(id);
                if (count == null) count = 0;
                basketMap.put(id, ++count);
            }
        }
        return basketMap;
    }
}
