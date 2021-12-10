import sit.bscit.unitchain.Unit;
//64130500004
public class Test {
    
    
    public static void main(String[] args) {
        Unit centimeter = new Unit("centimeter");
        Unit kilometer = new Unit("kilometer");
        Unit meter = new Unit("meter");
        Unit inch = new Unit("inch");
        Unit foot = new Unit("foot");
        Unit yard = new Unit("yard");
        Unit mile = new Unit("mile");
        centimeter.setLargerUnit(meter, 100.0); // 100.0 centimeters = 1.0 meter
        meter.setLargerUnit(kilometer, 1_000.0); // 1_000.0 
        inch.setLargerUnit(foot, 12);
        foot.setLargerUnit(yard, 3);
        yard.setLargerUnit(mile, 1_760);
        
          System.out.println("");
          System.out.println("");
        System.out.println("-----------------------------------------------------------------");
         double a = inch.convertFromLarger("foot", 50000);
         double b = inch.convertToLarger("foot", 50000);
         double c = inch.convertToLarger("mile", 85255555);
         
         System.out.println("inch.convertFromLarger foot : " + a);
         System.out.println("inch.convertToLarger foot : " + b);
         System.out.println("inch.convertToLarger mile : " + c);
         
           System.out.println("-----------------------------------------------------------------");
           
         double h = centimeter.convertFromLarger("meter", 50850);
         double i = centimeter.convertToLarger("meter", 50040);
         double j = centimeter.convertToLarger("kilometer", 8525555);
         
         System.out.println("centimeter.convertFromLarger meter : " + h);
         System.out.println("centimeter.convertToLarger meter : " + i);
         System.out.println("centimeter.convertToLarger kilometer : " + j);
         
         System.out.println("-----------------------------------------------------------------");
         
         System.out.println("Yard getName : " + yard.getName());
         System.out.println("Yard getLargerUnitName : " + yard.getLargerUnitName());
         System.out.println("Yard getRate : " + yard.getRate());
        
          System.out.println("-----------------------------------------------------------------");
         
         System.out.println("meter getName : " + meter.getName());
         System.out.println("meter getLargerUnitName : " + meter.getLargerUnitName());
         System.out.println("meter getRate : " + meter.getRate());
        
          System.out.println("-----------------------------------------------------------------");
         
         System.out.println("kilometer getName : " + kilometer.getName());
         System.out.println("kilometer getLargerUnitName : " + kilometer.getLargerUnitName());
         System.out.println("kilometer getRate : " + kilometer.getRate());
        
        
         System.out.println("-----------------------------------------------------------------");
        
         double d = yard.convertToLarger("foot", -225);
         System.out.println("yard convertToLarger foot ** when value < 0 : " + d);
         
         System.out.println("-----------------------------------------------------------------");
        
         double e = yard.convertToLarger("yard", 225);
         System.out.println("yard convertToLarger foot ** when Name == LargerUnitName : " + e);
       
         System.out.println("-----------------------------------------------------------------");
        
          Unit test = new Unit("test");
          Unit test2 = new Unit("test2");
          test.setLargerUnit(test2, 0.3);
          double f = test.convertToLarger("test2", 2725);
          System.out.println("when rate <= 1.0 / convertToLarger : " + f);
       
          System.out.println("-----------------------------------------------------------------");
         
          double g = test.convertToLarger("", 2425);
          System.out.println("when larger unit is null / convertToLarger : " + g);
          
          System.out.println("-----------------------------------------------------------------");
          
         Unit name = new Unit("");
         System.out.println("When Name is Blank : " + name.getName());
       
          System.out.println("");
          System.out.println("");
          System.out.println("");
          System.out.println("");
          System.out.println("");
        // Q.6 move all the test in this main() to another class outside this package.
        // Q7. try it on another unit system, i.e., inch, foot, yard, and mile.
        // You must try all methods and also try exception cases.
    }
}
