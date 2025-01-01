package javaapplication1;

import java.util.Scanner;

public class Fonksiyonlar {
    public static void selamlama(){
        System.out.println("Merhaba nasılsınız");
        System.out.println("Selamlar...");
    }
    public static void faktoriyel(){
        Scanner scanner = new Scanner(System.in);
        int fakt=1;
        int i,sayi;
        System.out.println("Sayı gir : ");
        sayi=scanner.nextInt();
        for(i=1;i<=sayi;i++){
            fakt*=i;
        }
        System.out.println("Sayının faktoriyeli = "+fakt);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        selamlama();
        int a;
        faktoriyel();
    }
    
}
