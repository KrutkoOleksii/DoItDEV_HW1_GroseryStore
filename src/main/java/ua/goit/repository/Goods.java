package ua.goit.repository;

import ua.goit.models.Good;
import ua.goit.models.Promo;

import java.util.HashMap;
import java.util.Map;

public class Goods implements GoodsIntf<Character, Good>{

    private Map<Character, Good> goods = new HashMap<>();

    public Goods() {
        this.goods.put('A', new Good('A', 1.25D, new Promo(3,3.00D)));
        this.goods.put('B', new Good('B', 4.25D, new Promo(0,0.00D)));
        this.goods.put('C', new Good('C', 1.00D, new Promo(6,5.00D)));
        this.goods.put('D', new Good('D', 0.75D, new Promo(0,0.00D)));
    }

    @Override
    public Good getById(Character id) {
        return goods.get(id);
    }
    @Override
    public Double getPrice(Character id){
        return goods.get(id).getPrice();
    }
    @Override
    public Double getPromoPrice(Character id){
        return goods.get(id).getPromo().getPromoPrice();
    }
    @Override
    public Integer getPromoQuantity(Character id){
        return goods.get(id).getPromo().getPromoQuantity();
    }
}
