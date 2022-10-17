package Metotlar;
import java.util.Scanner;
public class DeseneGoreMetotOlusturma {

    static void desen(int n) {
        System.out.print(n + " ");
        if (n > 0) {
            desen(n - 5);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("N sayısı : ");
        int n= input.nextInt();
        desen(n);
    }
}
