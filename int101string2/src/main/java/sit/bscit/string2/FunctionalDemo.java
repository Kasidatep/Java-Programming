package sit.bscit.string2;

import java.util.function.ToIntBiFunction;

public class FunctionalDemo {
    public static void main(String[] args) {
        demoStringDiff();
    }
    
    public static void demoStringDiff() {

        // functional approach
        System.out.println("-- functional approach --");
        StringDiff d = (p, q, f) -> {
                int i = f.applyAsInt(p, q);
                return i + " ... " + (i>0 ? "positive (>)" : i<0 ? "negative (<)" : "zero (=)");
        };
        
        System.out.println("\"not\".compareTo(\"no\") --> " + d.diff("not","no", String::compareTo));
        System.out.println("\"not\".compareTo(\"none\") --> " + d.diff("not","none", String::compareTo));
        System.out.println("\"not\".compareTo(\"not\") --> " + d.diff("not","not", String::compareTo));
        System.out.println("\"Not\".compareTo(\"no\") --> " + d.diff("Not","no", String::compareTo));
        System.out.println("\"Not\".compareToIgnoreCase(\"no\") -->" + d.diff("Not","no", String::compareToIgnoreCase));
        System.out.println("\"Not\".compareToIgnoreCase(\"noT\") -->" + d.diff("Not","noT", String::compareToIgnoreCase));
        
    }
}

@FunctionalInterface
interface StringDiff {
    String diff(String a, String b, ToIntBiFunction<String,String> f);
}
