
import java.util.Scanner;

public class dowhilerakamlartoplami {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
   
        System.out.println("Sayı giriniz : ");
        int sayi= scanner.nextInt();
        int toplam =0;
        do {
            toplam=toplam + (sayi%10);
            sayi=sayi/10;
            
        }while(sayi>0);
        System.out.println("Rakamlar toplamı : "+toplam);
        
}
}
