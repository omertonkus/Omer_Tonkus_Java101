package Metotlar;

import java.util.Scanner;

public class RecursiveUsluSayiHesaplama {

    static int power(int base, int pow){
        if (pow == 0) {
            return 1;
        } else {
            return base * power(base, (pow - 1));
        }

    }

    public static void main(String[] args) {
        while(true){
            Scanner input = new Scanner(System.in);
            int base, pow;
            System.out.print("Taban değeri giriniz: ");
            base = input.nextInt();
            System.out.print("Üs değerini giriniz: ");
            pow = input.nextInt();
            System.out.println("Sonuç = " + power(base, pow));
        }
    }
}
