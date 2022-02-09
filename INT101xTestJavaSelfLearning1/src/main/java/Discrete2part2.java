
import java.util.Scanner;

public class Discrete2part2 {
    public static void main(String[] args) {
    menu();
    }
    public static void menu(){
    Scanner ac = new Scanner(System.in);  
    System.out.println("Enter a ");
    String sa = ac.next();  
    System.out.println("a is: " + sa); 
    Scanner bc = new Scanner(System.in);  
    System.out.println(" b ");
    String sb = bc.next();  
    System.out.println("b is: " + sb);  
    int a = Integer.parseInt(sa);  
    int b = Integer.parseInt(sb);  
    System.out.println( (a) + " / " + (b));
   System.out.print("Divisible is : "+ divisible(a,b));
   System.out.println(" ------- Mod is : "+mod(a,b));
   
    }
    private static float divisible(int a, int b){    
          float sum ;
          sum = a/b ;
          return sum;
    }
    private static float mod(int a, int b){    
          float mod ;
          mod = a%b ;
          return mod;
    }


}