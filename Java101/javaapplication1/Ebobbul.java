package javaapplication1;

import java.util.Scanner;

public class Ebobbul {
    public static int ebobbulma(int a,int b){
        int ebob=1;
        for(int i=1;i<=a && i<=b;i++){
            if((a%i==0)&&(b%i==0)){
                ebob =i;
            }
        }
        return ebob;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci sayı gir : ");
        int sayi1 = scanner.nextInt();
        System.out.println("İkinci gir : ");
        int sayi2 = scanner.nextInt();
        System.out.println("İki sayının ebobu = "+ebobbulma(sayi1,sayi2));
        
    }
    
}
