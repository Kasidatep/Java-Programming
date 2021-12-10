/*
A. Implement Q01StaticMethod class as follow:
    1. Write the following two static methods:
        1.1) a static method (convertMeterToWah) 
                to convert a length in meters to a length in wah where 1.0 meter = 0.5 wah (ratio).
                This method receives a length in meters and returns an equivalent length in wah.
        1.2) a static method (convertYardToMeter)
                to convert a length in yards to a length in meters where 1.0 yard = 0.91 meter (ratio).
                This method receives a length in yards and returns an equivalent length in meters.
    2. In the public static void main method,
        2.1) let xxx be a variable of type double and set its value to be 2021.0,
        2.2) print the value of xxx out using System.out.println(),
        2.3) converts xxx meters to wah and print the result out using System.out.println(),
        2.4) converts xxx yards to wah and print the result out using System.out.println().
    3. Run this class, and screen capture the result.
Note:
You must do all the calculation programmatically without doing any part manually 
or using a calculator. All ratios must be set as constants locally in the methods.
You must use the naming conventions for all constants, variables, and methods. 
 */
public class Q01StaticMethod {
    
    // A 1.1) a static method for converting meters to wah
    public static double convertMeterToWah(double meter) {
        final double WAH_PER_METER = 0.5; // a local constant
        return meter * WAH_PER_METER;
    }
    
    // A 1.2) a static method for converting yards to meters
    public static double convertYardToMeter(double yard) {
        final double METER_PER_YARD = 0.91; // a local constant
        return yard * METER_PER_YARD;
    }

    // A.2 public static void main() method
    public static void main(String[] args) {
        
        // A 2.1) variable xxx
        double xxx = 2021.0;
        
        // A 2.2) print out xxx
        System.out.println(xxx);
        
        // A 2.3) convert meters to wah and print out
        System.out.println(xxx + " meters = " + convertMeterToWah(xxx) + " wah.");

        // A 2.4) convert yards to wah and print out
        System.out.println(xxx + " yards = " + convertMeterToWah(convertYardToMeter(xxx)) + " wah.");
        /* alternatively,
        double meters = convertYardToMeter(xxx);
        double wah = convertMeterToWah(meters);
        System.out.println(xxx + " yards = " + wah + " wah.");
        //*/
    }
}
