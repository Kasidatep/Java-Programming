public class DayHrMinSec {

    final static int HOURS_PER_DAY = 24;
    final static int MINUTES_PER_HOUR = 60;
    final static int SECONDS_PER_MINUTE = 60;

    public static void main(String[] args) {
        int days = 4;
        int hours = 3;
        int minutes = 2;
        int seconds = 1;
        int sec = daysHoursMinutesSecondsToSeconds(days, hours, minutes, seconds);

        System.out.println(days + " days " + hours + " hours and " 
                + minutes + " minutes and " + seconds + " seconds");

        System.out.println(secondsToDaysHoursMinutesSeconds(sec));
    }
    
    public static int daysHoursMinutesSecondsToSeconds(int days, int hours, int minutes, int seconds) {
        seconds += ((days * HOURS_PER_DAY + hours)
                * MINUTES_PER_HOUR + minutes)
                * SECONDS_PER_MINUTE;
        return seconds;
    }

    public static String secondsToDaysHoursMinutesSeconds(int seconds) {

        int minutes = seconds / SECONDS_PER_MINUTE;
        seconds %= SECONDS_PER_MINUTE;

        int hours = minutes / MINUTES_PER_HOUR;
        minutes %= MINUTES_PER_HOUR;

        int days = hours / HOURS_PER_DAY;
        hours %= HOURS_PER_DAY;

        return days + " days, " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds.";
    }

}
