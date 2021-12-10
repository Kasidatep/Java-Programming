package com.tarkom.projects;

public class AirTest {
    public static void main(String[] args) {
        AirConditioner a = new AirConditioner(30, 2);

        a.increaseTemperature();
        a.changeFanSpeed();

        a.turnAirOnOff();

        System.out.println( a.getairOn() );
        System.out.println( a.getTargetTemperature() );
        System.out.println( a.getFanSpeed() );
        System.out.println( a );
    }
}
