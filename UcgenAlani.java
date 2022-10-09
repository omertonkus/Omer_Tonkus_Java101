import java.util.Scanner;

public class UcgenAlani {
    public static void main(String[] args){

        int a,b;
        double c,u;
        Scanner inp = new Scanner(System.in);

        System.out.println("a kenarını giriniz: ");
        a = inp.nextInt();

        System.out.println("b kenarını giriniz: ");
        b = inp.nextInt();

        // c = (a*a) + (b*b);
        // c = Math.sqrt(c);
        // System.out.println("hipotenüs: " + c);

        System.out.println("c kenarını giriniz: ");
        c = inp.nextInt();

        u = (a+b+c) / 2;

        double cevre = 2*u;
        double temp = u*(u-a)*(u-b)*(u-c);
        double alan = Math.sqrt(temp);

        System.out.println("Çevre: " + cevre);
        System.out.println("Alan: " + alan);


    }

}
