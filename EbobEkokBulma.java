package donguler;

import java.util.Scanner;

public class EbobEkokBulma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n1, n2;

        System.out.print("n1 sayısını giriniz: ");
        n1 = input.nextInt();
        System.out.print("n2 sayısını giriniz: ");
        n2 = input.nextInt();
        if (n2 < n1) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }

        int ebob;


        int a = n1;
        while (a >= 1) {

            if (n1 % a == 0 && n2 % a == 0) {
                ebob = a;
                System.out.println("ebob: " + ebob);
                break;
            } else {
                a--;
            }
        }


        int b = n2;
        while (b <= (n1 * n2)) {

            if (b % n1 == 0 && b % n2 == 0) {

                System.out.println("ekok: " + b);
                break;
            } else {
                b++;
            }
        }


    }
}
