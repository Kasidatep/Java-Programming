package sit.bscit;

import java.util.Arrays;
import static sit.bscit.Dummy.randomDouble;

public class ArrayManipulation {

    public static void main(String[] args) {
        
        demo01ArrayDeclarationAndInstantiation(); // e.g., var ia = new int[5];
        demo02ArrayInstantiationWithImplicitSize(); // e.g., int[] ia = { 15, 30, 40 };
        demo03AccessingArraySizeAndContents(); // a.length; a[0].field; a[0].method()
        demo04ArrayForeachIteration(); // for (TYPE element : array) { ... element ... }
        demo05ArraysMethods(); // Arrays.toString(...), Arrays.fill(...), 
        // Arrays.copyOf(...), Arrays.copyOfRange(...), System.arraycopy(),
        // Arrays.sort(...), Arrays.equals(...), Arrays.compare(), ...
        
        demo06MultidimensionalArray(); // Arrays.deepToString(array)
        // (no example in here) Arrays.deepEquals(array1, array2)
    }
    
    public static void demo01ArrayDeclarationAndInstantiation() {

        System.out.println("--------------------------------");
        System.out.println("### [1] Demo of Array Declaration and Instantiation ###");

        // Array Declaration ------------------------------------
        // SYNTAX: "type[] varName" (array notation [] on type) vs. 
        // SYNTAX: "type varName[]" (array notation [] on variable name)
        // -- no difference between notation-on-type and notation-on-name
        // -- no difference between primitive types and reference types
        boolean[] boolAr1, boolAr2;           // primitive type array declaration - on-type 
        Dummy[] objAr1, objAr2;               // reference type array declaration - on-type
        int intVar1, intAr1[], intVar2 = 11;  // primitive type array declaration - on-name
        String obj1 = null, objAr3[], obj2;  // reference type array declaration - on-name

        // Array Instantiation ------------------------------------
        // Array instantiation only after array declaration
        // SYNTAX: new PrimitiveOrObject[size]
        // "size" must be a positive value of type int
        // "size" can be a literal or an integer expression
        int x = 9, y = 5;
        boolAr1 = new boolean[4];   // for array of primitive type
        intAr1 = new int[x % y + 2];  // for array of primitive type          
        objAr1 = new Dummy[3];     // for array of reference type

        // Because arrays are objects, like any other object,
        // once they are instantiated, their contents are 
        // automatically initialized to false, 0, 0.0, or null.
        System.out.println("automatic initialization of array's content with default: false, 0, 0.0, null ----------");
        System.out.println("Array of boolean: " + arrayInfo(boolAr1));
        System.out.println("Array of int: " + arrayInfo(intAr1));
        System.out.println("Array of Dummy objects: " + arrayInfo(objAr1));
        
        // Array Declaration and Instantiation together ------------------------------------
        // Array instatiation with a given size explicitly
        var objAr4 = new Dummy[4];
        System.out.println("Array of Dummy objects: " + arrayInfo(objAr4));
    }
    
    public static void demo02ArrayInstantiationWithImplicitSize() {

        System.out.println("--------------------------------");
        System.out.println("### [2] Demo of Array Instantiation With Implicit Size ###");

        // Array declaration and instantiation with implicit array size.
        // Giving implicit array size by initializing all the values in the arrays.
        // When initializing the contents of the arrays, the sizes cannot be specified.
        // SYNTAX: TypeName[] varName = new TypeName[] { ... <, ...> }; OR
        // SYNTAX: var varName = new TypeName[] { ... <, ...> }; OR
        // SYNTAX: TypeName[] varName = { ... <, ...> };

        // numAr5, objAr6, objAr7, and objAr8 are different ways to initialize array's contents.
        System.out.println("initialization of array's content with implicit size using { } ----------");
        // initialization by using { } notation from any combination of these forms:
        // (1) literals, (2) variables/expressions, (3) object constructors/method calls
        // This approach of initialization can be used only when 
        // doing declaration and initialization in the same statement.
        var dm = new Dummy();
        double realNum = 9.11 * Math.PI ;
        var numAr5 = new double[] { 5.9, Math.floor(100 * realNum)/100, randomDouble() };
        String[] objAr6 = { "Excellent", "Good", "Fair", "Poor", null, null };
        var objAr7 = new Dummy[] { dm, new Dummy(7.11), null, randomDummy() };
        Dummy[] objAr8 = { randomDummy(), null, new Dummy(1.08), dm, null, null };
        
        System.out.println("Array of doubles " + arrayInfo(numAr5));
        System.out.println("Array of Strings " + arrayInfo(objAr6));
        System.out.println("Array of Dummy objects " + arrayInfo(objAr7));
        System.out.println("Array of Dummy objects " + arrayInfo(objAr8));
    }
        
