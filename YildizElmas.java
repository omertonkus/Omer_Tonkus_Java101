
package donguler;

import java.util.Scanner;

public class YildizElmas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("basamak sayısını girin: ");
        n = input.nextInt();
        for (int i = 0; i <= n / 2; i++) {

            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i + 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }


        for (int i = n / 2; i > 0; i--) {
            for (int j = 1; j > (i - n); j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
