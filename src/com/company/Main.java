package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount accountAmount = new BankAccount();
        accountAmount.deposit(10000);


        while (true) {
            try {
                accountAmount.withDraw(6000);
                accountAmount.printInfo();
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                try {
                    accountAmount.withDraw(accountAmount.getAmount());
                }catch (LimitException le){
                    le.printStackTrace();
                }
                break;
            }
            System.out.println("Остаток: " + accountAmount.getAmount());
        }

    }
}
