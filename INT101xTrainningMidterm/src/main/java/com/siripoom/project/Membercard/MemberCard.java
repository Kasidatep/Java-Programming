package com.siripoom.project.Membercard;

public class MemberCard {
    static final int POINTS2CASH100 = 800; // 800 คะแนน สำหรับแลกเงินสด 100 บาท
    static final int BAHT2POINTS = 25; //25 บาท สำหรับแลก 1 คะแนน
    long memberId;
    double totalPurchaseAmount;
    int totalPoints;
    int usagePoints;
    int remainingPoints;

    public MemberCard(long idCard){
        this.memberId = idCard;
    }
    public void buy (double purchaseAmount){
        this.totalPurchaseAmount += purchaseAmount;
        addPoints(purchaseAmount);

    }

    private void addPoints(double purchaseAmount){
        totalPoints += (int) purchaseAmount / BAHT2POINTS;

    }
    public int redeem(){

        if (getRemainingPoints()>=800){
            usagePoints += 800;
            return 100;
        }
        else {
            return 0;
        }
    }
    public int getRemainingPoints(){
        return totalPoints - usagePoints;
    }
    public int getTotalPoints(){
        return totalPoints;
    }
    public double getTotalPurchaseAmount(){
        return totalPurchaseAmount;
    }
    public long getMemberId() {
        return memberId;
    }
    public int getNumberOfRedeem(){
        return usagePoints/800;
    }

    @Override
    public String toString() {
        return "MemberCard  {" +
                "memberId =" + memberId +
                ", totalPurchaseAmount =" + totalPurchaseAmount +
                ", totalPoints =" + totalPoints +
                ", usagePoints =" + usagePoints + ", remainingPoint ="+ getRemainingPoints() +
        '}';
    }
}
