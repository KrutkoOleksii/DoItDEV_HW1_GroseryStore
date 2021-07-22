package ua.goit.service;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountingGoodsInBasket<ID,T> implements CountingGoodsInBasketIntf<ID,T> {

    @Override
    public Map<ID, T> countingGoods(String basket) {
        return basket.toUpperCase()
                .chars()
                .mapToObj(id->(ID) id)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
