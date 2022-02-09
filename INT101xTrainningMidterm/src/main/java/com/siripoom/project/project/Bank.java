package com.siripoom.project.project;

public class Bank {
    private String OwnerName;
    private Double Balance;

    Bank(String OwnerName,Double Balance){ //Constructor
        this.OwnerName = OwnerName;
        this.Balance = Balance;
    }

    public void Deposit(double money){
        if (money > 0){
            this.Balance += money;
        }
    }
    public void Withdraw(double money){
        if (money < this.Balance){
            this.Balance -= money;
        }
    }
    public Double getBalance() {
        return Balance;
    }


    @Override
    public String toString() {
        return "Bank{" +
                "OwnerName='" + OwnerName + '\'' +
                ", Balance=" + Balance +
                '}';
    }
}
