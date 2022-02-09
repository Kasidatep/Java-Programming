package Data.display;

public class main {
    public static void main(String[] args) {
        System.out.println("------- Program -------");
       ////////////////////// Exponent ////////////////////////
        int baseOfExponent = 10;
        int powerOfExponent = 3;
        exponent(baseOfExponent, powerOfExponent);
        brake();
        ////////////////////// Factorial ////////////////////////
        int factorial = 3;
        factorial(factorial);
        brake();
    }
    public static void brake(){
        System.out.println("-----------------------");
    }
    public static void exponent(int baseOfExponent, int powerOfExponent){
        System.out.println("Function Of Exponent");
        int result = 1;
        for(int start = 1 ; start <= powerOfExponent ; start++){
            result *= baseOfExponent;
        }
        System.out.println("Result of "+ baseOfExponent +"^"+ powerOfExponent + " is "+result);
    }
    public static void factorial(int factorial){
        System.out.println("Function Of Factorial");
        int result = 1;
        for (int start = 1 ; start <= factorial ; start++){
            result *= start;
        }
        System.out.println("Result of "+ factorial + "! is "+result);
    }
}
