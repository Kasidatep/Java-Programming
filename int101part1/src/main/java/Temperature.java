public class Temperature {

    public static void main(String[] args) {
        final double fromCelsius = 73;
        double f = celsiusToFahrenheit(fromCelsius);
        System.out.println(fromCelsius + " celsius = " + f + " fahrenheit");

        final double fromFahrenheit = 32;
        double c = fahrenheitToCelsius(fromFahrenheit);
        System.out.println(fromFahrenheit + " fahrenheit = " + c + " celsius");
    }
    
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit;
        fahrenheit = celsius * 9.0 / 5.0 + 32.0;
        return fahrenheit;
    }
    
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
