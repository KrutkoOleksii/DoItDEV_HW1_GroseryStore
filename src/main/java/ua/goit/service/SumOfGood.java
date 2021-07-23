package ua.goit.service;

import ua.goit.models.Good;
import ua.goit.repository.BaseIntf;
import ua.goit.repository.Factory;

public class SumOfGood implements SumOfGoodIntf<String>{

    private final BaseIntf<String, Good> goods = Factory.of(Good.class);

    @Override
    public Double calculateSumOfGood(String id, Long quantity) {
        Integer promoQuantity = goods.getOne(id).getPromo().getPromoQuantity();
        return (promoQuantity == 0 ) ?
                goods.getOne(id).getPrice() * quantity :
                goods.getOne(id).getPrice() * (quantity % promoQuantity) + goods.getOne(id).getPromo().getPromoPrice() * (quantity / promoQuantity);

    }
}
