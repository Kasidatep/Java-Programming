package sit.bscit;

import java.util.Formatter;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class StringManipulation3 {

    public static void main(String[] args) {
        
        // https://docs.oracle.com/javase/10/docs/api/java/lang/String.html
        // https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html
        demo01StringConcatenation(); // +, +=, concat() 
        demo02StringPool(); // new String("...") vs. String literal "..."; intern()
        demo03StringBuilder(); // building strings programmatically: append,insert,delete,replace,reverse,setLength
        demo04StringJoinerAndValueOf(); // joining strings with delimiters: add(); String.join(), String.valueOf(anyType)
        demo05StringFormatting(); // string formatting and printing and Formatter: printf(), format(); Formattable
        demo06StringEqualityAndComparison(); // equals(),equalsIgnoreCase(),compareTo(),compareToIgnoreCase()
        demo07StringsWithWhitespaces(); // checking/removing whitespaces: isBlank(), isEmpty(), trim(), strip()
        demo08RelatedToPositionsInStrings(); // length(), charAt(), indexOf(), lastIndexOf(), substring()
        demo09StringReproduction(); // toUpperCase(), toLowerCase(), repeat(), replace()
        demo10SimpleStringMatching(); // contains(), startsWith(), endsWith()
        demo11RegExOnString(); // matches(), replaceAll(), replaceFirst(), split()
        demo12RegExOnPatternAndMatcher(); // Pattern and Matcher: compile(), matcher(); usePattern()
        demo13RegExWithFindAndReplace(); // find,groupCount,group,start,end,appendReplacement,appendTail
    }

    public static void demo01StringConcatenation() {

        System.out.println("--------------------------------");
        System.out.println("### [1] Demo of String Concatenation ###");

        // -------------------------------------------------
        String a = "You never fail";
        String b = " until ";
        String c = "you stop trying.";
        System.out.println("a = [" + a + "]");
        System.out.println("b = [" + b + "]");
        System.out.println("c = [" + c + "]");
        System.out.println("a + b + c = [" + (a + b + c) + "] -- Albert Einstein");
        System.out.println("a.concat(b).concat(c) = [" + a.concat(b).concat(c) + "]");
        System.out.println("a = [" + a + "] ... (a does not change.)");

        // -------------------------------------------------
        // use of + operator on String with other data types
        String d = "99" + 100 + 10; // 9910010 (left-to-right aassociativity)
        String e = 100 + 10 + "99"; // 11099 (left-to-right aassociativity)
        String f = "sit" + "@".concat("km").concat("utt");
        // String g = "yr".concat(2020); // error: concat() can be used on String only.
        System.out.println("+ operators on String with other data types: [" + d + ':' + e + ':' + f + "]");

        // -------------------------------------------------
        // use of += compound assignment on String concatenation (+)
        String s = "start ... ";
        s += "append ... ";
        s += "1" + "2";
        s += " ... ";
        s += 1 + 2; // same as: s += (1 + 2);
        s += " ... ";
        s += '1' + '2'; // same as: s += ('1' + '2');
        // char '1' and char '2' will be casted to int (49 and 50) before adding up
        System.out.println("Compound Assignment (+=) on String Concat: " + s);
        System.out.println("Because ... (int) '1' = " + (int) '1');
    }

    public static void demo02StringPool() {

        System.out.println("--------------------------------");
        System.out.println("### [2] Demo of String Pool ###");

        // -------------------------------------------------
        // Use of String literals is preferable to use of new String(...).
        String a = new String("The measure of intelligence is the ability to change."); // not in the string pool
        String b = new String("The measure of intelligence is the ability to change."); // not in the string pool
        String c = "The measure of intelligence is the ability to change."; // in the string pool
        String d = "The measure of intelligence is the ability to change."; // in the string pool
        System.out.println("a = new String(\"" + a + "\");");
        System.out.println("b = new String(\"" + b + "\");");
        System.out.println("c = \"" + c + "\";");
        System.out.println("d = \"" + d + "\";");
        System.out.println("a.equals(b) ? " + a.equals(b) + " ...\t a == b ? " + (a == b));
        System.out.println("a.equals(c) ? " + a.equals(c) + " ...\t a == c ? " + (a == c));
        System.out.println("d.equals(c) ? " + d.equals(c) + " ...\t d == c ? " + (d == c));
        String e = a.intern(); // String::intern() puts the string literal 
        // into the string pool and returns the reference to that string literal
        System.out.println("e = a.intern();");
        System.out.println("a.equals(c) ? " + a.equals(c) + " ...\t a == c ? " + (a == c));
        System.out.println("e.equals(c) ? " + e.equals(c) + " ...\t e == c ? " + (e == c));
    }

    public static void demo03StringBuilder() {

        System.out.println("--------------------------------");
        System.out.println("### [3] Demo of StringBuilder ###");

        // -------------------------------------------------
        // https://docs.oracle.com/javase/10/docs/api/java/lang/StringBuilder.html
        // https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/StringBuilder.html
        // use StringBuilder instead of gradually concatenating String objects.
        // StringBuilder uses "append" to build up a string efficiently from any datatype.
        // (less-efficient) StringBuffer is a thread-safe version of (more-efficient) StringBuilder.
        StringBuilder sb = new StringBuilder(100); // initial length
        sb.append("Starting ... ");
        sb.append(10.6); // can append anything, which will be converted to String
        sb.append(" ... ").append(true).append(" ... ").append(':').append("end."); // chaining
        System.out.println("Result: " + sb.toString());
        System.out.println("Or just: " + sb);
        // content manipulation (mutable): insert(), delete(), replace() 
        // like String: length(), charAt(), substring(); indexOf(), lastIndexOf(); equals(); compareTo()
        sb.setLength(0); // reset
        sb.append("Never odd or even."); // this is a palindrome.
        System.out.println("Original: [" + sb + "] ");
        sb.reverse(); // mutably reverse the content
        System.out.println("Reversed: [" + sb + "]");
        sb.setLength(0);
        sb.append("Malayalam"); // an Indian language // this is also a palindrome.
        System.out.println("Why? : [" + sb + "] >reverse> [" + sb.reverse().toString() + "]");
        sb.setLength(0);
        sb.append("Malayalam");
        System.out.println("Why? : [" + sb.toString() + "] >reverse> [" + sb.reverse() + "]");
        // why do they have different results?
    }

    public static void demo04StringJoinerAndValueOf() {

        System.out.println("--------------------------------");
        System.out.println("### [4] Demo of StringJoiner ###");

        // -------------------------------------------------
        // https://docs.oracle.com/javase/10/docs/api/java/util/StringJoiner.html
        // https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/StringJoiner.html
        // StringJoiner can build up a string from many strings 
        // by inserting a delimiter in between each added string.
        // "add" is used to concatenating new strings.
        // Other datatypes cannot be added.
        // -------------------------------------------------
        String delimiter = ",";
        StringJoiner sj1 = new StringJoiner(delimiter);
        System.out.println("StringJoiner with a delimiter.");
        System.out.println("-->" + sj1 + "<--");
        sj1.add("one");
        System.out.println("-->" + sj1 + "<--");
        sj1.add("two")
                .add(String.valueOf(3)) // integer
                .add(String.valueOf(4L)) // long
                .add(String.valueOf(5.5)) // double
                .add(String.valueOf(6.6f)) // float
                .add(String.valueOf(true)) // boolean
                .add(String.valueOf('8')) // char
                .add(String.valueOf("9")); // any Object including String
        System.out.println("-->" + sj1 + "<--");

        // -------------------------------------------------
        String prefix = "{";
        String suffix = "}";
        StringJoiner sj2 = new StringJoiner(delimiter, prefix, suffix);
        System.out.println("StringJoiner with delimiter, prefix, and suffix.");
        System.out.println("-->" + sj2 + "<--");
        sj2.add("one");
        System.out.println("-->" + sj2 + "<--");
        sj2.add("two").add("three").add("four");
        System.out.println("-->" + sj2 + "<--");

        // -------------------------------------------------
        // merging StringJoiners
        sj1 = new StringJoiner(" ... ", "sj1 = \"", ".\"\n        -- Albert Einstien.");
        sj1.add("God").add("does not").add("play dice with").add("the universe");
        sj2 = new StringJoiner(" _ ", "sj2 = [", ".]\n        -- Neils Bohr.");
        sj2.add("Stop").add("telling God").add("what to do");
        System.out.println(sj1);
        System.out.println(sj2);
        sj1.merge(sj2); 
        System.out.println("Beware of merging StringJoiners: \n" + sj1);
        // In merging of two string joiners, the prefix and the suffix of 
        // the second string joiner is ignored but it's delimiter has been applied.

        // -------------------------------------------------
        // String.join()
        String s = String.join(" _ ", "Any-fool", "can-know.", "The-point", "is", "to-understand."); // -- Albert Einstein
        System.out.println("String.join(-delimiter-, strings ...)\n   -->" + s + "<--");
        String[] stringArray = {"Never", "memorize_something", "that", "you_can_look_up."}; // -- Albert Einstein
        System.out.println("String.join(-delim-, string array)\n   -->" + String.join(" ... ", stringArray) + "<--");
    }

    public static void demo05StringFormatting() {

        System.out.println("--------------------------------");
        System.out.println("### [5] Demo of String Formatting ###");

        // -------------------------------------------------
        // https://docs.oracle.com/javase/10/docs/api/java/util/Formatter.html
        // https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Formatter.html
        // formatting: %b %c %d %o %x %f %e %g %a %s %- %+ %, %0 %1$ %< %n %%

        // -------------------------------------------------
        System.out.print("Printing without ending with a newline: print().");
        System.out.println(" ... Printing and ending with a newline: println().");
        System.out.printf("... Printing with format%n"); // %n = platform-independent newline
        System.out.printf("Print various types: (boolean %%b: %b)%n" // %% for escaping %
                + "(decimal: %%d=%d) (octal: %%o=%<o) (hexadecimal: %%X=%<X)%n"
                + "(floating point: %%f=%f, %%.2f=%<.2f, %%E=%<E, %%.2E=%<.2E) %n"
                + "(char: %c) (string: %s)%n", // < reuses the previous argument
                true, 31, 123456.789, 'a', "something");
        // float %f  2f     int(decamel base10) %d     boolean %b     char %c        String %s      newline %n    
        // -------------------------------------------------
        // System.out.printf(...) is exactly the same as System.out.format(...)
        System.out.println("Format Printing with Width, Left/Right Justification, Re-using Arguments");
        System.out.printf("|%7s|%<7s|%<7s|%<7s|%<7s|%<7s|%n", "1234567"); // < reuses previous
        System.out.printf("|%7d|%<+7d|%<-7d|%<07d|%,7d|%7d|%n", 1234, 12345, 12345678);
        System.out.printf("|%7.2f|%<+7.2f|%<-7.2f|%,7.2f|%,7.2f|%n", 1.234, 12345.678, 1234567.8);
        System.out.printf("|%7s|%-7s|%7s|%n", "a", "a", "abcdefhijk");
        System.out.printf("|%1$7s|%1$-7s|%2$7s|%2$7s|%7s|%n", "str", "abcde"); // 1$, 2$ = argument index

        // -------------------------------------------------
        // String.format() uses Formatter behind the scene.
        String s = String.format("Formatting %s and %d.", "string", 100);
        System.out.println("String.format(-format-, values ...) --> " + s);
        
        // -------------------------------------------------
        // Formatter is appendable; create a new one instead of reusing/resetting it.
        Formatter fm = new Formatter();
        fm.format("   Whole Number: %d (decimal) = %<o (octal) = %<X (hexadecimal)%n", 127);
        fm.format("   Real Number (.4): %.4f (float) = %<.4E (scientific)%n"
                + "      = %<.4G (general) = %<.4A (hex-float)%n", 12.345678E-3);
        fm.format("   Boolean: %b (integer:%<d); %b (double:%<.1f); %b (char:%<c);%n"
                + "      %b (empty string:%<s), %b (null:%<s);%n"
                + "      %b (boolean:%<b), %b (boolean:%<b)%n"
                + "      [everything is true except false and null]",
                0, 0.0, ' ', "", null, true, false);
        System.out.println("Formatter (appendable)):\n" + fm);
        // Use Formattable for advanced formatting objects printing
    }

    public static void demo06StringEqualityAndComparison() {

        System.out.println("--------------------------------");
        System.out.println("### [6] Demo of String Equality and Comparison ###");

        // -------------------------------------------------
        // String::equals() and String::equalsIgnoreCase()
        System.out.println("[mNo] equals [mNo] --> " + "mNo".equals("mNo"));
        System.out.println("[MnO] equals [mno] --> " + "MnO".equals("mno"));
        System.out.println("[MnO] equalsIgnoreCase [mno] --> " + "MnO".equalsIgnoreCase("mno"));

        // -------------------------------------------------
        // String::compareTo() and String::compareToIgnoreCase() // for sorting
        System.out.println("string comparison in lexicographical/dictionary/alphabetical order.");
        System.out.println("string1.compareTo(string2) --> positive = string1 > string2");
        System.out.println("string1.compareTo(string2) --> negative = string1 < string2");
        System.out.println("string1.compareTo(string2) --> zero = string1 == string2");
        System.out.println("All Capital Letters < All Small Letters.");
        int result;
        result = "not".compareTo("no"); // positive
        System.out.println("[not]  compareTo [no] --> "
                + result + " ... (" + (result > 0 ? "positive >" : result < 0 ? "negative <" : "zero =") + ")");
        result = "not".compareTo("none"); // positive
        System.out.println("[not] compareTo [none] --> "
                + result + " ... (" + (result > 0 ? "positive >" : result < 0 ? "negative <" : "zero =") + ")");
        result = "not".compareTo("not"); // zero
        System.out.println("[not] compareTo [not] --> "
                + result + " ... (" + (result > 0 ? "positive >" : result < 0 ? "negative <" : "zero =") + ")");
        result = "Not".compareTo("not"); // negative
        System.out.println("[Not] compareTo [not] --> "
                + result + " ... (" + (result > 0 ? "positive >" : result < 0 ? "negative <" : "zero =") + ")");
        result = "Not".compareToIgnoreCase("no"); // positive
        System.out.println("[Not] compareToIgnoreCase [no] -->"
                + result + " ... (" + (result > 0 ? "positive >" : result < 0 ? "negative <" : "zero =") + ")");
        result = "Not".compareToIgnoreCase("noT"); // zero
        System.out.println("[Not] compareToIgnoreCase [noT] -->"
                + result + " ... (" + (result > 0 ? "positive >" : result < 0 ? "negative <" : "zero =") + ")");
    }

    public static void demo07StringsWithWhitespaces() {

        System.out.println("--------------------------------");
        System.out.println("### [7] Demo of Strings With Whitespaces ###");

        // -------------------------------------------------
        // String::isBlank() and String::isEmpty()
        String dot = "."; // not blank and not empty
        String blank = " \t\t "; // A blank string contains whitespace only or nothing at all.
        String empty = ""; // An empty string contains nothing at all.
        System.out.printf("[%s] isBlank(): %b ... isEmpty(): %b%n", dot, dot.isBlank(), dot.isEmpty());
        System.out.printf("[%s] isBlank(): %b ... isEmpty(): %b%n", blank, blank.isBlank(), blank.isEmpty());
        System.out.printf("[%s] isBlank(): %b ... isEmpty(): %b%n", empty, empty.isBlank(), empty.isEmpty());

        // -------------------------------------------------
        // Stripping whitespaces: trim(), strip(), stripLeading(), stripTrailing()
        String dignity = " \t No one can make you feel inferior \t without your consent \t "; // -- Eleanor Roosevelt
        System.out.println("Original: [" + dignity + "]");
        // trim() removes characters lower than space; strip() removes Character.isWhitespace(char);
        System.out.println("   trim(): [" + dignity.trim() + "]"); // not unicode friendly
        System.out.println("   strip(): [" + dignity.strip() + "]"); // unicode friendly; 
        System.out.println("   stripLeading(): [" + dignity.stripLeading() + "]");
        System.out.println("   stripTrailing(): [" + dignity.stripTrailing() + "]");
    }

    public static void demo08RelatedToPositionsInStrings() {

        System.out.println("--------------------------------");
        System.out.println("### [8] Demo related to Positions In Strings ###");

        // -------------------------------------------------
        // String functions related to the positions of characters in the strings.
        // length(), chatAt(), indexOf(), lastIndexOf(), substring()
        String position = "0123456789A123456789B123456789C123456789D123456789E";
        String brave = "Danger is very real, but fear is a choice."; // -- After Earth, 2013
        System.out.println(position + "\n" + brave);
        int len = brave.length();
        System.out.printf("It is %d characters long. charAt(%d)=[%c], charAt(%d)=[%c], charAt(%d)=[%c]%n", 
                len, 0, brave.charAt(0), 3, brave.charAt(3), len-1, brave.charAt(len-1));
        String ea = "ea";
        String non = "non";
        int eaFirst = brave.indexOf(ea);
        int eaLast = brave.lastIndexOf(ea);
        int nonFirst = brave.indexOf(non);
        int nonLast = brave.lastIndexOf(non);
        System.out.printf("   [%s] is at %d (indexOf), %d (lastIndexOf)%n", ea, eaFirst, eaLast);
        System.out.printf("   [%s] is at %d (indexOf), %d (lastIndexOf)%n", non, nonFirst, nonLast);
        System.out.printf("   First [%s] from position %d is at %d : indexOf(string,pos)%n", 
                ea, eaFirst + 1, brave.indexOf(ea, eaFirst + 1));
        System.out.printf("   Last [%s] backwardly from position %d is at %d : lastIndexOf(string,pos)%n", 
                ea, eaLast - 1, brave.lastIndexOf(ea, eaLast - 1));
        System.out.println("   substring ( " + eaFirst + " ) : [" + brave.substring(eaFirst) + "]");
        System.out.println("   substring ( " + eaFirst + " , " + eaLast +" ) : [" + brave.substring(eaFirst, eaLast) + "]");
    }

    public static void demo09StringReproduction() {

        System.out.println("--------------------------------");
        System.out.println("### [9] Demo of String Reproduction ###");

        // -------------------------------------------------
        // Reproducing a new string from an old one
        // toUpperCase(), toLowerCase(), repeat(), replace()
        String work = "Love is a better Master than Duty."; // -- Albert Einstein
        System.out.println("String [" + work + "]");
        System.out.println("   toUpperCase(): [" + work.toUpperCase() + "]");
        System.out.println("   toLowerCase(): [" + work.toLowerCase() + "]");
        System.out.println("   the original : [" + work + "] does not change");
        String master = "Master";
        String boss = "Boss";
        System.out.printf("[%s] repeat 5 times = [%s]%n", master, master.repeat(5));
        System.out.printf("Replacing [%s] with [%s] =%n   [%s]%n", master, boss, work.replace(master, boss));
        System.out.println("The original does not change\n   [" + work + "]");
    }

    public static void demo10SimpleStringMatching() {

        System.out.println("--------------------------------");
        System.out.println("### [10] Demo Simple String Matching ###");
        
        // -------------------------------------------------
        // String Content Search: contains(), startsWith(), endsWith()
        String value = "Try not to become a man of success. Rather become a man of value."; // -- Albert Einstein
        String success = "success";
        String failure = "failure";
        String part1 = "Try not to";
        String part2 = "a man of value.";
        System.out.println("String [" + value + "]");
        System.out.printf("   contains [%s]? %b%n", part1, value.contains(part1));
        System.out.printf("   contains [%s]? %b%n", part2, value.contains(part2));
        System.out.printf("   contains [%s]? %b%n", success, value.contains(success));
        System.out.printf("   contains [%s]? %b%n", failure, value.contains(failure));
        System.out.printf("   starts with [%s]? %b%n", part1, value.startsWith(part1));
        System.out.printf("   ends with [%s]? %b%n", part1, value.endsWith(part1));
        System.out.printf("   starts with [%s]? %b%n", part2, value.startsWith(part2));
        System.out.printf("   ends with [%s]? %b%n", part2, value.endsWith(part2));
    }

    public static void demo11RegExOnString() {

        System.out.println("--------------------------------");
        System.out.println("### [11] Demo of Regular Expressions using String class only ###");

        // -------------------------------------------------
        // https://docs.oracle.com/javase/10/docs/api/java/util/regex/Pattern.html
        // https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/regex/Pattern.html
        // https://www.regular-expressions.info/tutorial.html
        // ., ?, *, +, ^, $, [ ], [^ ], [ - ], ( ), ??, (?: ), (?= ), (?<= ), (?!= ), (?!<= ), ... 

        String worth = "only a life lived for others is a life worthwhile"; // -- Albert Einstein

        // -------------------------------------------------
        // String Matching with Regular Expression
        // string.matches(regex) = matches the whole string
        String startsWith = "only a life .*";
        String endsWith = ".* a life worthwhile";
        String contains = ".* for others .*";
        String containsLxD = ".*\\bl[^\\s]*d\\b.*"; // contains a word starts with l and ends with d
        String containsIxE = ".*\\bi[^\\s]*e\\b.*"; // contains a word starts with i and ends with e
        String wBeforeL = ".*[wW].*[lL].*"; // any w/W before an l/L
        String hBeforeY = ".*[hH].*[yY].*"; // any h/H before a y/Y
        System.out.println("String [" + worth + "]");
        System.out.println("   matches [" + startsWith + "] ? " + worth.matches(startsWith));
        System.out.println("   matches [" + endsWith + "] ? " + worth.matches(endsWith));
        System.out.println("   matches [" + contains + "] ? " + worth.matches(contains));
        System.out.println("   matches [" + containsLxD + "] (word: l...d) ? " + worth.matches(containsLxD));
        System.out.println("   matches [" + containsIxE + "] (word: i...e) ? " + worth.matches(containsIxE));
        System.out.println("   matches [" + wBeforeL + "] (w...l) ? " + worth.matches(wBeforeL));
        System.out.println("   matches [" + hBeforeY + "] (h...y) ? " + worth.matches(hBeforeY));

        // -------------------------------------------------
        // String Replacement with Regular Expression
        // find a substring (not the whole string) and replace with another string
        // string.replace[All|First](regex, rexplace) = find regex and replace with rexplace
        String regex = "(?<=\\s)(li[^\\s]e)(d)?(?=\\s)"; // find substring "_liXe?_" 
        // where _ is a whitespace, X is not a whitespace, and ? is d or nothing
        String rexplace = "<$1.$2>"; // $1 is liXe and $s is d or nothing
        System.out.println("String [" + worth + "]");
        System.out.printf("ReplaceAll [%s] with [%s] : %n   [%s]%n", 
                regex, rexplace, worth.replaceAll(regex, rexplace));
        System.out.printf("ReplaceFirst [%s] with [%s] : %n   [%s]%n", 
                regex, rexplace, worth.replaceFirst(regex, rexplace));

        // -------------------------------------------------
        // String Splitting with Regular Expression
        // string.split(regex) = split the string into multiple substrings
        String delim = "li.ed?";
        System.out.println("String [" + worth + "]");
        System.out.println("Split string with [" + delim + "] :");
        Stream.of(worth.split(delim)).forEach(s->System.out.println("   [" + s + "]"));
        System.out.println("Split string with [" + delim + "] for at most 2 occurences only :");
        Stream.of(worth.split(delim, 2)).forEach(s->System.out.println("   [" + s + "]"));
    }
    
    public static void demo12RegExOnPatternAndMatcher() {

        System.out.println("--------------------------------");
        System.out.println("### [12] Demo of Regular Expressions: Pattern and Matcher ###");

        String worth = "only a life lived for others is a life worthwhile"; // -- Albert Einstein

        // -------------------------------------------------
        // java.util.regex.Pattern: matches()
        String only = "\\bonly\\b"; // word "only"
        String then = "\\bthen\\b"; // word "then"
        String other = "\\bothers?\\b"; // word "other" or "others"
        System.out.println("(12.1) Pattern.matches()");
        System.out.println("   [" + worth + "]");
        System.out.println("   matches [" + only + "] ? " + Pattern.matches(only, worth));
        System.out.println("   matches [" + then + "] ? " + Pattern.matches(then, worth));
        System.out.println("   matches [" + other + "] ? " + Pattern.matches(other, worth));
        
        // -------------------------------------------------
        // java.util.regex.Matcher: usePattern(),matches(), pattern() // pattern.matcher()
        Matcher mat = Pattern.compile(only).matcher(worth);
        System.out.println("(12.2) matcher.[usePattern(),matches(), pattern()]");
        System.out.println("   [" + worth + "]");
        System.out.println("   matches [" + mat.pattern() + "] ? " + mat.matches());
        mat.usePattern(Pattern.compile(then));
        System.out.println("   matches [" + mat.pattern() + "] ? " + mat.matches());
        mat.usePattern(Pattern.compile(other));
        System.out.println("   matches [" + mat.pattern() + "] ? " + mat.matches());

        // -------------------------------------------------
        // java.util.regex.Pattern: compile(); split(),splitAsStream(), pattern()
        Pattern pat = Pattern.compile("(?<=\\s)li.ed?(?=\\s)"); 
        System.out.println("(12.3) Pattern.compile(); pattern.split(), pattern.pattern()");
        System.out.println("    Split string with [" + pat.pattern() + "] :");
        pat.splitAsStream(worth).forEach(s->System.out.println("   [" + s + "]"));

        String learn = "Live as if you were to die tomorrow. Learn as if you were to live forever."; 
        // -- Mahatma Gandhi

        // -------------------------------------------------
        // java.util.regex.Matcher: replaceAll(), replaceFirst(), reset(), flag = Pattern.CASE_INSENSITIVE
        String regex = "\\b(l[^\\s]*)\\b";
        String repl = "<$1>";
        mat.usePattern(Pattern.compile(regex, Pattern.CASE_INSENSITIVE));
        System.out.println("(12.4) matcher.[replaceAll/First(),reset()], flag = Pattern.CASE_INSENSITIVE");
        System.out.printf("   ReplaceAll [%s] with [%s] : %n", regex, repl);
        System.out.printf("   String [%s]%n      [%s]%n", worth,  mat.replaceAll(repl));
        mat.reset(learn);
        System.out.printf("   String [%s]%n      [%s]%n", learn,  mat.replaceAll(repl));
    }
    
    public static void demo13RegExWithFindAndReplace() {
        
        System.out.println("--------------------------------");
        System.out.println("### [13] Demo of Regular Expressions with Find and Replace ###");

        // -------------------------------------------------
        // "Love the life you live. Live the life you love." -- Bob Marley
        String song = "Live the life you LOVE. OR ELSE, LIKE the LIFE you live.";

        // -------------------------------------------------
        // java.util.regex.Matcher: find,groupCount,group,start,end,appendReplacement,appendTail
//        String reg = "\\b[^\\s]([^\\s]{1,2})\\b.*?\\b([^\\s]{3})E\\b"; String rep = "<$1,$2a>";
//        String reg = ".{2}\\b([^\\s]{3,4})\\b"; String rep = ":$1";
        String reg = "\\b[^\\s]([^\\s]{1,2}\\s[^\\s]{2})[^\\s]{1,2}\\b"; String rep = "_$1_";
        System.out.println("find(), groupCount(), group(), start(), end(), appendReplacement(), appendTail()");
        System.out.println("   [0123456789A123456789B123456789C123456789D123456789E12345]");
        System.out.println("   [" + song + "]");
        Matcher mat = (Pattern.compile(reg,Pattern.CASE_INSENSITIVE).matcher(song));
        StringBuilder each = new StringBuilder(1000); // accumulate each round of matched substrings
        StringBuilder marker = new StringBuilder(100); // marks all matched regions with # and @ alternatively
        StringBuilder newText = new StringBuilder(100); // the new string resulted from replacement
        int len = song.length();
        int shift = 0;
        marker.append("   [");
        for (int count = 1; mat.find(); ++count) {
            marker.append(" ".repeat(mat.start()-shift))
                    .append((count%2==0 ? "@" : "#").repeat(mat.end()-mat.start()));
            shift = mat.end();
            int offset = 0;
            each.append("   [");
            for (int i = 1; i <= mat.groupCount(); i++) {
                each.append(" ".repeat(mat.start(i)-offset))
                        .append(mat.group(i));
                offset = mat.end(i);
            }
            each.append(" ".repeat(len-offset))
                    .append("] ").append(count)
                    .append(" [").append(mat.group())
                    .append("] [").append(mat.start())
                    .append(",").append(mat.end()).append(").\n");
            mat.appendReplacement(newText, rep);
            newText.append(count);
        }
        marker.append(" ".repeat(len-shift)).append("]");
        mat.appendTail(newText);
        System.out.println("=> [" + newText + "]");
        System.out.println(marker);
        System.out.print(each);
    }
}

