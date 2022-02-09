package sit.bscit;

public class Repetition {

    public static void main(String[] args) {
        demo01WhileLoop(); // while loop
        demo02DoWhileLoop(); // do-while loop
        demo03ForLoop(); // for loop
        demo04ContinueBreak(); // continue and break in loops
        demo05Recursion();
    }
    
    public static void demo01WhileLoop() {

        System.out.println("--------------------------------");
        System.out.println("### [1] Demo of While Loop ###");

        // -------------------------------------------------
        // while (boolean_expression) statement;
        // => (1) execute the statement repeatedly until boolean_expression becomes false. OR
        // => (2) do nothing at all if boolean_expression is false in the first place.
        // => (3) in case that there are many statements,
        // =>      { } will be used to enclose those statements.
        // while (boolean_expression) { 
        //     statements;
        // } 
        int start = 1;
        int end = 5;
        int count = start;
        int total = 0;
        // the 4 lines above are declarations and initializations 
        //     of variables to be used in the while loop
        while (count <= end) {
            total = total + count;
            count = count + 1;
            // the two lines above can be replaced by
            //     total += count++;
            // if there are variables declared in the loop, 
            //     they cannot be used outside this loop.
            // variables declared inside the loop 
            //     must have not been declared before the loop.
        }
        System.out.println("(1.1) Summation of " + start + " to " + end + " = " + total);

        // this following three lines are another example
        count = start; total = 1;
        while (count <= end) total *= count++;
        System.out.println("(1.2) Product of " + start + " to " + end + " = " + total);

        // the following lines are also another example
        count = start - 1; 
        total = 0;
        System.out.println("(1.3) Summation - step by step");
        while (count < end) {
            count++;
            total += count;
            System.out.println("Summation of " + start + " to " + count + " = " + total);
        }

        // alternative approach to while loop is to use the functional programming approach
        //     total = IntStream.range(start, end+1).reduce(0, (sum, each) -> sum+each);
        //     System.out.println("(1.3.x) Summation of " + start + " to " + end + " = " + total);
    }

    public static void demo02DoWhileLoop() {

        System.out.println("--------------------------------");
        System.out.println("### [2] Demo of Do-While Loop ###");

        // -------------------------------------------------
        // do { 
        //     statements; 
        // } while (boolean_expression);
        // => execute the statements in the block repeatedly 
        //       until boolean_expression becomes false.
        // => the statements in the block will always be executed at least once.
        int start = 1;
        int end = 5;
        int count = start;
        int total = 0;
        // like the while loop,
        // the 4 lines above are declarations and initializations 
        //     of variables to be used in the do-while loop
        do {
            total += count;
            System.out.println("sum of " + start + " to " + count + " = " + total);
            ++count;
        } while (count <= end);
        
        // the do-while loop is quite practical for interacting with users
        // int choice = 0;
        // do {
            // repeatedly showing some menus to the user 
            // until the user chooses appropriate choices.
            // choice = readUserInput();
            // switch (choice) {
            //    case 1 -> operation1();
            //    case 2 -> operation2();
            //    case 3 -> operation3();
        // } while (choice != 0);.
       
    }

    public static void demo03ForLoop() {

        System.out.println("--------------------------------");
        System.out.println("### [3] Demo of For Loop ###");

        // -------------------------------------------------
        // for (initialization; loop_condition; step) { statements; }
        // initialization : use for initializing the variables
        // loop_condition : 
        //     if it is true, the body (statements) will be executed.
        //     otherwise, the for loop will be ended.
        // step : performance each time after the body has been executed.
        // algorithm:
        //  1) execute the intialization
        //  2) evaluate the loop_condition
        //  3) if true, exit the for loop
        //  4) execute the body
        //  5) execute the step
        //  6) go back to 2)
        int start = 1, end = 5, total = 0;
        for (int count= start; count <= end; count++) {
            total += count;
            System.out.println("current =" + count + " ... total ="+ total);
        }
        System.out.println("(5.1) Summation of " + start + " to " + end + " = " + total);            
    }

    public static void demo04ContinueBreak() {

        System.out.println("--------------------------------");
        System.out.println("### [4] Demo of Continue and Break in Loops ###");

        // -------------------------------------------------
        // "continue" and "break" use in any kind of loops (while, do-while, for)
        //
        // "continue" means that the control will skip the rest of the loop 
        //     to the end of the loop.
        //     (1) in the while loop and do-while loop, 
        //          "continue" will go back to re-evaluate the loop_condition
        //     (2) in the for loop, "continue" will go execute the step and 
        //          re-evaluate the loop_condition
        //
        // "break" means that the control will exit the loop.
        
    }
    
    public static void demo05Recursion() {
        int x = 6; // 6! = 6 x 5 x 4 x 3 x 2 x 1
        System.out.println(x + "! = " + loopFactorial(x) + " // using normal loop");
        System.out.println(x + "! = " + recursiveFactorial(x) + " // using recursion");
        System.out.println(x + "! = " + tailFactorial(x) + " // using tail-call recursion");
    }
    
    public static int loopFactorial(int f) {
        if (f < 0) return 0;
        int result = 1; 
        for (int i = 1; i <= f; i++) {
            result *= i;
        }
        return result;
    }
    
    public static int recursiveFactorial(int f) {
        if (f<0) return 0;// guard
        if (f == 0) return 1;
        return f * recursiveFactorial(f-1);
        // one-liner version of the above three lines
        // return f<0 ? 0 : f==0 ? 1 : f * recursiveFactorial(f-1); 
    }
    
    public static int tailFactorial(int f) {
        if (f<0) return 0; // guard / pre-condition
        return fac(f, 1);
        // one-liner version of the above two lines
        // return (f<0) ? 0 : fac(f, 1); 
    }
    
    public static int fac(int f, int result) {
        if (f == 0) return result;
        return fac(f-1, result * f); 
        // one-liner version of the above two lines
        // return f == 0 ? result : fac(f-1, result * f); 
    }
}
