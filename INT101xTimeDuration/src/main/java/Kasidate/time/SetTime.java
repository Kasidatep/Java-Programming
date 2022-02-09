package Kasidate.time;

import java.util.Set;

public class SetTime {
    private int days;
    private int hours;
    private int minutes;
    private int seconds;
    private final int HOURPERDAY = 24;
    private final int MINPERHOUR = 60;
    private final int SECPERMIN = 60;

    SetTime(int seconds){
        this.seconds = seconds;
    }

    SetTime(int minutes, int seconds){
        this.minutes = minutes;
        this.seconds = seconds;
    }

    SetTime(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    SetTime(int days, int hours, int minutes, int seconds){
        this.days = days;
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getDays() {
        return days;
    }

    public int getHours() {
        return getDays()*HOURPERDAY + hours;
    }

    public int getMinutes() {
        return getHours()*MINPERHOUR + minutes;
    }

    public int getSeconds() {
        return getMinutes()*SECPERMIN + seconds;
    }

    public int changeToSeconds(){
        int sumSeconds;
        sumSeconds = ( ( days * HOURPERDAY + hours ) * MINPERHOUR + minutes ) * SECPERMIN + seconds;
        return sumSeconds;
    }
    public String changeToText(){
        int sec,min,hou,day,sec2;
        sec = seconds;
        sec2 = seconds%SECPERMIN;
        sec /= SECPERMIN;
        min = sec % SECPERMIN;
        sec /= MINPERHOUR;
        hou = sec % MINPERHOUR;
        sec /= HOURPERDAY;
        day = sec % HOURPERDAY;
        return seconds + " is " + day + " Day + " + hou + " Hours + " + min + " Minute + " + sec2 + " Second";
    }
}