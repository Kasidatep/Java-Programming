package sit.bscit;

public class Conditional3 {
    public static void main(String[] args) {
        demo01ShortCircuitBooleanOperators();
        demo02IfStatements(); // if, if-else, nested if-else
        demo03ConditionalExpressions(); // ... ? ... : ...
        demo04SwitchStatements(); // switch (...) { case ... : ...; break; } // { case ... -> ...; }
        demo05SwitchExpressions(); // switch (...) { case ... : ...; yield ...; }; // { case ... -> ...; };
    }
    
    public static void demo01ShortCircuitBooleanOperators() {

        System.out.println("--------------------------------");
        System.out.println("### [1] Demo of Short-Circuit and Non-Short-Circuit Boolean Operators ###");

        // -------------------------------------------------
        boolean test = false; // try this with different values; i.e., true, false
        boolean x = true;
        boolean y = true;
        
        // -------------------------------------------------
        // short-circuit boolean operators: AND (&&), OR (||)
        // IF test==true AND X==true THEN Y is not evaluated
        // IF test==false THEN X is not evaluted but Y will be evauated
        if (test && evaluate(x, "X") || evaluate(y, "Y"))
            System.out.print("(inside short-circuit)");
        System.out.println("->short-circuit done.");

        // -------------------------------------------------
        // non-short-circuit boolean operators: AND (&), OR (|), XOR (^) 
        // X and Y will be evaluated no matter what the result of test is
        if (test & evaluate(x, "X") | evaluate(y, "Y"))
            System.out.print("(inside non-short-circuit)");
        System.out.println("->non-short-circuit done.");
    }
    
    public static boolean evaluate(boolean result, String message) {
        System.out.print("(running " + message + ")");
        return result;
    }
    
