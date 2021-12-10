package dev.kasidate.membercard;

public class MyCard {
    public static void main(String[] args) {
        MemberCard mc1 = new MemberCard (310001234671L);
        mc1.buy(100000);
        mc1.redeem();
        mc1.redeem();
        System.out.println(mc1);
        //function();
        
        
    }
    /*public void function(){
        System.out.println("555");
        /*MemberCard mc1 = new MemberCard (310001234671L);
        mc1.buy(100000);
        mc1.redeem();
        mc1.redeem();
        System.out.println(mc1);*/
    }/*
}
