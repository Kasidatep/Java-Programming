/*
B. Implement Q02StaticVariable class as follow:
    1. Define a static constant in this class to represent the following ratio: 1.0 acre = 2.529 rai.
    2. Write the following two static methods:
        2.1) a static method (convertAcreToRai) to convert an area in acres to an area in rai.
                This method receives an area in acres and returns an equivalent area in rai.
        2.2) a static method (convertRaiToAcre) to convert an area in rai to an area in acres.
                This method receives an area in rai and returns an equivalent area in acres.
    3. In the public static void main method,
        3.1) let xxx be a variable of type double and set it value to be 2021.0,
        3.2) print the value of xxx out using System.out.println(),
        3.3) converts xxx acres to rai and print the result out using System.out.println(),
        3.4) converts xxx rai to acres and print the result out using System.out.println().
    4. Run this class, and screen capture the result.
Note:
You must do all the calculation programmatically 
without doing any part manually or by using a calculator. 
You must use the naming conventions for all constants, variables, and methods. 
 */
public class Q02StaticVariable {
    
    // B.1 a static constant for rai-acre ratio
    final static double RAI_PER_ACRE = 2.529;
    
    // B 2.1) a static method for converting acres to rai
    public static double convertAcreToRai(double acre) {
        return acre * RAI_PER_ACRE;
    }
    
    // B 2.2) a static method for converting rai to acres
    public static double convertRaiToAcre(double rai) {
        return rai / RAI_PER_ACRE;
    }

    // B.3 a public static void main() method
    public static void main(String[] args) {
        
        // B 3.1) variable xxx
        double xxx = 2021.0;

        // B 3.2) print out xxx
        System.out.println(xxx);
        
        // B 3.3) convert acres to rai and print out
        System.out.println(xxx + " acres = " + convertAcreToRai(xxx) + " rai.");
        
        // B 3.4) convert rai to acres and print out
        System.out.println(xxx + " rai = " + convertRaiToAcre(xxx) + " acres.");
    }
}
