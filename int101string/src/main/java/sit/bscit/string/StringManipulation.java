package sit.bscit.string;

import java.util.StringJoiner;

public class StringManipulation {
    public static void main(String[] args) {
        testStringPool();
        testStringConcatenation();
        testStringBuilder();
        testStringJoiner();
        testStringFormatting();
        testStringManipulation();
    }
    
    public static void testStringPool() {

        System.out.println("--------------------------------");
        System.out.println("Test of String Pool");
        
        // -------------------------------------------------
        // Use of String literals is preferable to new String(...).
        
        String a = new String("xyz"); // not in the string pool
        String b = new String("xyz"); // not in the string pool
        String c = "xyz"; // in the string pool
        String d = "xyz"; // in the string pool
        System.out.println("a = new String(\"xyz\");");
        System.out.println("b = new String(\"xyz\");");
        System.out.println("c = \"xyz\";");
        System.out.println("d = \"xyz\";");
        System.out.println("a.equals(b) ? " + a.equals(b) + " ...\t a == b ? " + (a == b));
        System.out.println("a.equals(c) ? " + a.equals(c) + " ...\t a == c ? " + (a == c));
        System.out.println("d.equals(c) ? " + d.equals(c) + " ...\t d == c ? " + (d == c));
        String e = a.intern(); // String::intern() puts the string literal 
        // into the string pool and returns the reference to that string literal
        System.out.println("e = a.intern();");
        System.out.println("a.equals(c) ? " + a.equals(c) + " ...\t a == c ? " + (a == c));
        System.out.println("e.equals(c) ? " + e.equals(c) + " ...\t e == c ? " + (e == c));
    }
    
    public static void testStringConcatenation() {

        System.out.println("--------------------------------");
        System.out.println("Test of String Concatenation");
        
        // -------------------------------------------------
        String a = "pqr";
        String b = "stu";
        String c = "xyz";
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("a + b + c = " + (a+b+c));
        System.out.println("a.concat(b).concat(c) = " + a.concat(b).concat(c));
        System.out.println("a = " + a + " ... (a does not change.)");
        System.out.println("+ can be used with any type.");
        System.out.println("But concat() can be used with string only.");
        System.out.println("However, StringBuilder should be used instead of + or concat().");
    }
    
    public static void testStringBuilder() {

        System.out.println("--------------------------------");
        System.out.println("Test of StringBuilder");
        
        // -------------------------------------------------
        // use StringBuilder instead of gradually concatenating String objects.
        // StringBuilder uses "append" to build up a string efficiently from any datatype.
        // (less-efficient) StringBuffer is a thread-safe version of (more-efficient) StringBuilder.
        
        StringBuilder sb = new StringBuilder(100); // initial length
        sb.append("Starting ... ");
        sb.append(10.6); // can append anything, which will be converted to String
        sb.append(" ... ").append(true).append(" ... ").append("end."); // chaining
        System.out.println("Result: " + sb.toString());
        System.out.println("Or just: " + sb);
    }
    
    public static void testStringJoiner() {

        System.out.println("--------------------------------");
        System.out.println("Test of StringJoiner");
        
        // -------------------------------------------------
        // StringJoiner can build up a string from many strings 
        // by inserting a delimiter in between each string.
        // "add" is used to concatenating new strings.
        
        // -------------------------------------------------
        String delimiter = ",";
        StringJoiner sj = new StringJoiner(delimiter);
        System.out.println("StringJoiner with a delimiter.");
        System.out.println("-->" + sj + "<--");
        sj.add("one");
        System.out.println("-->" + sj + "<--");
        sj.add("two").add("three").add("four");
        System.out.println("-->" + sj + "<--");

        // -------------------------------------------------
        String prefix = "{";
        String suffix = "}";
        sj = new StringJoiner(delimiter, prefix, suffix);
        System.out.println("StringJoiner with delimiter, prefix, and suffix.");
        System.out.println("-->" + sj + "<--");
        sj.add("one");
        System.out.println("-->" + sj + "<--");
        sj.add("two").add("three").add("four");
        System.out.println("-->" + sj + "<--");
    }
    
    public static void testStringFormatting() {

        System.out.println("--------------------------------");
        System.out.println("Test of String Formatting");
        // https://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html
        
        // -------------------------------------------------
        System.out.print("Printing without ending with a newline: print().");
        System.out.println(" ... Printing and ending with a newline: println().");
        System.out.printf("... Printing with format%n"); // %n = platform-independent newline
        System.out.printf("Print various types: (boolean %%b: %b)%n" // %% for escaping %
                + "(decimal: %%d=%d) (octal: %%o=%<o) (hexadecimal: %%X=%<X)%n"
                + "(floating point: %%f=%f, %%.2f=%<.2f, %%E=%<E, %%.2E=%<.2E) %n"
                + "(char: %c) (string: %s)%n", // < reuses the previous argument
                true, 31, 123456.789, 'a', "something");
        
        // -------------------------------------------------
        // System.out.printf(...) is exactly the same as System.out.format(...)
        System.out.println("Format Printing with Width, Left/Right Justification, Re-using Arguments");
        System.out.printf("|%7s|%<7s|%<7s|%<7s|%<7s|%<7s|%n", "1234567"); // < reuses previous
        System.out.printf("|%7d|%<+7d|%<-7d|%<07d|%,7d|%7d|%n", 1234, 12345, 12345678);
        System.out.printf("|%7.2f|%<+7.2f|%<-7.2f|%,7.2f|%,7.2f|%n", 1.234, 12345.678, 1234567.8);
        System.out.printf("|%7s|%-7s|%7s|%n", "a", "a", "abcdefhijk");
        System.out.printf("|%1$7s|%1$-7s|%2$7s|%2$7s|%7s|%n","str", "abcde"); // 1$, 2$ = argument index
        
        // -------------------------------------------------
        String s = String.format("Formatting %s and %d.%n", "string", 100);
        System.out.println(s);
    }
    
    public static void testStringManipulation() {

        System.out.println("--------------------------------");
        System.out.println("Test of String Manipulation");
        
        // -------------------------------------------------
        String s = "This is a not so long string.";
        System.out.format("[%s] is %d characters long. charAt(%d)=%c%n", s, s.length(), 1, s.charAt(1));
        // .equals(), .equalsIgnoreCase(), .compareTo(), .compareToIgnoreCase()
        // .isBlank(), .isEmpty(), .contains(), .startWith(), .endWith(), .matches(), .split() 
        // .trim(), .strip(), .stripLeading(), .stripTrailing(), .substring(), .replace(), .toUpperCase(), .toLowerCase()
        // .indexOf(), .lastIndexOf()
    }
}
