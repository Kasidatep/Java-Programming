package SecondtoDay;

public class SecondToMinHouDay {
    public static void main(String[] args) {
        int sec = 51452;
        int seconds, minutes, hours, days;
        final int SECONDSPERMINUTES = 60;
        final int MINUTESPERHOURS = 60;
        final int HOURSPERDAYS = 24;
        int giveSec = sec;
        seconds = sec%SECONDSPERMINUTES;
        sec = sec/ SECONDSPERMINUTES;
        minutes = sec%SECONDSPERMINUTES;
        sec = sec/ MINUTESPERHOURS;
        hours = sec%MINUTESPERHOURS;
        sec = sec/ HOURSPERDAYS;
        days = sec%HOURSPERDAYS;

        System.out.println( "sec = " + giveSec +" === " + days + " Day      " + hours + " Hours   " + minutes + " Minutes    " + seconds + "Seconds");

        System.out.println("--------------------------------------------------------------------------");

        int sum;
        sum = ((((( days * HOURSPERDAYS) + hours)*MINUTESPERHOURS)+minutes)*SECONDSPERMINUTES)+seconds;
        System.out.println("Total Seconds is " + sum);

        if (sum == giveSec){
            System.out.println("Function is True");
        } else {
            System.out.println("Function Error");
        }
    }
}
