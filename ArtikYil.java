import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {

        boolean artik  ;
        Scanner inp = new Scanner(System.in);

        int yil;
        System.out.println("Yıl Giriniz: ");
        yil = inp.nextInt();

        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0)
                    artik = true;
                else
                    artik = false;
            } else
                artik = true;
        } else
            artik = false;

        if (artik)
            System.out.println(yil + " artık yıldır.");
        else
            System.out.println(yil + " artık yıl değildir.");
    }
}