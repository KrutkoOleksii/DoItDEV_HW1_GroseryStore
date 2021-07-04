package ua.goit.service;

public interface CalculateBasketIntf {

    Double sumOfBasket(String basket);

    Double sumOfGood(Character id, Integer count);

    static CalculateBasket of(){
        return new CalculateBasket();
    }
}
