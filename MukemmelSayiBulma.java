package donguler;

import java.util.Scanner;

public class MukemmelSayiBulma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int n = input.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            System.out.println(n + " Mükemmel sayıdır");
        } else {
            System.out.println(n + " Mükemmel sayı degildir.");
        }


    }
}
