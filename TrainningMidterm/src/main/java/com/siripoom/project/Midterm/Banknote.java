package com.siripoom.project.Midterm;

public class Banknote {

    int BANK100 = 100*100;
    final int BANK50 = 50*100;
    final int BANK20 = 20*100;
    final int COIN10 = 10*100;
    final int COIN5 = 5*100;
    final int COIN1 = 1*100;
    final int COIN050 = 50;
    final int COIN025 = 25;

    int bank100,bank50,bank20,coin10,coin5,coin1;
    double coin050,coin025;
    double val;

    public Banknote(int bank100,int bank50,int bank20,int coin10,int coin5,int coin1,double coin050,double coin025){

        this.bank100 = bank100*100;
        this.bank50 = bank50*50;
        this.bank20= bank20*20;
        this.coin10 = coin10*10;
        this.coin5 = coin5*5;
        this.coin1 = coin1;
        this.coin050 =  coin050*0.50;
        this.coin025 = coin025*0.25;
    }

    public double bankToValue(){
        this.val = bank100 + bank50 + bank20 + coin10 + coin5 + coin1 + coin050 + coin025;
        return val;
    }
    
    public String valueToBank(double val){
        val *= 100;
        int money_baht = (int) val;
        bank100 = money_baht/BANK100;
        money_baht = money_baht%BANK100;
        bank50 = money_baht/BANK50;
        money_baht = money_baht%BANK50;
        bank20 =  money_baht/BANK20;
        money_baht = money_baht%BANK20;
        coin10 = money_baht/COIN10;
        money_baht = money_baht%COIN10;
        coin5 = money_baht/COIN5;
        money_baht = money_baht%COIN5;
        coin1 = money_baht/COIN1;
        money_baht = money_baht%COIN1;
        int coin050 = money_baht/COIN050;
        money_baht =money_baht%COIN050;
        int coin025 = money_baht/COIN025;
        money_baht =money_baht%COIN025;


        return "BANKNOTE100 : "+bank100+ ", BANKNOTE50 : "+bank50+", BANKNOTE20 :"+bank20+ ", COIN10 : "+coin10+
                ", COIN5 : "+coin5+", COIN1 : "+coin1+ ", COIN.50 : "+coin050+ ", COIN.25 : "+coin025;
    }

}
