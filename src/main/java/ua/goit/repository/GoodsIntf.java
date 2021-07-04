package ua.goit.repository;

import ua.goit.models.Good;

public interface GoodsIntf <ID, K> {

    K getById(ID id);

    Double getPrice(ID id);

    Double getPromoPrice(ID id);

    Integer getPromoQuantity(ID id);

    static Goods of() {
        return new Goods();
    }
}