// -------------------------------------------------
// SUMMARY of classes on REGULAR EXPRESSION
//
// Regular-Expression Related Classes: 
// String (contains text) :: matches(regex), replaceAll/First(regex, repl), split(regex)
// Pattern (contains regex) :: matches(text), split(text)
// Matcher (contains pattern and text) :: matches(), replaceAll/First(repl), find...
//
// Pattern <-- Pattern.compile(regex);
// Matcher <-- pattern.matcher(text);
//
// Matcher <-- matcher.usePattern(pattern); // change the pattern in the matcher
// Matcher <-- matcher.reset(text); // change the text in the matcher
//
// String <-- pattern.pattern(); pattern.toString();
// Pattern <-- matcher.pattern();

// -------------------------------------------------
// Task 1: matches the whole text string against the regular expression
// (Method 1) boolean <-- textString.matches(regexString);
// (Method 2) boolean <-- Pattern.matches(regexString, textString);
// (Method 3) boolean <-- Pattern.compile(regexString).matcher(textString).matches();
//      i.e., (3.1) Pattern <-- Pattern.compile(regexString);
//            (3.2) Matcher <-- pattern.matcher(textString);
//            (3.3) boolean <-- matcher.matches();

// -------------------------------------------------
// Task 2: find and replace all occurrences (replaceAll) or just the first occurrence (replaceFirst)
// (Method 1) String <-- textString.replaceAll(regexString, replaceString);
// (Method 2) String <-- Pattern.compile(regexString).matcher(textString).replaceAll(replaceString);
//      i.e., (2.1) Pattern <-- Pattern.compile(regexString);
//            (2.2) Matcher <-- pattern.matcher(textString);
//            (2.3) boolean <-- matcher.replaceAll(replaceString);

