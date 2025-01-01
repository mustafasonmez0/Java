package javaapplication1;

public class Özyinelemelifonksiyonlar {
    public static int toplama(int a,int b,int c){
        return (a+b+c);
    }
    public static int ikilecarp (int a){
        return 2*a;
    }
    public static int ikiiletopla (int a){
        return a+2;
    }
    public static int dortilecarp (int a){
        return 4*a;
    }
    
    public static void main(String[] args) {
        dortilecarp(ikiiletopla(ikilecarp(5)));
        System.out.println("Toplama = "+dortilecarp(ikiiletopla(ikilecarp(toplama(5, 60, 70)))));
    }
}
