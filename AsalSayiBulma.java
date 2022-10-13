
package donguler;
import java.util.Scanner;
public class AsalSayiBulma {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        for(int i = 1; i <= 100; i++) {
            int sayac = 0;
            for(int j = i; j >= 1; j--) {
                if(i % j == 0) {
                    sayac++;
                }
            }
            if(sayac == 2) {
                System.out.print(i + " ");
            }
        }

    }
}