    public static void demo03AccessingArraySizeAndContents() {

        System.out.println("--------------------------------");
        System.out.println("### [3] Demo of Accessing Array's Size and Contents ###");

        // Array Accessing ------------------------------------
        // SYNTAX: varName[index] where index starts from 0 to length-1
        System.out.println("accessing array's size and contents ----------");
        int size = 4;
        var dArray = new double[size];
        var oArray = new Dummy[size+1];
        System.out.println("Sizes of Arrays = " + dArray.length + " and " + oArray.length);

        // array contents are initialized to false, 0, 0.0, or null.
        dArray[0] = 10.0; // assigning a value
        dArray[0] = 9.0;   // re-assigning a value
        dArray[2] = dArray[0] + dArray[1]; // assigning and reading values
        dArray[3] = dArray[0] + dArray[2]; // assigning and reading values
        System.out.println("Primitive Type Array: " + arrayInfo(dArray));
        oArray[0] = new Dummy();
        oArray[2] = randomDummy();
        oArray[3] = oArray[0]; // now, oArray[0] and oArray[4] share the same object.
        oArray[4] = randomDummy();
        System.out.println("Reference Type Array: " + arrayInfo(oArray));
        oArray[3].changeX(); // oArray[0] got changed too because they references to the same object.
        System.out.println("after modification: " + arrayInfo(oArray));
        oArray[0].setX(oArray[2].getX()); // accessing (reading/modifying) objects in the array.
        System.out.println("after modification: " + arrayInfo(oArray));
    }
    
    public static void demo04ArrayForeachIteration() {

        System.out.println("--------------------------------");
        System.out.println("### [4] Demo of Iterating over Array's Contents ###");

        int size = 5;

        // ------------------------------------
        System.out.println("(4.1) using for each loop to iterate over an array of primitive type ----------");

        var ds = new double[size];
        // normal loops can be used to access (read, modify) and re-assign new values into the array.
        for (int i = 0; i < ds.length; i++) ds[i] = randomDouble(); 

        // For each loop can be used to read the array contents
        // but it cannot be used to re-assign new values into the array.
        // SYNTAX: for (typeName varName : arrayVarName) { ... manipulating varName ... } 
        // NOTE: varName is just a copy of each element in the array; not the actual element.
        // NOTE: varName may be null because array may contain null.
        System.out.print("  Original Array of primitive type\n   ");
        for (double d : ds) System.out.format(", %.3f", d);
        System.out.println(" // primitive type");
        
        // re-assign new values into the array cannot be done with for each loop.
        // (to do so, use the normal for/while loop)
        for (double d : ds) d = randomDouble(); // this statement has no effect.

        System.out.print("  Array of primitive type after trying to re-assign new values with for each loop\n   ");
        for (double d : ds) System.out.format(", %.3f", d);
        System.out.println(" // no effect");

        // use a normal for loop to re-assign new values to some elements in the array.
        for (int i = 0; i < ds.length; i += 2) ds[i] = randomDouble();

        System.out.print("  Array of primitive type after re-assigning new values with normal for loop\n   ");
        for (double d : ds) System.out.format(", %.3f", d);
        System.out.println(" // change");

        // ------------------------------------
        System.out.println("(4.2) using for each to iterate over an array of reference type ----------");

        var os = new Dummy[size];

        // same for array of reference type.
        System.out.print("  Original Array of Dummies (with default initialization)\n   ");
        for (Dummy o : os) System.out.print(", " + o); // full of nulls
        System.out.println(" // full of nulls (default value)");
        
        // re-assign new values into the array cannot be done with for each loop. 
        // (to do so, use the normal for/while loop)
        for (Dummy o : os) o = new Dummy(); // this statement has no effect.

        System.out.print("  Array of Dummies after trying to re-assign new values with for each loop\n   ");
        for (Dummy o : os) System.out.print(", " + o); // still remain nulls
        System.out.println(" // no effect");

        // use a normal for loop to re-assign new values to some elements in the array.
        for (int i = 0; i < os.length; i+=2) os[i] = new Dummy(); 

        System.out.print("  Array of Dummies after re-assign new values with a normal for loop\n   ");
        for (Dummy o : os) System.out.print(", " + o);
        System.out.println(" // change");

        // ------------------------------------
        System.out.println("(4.3) using for each to access objects and modify them ----------");
        
        // for each loop cannot be used to re-assign new values into the array
        // but it can be used to access object in the array which can be modified
        for (Dummy o : os) if (o !=null) o.changeX(); // beware of nulls in the array.

        System.out.print("  Array of Dummies after modifying the objects in the array with for each loop.\n   ");
        for (Dummy o : os) System.out.print(", " + o);
        System.out.println(" // old objects but values are changed.");
    }
    
