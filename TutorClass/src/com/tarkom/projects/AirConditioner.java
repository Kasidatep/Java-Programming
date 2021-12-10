package com.tarkom.projects;

public class AirConditioner {

    private int MIN_TEMPERATURE = 20;
    private int MAX_TEMPERATURE = 30;
    private int MAX_FAN_SPEED = 2;
    private int MIN_FAN_SPEED = 0;
    private boolean airOn; // false
    private boolean fanOn; // false
    private int targetTemperature;
    private int fanSpeed;

    AirConditioner(int targetTemperature, int fanSpeed){

        if(targetTemperature > MAX_TEMPERATURE){
            this.targetTemperature = MAX_TEMPERATURE;
        }else if(targetTemperature < MIN_TEMPERATURE){
            this.targetTemperature = MIN_TEMPERATURE;
        }else{
            this.targetTemperature = targetTemperature;
        }

        if(fanSpeed > MAX_FAN_SPEED){
            this.fanSpeed = MAX_FAN_SPEED;
        }else if(fanSpeed < MIN_FAN_SPEED){
            this.fanSpeed = MIN_FAN_SPEED;
        }else {
            this.fanSpeed = fanSpeed;
        }

    }

    public boolean isAirOn() {
        return airOn;
    }

    public int getTargetTemperature() {
        return targetTemperature;
    }

    public int getFanSpeed() {
        return fanSpeed;
    }

    public void turnAirOnOff(){
        if(isAirOn()){ // <--- isAirOn Start false
            this.airOn = false;
            this.fanOn = false;
        }else {
            this.airOn = true; //Start false
            this.fanOn = true; //Start false
        }
    }
    public boolean getairOn(){
        return this.airOn;
    }

    public void increaseTemperature(){
        this.targetTemperature += 1;
        if(this.targetTemperature > MAX_TEMPERATURE){
            this.targetTemperature = MAX_TEMPERATURE;
        }
    }

    public void decreaseTemperature(){
        this.targetTemperature -= 1;
        if(this.targetTemperature < MIN_TEMPERATURE){
            this.targetTemperature = MIN_TEMPERATURE;
        }
    }

    public void changeFanSpeed(){
        this.fanSpeed+=1;
        if(this.fanSpeed > MAX_FAN_SPEED){
            this.fanSpeed = MIN_FAN_SPEED;
        }
    }



    @Override
    public String toString() {

        StringBuilder airString = new StringBuilder();

        airString.append("Air Conditioner{Status:");

        if(isAirOn()){
            String fan = "";
            switch (this.fanSpeed){
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
        }else {
            airString.append("off}");
        }
        return airString.toString();
    }
}
