package donguler;

import java.util.Scanner;

public class DordVeBesinKuvvetleriniYazdiranProg {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int k;
        System.out.println("sayi giriniz: ");
        k = inp.nextInt();

        System.out.println("4'UN KUVVETLERI");
        for (int i = 4; i < k; i *= 4) {
            System.out.println(i);
        }

        System.out.println("-------------");

        System.out.println("5'IN KUVVETLERI");
        for (int i = 5; i < k; i *= 5) {
            System.out.println(i);
        }

    }
}
