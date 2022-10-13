package donguler;

import java.util.Scanner;

public class ÜslüSayiHesap {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n, k;
        System.out.println("Üssü alınacak sayi: ");
        n = inp.nextInt();
        System.out.println("Üs olacak sayi: ");
        k = inp.nextInt();
        int total = 1;
        for (int i = 1; i <= k; i++) {
            total *= n;
        }
        System.out.println(total);


    }
}
