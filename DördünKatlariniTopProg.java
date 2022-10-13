package donguler;

import java.util.Scanner;

public class DördünKatlariniTopProg {
    public static void main(String[] args) {
        int k;
        int sum = 0;
        Scanner inp = new Scanner(System.in);

        do {
            System.out.println("Sayı giriniz: ");
            k = inp.nextInt();
            if (k % 4 == 0) {
                sum += k;
            }
        } while (k % 2 == 0);
        System.out.println("4'ün katı olan sayıların taolamı: " + sum);
    }
}
