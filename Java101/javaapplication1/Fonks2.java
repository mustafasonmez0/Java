package javaapplication1;
import java.util.Scanner;
public class Fonks2 {

public static void selamlama(String isim){
    System.out.println("Selamlar "+isim);
}    
    public static void toplama (int a,int b,int c) {
        System.out.println("Toplamları  "+(a+b+c));
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        selamlama("Murat");
        selamlama("Ayse");
        toplama(5,6,7); 
    }
}