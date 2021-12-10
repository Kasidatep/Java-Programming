package int101.part1;

public class Duration {
    final static int HOURS_PER_DAY = 24; // number of hours in a day
    final static int MINUTES_PER_HOUR = 60; // number of minutes in an hour
    final static int SECONDS_PER_MINUTE = 60; // number of seconds in a minute

    private final int days;
    private final int hours;
    private final int minutes;
    private final int seconds;
    
    // constructor
    public Duration(int days, int hours, int minutes, int seconds) {
        this.days = days;
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    // constructor
    public Duration(int seconds) {

        // round seconds to minutes
        int minutes = seconds / SECONDS_PER_MINUTE;
        this.seconds = seconds % SECONDS_PER_MINUTE;

        // round minutes to hours
        int hours = minutes / MINUTES_PER_HOUR;
        this.minutes = minutes % MINUTES_PER_HOUR;

        // round hours to days
        this.days = hours / HOURS_PER_DAY;
        this.hours = hours % HOURS_PER_DAY;
    }
    
    public int toSeconds() {
        return ((days * HOURS_PER_DAY + hours) * MINUTES_PER_HOUR + minutes)
                * SECONDS_PER_MINUTE + seconds;
    }
    
    @Override
    public String toString() {
        return days + " days, " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds.";
    }
}
