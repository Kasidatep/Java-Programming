package kasidate.isPrime;

public class IsPrime {
    public static void main(String[] args) {

        int num = 9;
        System.out.println(num + " is " + (isPrime(num) ? "": "not ") + "a prime number ");
    }

    static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0 && i != num) {
                return false;
            }
        }
        return true;

    }
}
