package com.siripoom.project;

public class AirConditioner {
    private int MIN_TEMPERATURE = 20;
    private int MAX_TEMPERATURE = 30;
    private int MAX_FAN_SPEED = 2;
    private int MIN_FAN_SPEED = 0;
    private boolean airOn; //false
    private boolean fanOn; //false
    private int targetTemperature;
    private int fanSpeed;

    AirConditioner(int targetTemperature,int fanSpeed){
        //targetTemp
        if (targetTemperature > MAX_TEMPERATURE){
            this.targetTemperature = this.MAX_TEMPERATURE;
        }
        else if (targetTemperature < MIN_TEMPERATURE){
            this.targetTemperature = this.MIN_TEMPERATURE;
        }
        else {
            this.targetTemperature = targetTemperature;
        }

        //fanSpeed
        if (fanSpeed > MAX_FAN_SPEED){
            this.fanSpeed = this.MAX_FAN_SPEED;
        }
        else if (fanSpeed < MIN_FAN_SPEED){
            this.fanSpeed = this.MIN_FAN_SPEED;
        }
        else {
            this.fanSpeed = fanSpeed;
        }
    }


    public void turnAirOnOff(){
        if (isAirOn()){ // <--- Start false
            this.airOn = false;
            this.fanOn = false;
        }
        else {
            this.airOn = true;
            this.fanOn = true;
        }

    }
    public void  increaseTemperature(){
        this.targetTemperature += 1;
        if (targetTemperature > MAX_TEMPERATURE ){
            this.targetTemperature = MAX_TEMPERATURE;
        }

    }
    public void decreaseTemperature(){
        this.targetTemperature -= 1;
        if (targetTemperature < MIN_TEMPERATURE ){
            this.targetTemperature = MIN_TEMPERATURE;
        }
    }
    public void changeFanSpeed(){
        this.fanSpeed += 1;
        if (fanSpeed > MAX_FAN_SPEED){
            this.fanSpeed = MAX_FAN_SPEED;
        }

    }
    public boolean isAirOn() {
        return airOn;
    }

    public int getFanSpeed() {
        return fanSpeed;
    }

    public int getTargetTemperature() {
        return targetTemperature;
    }

    @Override
    public String toString() {
       StringBuilder airString = new StringBuilder();
       airString.append("Air Conditioner {Status:");
       if(isAirOn()) {
           String fan = "";
           switch (this.fanSpeed) {
               case 0:
                   fan = "low";
                   break;
               case 1:
                   fan = "medium";
                   break;
               case 2:
                   fan = "high";
                   break;
           }
           airString.append("on, ");
           airString.append("Temp: ");
           airString.append(this.targetTemperature);
           airString.append(", ");
           airString.append("Fan: ");
           airString.append(fan);
           airString.append("}");
       }
       else {
           airString.append("off}");
       }
       return airString.toString();
    }
}
