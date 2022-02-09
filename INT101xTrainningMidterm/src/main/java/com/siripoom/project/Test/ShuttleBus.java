package com.siripoom.project.Test;

public class ShuttleBus {
    private String busId;
    private int frontDoor;
    private int rearDoor;
    private int noOfPassenger;
    private int odometer;
    private int money;

    public void setBusId (String busId){
        this.busId = busId;
        this.busId += busId; //this.busId = this.busId + busId
    }
    public String getBusId() {
        return busId;
    }
}
