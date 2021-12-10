package com.siripoom.project.Midterm;

public class Logistics {
    double weight, width1, width2, height;

    public Logistics(double weight,double width1,double width2,double height){
        this.weight = weight;
        this.width1 = width1;
        this.width2 = width2;
        this.height = height;
    }

    public int getCostPerWeight(){
        if (weight > 0 && weight<=5){
            return 85;
        }
        else if (weight > 5 && weight <= 10){
            return 100;
        }
        else if (weight > 10 && weight <= 15){
            return 140;
        }
        else if (weight > 15 && weight <= 20){
            return 185;
        }
        else
            return -1;
    }

    public int getCostPerLength(){
        double l = width1 + width2 + height;
        if (l > 0 && l <= 60){
            return 85;
        }
        else if (l > 60 && l <= 90){
            return 100;
        }
        else if (l > 90 && l <= 120){
            return 140;
        }
        else if (l > 120 && l <= 150){
            return 185;
        }
        else return -1;
    }

    public int getCost(){
        if (getCostPerLength() == -1 || getCostPerWeight() == -1){
            return -1;
        }
        return Math.max(getCostPerWeight(),getCostPerLength());
    }
}
