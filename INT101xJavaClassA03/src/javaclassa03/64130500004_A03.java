package javaclass;
// 64130500004 kasidate
public class JavaClassA03 {
    public static void main(String[] args) {
        int days = 4 ;  // Input Days
        int hours = 2 ;  // Input Hours
        int minutes = 15 ;  // Input Minutes
        int seconds = daysHoursMinutesToSeconds(days,hours,minutes);
        System.out.println("Sum Seconds of " + days + " Day " + hours + " Hours and " + minutes + " Minute" );
        System.out.println("Total is " + seconds + " Second !!");
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