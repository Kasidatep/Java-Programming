/*
C. (Part 3 & 4: continued from Material.java)
    3. Create another class named MaterialTester, not in any package, 
        and create a public static void main method that does the following:
        3.1) Create two objects from Material class: one from each constructor.
                Construct the two objects with different positive values for mass, volume, and density.
        3.2) Print both objects out using System.out.println().
        3.3) Call the mass setter on one object and call the volume setter on the other object.
        3.4) Print both objects out using System.out.println().
    4. Run the MaterialTester class, and screen capture the result.
Note:
You must do all the calculation programmatically 
without doing any part manually or by using a calculator. 
You must use the naming conventions for all constants, variables, and methods. 
 */

import int101.midterm.Material;

// C.3 MaterialTester class not in any package
public class MaterialTester {

    // C.3 public static void main() method
    public static void main(String[] args) {
        
        // C 3.1) create two Material objects: one from each constructor
        Material m1 = new Material(38.55, 50.12);
        Material m2 = new Material(3.30);
        
        // C 3.2) print both objects out
        System.out.println("m1: " + m1);
        System.out.println("m2: " + m2);
        
        // C 3.3) call mass setter on one object and volume setter on the other object
        m1.setMass(10.8);
        m2.setVolume(10.09);
        
        // C 3.4) print both objects out
        System.out.println("m1: " + m1);
        System.out.println("m2: " + m2);
    }
}
