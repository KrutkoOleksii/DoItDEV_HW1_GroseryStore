package ua.goit.service;

public interface SumOfGoodIntf <ID>{

    Double calculateSumOfGood(ID id, Integer quantity);

    static SumOfGoodIntf of() {
        return new SumOfGood();
    }
}
