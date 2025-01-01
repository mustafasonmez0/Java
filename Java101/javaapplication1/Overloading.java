package javaapplication1;
public class Overloading {
    public static void toplama(String a,String b){
        System.out.println(a+""+b);
    }
    
    public static void toplama(int a,int b) {
        System.out.println("Toplamları = "+(a+b));
        
    }
    public static void toplama(int a,int b, int c){
        System.out.println("Toplamları =  " +(a+b+c));
    }
    public static void skorhesapla (String isim,int puan){
        System.out.println(isim + " Adlı oyuncunun puanı = " +puan + "Puanı var.");
    }
    public static void skorhesapla (int puan){
            System.out.println("İsimsiz oyunucunun " +puan +" Puanı var.");
}
    public static void skorhesapla (String isim){
        System.out.println(isim+ " Adlı oyuncunun hiç puanı yok");
    }
    public static void main(String[] args) {
       /* toplama(1,2,3);
        toplama(3,4);
        toplama("Etebo\n","Gol"); */
        skorhesapla("Mustafa");
        skorhesapla(50);
        skorhesapla("Mehmet",50);
    }
    
}