    public static void demo05ArraysMethods() {

        System.out.println("--------------------------------");
        System.out.println("### [5] Demo of Arrays.method() ###");

        // SYNTAX: Arrays.toString(array) : String ==> [..., ..., ..., ...]
        System.out.println("(5.1) Arrays.toString(array) ----------");
        double[] a7 = randomArrayOfDoubles(7); // create an array of double filled with random values
        System.out.println("  show array's content: " + Arrays.toString(a7));
        
        // ---------------------------------------------------
        // SYNTAX: Arrays.fill(array, value) OR Arrays.fill(array, from, to, value)
        System.out.println("(5.2) Arrays.fill(array <, from, to>, value) ----------");
        double[] a9 = randomArrayOfDoubles(9); 
        System.out.println("  Original: " + arrayInfo(a9));
        Arrays.fill(a9, 3, 7, 11.0); // fill with the same value on a range: 3, 4, 5, 6
        System.out.println("  filled 3,7 with 11.0: " + arrayInfo(a9));
        Arrays.fill(a9, 7.0); // fill with the same value
        System.out.println("  filled all with 7.0: " + arrayInfo(a9));

        // ---------------------------------------------------
        // SYNTAX: Arrays.copyOf(array, length) OR Arrays.copyOfRange(array, from, to)
        System.out.println("(5.3) Arrays.copyOf(array, length) .copyOfRange(array, from, to) ----------");
        double[] a6 = randomArrayOfDoubles(6); 
        System.out.println("  Original: " + arrayInfo(a6));
        System.out.println("     0,4: " + arrayInfo(Arrays.copyOf(a6, 4)));
        System.out.println("     0,9: " + arrayInfo(Arrays.copyOf(a6, 9)));
        System.out.println("     2,5: " + arrayInfo(Arrays.copyOfRange(a6, 2, 5)));
        System.out.println("     4,8: " + arrayInfo(Arrays.copyOfRange(a6, 4, 8)));

        // ---------------------------------------------------
        // SYNTAX: System.arraycopy(srcArray, src_index, destArray, des_index, copy_count)
        // Both arrays must exist and have sizes for valid index accessing.
        System.out.println("(5.4) System.arraycopy(src, src_index, dest, dest_index, copy_count) ----------");
        System.out.println("  Source: " + arrayInfo(a7));
        System.out.println("  Before Copy: " + arrayInfo(a9));
        System.arraycopy(a7, 1, a9, 2, 5); // srcArray, src_index, destArray, des_index, copy_count
        System.out.println("  Copy(s, 1, d, 2, 5): " + arrayInfo(a9));
        
        // ---------------------------------------------------
        // SYNTAX: Arrays.sort(array) OR Arrays.sort(array, from, to) 
        System.out.println("(5.5) Arrays.sort(array <, from, to>) ----------");
        System.out.println("  Original: " + arrayInfo(a6));
        Arrays.sort(a6);
        System.out.println("      sort: " + arrayInfo(a6));
        System.out.println("  Original: " + arrayInfo(a7));
        Arrays.sort(a7, 1, 5);
        System.out.println("  sort 1,5: " + arrayInfo(a7));

        // ---------------------------------------------------
        // SYNTAX: Arrays.equals(array1, array2) OR Arrays.equals(array1, from1, to1, array2, from2, to2) 
        System.out.println("(5.6) Arrays.equals(array1 <, from1, to1>, array2 <, from2, to2> ) ----------");
        Object[] e0 = { 1, "two", null, 3f, false, -5 }; // auto-boxing for primitive types
        Object[] e1 = { 1, "two", null, 3.0, false, -5L };
        Object[] e2 = { 1, new String("two"), null, 3d, false, -5L };
        Object[] e3 = { "two", null, 3d, true, 4 };
        System.out.println("  e0: " + arrayInfo(e0));
        System.out.println("  e1: " + arrayInfo(e1));
        System.out.println("  e2: " + arrayInfo(e2));
        System.out.println("  e3: " + arrayInfo(e3));
        // equals => must be exactly the same type
        System.out.println("  Arrays.equals(e0, e1): " + Arrays.equals(e0, e1)); // false
        System.out.println("  Arrays.equals(e1, e2): " + Arrays.equals(e1, e2)); // true
        System.out.println("  Arrays.equals(e2, e3): " + Arrays.equals(e2, e3)); // false
        System.out.println("  Arrays.equals(e2, 1, 4, e3, 0, 3): " + Arrays.equals(e2, 1, 4, e3, 0, 3)); // true
        System.out.println("  Arrays.equals(e2, 3, 5, e3, 2, 4): " + Arrays.equals(e2, 3, 5, e3, 2, 4)); // false
        
        // ---------------------------------------------------
        // SYNTAX: Arrays.compare(array1, array2) OR Arrays.compare(array1, from1, to1, array2, from2, to2) 
        System.out.println("(5.7) Arrays.compare(array1 <, from1, to1>, array2 <, from2, to2> ) ----------");
        String[] c0 = { "one", "two", "passed" };
        String[] c1 = { "one", "two", "pass" };
        String[] c2 = { "one", "two", "past", null };
        String[] c3 = { "one", "two", "past", "present" };
        String[] c4 = { "one", "two", "post" };
        String[] c5 = { "one", "two", "post", null };
        String[] c6 = { "one", "two", new String("post"), null };
        String[] c7 = { "zero", "one", "two", "post", null, "end" };
        System.out.println("  c0: " + arrayInfo(c0));
        System.out.println("  c1: " + arrayInfo(c1));
        System.out.println("  c2: " + arrayInfo(c2));
        System.out.println("  c3: " + arrayInfo(c3));
        System.out.println("  c4: " + arrayInfo(c4));
        System.out.println("  c5: " + arrayInfo(c5));
        System.out.println("  c6: " + arrayInfo(c6));
        System.out.println("  c7: " + arrayInfo(c7));
        System.out.println("  Arrays.compare(c0, c1): " + Math.signum(Arrays.compare(c0, c1))); // +
        System.out.println("  Arrays.compare(c1, c2): " + Math.signum(Arrays.compare(c1, c2))); // -
        System.out.println("  Arrays.compare(c2, c3): " + Math.signum(Arrays.compare(c2, c3))); // -
        System.out.println("  Arrays.compare(c3, c4): " + Math.signum(Arrays.compare(c3, c4))); // -
        System.out.println("  Arrays.compare(c4, c5): " + Math.signum(Arrays.compare(c4, c5))); // -
        System.out.println("  Arrays.compare(c5, c6): " + Math.signum(Arrays.compare(c5, c6))); // 0
        System.out.println("  Arrays.compare(c4, 0, 3, c5, 0, 3): " + Math.signum(Arrays.compare(c4, 0, 3, c5, 0, 3))); // 0
        System.out.println("  Arrays.compare(c6, 0, 4, c7, 1, 5): " + Math.signum(Arrays.compare(c6, 0, 4, c7, 1, 5))); // 0
    }
    
