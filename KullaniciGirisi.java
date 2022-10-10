import java.util.Scanner;

public class KullaniciGirisi {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Scanner input1=new Scanner(System.in);
        String userName, password , newPassword;
        int select;

        System.out.print("Kullanıcı Adı Giriniz:");
        userName=input.nextLine();
        System.out.print("Parola Giriniz:");
        password=input.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.print("Giriş Yapıldı");
        }
        else {
            System.out.println("Yanlış Kullanıcı Adı Veya Parola");
            System.out.print("Şifrenizi Değiştirmek İçin 1'e Basın:");
            select=input.nextInt();
            switch (select){
                case 1:
                    System.out.print("Yeni Parolanızı Yazın:");
                    newPassword=input1.nextLine();
                    if (!newPassword.equals(password)){
                        System.out.print("Yeni Parolanız Eski Parolanız İle Aynı Olamaz");
                    }
                    else {
                        System.out.print("Parolanız Başarıyla Değiştirildi");
                    }
                    break;



            }

        }

    }

}