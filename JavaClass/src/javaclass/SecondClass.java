package javaclass;

public class SecondClass {
    public static void main(String[] args) {
        int days = 3 ;  // Import Days
        int hours = 2 ;  // Import Hours
        int minutes = 35 ;  // Import Minutes
        int seconds = daysHoursMinutesToSeconds(days,hours,minutes);
        //output 268500
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








    