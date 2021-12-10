package com.siripoom.project;

public class Airtest {
    public static void main(String[] args) {
        AirConditioner a = new AirConditioner(24,0);

        a.increaseTemperature();
        a.changeFanSpeed();
        a.turnAirOnOff();

        System.out.println(a.getTargetTemperature());
        System.out.println(a.getFanSpeed());
        System.out.println(a);
    }
}
