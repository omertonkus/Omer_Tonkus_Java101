import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        //Degiskenleri oluştur
        int mat, fizik, kimya, turkce, tarih, muzik;

        //Scanner sınıfını tanımladık
        Scanner inp = new Scanner(System.in);

        //kullanıcıdan verileri al
        System.out.print("Matematik Notunuz: ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = inp.nextInt();

        int notToplam = mat + fizik + kimya + turkce + tarih + muzik;
        double notOrtalamasi = notToplam / 6.0;

        System.out.print("Ortalamanız: " + notOrtalamasi);

        String sonuc = (notOrtalamasi > 60)? "Sınıfı geçti" : "Kaldı";
        System.out.println("\nGeçme durumu:" +sonuc);
    }
}
