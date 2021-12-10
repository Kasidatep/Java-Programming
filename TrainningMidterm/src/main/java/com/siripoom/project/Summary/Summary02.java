package com.siripoom.project.Summary;
import java.util.Scanner;
public class Summary02 {
    public static void main(String[] args) {
        menu();
    }
    public static void menu()
    {
        Scanner sc = new Scanner(System.in);
        int num;
        int width , height;
        int t_base ,t_height;
        float r;

        do {
            System.out.println("==========Find Area==========");
            System.out.println("Square   -- 1");
            System.out.println("Triangle -- 2");
            System.out.println("Circle   -- 3");
            System.out.println("Exit     -- 0");
            System.out.println("=============================");
            System.out.print("Enter Number : ");
            num = sc.nextInt();

            switch (num) {
                case 1: //Square
                    System.out.print("Enter number of width:  ");
                    width = sc.nextInt();
                    System.out.print("Enter number of height:");
                    height = sc.nextInt();
                    int ans = areaSquare(width, height);
                    System.out.printf("Area of square : %d\n", ans);
                    break;
                case 2: //Triangle
                    System.out.print("Enter number of base : ");
                    t_base = sc.nextInt();
                    System.out.print("Enter number of height : ");
                    t_height = sc.nextInt();
                    float t_ans = areaTriangle(t_base, t_height);
                    System.out.println("Area of triangle :  "+ t_ans);
                    break;
                case 3: //Circle
                    System.out.print("Enter number of r :  ");
                    r = sc.nextFloat();
                    float r_ans = areaCircle(r);
                    System.out.printf("Area of circle : %2f\n ", r_ans);
                    break;
            }
        }while (num != 0);
    }
    public static int areaSquare(int width,int height){
        return  width*height;

    }

    public static float areaTriangle(int t_base, int t_height){
        return (float) ((0.5)* t_base * t_height);
    }

    public static float areaCircle(float r){
        return (float) (Math.PI * r * r);
    }
}
