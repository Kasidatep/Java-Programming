package geometry;

public interface Measurable {
    double getArea();
    double getPerimeter();
    public default double getAreaPerPerimeter(){
        return getArea()/getPerimeter();
    }
}


