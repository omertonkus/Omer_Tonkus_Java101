import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args){
        String ay;
        int gun;

        Scanner inp = new Scanner(System.in);


        System.out.print("Doğum tarihinizin Gününü Girin :");
        gun = inp.nextInt();

        System.out.print("Doğum tarihinizin Gününü AY girin :");
        ay = inp.next();

        if ((ay.equals("Ocak") && gun<=20)||(ay.equals("Aralık") && gun>=21))
        {
            System.out.println("Oğlak");
        }
        else if((ay.equals("Ocak") && gun>=21)||(ay.equals("Şubat") && gun<=19))
        {
            System.out.println("Kova");
        }
        else if((ay.equals("Şubat") && gun>=20)||((ay.equals("Mart") && gun<=20)))
        {
            System.out.println("Balık");
        }
        else if((ay.equals("Mart") && gun>=21)||(ay.equals("Nisan") && gun<=20))
        {
            System.out.println("Koç");
        }
        else if((ay.equals("Nisan") && gun>=21)||(ay.equals("Mayıs") && gun<=20))
        {
            System.out.println("Boğa");
        }
        else if((ay.equals("Mayıs") && gun>=21)||(ay.equals("Haziran") && gun<=21))
        {
            System.out.println("İkizler");
        }
        else if((ay.equals("Haziran") && gun>=22)||(ay.equals("Temmuz") && gun<=22))
        {
            System.out.println("Yengeç");
        }
        else if((ay.equals("Temmuz") && gun>=23)||(ay.equals("Ağustos") && gun<=23))
        {
            System.out.println("Aslan");
        }
        else if((ay.equals("Ağustos") && gun>=24)||(ay.equals("Eylül") && gun<=23))
        {
            System.out.println("Başak");
        }
        else if((ay.equals("Eylül") && gun>=24)||(ay.equals("Ekim") && gun<=23))
        {
            System.out.println("Terazi");
        }
        else if((ay.equals("Ekim") && gun>=24)||(ay.equals("Kasım") && gun<=22))
        {
            System.out.println("Akrep");
        }
        else if((ay.equals("Kasım") && gun>=23)||(ay.equals("Aralık") && gun<=21))
        {
            System.out.println("Yay");
        }
        else
        {
            System.out.printf("hatalı giriş");
        }
    }

}
