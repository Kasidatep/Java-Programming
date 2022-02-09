package kasidatephlaiphueak;

public class KasidatePhlaiphueak { 
    public static void main(String[] args) { 
        //Constants variables 
        final int NOTE1000 = 1000; 
        final int NOTE500 = 500; 
        final int NOTE100 = 100; 
        final int NOTE50 = 50; 
        final int NOTE20 = 20; 
        final int COIN10 = 10; 
        final int COIN5 = 5; 
        final int COIN1 = 1;          
 
        //Import amount banknote and coin into VALUE Function 
        int note1000 = 8; 
        int note500 = 5; 
        int note100 = 6;  
        int note50 = 3; 
        int note20 = 3; 
        int coin10 = 3; 
        int coin5 = 5; 
        int coin1 = 6;         
 
        //Import value into CHANGE Function 
        int value = 15987;         
 
        //Display VALUE Function 
        System.out.println("Sum value of banknotes and coins : " + value(note1000,note500,note100,note50,note20,coin10,coin5,coin1,NOTE1000,NOTE500,NOTE100,NOTE50,NOTE20,COIN10,COIN5,COIN1)); 
 
       //Display CHANGE Function     
        System.out.println(change(value,note1000,note500,note100,note50,note20,coin10,coin5,coin1,NOTE1000 ,NOTE500,NOTE100,NOTE50,NOTE20,COIN10,COIN5,COIN1)); 
    } 
    
   //VALUE Function 
     public static int value(int note1000, int note500, int note100, int note50, int note20, int coin10, int coin5, int coin1, int NOTE1000, int NOTE500, int NOTE100, int NOTE50, int NOTE20, int COIN10, int COIN5, int COIN1) { 
        int sum = note1000*NOTE1000 + note500*NOTE500 + note100*NOTE100 + note50*NOTE50 + note20*NOTE20 + coin10*COIN10 + coin5*COIN5 + coin1 ; 
        return sum ; 
    }    
      
     //CHANGE Function 
     public static String change(int value, int note1000, int note500, int note100, int note50, int note20, int coin10, int coin5, int coin1, int NOTE1000, int NOTE500, int NOTE100, int NOTE50, int NOTE20, int COIN10, int COIN5, int COIN1) { 
        note1000 = value/NOTE1000;  
        value = value%NOTE1000;  
        note500 = value/NOTE500; 
        value = value%NOTE500; 
        note100 = value/NOTE100; 
        value = value%NOTE100; 
        note50 = value/NOTE50; 
        value = value%NOTE50; 
        note20 = value/NOTE20; 
        value = value%NOTE20; 
        coin10 = value/COIN10; 
        value = value%COIN10; 
        coin5 = value/COIN5; 
        value = value%COIN5; 
        coin1 = value/COIN1;   
         
        return "NOTE1000 : " + note1000 + " | NOTE500 : " + note500 + " | NOTE100 :" + note100 + " | NOTE50 : " + note50 + " | NOTE20 : " + note20 + " | COIN10 " + coin10 + " | COIN5 " + coin5 + " | COIN1 " + coin1 ; 
     } 
} 