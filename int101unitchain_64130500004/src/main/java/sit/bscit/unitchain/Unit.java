package sit.bscit.unitchain;

// Assignment #5 : INT101 on class-object and conditional. 64130500004

/**
 * This class represents a unit of measurement.
 * It has three instance variables: <br/>
 * (1) <code>name (String)</code>: an immutable unit name, <br/>
 * (2) <code>largerUnit (Unit)</code>: a reference to it's larger unit;
 * for example, a larger unit of "meter" could be "kilometer", <br/>
 * (3) <code>rate (double)</code>: the conversion rate between this unit 
 * and its larger unit; for example, if this unit is "meter" 
 * and its larger unit is "kilometer", then "rate" is 1000.0.
 */
public class Unit {

 
    /**
     * The name of this unit of measurement.
     */
    private final String name;
 
  
    /**
     * The reference to the larger unit of this unit.
     */
    private Unit largerUnit;
    
    /**
     * The rate to convert this unit to the larger unit.
     */
    private double rate;
    
    /**
     * Constructor 
     * @param name the name of this unit.
     */
    public Unit(String name) {
        // Q.1 if the name is blank or null, set it to "unknown" 
        
        if(name == null || name.isBlank()){
            this.name = "unknown";
        } else {this.name = name;}  
        
        this.largerUnit = null;
        this.rate = 0.0;
    }
    
    /**
     * Setting the larger unit and the conversion rate.
     * @param largerUnit the larger unit of this unit
     * @param rate the conversion rate
    
     */
    public void setLargerUnit(Unit largerUnit, double rate ) {   
        // Q.2 the larger unit must not be the unit itself or null 
        // and the rate must be a positive number larger than 1.0
        // otherwise, do nothing (both parameters must be set together).
        if(largerUnit.name.equals(name) || rate < 1.0){
             this.rate = 1.0;
        } else if( largerUnit == null ){
              this.largerUnit = null;
        }   else { 
        this.largerUnit = largerUnit;
        this.rate = rate;
        }
    }
    
    
    @Override
    public String toString() { return name; }
    public String getName() { return name; }
    public double getRate() { return rate; }
    
    // Q.3 should return null if largerUnit is null,   
    // otherwise return the name of the larger unit
    public String getLargerUnitName() {
        if(largerUnit == null){  return null; }
        else { return largerUnit.name; }
    }
    /**
     * Converting the value in this unit to the value in the larger unit
     * @param name the name of the larger unit to convert to
     * @param value the value in this unit to convert
     * @return the value in the larger unit to convert to
     */
    public double convertToLarger(String name, double value) {
        // Q.4 if this unit does not have a larger unit or 
        // it cannot find a matched larger unit name, then return zero.
        // If the parameter "name" is null or "value" <= 0.0, then return zero.
        double larger = value/rate;
        if(largerUnit == null || name == null || value <= 0.0){ return 0; }  
        else if (largerUnit.name.equals(name)) return larger;
        return largerUnit.convertToLarger(name, larger);
    }
    
    public double convertFromLarger(String name, double value) {
        // Q.5 this method is opposite to convertToLarger(...)
        // This method converts the "value" in the larger unit 
        // to the value in this unit and return the result.
        // design exception cases appropriately.
        double larger = value*rate;
        if(largerUnit == null || name == null || value <= 0.0){   return 0; }  
        else if (largerUnit.name.equals(name)) return larger;
        return largerUnit.convertFromLarger(name, larger);
    }
}
