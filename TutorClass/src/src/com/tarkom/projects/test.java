package com.tarkom.projects;

public class test {
    public static void main(String[] args) {

        Bank acc1 = new Bank("Demo1",100.00);
        acc1.Deposit(1000);
        acc1.Withdraw(500);
        System.out.println(acc1.getBalance());
    }
}
