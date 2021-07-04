package ua.goit;

import ua.goit.service.CalculateBasket;
import ua.goit.service.CalculateBasketIntf;

public class Main {

    private CalculateBasket calculateBasket = CalculateBasketIntf.of();

    public static void main(String[] args) {
        new Main().calculate();
    }

    public void calculate() {
        String basket = "ABCDACCDABCAF";
        Double sum = calculateBasket.sumOfBasket(basket);
        System.out.println("sum = "+sum);
    }
}
