package donguler;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısı: ");
        int n = input.nextInt();

        for (int i = n; i > 0; i--) {
            for (int j = 1; j > (i - n); j--)
                System.out.print(" ");
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

}
