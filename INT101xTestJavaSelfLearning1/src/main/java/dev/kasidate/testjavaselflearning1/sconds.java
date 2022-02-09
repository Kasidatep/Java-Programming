package dev.kasidate.testjavaselflearning1;

import java.util.Scanner;

public class sconds {
     public static void main(String[] args) {
        
        System.out.print("PROGRAM CALCULATE DAY HOUR MINUTE TO SECOND " );
        System.out.print("-----------------------------------------------");
        System.out.print("INPUT DAY : ");
        Scanner scday = new Scanner(System.in);
        String day = scday.nextLine() ;  // Import Days
        int days =Integer.parseInt(day); 
        System.out.println(days);
        System.out.println(" ********************** ");
        System.out.print("INPUT HOURS : ");
        Scanner schours = new Scanner(System.in);
        String hour = schours.next() ;
        int hours=Integer.parseInt(hour);  
        System.out.println(hours);
        System.out.println(" ********************** ");
        System.out.print("INPUT MINUTE : ");
        Scanner scminutes = new Scanner(System.in);
        String minute = scminutes.nextLine() ; 
        int minutes = Integer.parseInt(minute); 
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
}