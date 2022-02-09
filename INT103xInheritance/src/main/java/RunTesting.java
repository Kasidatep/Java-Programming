
import geometric.Circle;
import geometric.Rectangle;

public class RunTesting {
    
    public static void main(String[] args) {
        System.out.println("**********************************");
        var a = new Rectangle(2.3,23.1,"WHITE");
        System.out.println(a);
        System.out.println("Perimeter : " + a.getPerimeter());
        System.out.println("Area : " + a.getArea());
        System.out.println("Color : " + a.getColor());
        System.out.println("Width : " + a.getWidth());
        a.setWidth(25.2);
        System.out.println(a);
        System.out.println("Perimeter : " + a.getPerimeter());
        System.out.println("**********************************");
        var b = new Circle(27.12,"BLUE");
        System.out.println(b);
        System.out.println("Perimeter : " + b.getPerimeter());
        System.out.println("Area : " + b.getArea());
        System.out.println("Color : " + b.getColor());
        System.out.println("Redius : " + b.getRedius());
        b.setRedius(25.2);
        System.out.println(b);
        System.out.println("Redius : " + b.getRedius());
        System.out.println("**********************************");
    }
    
}



