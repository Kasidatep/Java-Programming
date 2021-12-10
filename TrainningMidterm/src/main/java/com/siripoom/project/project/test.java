package com.siripoom.project.project;

public class test {
    public static void main(String[] args) {
        Bank acc1 = new Bank("Test1",10000.00);
        Bank acc2 = new Bank("Test2",10000.00);

        acc1.Deposit(200.0); //ฝากเงิน
        acc1.Withdraw(2000.0);//ถอนเงิน

        System.out.println(acc1.getBalance());

    }



}
