package donguler;

import java.util.Scanner;

public class MinMaxDegerleriBulma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = 1;
        int min = 1;

        System.out.print("Kaç tane sayı gireceksiniz: ");
        int sayi = input.nextInt();


        for (int i = 1; i <= sayi; i++) {
            System.out.print(i + ". Sayıyı giriniz:");
            int a = input.nextInt();

            if (a > max) {
                max = a;
            } else if (a < max) {
                min = a;
            } else {
                min = a;
            }
        }

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);


    }
}
