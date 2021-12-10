import int101.part1.Duration;

public class TestOfDuration {

    public static void main(String[] args) {
        
        Duration duration1 = new Duration(3, 21, 46, 41);
        int sec = duration1.toSeconds();
        System.out.println("Total number of seconds = " + sec);
        System.out.println(duration1);
        
        Duration duration2 = new Duration(sec);
        System.out.println("Total number of seconds = " + duration2.toSeconds());
        System.out.println(duration2);
    }

}
