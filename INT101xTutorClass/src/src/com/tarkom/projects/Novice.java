package com.tarkom.projects;

public class Novice {

    private int HP;
    private int Atk;
    private int Exp;

    Novice(){
        this.HP = 100;
        this.Atk = 10;
        this.Exp = 0;
    }

    public int getHP() {
        return HP;
    }

    public int getAtk() {
        return Atk;
    }

    public int getExp() {
        return Exp;
    }

    public String Walk(){
        return  "Walk";
    }

    public String Sit(){
        return "Sit";
    }

    public String Death(){
        return "Death";
    }
}
