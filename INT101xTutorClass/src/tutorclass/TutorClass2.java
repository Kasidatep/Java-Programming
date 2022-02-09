package tutorclass;

import java.util.Scanner;

public class TutorClass2 {

    public static void main(String[] args) {
    menu();
}
public static void menu(){
    Scanner sc = new Scanner(System.in);
    int num;
    float width, height, base, radius;
    
    do{
        System.out.println("==============Find area==============");
        System.out.println("square   -- 1");
        System.out.println("triangle -- 2");
        System.out.println("circle   -- 3");
        System.out.println("Exit     -- 0");
        System.out.println("=====================================");
        System.out.print("Enter number: ");
        num = sc.nextInt();
        switch (num){
            case 1:
                System.out.print("Enter number for width: ");
                width = sc.nextFloat();
                System.out.print("Enter number for height: ");
                height = sc.nextFloat();
                float ans = areaSquare(width, height);
                System.out.printf("Area of square : %f\n", ans);
                break;
            case 2:
                System.out.print("Enter number for base: ");
                base = sc.nextFloat();
                System.out.print("Enter number for height: ");
                height = sc.nextFloat();
                float anstriangle = areatriangle(base, height);
                System.out.printf("Area of Triangle : %.2 f\n", anstriangle);
                break;
            case 3:
                System.out.print("Enter number for radius: ");
                radius = sc.nextFloat();
                float anscircle = areacircle(radius);
                System.out.printf("Area of Circle : %.2f\n", anscircle);
                break;
        }
    }while (num != 0);
            
}

    public static float areaSquare(float width, float height){
    return width*height;  
}
    public static float areatriangle(float base, float height){
    return base*height/2;  
}
    public static float areacircle(float radius){
        return (float) ((Math.PI)*radius*radius);  
}
}