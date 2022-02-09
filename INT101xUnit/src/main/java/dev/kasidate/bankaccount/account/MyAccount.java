package dev.kasidate.bankaccount.account;


public class MyAccount {
    public static void main(String[] args) {
        System.out.println("     My Account    " );
        System.out.println("=====================");
        Bank acc1 = new Bank("64130500004", "Kasidate",12587.25);
        Bank acc2 = new Bank("67777777004", "PhlaiPhueak",71857.75);
        System.out.println("Account Number : "+acc1.getAccountNumber());
        System.out.println("Account Owner : "+acc1.getAccountOwner());
        System.out.println("=====================");
        System.out.println(acc1.deposit(300.00));
        System.out.println("---------------------"+acc1.getBalance());
        System.out.println(acc1.withdraw(5700.00));
        System.out.println(acc1.deposit(5000.00));
        System.out.println(acc1.deposit(4000.00));
        System.out.println(acc1.withdraw(5000.00));
        acc1.withdraw(3000.00);
        System.out.println("---------------------"+acc1.getBalance());
        System.out.println(acc1.withdraw(2400.00));

    }
}

