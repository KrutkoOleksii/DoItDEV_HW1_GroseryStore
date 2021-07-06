package ua.goit.service;

import ua.goit.repository.Goods;
import ua.goit.repository.GoodsIntf;

public class SumOfGood implements SumOfGoodIntf{
    private final Goods goods = GoodsIntf.of();

    @Override
    public Double calculateSumOfGood(Character id, Integer quantity) {
        Integer promoQuantity = goods.getPromoQuantity(id);
        Double sum = (promoQuantity == 0 ) ?
                goods.getPrice(id) * quantity :
                goods.getPrice(id) * (quantity % promoQuantity) + goods.getPromoPrice(id) * (quantity / promoQuantity);
        return sum;
    }
}
