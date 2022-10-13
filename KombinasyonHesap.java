package donguler;

import java.util.Scanner;

public class KombinasyonHesap {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int n, r;
        int nTotal = 1;
        int rTotal = 1;
        int farkTotal = 1;

        System.out.println("N Kümenin top eleman sayisini girin: ");
        n = inp.nextInt();

        System.out.println("R elemanlı farklı grup sayisini girin: ");
        r = inp.nextInt();


        for (int i = 1; i <= n; i++) {
            nTotal = nTotal * i;
        }

        // System.out.println("n! = " + nTotal);

        for (int i = 1; i <= r; i++) {
            rTotal = rTotal * i;
        }

        //System.out.println("r! = " + rTotal);

        int fark = n - r;

        for (int i = 1; i <= fark; i++) {
            farkTotal = farkTotal * i;
        }

        // System.out.println("(n-r)! = " + farkTotal);

        int total;

        total = nTotal / (rTotal * farkTotal);
        System.out.println(n + "'in " + r + "'li kombinasyonu C(" + n + "," + r + ") = " + total);


    }
}