    public static void demo02IfStatements() {

        System.out.println("--------------------------------");
        System.out.println("### [2] Demo of IF Statements ###");

        // -------------------------------------------------
        // example: if ( boolean_expression ) statement;
        double value1 = -5.5; // try this with different values, e.g., 0.0, 10.1, -3.2.
        if (value1 < 0.0) 
            System.out.println(value1 + " is negative.");
        
        // -------------------------------------------------
        // example: if ( boolean_expression ) statement; else statement;
        int value2 = 4; // try this with different values, e.g., -2, -1, 0, 1, 2.
        if (value2 % 2 == 0)
            System.out.println(value2 + " is an even number.");
        else
            System.out.println(value2 + " is an odd number.");

        // -------------------------------------------------
        // example: nested IF statement
        // example: if ( boolean_expression ) { statements; }
        String str = ""; // an empty string, which is also a blank string.
        // try this with different values, e.g., #str = null;#, #str = "    ";#.
        if (str != null) {
            System.out.println("\"" + str + "\" is not null.");
            if (str.isBlank()) { // a blank string contains only whitespaces or nothing at all.
                System.out.println("   ... it is a blank string.");
                if (str.isEmpty()) { // an empty string has zero-length.
                    System.out.println("      ... because it is, in fact, an empty string.");
                }
            }
        }

        // -------------------------------------------------
        // example: nested IF ELSE statement
        // if ( boolean_expression ) { statements; } 
        // else if ( boolean_expression ) { statements; }
        // else { statements; }
        str = " \t "; // a blank string contains only whitespace or nothing at all.
        // try this with different values, e.g., #str = null;#, #str = "";#.
        if (str == null) {
            System.out.println(str + " is null.");
        } else if (str.isEmpty()) {
                System.out.println("\"" + str + "\" is an empty string.");
        } else {
                System.out.println("\"" + str + "\" is a blank string.");
        }
        
        // -------------------------------------------------
        // example: IF with complex boolean expression
        /* A leap year is the year that is divisible by 4 but not divisible by 100; 
            but if that year is divisible by 100 and it is also divisible by 400, it is a leap year.
            Rephrasing: 
            a leap year is divisible by 4 AND not divisible by 100 OR divisible by 400. */
        int year = 2000; // try this with different values, e.g., 1600, 1996, 2001, 2020, 2100.
        // precedence: % --> ==,!= --> && --> ||
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
    
    public static void demo03ConditionalExpressions() {

        System.out.println("--------------------------------");
        System.out.println("### [3] Demo of Conditional Expressions: ... ? ... : ... ###");
        
        // -------------------------------------------------
        // example: conditional expression : ... ? ... : ...
        // boolean_expression ? expression_for_true : expression_for_false;
        int value = -4; // try this with different values, e.g., -2, -1, 0, 1, 2.
        String message = value<0 ? "negative" : "non-negative";
        System.out.println(value + " is a " + message + " value.");
        
        // -------------------------------------------------
        // associativity of conditional expressions, ... ? ... : ..., is right-to-left. 
        // i.e., a ? b : c ? d : e -equivalent-to- a ? b : (c ? d : e)
        // and a ? b ? c : d : e -equivalent-to- a ? (b ? c : d) : e
        boolean condition = true;
        boolean trueCase = true;
        boolean falseCase = false;
        boolean result1 = condition ? trueCase : falseCase ? false : false;
        boolean result2 = condition ? trueCase : (falseCase ? false : false);
        boolean result3 = (condition ? trueCase : falseCase) ? false : false;
        System.out.println("condition = " + condition);
        System.out.println("trueCase = " + trueCase);
        System.out.println("falseCase = " + falseCase);
        System.out.println("Case 1: condition ? trueCase : falseCase ? false : false; ==> " + result1);
        System.out.println("Case 2: condition ? trueCase : (falseCase ? false : false); ==> " + result2);
        System.out.println("Case 3: (condition ? trueCase : falseCase) ? false : false; ==> " + result3);
        System.out.println("conditional expression is right-associative, so Case 1 == Case 2");
    }
    
    public static void demo04SwitchStatements() {

        System.out.println("--------------------------------");
        System.out.println("### [4] Demo of Switch Statements ###");
        
        // switch-case can be used for int (and byte, short, char), Enum, String.
        // switch and case must result in the same type.
        // there are 2 types of switch-case: colon-case and arrow-case.
        // colon-case and arrow-case cannot be mixed.
        // colon-case: switch (expression) { case compile-time_constant_expression : ... }
        // arrow-case: switch (expression) { case compile-time_constant_expression -> ... }
        // in switch-case statements, default is optional.
        // each case must be compile-time constant expression, 
        // e.g, literals, constants, arithmetic expression of literals and constants.
        // each case must not duplicate or overlap.
        // the order of cases, including default, is meaningless.
        // switch-case can be nested.
        
        // -------------------------------------------------
        // example: switch-case statement with colon
        // use of colon-case needs "break;" to jump out of the switch-case.
        // without a break, the case continues through the next case.
        int month = 4; // try this with different values, e.g., -2, 0, 2, 7, 11, 14.
        int days = -1;
        switch (month) { 
            case 1, 3, 5, 7, 8, 10, 12 : 
                days = 31; 
                break;
            case 4, 6, 9, 11 : 
                days = 30; 
                break;
            case 2 : 
                days = 28; 
                break;
            default : // default is optional and can be anywhere
                days = -1;
                break; // break is not required for the last case
        }
        System.out.println("Month " + month + " has " + days + " days.");
        
        // -------------------------------------------------
        // example: switch-case statement with arrow 
        // use of arrow-case implies "break;" automatically
        char letterGrade = 'B'; // try this with different values, e.g., 'Z', '2', 'D', 'd'.
        int numericGrade = -1;
        switch (letterGrade) {
            case 'A', 'a' -> numericGrade = 4;
            case 'B', 'b' -> numericGrade = 3;
            case 'C', 'c' -> numericGrade = 2;
            case 'D', 'd' -> numericGrade = 1;
            case 'F', 'f' -> numericGrade = 0;
            default -> numericGrade = -1;
        }
        System.out.println("Letter Grade " + letterGrade + 
                " is equivalent to Numeric Grade " + numericGrade + ".");
        
        // -------------------------------------------------
        // example: switch-case statement on String
        String dayOfWeek = "Thursday"; // try this with different values, e.g., "Earthday".
        boolean workingDay = true;
        int weekdayNumber = -1; // ISO 8601: 1-7 for Monday-Sunday.
        switch (dayOfWeek) { // switch on String uses SWITCH.equals(CASE).
            case "Monday"       -> weekdayNumber = 1;
            case "Tuesday"       -> weekdayNumber = 2; 
            case "Wednesday"  -> weekdayNumber = 3;
            case "Thursday"      -> weekdayNumber = 4;
            case "Friday"           -> weekdayNumber = 5;
            case "Saturday"      -> { workingDay = false; weekdayNumber = 6; }
            case "Sunday"        -> { workingDay = false; weekdayNumber = 7; }
            default                    -> { workingDay = false; weekdayNumber = -1; }
        }
        System.out.println(dayOfWeek + " (" + weekdayNumber + ") is " 
                + (workingDay ? "" : "not a") + " working day.");
    }
    
    public static void demo05SwitchExpressions() {

        System.out.println("--------------------------------");
        System.out.println("### [5] Demo of Switch Expressions ###");

        // switch-case expressions are similar to switch-case statements 
        // except that, in switch-case expression, default is required.
        // (note: default can be anywhere; the order of cases is meaningless.)
        // switch-case expressions use "yield" to return values if neccessary.
        // "yield" in switch expressions is like "break" in switch statements.
        
        // -------------------------------------------------
        // example: switch-case expression with colon 
        char letterGrade = 'B'; // try this with different values, e.g., 'Z', '2', 'D', 'd'.
        int numericGrade =
                switch (letterGrade) {
                    case 'A', 'a' : yield 4;
                    case 'B', 'b' : yield 3;
                    case 'C', 'c' : yield 2;
                    case 'D', 'd' : yield 1;
                    default : yield -1;
                };
        System.out.println("Letter Grade " + letterGrade + 
                " is equivalent to Numeric Grade " + numericGrade + ".");

        // -------------------------------------------------
        // example: switch-case expression with arrow
        String dayOfWeek = "Thursday"; // try this with different values, e.g., "Earthday".
        boolean workingDay = true;
        int weekdayNumber =
                switch (dayOfWeek) { 
                    case "Monday" -> 1;
                    case "Tuesday" -> 2; 
                    case "Wednesday" -> 3;
                    case "Thursday" -> 4;
                    case "Friday" -> 5;
                    case "Saturday" -> { workingDay = false; yield 6; }
                    case "Sunday" -> { workingDay = false; yield 7; }
                    default -> { workingDay = false; yield -1; }
        };
        System.out.println(dayOfWeek + " (" + weekdayNumber + ") is " 
                + (workingDay ? "a" : "not a") + " working day.");
    }

}
