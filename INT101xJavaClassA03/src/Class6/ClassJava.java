package Class6;


    
public class ClassJava {



final static int HOURS_PER_DAY = 24;
final static int MINUTES_PER_HOUR = 60;
final static int SECONDS_PER_MINUTE = 60;



public static void main(String[] args) {



/*
final int NOTE100 = 100;
final int NOTE50 = 50;
final int NOTE20 = 20;
final int COIN10 = 10;

*/
int days, hours, minutes, seconds;
days = 4;
hours = 3;
minutes = 2;
seconds = 1;
int sec = daysHoursMinutesSecondsToSeconds(days, hours, minutes, seconds);



System.out.println(days + " days " + hours + " hours and " + minutes + " minutes and "
+ seconds + " seconds");

System.out.println(secondsToDaysHoursMinutesSeconds(sec));

}
// 872 = 8, 1, 1, 0, 2
public static String change(int value) {
return "";
}

// value(3,1,0,3,4) = 384
public static int value(int note100, int note50, int note20, int coin10, int coin1) {
return 0;
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

