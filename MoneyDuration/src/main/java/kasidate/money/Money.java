package kasidate.money;

public class Money {
    private final int BANKNOTE1000 = 1000;
    private final int BANKNOTE500 = 500;
    private final int BANKNOTE100 = 100;
    private final int BANKNOTE50 = 50;
    private final int BANKNOTE20 = 20;
    private final int COIN10 = 10;
    private final int COIN5 = 5;
    private final int COIN1 = 1;
    private int note1000;
    private int note500;
    private int note100;
    private int note50;
    private int note20;
    private int coin10;
    private int coin5;
    private int coin1;
    private int money;


    Money(int money) {
        this.money = money;
    }
    Money(int note1000, int note500, int note100, int note50, int note20, int coin10, int coin5, int coin1){
        this.note1000 = note1000;
        this.note500 = note500;
        this.note100 = note100;
        this.note50 = note50;
        this.note20 = note20;
        this.coin10 = coin10;
        this.coin5 = coin5;
        this.coin1 = coin1;
    }

    public void change() {
        int getMoney = money;
        note1000 = money / BANKNOTE1000;
        money = money % BANKNOTE1000;

        note500 = money / BANKNOTE500;
        money = money % BANKNOTE500;

        note100 = money / BANKNOTE100;
        money = money % BANKNOTE100;

        note50 = money / BANKNOTE50;
        money = money % BANKNOTE50;

        note20 = money / BANKNOTE20;
        money = money % BANKNOTE20;

        coin10 = money / COIN10;
        money = money % COIN10;

        coin5 = money / COIN5;
        money = money % COIN5;

        coin1 = money / COIN1;
        money = money % COIN1;
        money = getMoney;
    }
    public void moneyCount(){
        money = note1000*BANKNOTE1000;
        money += note500*BANKNOTE500;
        money += note100*BANKNOTE100;
        money += note50*BANKNOTE50;
        money += note20*BANKNOTE20;
        money += coin10*COIN10;
        money += coin5*COIN5;
        money += coin1*COIN1;
    }


    @Override
    public String toString() {
        return "Money{ money " + money +
                " is Change : note1000=" + note1000 +
                ", note500=" + note500 +
                ", note100=" + note100 +
                ", note50=" + note50 +
                ", note20=" + note20 +
                ", coin10=" + coin10 +
                ", coin5=" + coin5 +
                ", coin1=" + coin1 +
                '}';
    }
}


