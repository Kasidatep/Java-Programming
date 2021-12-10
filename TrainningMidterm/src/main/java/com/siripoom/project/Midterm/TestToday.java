package com.siripoom.project.Midterm;

import com.siripoom.project.project.Bank;

import java.util.Scanner;

public class TestToday {
    public static void main(String[] args) {

        Banknote bk1 = new Banknote(1,1,1,1,1,1,1,1);
        System.out.println(bk1.bankToValue());

        System.out.println(bk1.valueToBank(186.75));


//        Scanner sc = new Scanner(System.in);
//        System.out.print("Width : ");
//        double w = sc.nextDouble();
//        System.out.print("Height : ");
//        double h = sc.nextDouble();
//        Rectangle01 rec1 = new Rectangle01();
//        rec1.setWidth(w);
//        rec1.setHeight(h);
//        System.out.println("Area : "+rec1.getArea());
//        System.out.println("Perimeter : "+rec1.getPerimeter());
    }
}
