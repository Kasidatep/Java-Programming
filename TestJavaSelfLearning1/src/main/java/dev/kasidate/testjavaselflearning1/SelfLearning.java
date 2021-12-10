package dev.kasidate.testjavaselflearning1;

import java.util.Scanner;

public class SelfLearning {

    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("What is your name? ");
        Scanner scname = new Scanner(System.in);
        System.out.print("Name : ");
        String name = scname.nextLine();
        System.out.println(name);
        Scanner day = new Scanner(System.in);
        System.out.print("Day : ");
        int days = day.nextLine();  // Import Days

        int hours = 2;  // Import Hours
        int minutes = 35;  // Import Minuntes
        int seconds;
        seconds = daysHoursMinutesToSeconds(days, hours, minutes);
        //output 268500
        System.out.print("Total Second : ");
        System.out.println(seconds);
    }

    static int daysHoursMinutesToSeconds(int days, int hours, int minutes) {
        //funtion daysHoursMinutesToSeconds
        int seconds;
        hours = hours + days * 24;
        minutes = minutes + hours * 60;
        seconds = minutes * 60;
        return seconds;
    }
}
