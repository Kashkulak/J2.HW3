package com.company;

public class LimitException extends Exception {
    private double remainingAmount;

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    public LimitException(String message, double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }

    public double getRemainingAmount() {
        return remainingAmount;
    }

}
