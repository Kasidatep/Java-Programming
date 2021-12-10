package dev.kasidate.int101class15taskinclass;

import java.util.Scanner;

public class EndgameCollection {

    public static void main(String[] args) {
        System.out.println("RUN");
        loop();
       //
    }

    public static void loop() {
        var scan = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Choose the following Menu:");
            System.out.println(" 1: Create a course");
            System.out.println(" 2: List all courses");
            System.out.println(" 3: Find a course");
            System.out.println(" 0: Exit");
            System.out.print("Your choice is : ");
            choice = scan.nextInt();
            switch (choice) {
                case 1 ->
                    createCourse();
                case 2 ->
                    listCourses();
                case 3 ->
                    findCourse();
            }
  
        ​while(choice != 0){
        System.out.println("Good Bye.");
        }
    }
        }
    public static void createCourse() {
        System.out.println("createCourse");
    }
public static void listCourses() {
            System.out.println("listCourses");
}
public static void findCourse() {
            System.out.println("findCourse");
}
}
