package dev.kasidate.lift;

public class Lift {
    private int currentFloor;
    private double currentWeight;
    private final double maxWeight;
    private String movingDirection;
    private boolean onOffStatus;
    private int floorToGO;
    private boolean doorStatus;
    private boolean alarmStatus;

    Lift(String movingDirection,  int currentFloor,int floorToGO ,double currentWeight){
        this.movingDirection = movingDirection;
        this.currentFloor = currentFloor;
        this.floorToGO = floorToGO;
        this.currentWeight = currentWeight;
    }

}

