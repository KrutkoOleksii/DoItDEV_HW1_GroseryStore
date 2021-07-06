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
    public void sumOfGoodA(){
        Double sum = sumOfGood.calculateSumOfGood('A', 1);
        Assert.assertEquals(1.25D,  sum, 0.0000000000001D);
    }
    @Test
    public void sumOfGoodAPromo(){
        Double sum = sumOfGood.calculateSumOfGood('A', 5);
        Assert.assertEquals(5.50D,  sum, 0.0000000000001D);
    }
    @Test
    public void sumOfGoodB(){
        Double sum = sumOfGood.calculateSumOfGood('B', 1);
        Assert.assertEquals(4.25D,  sum, 0.0000000000001D);
    }
    @Test
    public void sumOfGoodC(){
        Double sum = sumOfGood.calculateSumOfGood('C', 1);
        Assert.assertEquals(1.00D,  sum, 0.0000000000001D);
    }
    @Test
    public void sumOfGoodCPromo(){
        Double sum = sumOfGood.calculateSumOfGood('C', 8);
        Assert.assertEquals(7.00D,  sum, 0.0000000000001D);
    }
    @Test
    public void sumOfGoodD(){
        Double sum = sumOfGood.calculateSumOfGood('D', 1);
        Assert.assertEquals(0.75D,  sum, 0.0000000000001D);
    }
}
