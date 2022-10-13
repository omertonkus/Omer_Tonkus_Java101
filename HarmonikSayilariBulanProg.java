package donguler;

import java.util.Scanner;

public class HarmonikSayilariBulanProg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("sayıyı giriniz: ");
        n = input.nextInt();
        double result = 0;
        for (int i = 1; i <= n; i++) {
            result += (1.0/i); //1.0 yazmamızın nedeni int/int=int, double/int=double olmasıdır.
        }
        System.out.println(result);
    }
}
