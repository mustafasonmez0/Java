package javaapplication1;

import java.util.Scanner;

public class Whiledongusu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //While kullanımı while(Döngü koşulu) { }
        int i=1;
        int fakto = 1;
        int sayi=scanner.nextInt();
                /*
        while(i<=sayi){
         
        fakto*=i;
        i++;
        }
        System.out.println("Sayının faktoriyeli : "+fakto); */
        //2.Yöntem ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
        while(sayi>0){
            fakto*=sayi;
            sayi--;
        }
        System.out.println("Sonuç : "+fakto);
    }
}
