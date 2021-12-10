package dev.kasidate.bankaccount.account;

public class Bank {
    private String accountNumber;
    private String accountOwner;
    private double balance;
    private double deposit;
    private double totalDeposit;
    private double withdraw;
    private double totalWithdraw;
    // private String transactionHistory;


    Bank(String accountNumber, String accountOwner, double balance) {
        this.accountNumber = accountNumber;
        this.accountOwner = accountOwner;
        this.balance = balance;
        this.totalDeposit += this.totalDeposit + deposit;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public double getBalance() {
        return balance;
    }

    public String deposit(double deposit) {
        String msgDeposit;
        String depositSuccess = "Deposit In Account Number " + accountNumber + " is " + deposit + "\n" + "New Balance is " ;
        String depositFailed = "Can Not Deposit now Please Check Again";
        if (deposit > 0) {
            this.balance = this.balance + deposit;
            msgDeposit = depositSuccess;
        } else {
            this.balance = this.balance;
            msgDeposit = depositFailed;
        }
        return msgDeposit + balance;
    }

    /*  public String MsgDeposit(){
          String msgDeposit;
          String depositSuccess = "Deposit In Account Number "+ accountNumber +" is " + this.deposit + "\n" + "New Balance is "+ this.balance;
          String depositFailed = "Can Not Deposit now Please Check Again";
          if( this.deposit <= 0){
              msgDeposit = depositFailed;
          } else {
              msgDeposit = depositSuccess;
          }
          return msgDeposit;
      }*/
    public String withdraw(double withdraw) {
        String msgWithdraw;
        String withdrawSuccess = "Withdraw In Account Number " + accountNumber + " is " + withdraw + "\n" + "New Balance is " ;
        String withdrawFailed = "Can Not Withdraw now Please Check Again";
        if (withdraw <= this.balance) {
            this.balance = this.balance - withdraw;
            msgWithdraw = withdrawSuccess;
        } else {
            this.balance = this.balance;
            msgWithdraw = withdrawFailed;
        }
        return msgWithdraw + balance;
    }
}
   /* public String MsgWithdraw(){
        String msgWithdraw;
        String withdrawSuccess = "Withdraw In Account Number "+ accountNumber +" is " + this.withdraw + "\n" + "New Balance is "+ this.balance;
        String withdrawFailed = "Can Not Withdraw now Please Check Again";
        if( this.withdraw > this.balance){
            msgWithdraw = withdrawFailed;
        } else {
            msgWithdraw = withdrawSuccess;
        }
        return msgWithdraw;
    }*/
   // public void Transfer(String accountTransfer){}
