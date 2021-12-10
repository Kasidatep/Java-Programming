package com.siripoom.project.Membercard;

public class Test {
    public static void main(String[] args) {
        MemberCard mc = new MemberCard(1269900357104L);
        mc.buy(50000);
        mc.redeem();
        mc.getNumberOfRedeem();
        System.out.println(mc.toString());
    }


}