    public static void demo06MultidimensionalArray() {
        
        System.out.println("--------------------------------");
        System.out.println("### [6] Demo of Multi-Dimensional Arrays ###");

        // multi-dimensional array : (same as 1-d arrays) 
        // can be used for primitive types and reference types 
        int[][] int2dAr1;
        int int2dAr2[][];
        int[] int2dAr3[]; // this is correct but it is a very bad style.

        int[][] int2dAr4 = { {00, 01, 02, 03} , {10, 11} , null, { }, {40, 41, 42}, {50, 51, 52, 53, 54} };
        
        // SYNTAX: Arrays.deepToString(array) : String ==> [[..., ..., ...], [..., ...], [..., ..., ..., ...]]
        System.out.println("(6.1) Arrays.deepToString(array) ----------");
        System.out.println("  : " + Arrays.deepToString(int2dAr4));

        System.out.println("(6.2) Accessing Multidimensional Arrays (don't need to have the same sizes) ----------");
        System.out.println("  at [2]: " + (int2dAr4[2] == null ? "NULL" : "(size=" + int2dAr4[2].length +")"));
        System.out.println("  at [3]: " + (int2dAr4[3] == null ? "NULL" : "(size=" + int2dAr4[3].length +")"));
        System.out.println("  at [4]: (size=" + int2dAr4[4].length + ") [4][1]: " + int2dAr4[4][1]);
        System.out.println("  at [5]: (size=" + int2dAr4[5].length + ") [5][3]: " + int2dAr4[5][3]);
        
        System.out.println("(6.3) Multidimensional Array on Reference Types ----------");
        Dummy[][] dm2dAr5 = {{ new Dummy(), new Dummy() } , { null, null, null }, { } , { null, new Dummy() } };
        System.out.println("  : " + Arrays.deepToString(dm2dAr5));
        for (Dummy[] ds : dm2dAr5) if (ds != null) System.out.println("  " + arrayInfo(ds));

        System.out.println("(6.4) Multidimensional Array on Reference Types with Irregular Depth ----------");
        Object[] o1 = { 3.141, null, 5.9, "StringObject", 7.11 }; // primitive as Object (auto-boxing)
        Object[] o2 = { "one", "two", null, "three" };
        Object[] o3 = { o1, 3, o2, "four" };
        Object[] o4 = { new Dummy(), "LAST" };
        Object[] o5 = { 1.732, o3, "SomeString", new Dummy(), null, o4 };
        System.out.println("  : " + Arrays.deepToString(o5));
        
        System.out.println("(6.5) Recursively traverse Irregular Multidimensional Array ----------");
        Object[] a0 = { };
        Object[] a1 = { "level2a", null, a0 };
        Object[] a21 = { "level3a", a0, "something" };
        Object[] a22 = { null, a0 };
        Object[] a2 = { "level2b", a21, a0, a22 };
        Object[] a311 = { "level4a", a0, null };
        Object[] a312 = { "anything" };
        Object[] a31 = { "level3a", a311, null, a312 };
        Object[] a32 = { "nothing", a0 };
        Object[] a3 = { "level2c", a31, a32 };
        Object[] a ={ "level1", a1, a2, a3 };
        System.out.println("Arrays.deepToString()\n" + Arrays.deepToString(a));
        System.out.println("Custom Array ToString()\n" + arrayToString(a));
    }
    
