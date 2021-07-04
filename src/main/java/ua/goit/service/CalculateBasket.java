package ua.goit.service;

import ua.goit.repository.Goods;
import ua.goit.repository.GoodsIntf;

import java.util.HashMap;
import java.util.Map;

public class CalculateBasket implements CalculateBasketIntf{

    private final Goods goods = GoodsIntf.of();

    @Override
    public Double sumOfBasket(String basket) {
        Map<Character, Integer> basketMap = getBasketMap(basket);
        Double sum = 0.00D;
        for (Map.Entry<Character,Integer> o : basketMap.entrySet()) {
            sum += sumOfGood(o.getKey(), o.getValue());
        }
        return sum;
    }

    @Override
    public Double sumOfGood(Character id, Integer quantity) {
        Integer promoQuantity = goods.getPromoQuantity(id);
        Double sum = (promoQuantity == 0 ) ?
                goods.getPrice(id) * quantity :
                goods.getPrice(id) * (quantity % promoQuantity) + goods.getPromoPrice(id) * (quantity / promoQuantity);
        return sum;
    }

    private Map<Character,Integer> getBasketMap(String basket){
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
