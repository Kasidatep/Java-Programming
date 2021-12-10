import int101.part1.UnitAndValue;

public class TestOfUnitAndValue {

    public static void main(String[] args) {
        UnitAndValue hour = new UnitAndValue("hours", 5);
        UnitAndValue minute = new UnitAndValue("minutes", 3);
        System.out.println(minute.getValue() + " " + minute.getName());
        System.out.println(hour);
        System.out.println(minute);
    }
}
