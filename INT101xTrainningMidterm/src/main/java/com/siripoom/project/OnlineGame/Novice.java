package com.siripoom.project.OnlineGame;

public class Novice {
    private int Hp;
    private int Atk;
    private int Exp;

    Novice(){
        this.Hp = 100;
        this.Atk = 10;
        this.Exp = 0;
    }

    public int getHp() {
        return Hp;
    }

    public int getAtk() {
        return Atk;
    }

    public int getExp() {
        return Exp;
    }

    public String Walk() {
        return "Walk";
    }

    public String Sit() {
        return "Sit";
    }

    public String Attack() {
        return "Attack";
    }

    public String Dead() {
        return  "Death";

    }

}

