package ua.goit.service;

public class CalculateBasket implements CalculateBasketIntf{

    private final SumOfGoodIntf<String> sumOfGood = SumOfGoodIntf.of();
    private final CountingGoodsInBasketIntf<String, Long> countingGoodsInBasket = CountingGoodsInBasketIntf.of();

    @Override
    public Double sumOfBasket(String basketString) {
        return countingGoodsInBasket.countingGoods(basketString)
                .entrySet()
                .stream()
                .mapToDouble(o->sumOfGood.calculateSumOfGood(o.getKey(), o.getValue()))
                .sum();
    }

}
