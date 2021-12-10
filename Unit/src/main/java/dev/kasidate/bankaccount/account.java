package dev.kasidate.bankaccount;

public class account {
    public static void main(String[] args) {
        System.out.println("     My Account    ");
        System.out.println("=====================");
        BankSystem acc1 = new BankSystem("64130500004", "Kasidate", 12587.25);
        //BankSystem acc2 = new BankSystem("67777777004", "PhlaiPhueak",71857.75);
        System.out.println("Account Number : " + acc1.getAccountNumber());
        System.out.println("Account Owner : " + acc1.getAccountOwner());
        System.out.println("=====================");
        System.out.println("Account Balance : " + acc1.getBalance());
        acc1.deposit(500000.00);
        System.out.println(acc1.MsgDeposit());
        System.out.println("Account Balance : " + acc1.getBalance());
        acc1.withdraw(5000.00);
        System.out.println(acc1.MsgWithdraw());
        acc1.deposit(4000.00);
        System.out.println(acc1.MsgDeposit());
        System.out.println(newAccount("321223", "asdfghj"));
    }
}
