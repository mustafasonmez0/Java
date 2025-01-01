import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        char c2 ='\uface';
        System.out.println(""+c2);
        System.out.println("Birinici kenarı giriniz : ");
        a=scanner.nextInt();
        System.out.println("İkinci kenarı giriniz : ");
        b=scanner.nextInt();
        double h = Math.sqrt(a*a + b*b);
        System.out.println("Hipotenüs = "+h);
        
    }
    
}
