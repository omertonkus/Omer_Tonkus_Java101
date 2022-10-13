package donguler;

import java.util.Scanner;

public class YildizUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("basamak sayısını giriniz: ");
        n = input.nextInt();

        for (int i = 0; i <= n; i++) {

            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i + 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
