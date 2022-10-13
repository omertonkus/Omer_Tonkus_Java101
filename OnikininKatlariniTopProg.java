package donguler;

import java.util.Scanner;

public class OnikininKatlariniTopProg {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int k;
        int sum=0;
        System.out.println("Bir sayi girin : ");
        k = inp.nextInt();

        for (int i = 0; i <= k; i++) {
            if (i % 12 != 0) {
                continue;
            }
            sum += i;
        }
        System.out.println(sum);
    }
}
