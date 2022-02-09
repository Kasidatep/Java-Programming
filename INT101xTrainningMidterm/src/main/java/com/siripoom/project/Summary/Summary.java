package com.siripoom.project.Summary;
import java.util.Scanner;
public class Summary {
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        int num;
        int width, height;
        int t_base, t_height;
        float r;
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
                    System.out.print("Enter number for base: ");
                    t_base = sc.nextInt();
                    System.out.print("Enter number for height: ");
                    t_height = sc.nextInt();
                    float t_ans = areaTriangle(t_base, t_height);
                    System.out.println("Area of triangle : " + t_ans);
                    break;
                case 3:
                    System.out.print("Enter number for R: ");
                    r = sc.nextFloat();
                    float r_ans = areaCircle(r);
                    System.out.println("Area of circle : " + r_ans);
            }
        }while (num != 0);
    }

    public static int areaSquare(int width, int height){
        return width*height;  // 10 --> "10"
    }

    public static float areaTriangle(int base, int height){
        return (float) ((0.5) * base * height);
    }

    public static float areaCircle(float r){
        return (float) (Math.PI * r * r);
    }
}