// -------------------------------------------------
// Task 3: splitting (tokenizing) text string into multiple strings
// (Method 1) String[] <-- textString.split(regexString);
// (Method 2) String[] <-- Pattern.compile(regexString).split(textString);
//      i.e., (2.1) Pattern <-- Pattern.compile(regexString);
//            (2.2) String[] <-- pattern.split(textString);

// -------------------------------------------------
// Task 4: find and replace: find,groupCount,group,start,end,appendReplacement,appendTail
// E.g., text ="01xyy5678xxyyy45678xxxy3456789"; regex = "(x+)(y+)"; rexpl = "$2_$1"
//
//    Matcher mat = Pattern.compile(regex).matcher(text);
//    StringBuilder stringBuilder = new StringBuilder();
//    while (mat.find()) { // found 3 times: xyy, xxyyy, xxxy
//        foreach (groupCount()) { // there are two groups each time: 1 and 2
//            process ... group(), start(), end() // group 1 matches x+ and group 2 matches y+
//        }
//        mat.appendReplace(stringBuilder,rexpl);
//    }
//    mat.appendTail(stringBuilder);
//    return stringBuilder.toString();
//
// --------------------------------------------------------
//    text = "01xyy5678xxyyy45678xxxy3456789";
//    result = "01yy_x5678yyy_xx45678y_xxx3456789";
//
