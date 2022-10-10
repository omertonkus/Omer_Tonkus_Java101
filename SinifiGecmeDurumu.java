import java.util.Scanner;

public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        double average = 0, toplam=0;
        int sayac = 0;

        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik Notunuz: ");
        mat = inp.nextInt();

        System.out.println("Fizik Notunuz: ");
        fizik = inp.nextInt();

        System.out.println("Kimya Notunuz: ");
        kimya = inp.nextInt();

        System.out.println("Turkce Notunuz: ");
        turkce = inp.nextInt();

        System.out.println("Muzik Notunuz: ");
        muzik = inp.nextInt();

        if (mat > 0 && mat <= 100) {
            toplam = toplam + mat;
            sayac++;
        }else{
            System.out.println("Matematik notu 0 ile 100 arasında olmadığı için ortalamaya katılmadı.");
        }

        if (fizik > 0 && fizik <= 100) {
            toplam = toplam + fizik;
            sayac++;
        }else{
            System.out.println("Fizik notu 0 ile 100 arasında olmadığı için ortalamaya katılmadı.");
        }

        if (turkce > 0 && turkce <= 100) {
            toplam = toplam + turkce;
            sayac++;
        }else{
            System.out.println("Turkçe notu 0 ile 100 arasında olmadığı için ortalamaya katılmadı.");
        }

        if (kimya > 0 && kimya <= 100) {
            toplam = toplam + kimya;
            sayac++;
        }else{
            System.out.println("Kimya notu 0 ile 100 arasında olmadığı için ortalamaya katılmadı.");
        }

        if (muzik > 0 && muzik <= 100) {
            toplam = toplam + muzik;
            sayac++;
        }else{
            System.out.println("Muzik notu 0 ile 100 arasında olmadığı için ortalamaya katılmadı.");
        }

        average = toplam / sayac;



        if (average<= 55) {
            System.out.println("Sınıfta kaldınız !!!");
        } else {
            System.out.println("Sınıfı geçtiniz");
        }

        System.out.println("Ortalamanız: " + average);


    }

}
