package Metotlar;

import java.util.Scanner;

public class RecursiveAsalSayiBulma {

    static Boolean asal(int n, int i) {

        if (i == 1)
            return true;
        else if (n % i == 0)
            return false;
        else
            return asal(n, i - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int n = input.nextInt();
        if (asal(n, n / 2) == true) {
            System.out.println(n + " sayısı ASALDIR!");
        } else {
            System.out.println(n + " sayısı ASAL değildir !");
        }


    }
}
