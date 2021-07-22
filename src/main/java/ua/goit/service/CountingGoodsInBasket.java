package ua.goit.service;

import ua.goit.models.Good;
import ua.goit.repository.BaseIntf;
import ua.goit.repository.Factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountingGoodsInBasket<ID,T> implements CountingGoodsInBasketIntf<ID,T> {

    private final BaseIntf<String, Good> goods = Factory.of(Good.class);

    @Override
    public Map<ID, T> countingGoods(String basket) {
//        return basket.toUpperCase()
//                .chars()
//                .mapToObj(ch->(char)ch)
//                .filter(id->goods.getOne(id) != null)
//                //.mapToObj(id->(ID) id)
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<String,Integer> basketMap = new HashMap<>();
        for (String id: basket.toUpperCase().split("")){
            if (goods.getOne(id) == null){
                System.out.println("No good with id '"+id+"' in the store");
            }
            else {
                Integer count = basketMap.get(id);
                if (count == null)  {
                    count = 0;
                }
                basketMap.put(id, ++count);
            }
        }
        return (Map<ID, T>) basketMap;
    }
}
