package dev.kasidate.bankaccount;

import com.sun.net.httpserver.Authenticator;

public class BankSystem  {
    private String accountNumber;
    private String accountOwner;
    private double balance;
    private double deposit;
    private double totalDeposit;
    private double withdraw;
    private double totalWithdraw;
   // private String transactionHistory;


    BankSystem(String accountNumber, String accountOwner, double balance){
        this.accountNumber = accountNumber;
        this.accountOwner = accountOwner;
        this.balance = balance;
        this.totalDeposit += this.totalDeposit + deposit;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public  String getAccountOwner(){
        return accountOwner;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double deposit){
        if(deposit > 0){
            this.balance = this.balance + deposit;
            this.deposit = deposit;
        } else {
            this.balance = this.balance;
        }
    }
   public String MsgDeposit(){
        String msgDeposit;
        String depositSuccess = "Deposit In Account Number "+ accountNumber +" is " + this.deposit + "\n" + "New Balance is "+ this.balance;
        String depositFailed = "Can Not Deposit now Please Check Again";
        if( this.deposit <= 0){
            msgDeposit = depositFailed;
        } else {
           msgDeposit = depositSuccess;
        }
        return msgDeposit;
    }
    public void withdraw(double withdraw){

        if(withdraw <= this.balance ){
            this.balance = this.balance - withdraw;
            this.withdraw = withdraw;
        } else {
            this.balance = this.balance;
        }
    }
    public String MsgWithdraw(){
        String msgWithdraw;
        String withdrawSuccess = "Withdraw In Account Number "+ accountNumber +" is " + this.withdraw + "\n" + "New Balance is "+ this.balance;
        String withdrawFailed = "Can Not Withdraw now Please Check Again";
        if( this.withdraw > this.balance){
            msgWithdraw = withdrawFailed;
        } else {
            msgWithdraw = withdrawSuccess;
        }
        return msgWithdraw;
    }
    public String newAccount (String accountOwner, String accountNumber){
        this.accountOwner = accountOwner;
        this.accountNumber = accountNumber;
        return ;
    }
    public String closeAccount (String accountOwner, String accountNumber){
        this.accountOwner = accountOwner;
        this.accountNumber = accountNumber;
        return ;
    }
}