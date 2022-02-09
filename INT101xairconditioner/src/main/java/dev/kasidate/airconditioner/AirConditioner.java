package dev.kasidate.airconditioner;

public class AirConditioner {
    private boolean onOffStatus;
    private boolean onOffTimer;
    private int fanSpeed;
    private double tempurature;
    private int direction;
    private int minutesToOff;

    AirConditioner(int fanSpeed, double tempurature) {
        this.fanSpeed = fanSpeed;
        this.tempurature = tempurature;
    }

    public double getTempurature() {
        return tempurature;
    }

    public int getFanSpeed() {
        return fanSpeed;
    }

    public void increaseTempurature() {
        this.tempurature += 1;
    }

    public void decreaseTempurature() {
        this.tempurature -= 1;
    }

    public void increaseFanSpeed() {
        this.fanSpeed += 1;
    }

    public void decreaseFanSpeed() {
        this.fanSpeed -= 1;
    }

    public void Direction(int direction) {
        this.direction = direction;
    }

    public String getdirection() {
        String msgDirection;
        if (this.direction == 1) {
            String msgDirection1 = "Mode 1";
            msgDirection = msgDirection1;
        } else if (this.direction == 2) {
            String msgDirection2 = "Mode 2";
            msgDirection = msgDirection2;
        } else if (this.direction == 3) {
            String msgDirection3 = "Mode 3";
            msgDirection = msgDirection3;
        } else if (this.direction == 4) {
            String msgDirection4 = "Mode 4";
            msgDirection = msgDirection4;
        } else if (this.direction == 5) {
            String msgDirection5 = "Mode 5";
            msgDirection = msgDirection5;
        } else {
            String msgDirection0 = "Not Found";
            msgDirection = msgDirection0;
        }
        return msgDirection;
    }

    public void MinutesToOff(int minutes) {
            this.minutesToOff = minutes;

    }

    public String getMinutesToOff() {
        String msgMinutesToOff;
        if (minutesToOff <= 0) {
            String msgMinutesOff = "Now AutoOff is OFF please set TimeToOff for used";
            msgMinutesToOff = msgMinutesOff;
        } else {
            String msgMinutesOn = "Now AutoOff is ON Count "+ this.minutesToOff +" Minutes To off";
            msgMinutesToOff = msgMinutesOn;
        }
        return msgMinutesToOff;
    }
   public void onOffTimer (){
        if (minutesToOff <= 0){
            this.onOffTimer = false ;
        } else if(minutesToOff > 0){ this.onOffTimer = true; }
    }
    public void AirOn(){
        onOffStatus = true;
    }

    public String Status(){
        String status;
        if ( onOffStatus = true){
            String statusOn = "Air : ON ";
            status = statusOn;
        } else {
            String statusOff = "Air : OFF";
            status = statusOff;
        }
        return status;
    }
    @Override
    public String toString() {
        String air;
        String airtime;
        if (minutesToOff > 0) {
            String airTimeOn = " and  " +  minutesToOff + " Minutes To Off }" ;
            airtime = airTimeOn;
        } else {
            String airTimeOff = " ";
            airtime = airTimeOff;
        }

        if (onOffStatus = true) {
            String airOn = "AirConditioner { " +
                    " Status : " + Status() +
                    ", Fan Speed : " + fanSpeed +
                    ", tempurature : " + tempurature + " c" +
                    ", direction : " + getdirection() + ", AutoOff " + onOffTimer + airtime +" }";
            air = airOn;
        }else {
            String airOff = "AirConditioner{" +
                    "Status : " + Status() ;
            air = airOff;
        }

        return air;
}

}

