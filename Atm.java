package donguler;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Scanner input1 = new Scanner(System.in);
        String userName, password;
        int right = 4;
        int select;
        int balance = 1500;

        while (right > 0) {
            System.out.print("Kullanıcı adı girin : ");
            userName = input.nextLine();
            System.out.print("Şifre girin : ");
            password = input.nextLine();


            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.print("Giriş başarılı...");
                do {

                    System.out.println("\n1-Para çekme\n" +
                            "2-Para yatırma\n" +
                            "3-Bakiye sorgulama\n" +
                            "4-Çıkış");

                    System.out.print("Lütfen işleminizi seçiniz : ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            int tutar;
                            System.out.print("Çekeceğiniz tutarı girin: ");
                            tutar = input.nextInt();
                            if (tutar > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= tutar;
                            }

                            break;
                        case 2:
                            //int tutar;
                            System.out.print("Yatıracağınız tutarı girin: ");
                            tutar = input.nextInt();
                            balance += tutar;
                            break;
                        case 3:
                            System.out.print("Bakiyeniz: " + balance);
                            System.out.println("\n");
                            break;
                        case 4:
                            System.out.print("İyi günler...");
                            break;
                        default:
                            System.out.println("Hatalı seçim !!!");

                    }
                } while (select != 4);break;

            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }

            }
        }
    }
}
