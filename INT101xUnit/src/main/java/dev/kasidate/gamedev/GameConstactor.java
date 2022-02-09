package dev.kasidate.gamedev;

public class GameConstactor {
    
   private int HP ;
   private int ATK;
   private int EXP ;
 
    GameConstactor(){
        this.HP = 100;
        this.ATK = 10;
        this.EXP = 2;
    }

    public int getHP() {
        return HP;
    }

    public int getATK() {
        return ATK;
    }

    public int getEXP() {
        return EXP;
    }
    
    public String Walk(){
        return "Walk";
    }
     public String Sit(){
        return "Sit";
    }
      public String Death(){
        if( HP < 1 ){
                return "Death";
          }
       return null;
    }
     public void Attack(int attack){
         if( attack < 0 ){
             this.HP -= attack;
         }
     }
      
 
}