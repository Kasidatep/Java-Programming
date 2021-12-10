package dev.kasidate;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
       my a = new my("a222",22);
        System.out.println(a.getProduct());
        System.out.println(a.removeitem());
        System.out.println(a.removeitem());
        System.out.println(a.removeitem());
        System.out.println(a.getProduct());
        System.out.println(a.additem());
        System.out.println(a.getProduct());
        System.out.println(a.getTotalPrice());
        System.out.println(a.setReceive(1000));
        System.out.println(a.getChange());
    }
}

