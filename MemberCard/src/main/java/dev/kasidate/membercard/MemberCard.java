package dev.kasidate.membercard;

public class MemberCard {
    static final int POINTS2CASH100 = 800;
    static final int BAHT2POINTS = 25;
    long memberId;
    double totalPurchaseAmount;
    int totalPoints;
    int numberOfRedeem;

    MemberCard(long memberId){
    this.memberId = memberId;
    }

    public  void  buy(double purchaseAmount){
        this.totalPurchaseAmount += purchaseAmount;
        addPoints(purchaseAmount);
    }
    public void addPoints(double purchaseAmount){
        this.totalPoints += (purchaseAmount/BAHT2POINTS);
    }
    public int redeem(){
        int cash = 0;
        if (totalPoints < 100){
             cash = cash + 100 ;
            numberOfRedeem += 1;
            totalPoints -= 100;
        } 
        return cash;
    }
    public int getRemainingPoints(){
     return  this.totalPoints -  getUsagePoints() ;
    }
    public int getUsagePoints(){
        return numberOfRedeem*POINTS2CASH100;

    }
    public int getTotalPoints(){
        return totalPoints;
    }
    public double getTotalPurchaseAmount(){
        return totalPurchaseAmount;
    }
    public long getMemberId(){
        return memberId;
    }

    @Override
    public String toString() {
        return "MemberCard{" +
                "memberId=" + memberId +
                ", totalPurchaseAmount=" + totalPurchaseAmount +
                ", totalPoints=" + totalPoints +
                ", numberOfRedeem=" + numberOfRedeem +
                "'  remainingPoints=" + getRemainingPoints() +
                '}';
    }
}