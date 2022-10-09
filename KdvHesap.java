import java.util.Scanner;

public class KdvHesap {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);

        double kdvsizFiyat,kdvliFiyat,kdvTutari;

        System.out.println("KDV si hesaplanacak ücret tutarını giriniz: ");
        kdvsizFiyat = inp.nextInt();

        double kdvOrani = (kdvsizFiyat>0 && kdvsizFiyat<1000)? 0.18 : 0.08;

        kdvliFiyat = (kdvsizFiyat*kdvOrani) + kdvsizFiyat;
        kdvTutari = kdvliFiyat - kdvsizFiyat;


        System.out.println("\nKDV'siz Fiyat: " + kdvsizFiyat);
        System.out.println("\nKDV'li Fiyat: " + kdvliFiyat);
        System.out.println("\nKDV tutarı: " + kdvTutari);
        System.out.println("\nKDV oranı: " + kdvOrani);

    }
}
