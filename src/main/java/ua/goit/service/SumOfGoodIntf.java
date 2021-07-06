package ua.goit.service;

public interface SumOfGoodIntf {

    Double calculateSumOfGood(Character id, Integer quantity);

    static SumOfGood of() {
        return new SumOfGood();
    }
}