    static String arrayToString(Object[] array) {
        if (array == null) return null;
        var result = new StringBuilder();
        arrayToString(array, "   ", 0, result);
        return result.toString();
    }
    
    static void arrayToString(Object[] array, String indent, int depth, StringBuilder result) {
        var step = indent.repeat(depth);
        var nextStep = step + indent;
        if (array.length == 0) result.append("{EMPTY}");
        for (int i = 0; i < array.length; ++i) {
            if (i == 0) // do this before the first element
                result.append("{").append("size=").append(array.length).append(":\n").append(nextStep); 
            else // do this before each element that is not the first element
                result.append(", "); 
            if (array[i] == null) // do this if this element is null
                result.append("NULL");
            else // do this if this element is not null
                if (array[i].getClass().getName().startsWith("[")) // do this if this element is an array
                    arrayToString((Object[]) array[i], indent, depth+1, result);
                else result.append(array[i].toString()); // do this if this element is not an array
            if (i == array.length -1)  // do this after the last element
                result.append("\n").append(step).append("}"); 
        }
    }
    
    // accessing array info
    static String arrayInfo(Object[] a) { return String.format("[%d]: %s", a.length, Arrays.toString(a)); }
    static String arrayInfo(double[] a) { return String.format("[%d]: %s", a.length, Arrays.toString(a)); }
    static String arrayInfo(int[] a) { return String.format("[%d]: %s", a.length, Arrays.toString(a)); }
    static String arrayInfo(boolean[] a) { return String.format("[%d]: %s", a.length, Arrays.toString(a)); }
    // generating random values
    static Dummy randomDummy() { return new Dummy(); }
    static double[] randomArrayOfDoubles(int size) {
        var a = new double[size>0 ? size : 10];
        for (int i = 0; i < a.length; ++i) a[i] = Math.floor(10000.0 * Math.random()/100.0);
        return a;
    }
}

// this is a dummy class for generating random objects
// with some helper methods for convenience of this demonstration
class Dummy {
    private static int currentId = 0;
    private final int id; 
    private double x;
    // constructors
    Dummy(double x) { id = ++currentId; this.x=x;}
    Dummy() { this(randomDouble()); }
    // getters & setters
    int getId() { return id; }
    double getX() { return x; }
    void setX(double x) { this.x = x; }
    void changeX() { x = randomDouble(); }
    // overriding object's methods
    @Override public String toString() { return String.format("(%d:%.2f)", id, x); }
    @Override public int hashCode() { return (int) (101 * x); }
    @Override public boolean equals(Object o) { // compare only the x value 
        return this == o || o != null && this.getClass() == o.getClass() 
                && Math.abs(this.x - ((Dummy) o).x) <= 1E-6; 
    }
    static double randomDouble() { return Math.floor(1E6 * Math.random() % 10100.0)/100.0; }
}
