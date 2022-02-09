

public class CashBack {

    public static void main(String[] args) {
       // INPUT CHANCE FUNCTION
        int value = 2787 ;
        String change = change (value);
       // INPUT VALUE FUNCTION
        int note1000 = 8;
        int note500 = 4;
        int note100 = 3 ;
        int note50 = 8 ;
        int note20 = 3 ;
        int coin10 = 5;
        int coin5 = 1;
        int coin1 = 4;
        
        
        
        int values = value(note1000,note500,note100,note50,note20,coin10,coin5,coin1);
        System.out.println(values);
        
       }

    public static int value(int note1000, int note500, int note100, int note50, int note20, int coin10, int coin5, int coin1, int NOTE1000, int NOTE500, int NOTE100, int NOTE50, int NOTE20, int COIN10, int COIN5, int COIN1){
        int values;
        values = note1000*NOTE1000 + note500*NOTE500 + note100*NOTE100 + note50*NOTE50 + note20*NOTE20 + coin10*COIN10 + coin5*COIN5 + coin1 ;
        return values ;
}
    
}
