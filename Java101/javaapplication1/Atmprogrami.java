import java.util.Scanner;


public class Atmprogrami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bakiye = 1000;
        String islemler = "1. İşlem Bakiye Öğrenme\n" 
                + "2.İşlem Para Yatırma\n" 
                + "3.İşlem Para Çekme\n"
                +"Çıkış için Q'ya basın.\n";
        System.out.println("*************************");
        System.out.println(islemler);
        System.out.println("**************************");
        
        while(true){
            System.out.println("İşlem Se çiniz : ");
            String islem = scanner.nextLine();
            if(islem.equals("q")){
                System.out.println("Programdan çıkılıyor.");
                break;
                
            }
            else if (islem.equals("1")) {
                System.out.println("Bakiyeniz : "+bakiye);
            }
            else if(islem.equals("2")){
                System.out.println("Yatırmak istediğiniz tutarı giriniz : ");
                int ekle = scanner.nextInt();
                scanner.nextLine();
                bakiye+=ekle;
                System.out.println("Güncel bakiyeniz : "+bakiye);
                
            }
            
            else if(islem.equals("3")){
                System.out.println("Çekmek istediğiniz tutarı giriniz : ");
                int cek=scanner.nextInt();
                scanner.nextLine();
                if(bakiye-cek<0){
                    System.out.println("Yetersiz bakiye");
                   
                }
                else{ 
                    bakiye-=cek;
                    System.out.println("Güncel bakiyeniz : "+bakiye);
                    continue;
                }
            }
            else {
                System.out.println("Geçersiz işlem...");
            }
    }
    
} }
