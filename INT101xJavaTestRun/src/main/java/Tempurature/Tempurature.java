package Tempurature;

public class Tempurature {

    public static void main(String[] args) {
        double fahrenheit = 55;
        double celsius = (double)  tempuraturecel(fahrenheit);
        System.out.println(celsius);

    }

    public static double tempuraturecel(double fahrenheit){
        double celsius =( 5/9* fahrenheit) +32;
        return celsius;
    }
}
