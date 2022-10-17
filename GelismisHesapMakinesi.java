package Metotlar;

import java.util.Scanner;

public class GelismisHesapMakinesi {
    static void plus(int a, int b) {
        int result = a + b;
        System.out.println("Toplama = " + result);
    }
    static void minus(int a, int b) {
        int result = a - b;
        System.out.println("Çıkarma = " + result);
    }

    static void times(int a, int b) {
        int result = a * b;
        System.out.println("Çarpma = " + result);

    }
    static void divided(int a, int b) {
        if (b == 0) {
            System.out.println("Bölen sıfır olamaz!!");
        } else {
           int  result = a / b;
            System.out.println("Bölme = " + result);
        }
    }
    static void power(int a, int b) {
        int result = 1;
        if (b == 0) {
            System.out.println("Üs alma = " + result);
        }
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Üs alma = " + result);
    }
    static void factorial(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        System.out.println("Faktoriyel = " + result);
    }
    static void mod(int a, int b) {
        int result = a % b;
        System.out.println("Mod = " + result);
    }

    static void calc(int a, int b) {
        int alan = a * b;
        int cevre = 2 * (a + b);
        System.out.println("Alan= " + alan);
        System.out.println("Cevre = " + cevre);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        int select;
        String menu = "-------------------\n"
                + "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        while (true) {
            System.out.println(menu);
            System.out.print("Bir işlem seçiniz : ");
            select = scan.nextInt();

            System.out.print("İlk sayi girin: ");
            int n1 = input.nextInt();
            System.out.print("İkinci sayi girin: ");
            int n2 = input.nextInt();

            switch (select) {
                case 1:
                    plus(n1, n2);
                    break;
                case 2:
                    minus(n1, n2);
                    break;
                case 3:
                    times(n1, n2);
                    break;
                case 4:
                    divided(n1, n2);
                    break;
                case 5:
                    power(n1, n2);
                    break;
                case 6:
                    factorial(n1);
                    break;
                case 7:
                    mod(n1, n2);
                    break;
                case 8:
                    calc(n1, n2);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        }
    }
}
