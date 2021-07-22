package ua.goit.service;

public interface CalculateBasketIntf {

    Double sumOfBasket(String basket);

    static CalculateBasketIntf of(){
        return new CalculateBasket();
    }
}
