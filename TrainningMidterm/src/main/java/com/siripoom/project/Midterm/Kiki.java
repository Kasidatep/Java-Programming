package com.siripoom.project.Midterm;

public class Kiki {
    public static void main(String[] args) {
        double x = 19988.75;
        System.out.println(changed(x));
    }
    public static String changed(double totalMoney) {
        final int Note1000 = 1000;
        final int Note500 = 500;
        final int Note100 = 100;
        final int Note50 = 50;
        final int Note20 = 20;
        final int Coin10 = 10;
        final int Coin5 = 5;
        final int Coin2 = 2;
        final int Coin1 = 1;
        final float Coin050 = 0.50f; //Coin050 = 50 satang
        final float Coin025 = 0.25f; // Coin025 = 25 satang

        double temp=totalMoney;
        int note1000 =(int)(totalMoney / Note1000);
        totalMoney %= Note1000;
        int note500 = (int)(totalMoney / Note500);
        totalMoney %= Note500;
        int note100 = (int)(totalMoney / Note100);
        totalMoney %= Note100;
        int note50 = (int)(totalMoney / Note50);
        totalMoney %= Note50;
        int note20 = (int)(totalMoney / Note20);
        totalMoney %= Note20;
        int coin10 = (int)(totalMoney / Coin10);
        totalMoney %= Coin10;
        int coin5 = (int)(totalMoney / Coin5);
        totalMoney %= Coin5;
        int coin2 = (int)(totalMoney / Coin2);
        totalMoney %= Coin2;
        int coin1 = (int)(totalMoney / Coin1);
        totalMoney %= Coin1;
        int coin050 = (int)(totalMoney / Coin050);
        totalMoney %= Coin050;
        int coin025 = (int)(totalMoney / Coin025);
        totalMoney %= Coin025;

        return "You can receive "+temp+
                "\nNote1000 = " + note1000 +
                "\nNote500 = " + note500+
                "\nNote100 = "+ note100 +
                "\nNote50 = " + note50 +
                "\nNote20 = " +note20  +
                "\nCoin10 = " + coin10  +
                "\nCoin5 = "+ coin5 +
                "\nCoin2 = "+ coin2+
                "\nCoin1 = "+ coin1+
                "\nCoin050 = "+ coin050+
                "\nCoin025 = "+ coin025;

    }
}
