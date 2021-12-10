package dev.kasidate.unit;


public class AirTest {
    public static void main(String[] args) {
        AirConditioner a = new AirConditioner(28, 3);

        a.increaseTemperature();
        a.decreaseTemperature();
        a.decreaseTemperature();
        a.decreaseTemperature();
        a.decreaseTemperature();
        a.changeFanSpeed();

        //a.turnAirOnOff();

        System.out.println( "airOn "+ a.getairOn() );
        System.out.println(a.AirStatus() );
        System.out.println( "Temperature "+ a.getTargetTemperature() );
        System.out.println(a.getTempMessage());
        System.out.println("FanSpeed "+ a.getFanSpeed() );
        System.out.println(a.getFanMessage());
        System.out.println(a.isAirOn());
        System.out.println( a );
    }
}
