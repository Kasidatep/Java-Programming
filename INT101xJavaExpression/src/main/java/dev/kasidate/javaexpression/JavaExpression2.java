package dev.kasidate.javaexpression;
 
    public class JavaExpression2 {     
        public static void main(String[] args) {
            System.out.println("Hi");
            int i = 1; 
            int q = 1 ;
            for(int a = 1; a <= i ; a++ ){
                System.out.println(a +" :  choice " + (i-a) + " !" );
            }
            int s = i - q ;
            if( s == 0 ){
                System.out.println("Hey!!");
            }
        }
    }
