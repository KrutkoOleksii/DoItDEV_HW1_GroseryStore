package ua.goit.repository;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GoodsTest {

    private Goods goods;

    @Before
    public void createGoods(){
        goods = new Goods();
    }

    @Test
    public  void testGetPrice() {
        Double price = goods.getPrice('A');
        Assert.assertEquals(1.25D,  price, 0.0000000000001D);
    }

    @Test
    public  void testGetPromoPrice() {
        Double price = goods.getPromoPrice('C');
        Assert.assertEquals(5.00D,  price, 0.0000000000001D);
    }

    @Test
    public  void testGetPromoQuantity() {
        Integer quantity = goods.getPromoQuantity('C');
        Assert.assertEquals(6,  quantity, 0);
    }

}
