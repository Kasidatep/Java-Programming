package dev.kasidate;

public class Main {

    public static void main(String[] args) {
        hello();
        int a =8;
        switch (a){
            case 1: System.out.println("1");break;
            case 2: System.out.println("2");break;
            case 3: System.out.println("3");break;
            case 4: System.out.println("4");break;
            case 5: System.out.println("5");break;
            case 6: System.out.println("6");break;
            case 7: System.out.println("7");break;
            case 8: System.out.println("8");break;
            //case 9: continous;
    }
    }
    public static void hello(){
        System.out.println("Hello");
        double x =  843.66;
        double y = 843.66;
        if (x>y){
            System.out.println(x +" > "+ y);
        } else if (x == y){
            System.out.println(x+" = "+y  );
        } else if(x < y){
            System.out.println(x + " < "+ y);
        }
    }
}
