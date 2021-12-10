package int101.part1;

public class UnitAndValue {  // immutable object
    
    private final String name;
    private final int value; 
    
    public UnitAndValue(String name, int value) {
        this.name = name;
        this.value = value;
    }
    
    public String getName() { return name; }
    public int getValue() { return value; }

  //  @Override
  //  public String toString() { return value + " " + name; }
    
}
