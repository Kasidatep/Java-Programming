package javaclassa03;
// 64130500004 kasidate

import java.util.Scanner;

public class JavaClassA03 {
    public static void main(String[] args) {
        System.out.print("PROGRAM CALCULATE DAY HOUR MINUTE TO SECOND ");
        System.out.print("-----------------------------------------------");
        System.out.print("INPUT DAY : ");
        Scanner scdays = new Scanner(System.in);
        int days = scdays.nextLine() ;  // Import Days
        System.out.println(days);
        System.out.println(" ********************** ");
        System.out.print("INPUT HOURS : ");
        Scanner schours = new Scanner(System.in);
        int hours = schours.nextLine() ;  
        System.out.println(hours);
        System.out.println(" ********************** ");
        System.out.print("INPUT MINUTE : ");
        Scanner scminutes = new Scanner(System.in);
        int minutes = scminutes.nextLine() ;  //
        System.out.println(minutes);
        System.out.println(" ********************** ");
        
                
        int  seconds = daysHoursMinutesToSeconds(days,hours,minutes);
        //output
        System.out.print("Total Second : ");
        System.out.println(seconds);
    }
    
    static int daysHoursMinutesToSeconds(int days, int hours, int minutes) {
        //funtion daysHoursMinutesToSeconds
        int seconds;
        hours = hours + days*24;
        minutes = minutes + hours*60;
        seconds = minutes*60;
        return seconds ;
    }
     public static void main(String[] args) {
        
        scanner day = new Scanner(system.in);
        System.out.print("Day : ");
        int days=day.nextLine() ;  // Import Days
        
        int hours = 2 ;  // Import Hours
        int minutes = 35 ;  // Import Minutes
        int seconds = daysHoursMinutesToSeconds(days,hours,minutes);
        //output 268500
        System.out.print("Total Second : ");
        System.out.println(seconds);
    }
    
    static int daysHoursMinutesToSeconds(int days, int hours, int minutes) {
        //funtion daysHoursMinutesToSeconds
       //int seconds; 
        hours = hours + days*24;
        minutes = minutes + hours*60;
        seconds = minutes*60;
        return seconds ;
    }
}