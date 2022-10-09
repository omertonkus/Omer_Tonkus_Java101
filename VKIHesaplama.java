
import java.util.Scanner;

public class VKIHesaplama {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        double boy,kilo,vki;

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = inp.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz :");
        kilo = inp.nextDouble();

        vki = kilo/(boy*boy);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : " + boy);
        System.out.println("Lütfen kilonuzu giriniz :" + kilo);
        System.out.println("Vücut Kitle İndeksiniz :" + vki);


    }
}
