package IfElse_Swich_Loop;

public class IfElse {
    public static void main(String[] args) {
        ifElse();
        fswitch();
        loop();
}
    public static void  ifElse() {
        /**
         * Less than: a < b
         * Less than or equal to: a <= b
         * Greater than: a > b
         * Greater than or equal to: a >= b
         * Equal to a == b
         * Not Equal to: a != b
         */
        int a = 1;
        int b = 2;
        int c = 2;
        int d = 10;
        System.out.println(" A < B");
        System.out.println(" B >= A");

        System.out.println("B==C");

        //variable = (condition) ? expressionTrue :  expressionFalse;
    }
    public static void fswitch(){
        int swtest = 2;
        switch (swtest){
            case 0 :
                System.out.println("0");
                break;
            case 1 :
                System.out.println("1");
                break;
            case 2 :
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4 :
                System.out.println("4");
                break;
            default:
                System.out.println("def");
        }
    }
    public static void loop(){
        // While Loop
        int i = 0;
        while (i < 3) {
            System.out.println(i);
            i++;
        }
        // do while loop ** Do >> While Check >> Loop/End
        int j = 0;
        do {
            System.out.println(j);
            j++;
        }
        while (j < 3);

        /**
         * for (statement 1; statement 2; statement 3) {
         *   // code block to be executed
         * }
         */
        for (int k = 0; k < 3; k++) {
            System.out.println(k);
        }
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String z : cars) {
            System.out.println(z);
        }
    }
}
