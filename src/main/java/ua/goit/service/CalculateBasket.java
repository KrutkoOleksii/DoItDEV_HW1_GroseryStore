package ua.goit.service;

import java.util.Map;

public class CalculateBasket implements CalculateBasketIntf{

    private final SumOfGood sumOfGood = SumOfGoodIntf.of();
    private final BasketMap basketMap = BasketMapIntf.of();

    @Override
    public Double sumOfBasket(String basketString) {
        Map<Character,Integer> basket = basketMap.getBasketMap(basketString);
        Double sum = 0.00D;
        for (Map.Entry<Character,Integer> o : basket.entrySet()) {
            sum += sumOfGood.calculateSumOfGood(o.getKey(), o.getValue());
        }
        return sum;
    }

}
