package com.siripoom.project.Midterm;

public class Rectangle {
    double width;
    double height;
    double area;
    double perimeter;

    public Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        this.area = width*height;
        return area;
    }

    public double getPerimeter() {
        this.perimeter = 2*(width*height);
        return perimeter;
    }
}
