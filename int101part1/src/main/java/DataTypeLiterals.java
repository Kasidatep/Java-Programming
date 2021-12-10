public class DataTypeLiterals {

    public static void main(String[] args) {
        System.out.println("To test this method, please uncomment each line in the method.");
//        testPrimitiveBooleanLiterals();
//        testPrimitiveCharacterLiterals();
//        testPrimitiveIntegerLiterals();
//        testPrimitiveFloatingPointNumberLiterals();
    }

    /**
     * test boolean literals.
     * There are only two possible values for boolean data types: 
     *     <code>true</code> and <code>false</code>.
     * You can test boolean equality: 
     *     <code>true == false</code> or
     *     <code>true != false</code>
     * but you CANNOT do boolean comparison:
     *     <code>true &gt; false</code> or
     *     <code>true &lt; false</code> or
     *     <code>true &gt;= false</code>
     *     <code>true &lt;= false</code>.
     */
    public static void testPrimitiveBooleanLiterals() {
        System.out.println("\n--------------------------------\nTest Boolean Literals:");
        System.out.println("boolean literal: true [" + true + "]");
        System.out.println("boolean literal: false [" + false + "]");
        System.out.println("boolean equality tests: == (equal) and != (not equal) are allowed.");
        System.out.println("true == false ? " + (true == false));
        System.out.println("true != false ? " + (true != false));
        System.out.println("but boolean comparison: <, >, <=, >= are not allowed.");
        System.out.println("true <= false ? ... syntax error.");
        //System.out.println("true <= false ? " + (true <= false)); // syntax error
        System.out.println("Logical Operations are allowed:");
        System.out.println("  ! (logical negation), && (logical AND), || (logical OR)");
    }

    /**
     * test character literals.
     * Each character literal is placed in between 
     * a pair of single quote characters (' ').
     * Backslash (\) is used as an escape character 
     * to put in front of a character for a special meaning 
     * (e.g., '\n' for a new line character, '\t' for a tab character)
     * or to escape from the special meaning
     * (e.g., '\\' for backslash character, '\'' for single quote characters).
     * Unicode characters are written by using '\\uXXXX' 
     * where XXXX are 4 hexadecimal digits, e.g., '\u03BB'
     */
    public static void testPrimitiveCharacterLiterals() {
        System.out.println("\n--------------------------------\nTest Character Literals:");
        System.out.println("character literal: a [" + 'a' + "]");
        System.out.println("character literal: A [" + 'A' + "]");
        System.out.println("character literal: \\t (tab) [" + '\t' + "]");
        System.out.println("character literal: \\n (newline) [" + '\n' + "]");
        System.out.println("character literal: \\u20AC (\u20AC - Euro Sign) [" + '\u20AC' + "]");
        System.out.println("character literal: \\u0E01 (\u0E01 - Kor Kai) [" + '\u0E01' + "]");
        System.out.println("character literal: ก (Kor Kai) [" + 'ก' + "]");
        System.out.println("Equality test and comparison of characters are allowed.");
        System.out.println("'a' == 'b' ? " + ('a' == 'b'));
        System.out.println("'a' <= 'b' ? " + ('a' <= 'b'));
        char x = 'a'; System.out.println("char x = 'a': " + x);
        x++;            System.out.println("char: x++: " + x + " (++, -- are allowed for characters)");
        x += 3;        System.out.println("char: x += 3: " + x + " (+=, -= are allowed for characters)");
        System.out.println("char: x = x + 3 ... syntax error (need explicit type casting)");
        //x = x + 3;    System.out.println("char x = x + 3: " + x);
        x = (char) (x + 3); System.out.println("char: x = (char) (x + 3): " + x);
    }

    /**
     * test integer literals.
     * Integer literals can be written in 
     * binary (0b...), octal (0...), decimal (...), and hexadecimal (0x...) forms
     * Underscores can be used to in between digits to improve readability.
     * There are no literals for byte and short.
     * Default integer literals are int.
     * Integer literals for long end with small l or capital L.
     */
    public static void testPrimitiveIntegerLiterals() {
        System.out.println("\n--------------------------------\nTest Integer Literals:");
        System.out.println("There is no literal for byte and short.");
        System.out.println();
        System.out.println("int literal: 3574 [" + 3574 + "]");
        System.out.println("int literal: -2,147,483,648 (~ -2 billions -- min) [" + -2_147_483_648 + "]");
        System.out.println("int literal: 2,147,483,647 (~ 2 billions -- max) [" + 2_147_483_647 + "]");
        System.out.println("int literal (in binary - 0b...): -0b1111111_11111111_11111111_11111111 (31 bits) [" 
                + -0b1111111_11111111_11111111_11111111 + "]");
        System.out.println("int literal (in octal - 0...): -0177_7777_7777 [" + -0177_7777_7777+ "]");
        System.out.println("int literal (in hexadecimal - 0x...): -0x7FFF_FFFF [" + -0x7FFF_FFFF + "]");
        System.out.println("int literal (in hexadecimal - 0x...): 0xFFFF_FFFF (-1) [" + 0xFFFF_FFFF + "]");
        System.out.println("int literal (in hexadecimal - 0x...): 0x8000_0000 (min) [" + 0x8000_0000 + "]");
        System.out.println("int literal (in hexadecimal - 0x...): 0xb01dface [" + 0xb01dface + "]");
        System.out.println();
         System.out.println("long literal: -9,223,372,036,854,775,808 (-9 billion billions -- min) [" 
                + -9_223_372_036_854_775_808L + "]");
        System.out.println("long literal: -0x7FFF_FFFF_FFFF_FFFFL (63-bit integers) [" 
                + -0x7FFF_FFFF_FFFF_FFFFL + "]");
        System.out.println("long literal: 0xFFFF_FFFF_FFFF_FFFFL (63-bit integers) = -1 [" 
                + 0xFFFF_FFFF_FFFF_FFFFL + "]");
        System.out.println("long literal: 0x8000_0000_0000_0000L (63-bit integers) = min [" 
                + 0x8000_0000_0000_0000L + "]");
        System.out.println("Integers can perform the following operations:");
        System.out.println("  ++,--; +,-,*,/,%; <<,>>,>>>; ~,&,^,|; ==,!=, <,>,<=,>=");
        System.out.println("  +=,-=,*=,/=,%=; <<=,>>=,>>>=; &=,^=,|=");
    }

    /**
     * test floating-point number literals.
     * Floating-point number literals can be written in decimal digits with ".".
     * Like integers, underscores can be used to in between digits to improve readability.
     * Floating-point number literals can be written in scientific notation.
     * Default floating-point number literals are double.
     * Floating-point number literals for float end with small f or capital F.
     */
    public static void testPrimitiveFloatingPointNumberLiterals() {
        System.out.println("\n--------------------------------\nTest Floating-Point Number Literals:");        
        System.out.println("float literal: 254_946_390_471.57F <" + 254_946_390_471.57F + ">");
        System.out.println("float literal: -545.676_867_975f <" + -545.676_867_975f + ">");
        System.out.println("float literal: 0.0000_0964_0047_6905F <" + 0.0000_0964_0047_6905F + ">");
        System.out.println("float literal: 340_282_356_779_733_661_637_539_395_458_142_568_447.0f <" 
                + 340_282_356_779_733_661_637_539_395_458_142_568_447.0f + ">");
        System.out.println("float literal: 3.4028_2356E38F (close to max) <" + 3.4028_2356E38F + ">");
        System.out.println("float literal: 7.0064_9233e-46f <" + 7.0064_9233e-46f + ">");
        System.out.println();
        System.out.println("double literal: 254_946_390_471.57 <" + 254_946_390_471.57 + ">");
        System.out.println("double literal: -545.676_867_975 <" + -545.676_867_975 + ">");
        System.out.println("double literal: 0.0000_0964_0047_6905 <" + 0.0000_0964_0047_6905 + ">");
        System.out.println("double literal: 340_282_356_779_733_661_637_539_395_458_142_568_447.0 <" 
                + 340_282_356_779_733_661_637_539_395_458_142_568_447.0 + ">");
        System.out.println("double literal: (close to max) <" 
                + 179_769313486_200000000_000000000_000000000_000000000_000000000_000000000_000000000_000000000_000000000_000000000_000000000_000000000_000000000_000000000_000000000_000000000_000000000_000000000_000000000_000000000_000000000_000000000_000000000_000000000_000000000_000000000_000000000_000000000_000000000_000000000_000000000_000000000_000000000.0 + ">");
        System.out.println("double literal: 1.7976_9313_4862e308 <" + 1.7976_9313_4862e308 + ">");
        System.out.println("double literal: 2.47032823e-324 <" + 2.47032823e-324 + ">");
        System.out.println("Floating-point numbers can perform the following operations:");
        System.out.println("  ++,--; +,-,*,/,%; ==,!=, <,>,<=,>=; +=,-=,*=,/=,%=");
   }
}
