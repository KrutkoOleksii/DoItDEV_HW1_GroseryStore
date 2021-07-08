package ua.goit.service;

import ua.goit.repository.CountingGoodsInBasketIntf;

import java.util.Map;

public class CalculateBasket implements CalculateBasketIntf{

    private final SumOfGoodIntf sumOfGood = SumOfGoodIntf.of();
    private final CountingGoodsInBasketIntf countingGoodsInBasket = CountingGoodsInBasketIntf.of();

    @Override
    public Double sumOfBasket(String basketString) {
        try {
            Map<Character, Integer> basket = countingGoodsInBasket.countingGoods(basketString);
            Double sum = 0.0;
            for (Map.Entry<Character,Integer> o : basket.entrySet()) {
                sum += sumOfGood.calculateSumOfGood(o.getKey(), o.getValue());
            }
            return sum;
        } catch (NullPointerException e){
            System.out.println(e);
            return 0.0;
        }
    }

}
