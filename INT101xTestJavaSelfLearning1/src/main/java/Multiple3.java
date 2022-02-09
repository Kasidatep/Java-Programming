public class Multiple3 {
    public static void main(String[] args) {
        float time = 100;  //no.
        float number = 2 ;  // namber
        float changePowerByTime = 2; // changePowerByTime
        float power = 2; //startPower
        
        for (int a=1; a<=time ; a++){
            
            float result = (float) Math.pow(number, power);
        //  System.out.println(a+". Result of "+ number + "^"+ power +" is "+ result);
            float fresult = result -1 ;
         // System.out.println(a+". Result of "+ number + "^"+ power +"- 1 is "+ fresult);
            float fm3result = fresult /3 ;
            float f3percent = fresult %3 ;
            System.out.println(a+". Result of "+ number + "^"+ power  +" is "+ result + "- 1 = "+fresult+" / 3 is "+ fm3result + " Told " + f3percent);
            power = power+changePowerByTime;
        }        
    }
}
