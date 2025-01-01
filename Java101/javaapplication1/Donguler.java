
import java.util.Scanner;

public class Donguler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i ;
        int sayi;
        int fakt=1;
        System.out.println("Faktoriyelini bulmak istediğiniz sayıyı giriniz : ");
        sayi=scanner.nextInt();
        for(i=1;i<=sayi;i++){
            fakt*=i;
            
        }
        System.out.println("Sayının faktoriyeli = "+fakt);
    }
    
}
