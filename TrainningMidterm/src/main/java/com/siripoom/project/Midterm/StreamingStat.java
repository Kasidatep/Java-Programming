package com.siripoom.project.Midterm;

public class StreamingStat {
    String name;
    double max,min,mean,lastValue;
    int n;

    public StreamingStat(String name){
        this.name = name;
        this.max  = 0;
        this.mean = 0;
        this.lastValue = 0;
        this.n = 0;
        this.min = Double.POSITIVE_INFINITY;
    }

    public void setValue(double num) {
         this.lastValue = num;
         this.n++;
         updateMax();
         updateMin();
         updateAverage();
    }
    private void updateMax(){
        if (this.lastValue > this.max){
            this.max = this.lastValue;
        }

    }
    private void updateMin(){
        if (this.lastValue < this.min){
            this.min = this.lastValue;
        }
    }
    private void updateAverage(){
        this.mean = ((this.mean * (this.n-1))+this.lastValue)/this.n;
    }

    @Override
    public String toString() {
        return "StreamingStat{" +
                "name='" + name + '\'' +
                ", max=" + max +
                ", min=" + min +
                ", mean=" + mean +
                ", lastValue=" + lastValue +
                ", n=" + n +
                '}';
    }
}
