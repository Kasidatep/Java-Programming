package dev.kasidate.airconditioner;


public class AirControl {
    public static void main(String[] args) {
        AirConditioner a1 = new AirConditioner(3,25.00);
        System.out.println(a1.getFanSpeed());
        System.out.println(a1.getTempurature());
        a1.decreaseTempurature();
        System.out.println(a1.getTempurature());
        a1.increaseFanSpeed();
        System.out.println(a1.getFanSpeed());
        a1.increaseTempurature();
        System.out.println(a1.getTempurature());
        a1.decreaseFanSpeed();
        System.out.println(a1.getFanSpeed());
        System.out.println("-------------------------");
        a1.Direction(7);
        System.out.println(a1.getdirection());
        System.out.println("-------------------------");
       // a1.MinutesToOff(854);
        System.out.println(a1.getMinutesToOff());
        System.out.println(a1);
        a1.AirOn();
        System.out.println(a1.Status());
        a1.Direction(5);
        System.out.println(a1.getdirection());

        System.out.println("-------------------------");
        System.out.println(a1);

    }
}
