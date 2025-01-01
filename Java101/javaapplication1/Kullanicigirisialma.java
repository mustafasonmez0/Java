
import java.util.Scanner;


public class Kullanicigirisialma {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); /*
        System.out.println("Yaşınızı giriniz : ");
        int yas= scanner.nextInt();
        System.out.println("Yaşınız "+yas); 
        
        double sayi = scanner.nextDouble();
        System.out.println("Sayı giriniz :"+sayi);
       
        String yazi = scanner.nextLine();
        System.out.println("Yazı : " +yazi);  */
        // Bu alttakileri entere basınca bida input istemediği için yaptık nextline ile enter yani \n bir karakter olarak algılanmadı.
        //önce stringi alsak bu hatayla karşılaşmazdık.
        /*
        int yas= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Yaşınız "+yas); 
        
        double sayi = scanner.nextDouble();
        System.out.println("Sayı giriniz :"+sayi);
       
        String yazi = scanner.nextLine();
        System.out.println("Yazı : " +yazi); */
        
        int yas1=scanner.nextInt();
        int yas2=scanner.nextInt();
        int yas3=scanner.nextInt();
        System.out.println("yas1 : "+yas1 +"yas2: "+yas2+"yas3: "+yas3);
        // NOT: JAVADA MESELA YAS 1 de entere basmasak boşluk bıraksak da ayrı ayrı giriş olarak alıyo.
    }
    
}
