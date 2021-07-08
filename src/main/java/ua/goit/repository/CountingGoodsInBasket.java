package ua.goit.repository;

import java.util.HashMap;
import java.util.Map;

public class CountingGoodsInBasket implements CountingGoodsInBasketIntf<Character,Integer> {

    private final GoodsIntf goods = GoodsIntf.of();

    @Override
    public Map<Character, Integer> countingGoods(String basket) {
        Map<Character,Integer> quantityOfGoods = new HashMap<>();
        for (Character id: basket.toUpperCase().toCharArray()){
            if (goods.getById(id) == null){
                System.out.println("No good with id '"+id+"' in the store");
            }
            else {
                Integer count = quantityOfGoods.get(id);
                if (count == null) count = 0;
                quantityOfGoods.put(id, ++count);
            }
        }
        return quantityOfGoods;
    }
}
