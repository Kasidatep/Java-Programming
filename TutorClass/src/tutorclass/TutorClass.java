package tutorclass;

import java.util.Scanner;

public class TutorClass {

    public static void main(String[] args) {
    menu();
}
public static void menu(){
    Scanner sc = new Scanner(System.in);
    int num;
    int width, height, radius;
    
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
                width = sc.nextInt();
                System.out.print("Enter number for height: ");
                height = sc.nextInt();
                int ans = areaSquare(width, height);
                System.out.printf("Area of square : %d\n", ans);
                break;
            case 2:
                System.out.print("Enter number for width: ");
                width = sc.nextInt();
                System.out.print("Enter number for height: ");
                height = sc.nextInt();
                int anstriangle = areatriangle(width, height);
                System.out.printf("Area of Triangle : %d\n", anstriangle);
                break;
            case 3:
                System.out.print("Enter number for radius: ");
                radius = sc.nextInt();
                int anscircle = areacircle(radius);
                System.out.printf("Area of Circle : %d\n", anscircle);
                break;
        }
    }while (num != 0);
            
}

    public static int areaSquare(int width, int height){
    return width*height;  
}
    public static int areatriangle(int width, int height){
    return width*height/2;  
}
    public static int areacircle(int radius){
        return 22/7*radius*radius;  
}
}