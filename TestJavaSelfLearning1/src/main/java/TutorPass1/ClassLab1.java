package TutorPass1;

import java.util.Scanner;


public class ClassLab1 {
    public static void main(String[] args) {
    menu();
}
public static void menu(){
    Scanner sc = new Scanner(System.in);
    int num;
    int width, height;
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
                System.out.println("case2");
                break;
            case 3:
                System.out.println("case3");
                break;
        }
    }while (num != 0);
}

public static int areaSquare(int width, int height){
    return width*height;  // 10 --> "10"
}
 
}
