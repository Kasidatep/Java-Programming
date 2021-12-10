package com.siripoom.project.Midterm;

public class Rectangle01 {
    double width,height,area,perimeter;

//    public Rectangle01 (){
//        this.width = width;
//        this.height = height;
//    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        this.area = this.width * this.height;
        return area;
    }

    public double getPerimeter() {
        this.perimeter = 2*(this.width+this.height);
        return perimeter;
    }
}
