package com.siripoom.project.Midterm;

public class Matchstick {
    private int matchstick; //เก็บไม้ขีดที่เหลือ

    public Matchstick(int initMatch){ //Constructor กำหนดจำนวนก้านไม้ขีดเริ่มต้น
        this.matchstick = initMatch;
    }
    public void takeMatches (int numMatches){ //method ใช้สำหรับหยิบไม้ขีด
        this.matchstick -= numMatches;
    }
    public  boolean isValidMove(int numMatches) { //method ตรวจไม้ขีด
        if (numMatches <= 3 && numMatches <= matchstick && numMatches >= 1) {
            return true;
        }
        return false;
    }

    public boolean isGameOver() { //ตรวจเกมจบยัง
         boolean check = matchstick == 0;
         return check;
     }
    }
