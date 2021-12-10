package Kasidate.time;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        welcome();
    }
    public static void welcome(){
        System.out.println(" ***************** Time Duration Machine ****************** ");
        System.out.println(" ************************ Log In ************************* ");
        Scanner getUser = new Scanner(System.in);
        System.out.print("Enter your username : ");
        long user = getUser.nextLong();
        if(user == 004){
            System.out.println("Log In Failed {Close Program}");
            welcome();
        } else{
            Scanner getPW = new Scanner(System.in);
            System.out.print("Enter your password : ");
            int password = getPW.nextInt();
            if (password == 254519){
                System.out.println(" ***************** Log In Complete ***************** ");
                run();
            } else {
                System.out.println("PassWord is not corect");
                welcome();
            }
            
            
        }
    }
    public static void run(){
        SetTime a = new SetTime(485141);
        SetTime b = new SetTime(5,14,45,41);
        a.changeToText();
        System.out.println(a.changeToText());
        System.out.println(b.changeToSeconds());
    }

}
