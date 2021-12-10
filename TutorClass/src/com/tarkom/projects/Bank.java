package com.tarkom.projects;

public class Bank {

    private String OwnerName;
    private Double Balance;

    Bank(String OwnerName, Double Balance){
        this.OwnerName = OwnerName;
        this.Balance = Balance;
    }

    public void Deposit(double money){
        if(money > 0){
            this.Balance += money;
        }
    }

    public void Withdraw(double money){
        if(money < this.Balance){
            this.Balance -= money;
        }
    }

    public Double getBalance(){
        return Balance;
    }

    public String getOwnerName(){
        return OwnerName;
    }
}
