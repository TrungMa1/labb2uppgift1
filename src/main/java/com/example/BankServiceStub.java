package com.example;

public class BankServiceStub implements BankService {

    private final boolean paymentResult;

    public BankServiceStub(boolean paymentResult) {
        this.paymentResult = paymentResult;
    }

    @Override
    public boolean pay(String id, double amount) {
        if ("1".equals(id) && amount == 50000.0) {
            return this.paymentResult;
        }
        return false;
    }
}