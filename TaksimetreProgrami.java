import java.util.Scanner;

public class TaksimetreProgrami {
    public static void main(String[] args){
        double km, kmToplamTutar, toplamTutar;
        Scanner inp = new Scanner(System.in);

        System.out.println("Kaç km gittiğinizi giriniz: ");
        km = inp.nextInt();

        kmToplamTutar = 10 + (km*2.20);

        toplamTutar = (kmToplamTutar<20)? toplamTutar=20 : kmToplamTutar;

        System.out.println(toplamTutar);

    }
}
