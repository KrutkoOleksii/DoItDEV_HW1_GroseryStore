package ua.goit.service;

public interface CalculateBasketIntf {

    Double sumOfBasket(String basket);

    static CalculateBasket of(){
        return new CalculateBasket();
    }
}
