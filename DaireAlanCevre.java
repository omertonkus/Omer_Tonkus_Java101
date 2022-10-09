import java.util.Scanner;

public class DaireAlanCevre {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);

        double r,pi=3.14,a,alan,cevre,dilimAlani;

        System.out.println("dairenin yarıçapını giriniz: ");
        r = inp.nextInt();

        alan = pi*r*r;
        cevre = 2*pi*r;

        System.out.println("alanı: " + alan);
        System.out.println("cevresi: " + cevre);

        System.out.println("merkez açının ölçüsünü giriniz: ");
        a = inp.nextInt();

       dilimAlani = (pi*(r*r)*a)/360;

       System.out.println("daire diliminin alanı: " + dilimAlani);


    }
}
