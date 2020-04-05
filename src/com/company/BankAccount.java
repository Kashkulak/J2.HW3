package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public double deposit(double sum) {
        return amount += sum;
    }

    public void withDraw(double sum) throws LimitException {

        if (sum>amount) {
            throw new LimitException(
                    "Недостаточно средств на счёте ",amount);
        }else {
            System.out.println("Баланс: " + amount);
            amount -= sum;
        }
    }

    public void printInfo() {
        System.out.println("_______________________");
        System.out.println("Снимаем со счёта: 6000 сом");
    }
}