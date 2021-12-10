

public class BmiCalculation {

    public static void main(String[] args) {
        final double heightInCm = 180.0;
        final double weightInKg = 75.0;
        
        System.out.println("Height = " + heightInCm + " cm.");
        System.out.println("Weight = " + weightInKg + " kg.");
        System.out.println("BMI = " + bmi(heightInCm, weightInKg));
    }

    public static double bmi(double heightCm, double weightKg) {
        // bmi = weight_in_kg --divided by-- (height_in_meter square)
        double heightM = heightCm / 100.0;
        return weightKg / heightM / heightM;
    }
}
