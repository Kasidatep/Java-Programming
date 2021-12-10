/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sit.bscit.unitchain;

/**
 *
 * @author Kasidatep
 */
public class LoopTesting {
    public static void main(String[] args) {
    
          System.out.println("----------  Loop Testing   ----------  \n ");
          int faccount = 5;
          factorial(faccount);
        
        }
    
    //**********************  Factorial *********************
    
      public static void factorial(int faccount){
          System.out.println(" ----------  Factorial   ---------- ");
           
           int result = 1;
        
        for(int start = 1; start <= faccount ; start ++){
            result *= start;
            System.out.println("Result of " +start +"! = " + result);
        }
        
    }
   
   
    
}
