package ua.goit.repository;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ua.goit.models.Good;

import java.util.HashMap;
import java.util.Map;

public class GoodsTest {

    private BaseIntf<String ,Good> goods;

    @Before
    public void createGoods(){
//        Map<String, Good> base = new HashMap<>();
//        goods = new Base(base);
    }

    @Test
    public  void testGetPrice() {
        Double price = goods.getOne("A").getPrice();
        Assert.assertEquals(1.25D,  price, 0.0000000000001D);
    }

    @Test
    public  void testGetPromoPrice() {
        Double price = goods.getOne("C").getPromo().getPromoPrice();
        Assert.assertEquals(5.00D,  price, 0.0000000000001D);
    }

    @Test
    public  void testGetPromoQuantity() {
        Integer quantity = goods.getOne("C").getPromo().getPromoQuantity();
        Assert.assertEquals(6,  quantity, 0);
    }

}
