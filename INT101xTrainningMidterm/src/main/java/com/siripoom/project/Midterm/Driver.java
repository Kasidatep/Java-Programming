package com.siripoom.project.Midterm;

public class Driver {

    public static void main(String[] args) {
        int num = 15;
        System.out.println(num + " is " + (isPrime(num) ? "": "not ") + "a prime number ");
    }
    public static boolean isPrime(int num){
      for(int x = 2;x < num;x++){
          if(num % x == 0){
              return  false;
          }
      }
        return true;
    }

}
