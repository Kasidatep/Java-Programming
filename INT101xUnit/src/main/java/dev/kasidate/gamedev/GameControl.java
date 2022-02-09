
package dev.kasidate.gamedev;

public class GameControl {
    public static void main(String[] args) {
       GameConstactor a = new GameConstactor();
        System.out.println(" HP "+a.getHP());
        System.out.println(" ATK "+a.getATK());
        System.out.println(" EXP "+a.getEXP());
        
        a.Attack(3) ;
        System.out.println(" HP "+a.getHP());
}
}