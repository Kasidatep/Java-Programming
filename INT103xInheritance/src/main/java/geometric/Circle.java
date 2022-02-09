package geometric;

import geometry.Shape;

public class Circle extends Shape {
    
    private double redius;
    
    public Circle(double redius, String color){
        super(color);
        this.redius = redius;
    }

    public double getRedius() {return redius;}

    public void setRedius(double redius) { this.redius = redius; }
    
     @Override
    public double getArea(){
        return Math.PI*redius*redius;
    }
    
    @Override
    public double getPerimeter(){
        return Math.PI*2*redius;
    }

    @Override
    public String toString() {
        return "Circle{" + "redius=" + redius + " color : " + color + '}';
    }
     
}


