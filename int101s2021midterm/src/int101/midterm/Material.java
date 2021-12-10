/*
C. Implement a class named Material, in a package named int101.midterm, as follow:
    1. This class contains the following three private instance variables (of type double) named: 
        mass (in grams), volume (in cc), and density (in g./cc.) where density cannot be changed.
    2. Write the following public non-static methods:
        2.1) A constructor that receives a mass and a volume to set its internal states 
                (i.e., mass and volume). The density is set to mass/volume (i.e., mass divided by volume).
        2.2) A constructor that receives a density to set its internal state.
                Its internal states, which are mass and volume, are set to 0.
        2.3) Three getter methods, one for each field (i.e., mass, volume, density).
        2.4) Two setter methods, one for mass and the other for volume. 
                Note that when the mass or the volume is changed, 
                the other one must be updated accordingly to preserve the density.
        2.5) One toString() method to return a string containing its mass, volume, and density.
    3. Create another class named MaterialTester, not in any package.
        (continue Part 3 & 4 in MaterialTester.java)
Note:
You must do all the calculation programmatically 
without doing any part manually or by using a calculator. 
You must use the naming conventions for all constants, variables, and methods. 
 */
package int101.midterm;

public class Material {
    
    // C.1 private non-static fields
    private final double density;
    private double mass;
    private double volume;
    
    // C 2.1) constructor with mass and volume
    public Material(double mass, double volume) {
        this.mass = mass;
        this.volume = volume;
        density = mass/volume;
    }
    
    // C 2.2) constructor with density
    public Material(double density) { this.density = density; }
    
    // C 2.3) three getters for mass, volume, and density
    public double getMass() { return mass; }
    public double getVolume() { return volume; }
    public double getDensity() { return density; }
    
    // C 2.4 two setters for mass and volume
    public void setMass(double mass) { 
        this.mass = mass;
        this.volume = mass/density;
    }
    public void setVolume(double volume) {
        this.volume = volume;
        this.mass = volume * density;
    }
    
    // C 2.5 toString() method returns mass, volume, and density
    @Override
    public String toString() {
        return "mass=" + mass + " grams; volume=" + volume + " cc. (density=" + density + " g./cc.)";
    }
}

// C.3 in MaterialTester.java
