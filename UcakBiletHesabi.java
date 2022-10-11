import java.util.Scanner;

public class UcakBiletHesabi {

    public static void main(String[] args) {

        int km,yas,tip;
        double kmFiyat = 0.10, toplam;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Mesafeyi Giriniz: ");
        km = input.nextInt();

        System.out.print("Lütfen Yaşınızı Giriniz: ");
        yas = input.nextInt();

        System.out.println("Lütfen Yolculuk Tipini Seçiniz \n1-Tek Yön\n2-Gidiş Dönüş");
        tip = input.nextInt();

        switch(tip){
            case 1:
                System.out.println("Tek Yön Seçtiniz");
                break;
            case 2:
                System.out.println("Gidiş Dönüş Seçtiniz");
                break;
        }

        if ((km>0 && yas>0) && (tip==1 || tip==2)){

            if (yas<12){

                if (tip==1){
                    toplam = (km*kmFiyat)*0.5;
                    System.out.println("Toplam Tutar: " + toplam + " Tl");
                }else{
                    toplam = (((km*kmFiyat)*0.5)*2)*0.8;
                    System.out.println("Toplam Tutar: " + toplam + " Tl");
                }

            }else if(yas>=12 && yas<=24){

                if (tip==1){
                    toplam = (km*kmFiyat)*0.9;
                    System.out.println("Toplam Tutar: " + toplam + " Tl");
                }else{
                    toplam = (((km*kmFiyat)*0.9)*2)*0.8;
                    System.out.println("Toplam Tutar: " + toplam + " Tl");
                }

            }else if (yas>65){

                if (tip==1){
                    toplam = (km*kmFiyat)*0.7;
                    System.out.println("Toplam Tutar: " + toplam + " Tl");
                }else{
                    toplam = (((km*kmFiyat)*0.7)*2)*0.8;
                    System.out.println("Toplam Tutar: " + toplam + " Tl");
                }

            }else if(yas>24 && yas<=65){

                if (tip==1){
                    toplam = km*kmFiyat;
                    System.out.println("Toplam Tutar: " + toplam + " Tl");
                }else{
                    toplam = ((km*kmFiyat)*2)*0.8;
                    System.out.println("Toplam Tutar: " + toplam + " Tl");
                }

            }

        }else{
            System.out.println("Hatalı Veri Girdiniz !");
        }

    }
}