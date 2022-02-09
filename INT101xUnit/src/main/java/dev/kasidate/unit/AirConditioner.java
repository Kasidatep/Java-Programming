package dev.kasidate.unit;

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
        //This is Constructors
        // if targetTemperature > MAX_TEMPERATURE --> use value MAX_TEMPERATURE
        // if targetTemperature < MIN_TEMPERATURE --> use value MIN_TEMPERATURE
        // can use targetTemperature when MIN_TEMPERATURE < targetTemperature < MAX_TEMPERATURE
        if(targetTemperature > MAX_TEMPERATURE){
            this.targetTemperature = MAX_TEMPERATURE;
        }else if(targetTemperature < MIN_TEMPERATURE){
            this.targetTemperature = MIN_TEMPERATURE;
        }else{
            this.targetTemperature = targetTemperature;
        }

        // if fanSpeed > MAX_FAN_SPEED set fanSpeed value = MAX_FAN_SPEED
        // if fanSpeed < MIN_FAN_SPEED set fanSpeed value = MIN_FAN_SPEED
        // if MIN_FAN_SPEED < fanSpeed < MAX_FAN_SPEED use fanSpeed value
        if(fanSpeed > MAX_FAN_SPEED){
            this.fanSpeed = MAX_FAN_SPEED;
        }else if(fanSpeed < MIN_FAN_SPEED){
            this.fanSpeed = MIN_FAN_SPEED;
        }else {
            this.fanSpeed = fanSpeed;
        }

    }
    //method return airOn value by turnAirOnOff method  can call on main class
    public boolean isAirOn() {
        return airOn;
    }
    public String AirStatus(){
        String airStatus;
        String statusOn = "Air Status is : ON ";
        String statusOff = "Air Status is : OFF ";
        if(isAirOn()) {
            airStatus = statusOn;
        } else{
            airStatus = statusOff;
        }
        return airStatus;
    }

    //check targetTemperature value can call on main class
    public int getTargetTemperature() {
        return targetTemperature;
    }
    //check fanSpeed value can call on main class
    public int getFanSpeed() {
        return fanSpeed;
    }
    public String getFanMessage(){
        String fanMessage ;
        if(fanSpeed == 0 ){
            String fanLv0 ="Fan Speed Level : Low";
            fanMessage = fanLv0;}

            else if(fanSpeed == 1){
            String fanLv1 ="Fan Speed Level : Medium";
            fanMessage = fanLv1;}

        else if(fanSpeed == 2){
        String fanLv2 ="Fan Speed Level : High";
        fanMessage = fanLv2;}
        else {
        String fanLvErr ="Fan Speed Level : Err";
        fanMessage = fanLvErr;}
        return fanMessage + " ";
    }
    //check airOn Status when you call status air is switch
    public void turnAirOnOff(){
        if(isAirOn()){ // <--- isAirOn Start false
            this.airOn = false;
            this.fanOn = false;
        }else {
            this.airOn = true; //Start false
            this.fanOn = true; //Start false
        }
    }
    //method return airOn value  can call on main class
    public boolean getairOn(){
        return this.airOn;
    }
    public String getTempMessage(){
        if(targetTemperature <= MIN_TEMPERATURE){
            this.targetTemperature = MIN_TEMPERATURE;
        } else if(targetTemperature >= MAX_TEMPERATURE){
            this.targetTemperature = MAX_TEMPERATURE;
        } else{
            this.targetTemperature = targetTemperature;
        }
        return "Temperature is " + this.targetTemperature;
    }
    // increaseTemperature when this.targetTemperature + increaseTemperature <= MAX_TEMPERATURE
    // else return MAX_TEMPERATURE is Max
    public void increaseTemperature(){
        this.targetTemperature += 1;
        if(this.targetTemperature > MAX_TEMPERATURE){
            this.targetTemperature = MAX_TEMPERATURE;
        }
    }
    // decreaseTemperature when this.targetTemperature - increaseTemperature >= MIN_TEMPERATURE
    // else return MIN_TEMPERATURE is Min
    public void decreaseTemperature(){
        this.targetTemperature -= 1;
        if(this.targetTemperature < MIN_TEMPERATURE){
            this.targetTemperature = MIN_TEMPERATURE;
        }
    }
    //change fanSpeed
    public void changeFanSpeed(){
        this.fanSpeed+=1;
        if(this.fanSpeed > MAX_FAN_SPEED){
            this.fanSpeed = MIN_FAN_SPEED;
        }
    }


    //toString return to main class
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

