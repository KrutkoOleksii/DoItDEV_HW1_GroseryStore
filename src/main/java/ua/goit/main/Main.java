package ua.goit.main;

import ua.goit.models.Good;
import ua.goit.models.Promo;
import ua.goit.repository.BaseIntf;
import ua.goit.repository.Factory;
import ua.goit.service.CalculateBasketIntf;

public class Main {

    private CalculateBasketIntf calculateBasket = CalculateBasketIntf.of();

    public static void main(String[] args) {
        BaseIntf<String, Good> repositoryGood = Factory.of(Good.class);
        repositoryGood.save(new Good("A", 1.25D, new Promo(3,3.00D)));
        repositoryGood.save(new Good("B", 4.25D, new Promo(0,0.00D)));
        repositoryGood.save(new Good("C", 1.00D, new Promo(6,5.00D)));
        repositoryGood.save(new Good("D", 0.75D, new Promo(0,0.00D)));

        new Main().calculate();
    }

    public void calculate() {
        String basket = "ABCDACCDABCAF";
        Double sum = calculateBasket.sumOfBasket(basket);
        System.out.println("sum = "+sum);
    }
}
