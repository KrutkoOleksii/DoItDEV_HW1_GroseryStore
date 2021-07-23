package ua.goit.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SumOfGoodTest {
    private SumOfGood sumOfGood;

    @Before
    public void createGoods(){
        sumOfGood = new SumOfGood();
    }

    @Test
    public void testSumOfGoodA(){
        Double sum = sumOfGood.calculateSumOfGood("A", 1L);
        Assert.assertEquals(1.25D,  sum, 0.0000000000001D);
    }
    @Test
    public void testSumOfGoodAPromo(){
        Double sum = sumOfGood.calculateSumOfGood("A", 5L);
        Assert.assertEquals(5.50D,  sum, 0.0000000000001D);
    }
    @Test
    public void testSumOfGoodB(){
        Double sum = sumOfGood.calculateSumOfGood("B", 1L);
        Assert.assertEquals(4.25D,  sum, 0.0000000000001D);
    }
    @Test
    public void testSumOfGoodC(){
        Double sum = sumOfGood.calculateSumOfGood("C", 1L);
        Assert.assertEquals(1.00D,  sum, 0.0000000000001D);
    }
    @Test
    public void testSumOfGoodCPromo(){
        Double sum = sumOfGood.calculateSumOfGood("C", 8L);
        Assert.assertEquals(7.00D,  sum, 0.0000000000001D);
    }
    @Test
    public void testSumOfGoodD(){
        Double sum = sumOfGood.calculateSumOfGood("D", 1L);
        Assert.assertEquals(0.75D,  sum, 0.0000000000001D);
    }
}
