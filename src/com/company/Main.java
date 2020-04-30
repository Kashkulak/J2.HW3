package com.company;

public class Main {

    public static void main(String[] args) {
        Bank demirBank = new Bank();
        demirBank.deposit(10000);
        while (true) {
            try {
                demirBank.withDraw(6000);
            } catch (LimitException le) {
                System.out.println(le.getMessage());
                try {
                    demirBank.withDraw((int) demirBank.getAmount());
                } catch (LimitException l) {
                    l.printStackTrace();
                }
                break;
            }
        }
    }
}
