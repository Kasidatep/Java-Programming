
public class CashBack {

    public static void main(String[] args) {
        int value = 2787 ;
        String change = Change (value);
        System.out.println(change);
       }
    
    public static String Change(int value){
         final int NOTE1000 = 1000 ;
        final int NOTE500 = 500 ;
        final int NOTE100 = 100 ;
        final int NOTE50 = 50 ;
        final int NOTE20 = 20 ;
        final int COIN10 = 10 ;
        final int COIN5 = 5 ;
        final int COIN1 = 1 ;
      
        int note1000, note500, note100, note50, note20, coin10, coin5, coin1;
        
        //program
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
        
        return  "NOTE1000 : " + note1000 + " / NOTE500 : " + note500 + " / NOTE100 : " + note100 +
                " / NOTE50 : " + note50 + " / NOTE20 : " + note20 + " / COIN10 : " + coin10 + " / COIN5 : " + coin5 + " / COIN1 : " + coin1 ;
      
    }
    
}
