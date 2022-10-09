import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);

        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.00,toplamTutar;
        double a,e,d,m,p;

        System.out.println("Armut kaç kilo: ");
        a = inp.nextDouble();

        System.out.println("Elma kaç kilo: ");
        e = inp.nextDouble();

        System.out.println("Domates kaç kilo: ");
        d = inp.nextDouble();

        System.out.println("Muz kaç kilo: ");
        m = inp.nextDouble();

        System.out.println("Patlıcan kaç kilo: ");
        p = inp.nextDouble();

        toplamTutar = ((armut*a) + (elma*e) + (domates*d) + (muz*m) + (patlican*p));

        System.out.println("Toplam Tutar: " + toplamTutar);



    }
}
