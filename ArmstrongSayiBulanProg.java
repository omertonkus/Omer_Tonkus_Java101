package donguler;

import java.util.Scanner;

public class ArmstrongSayiBulanProg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("sayıyı girin: ");
        int number = input.nextInt();

        int numberOfDigits = 0;
        int temp = number;
        int numberDigit;
        int basValue;
        int result = 0;

        while (temp != 0) {
            temp = temp / 10;
            numberOfDigits++;
        }

        temp = number;

        while (temp != 0) {
            basValue = temp % 10;

            // basPow; "(4^3)+ (0^3)+(7^3) = 64+0+343 = 407"  bu eşitlikteki (4^3),(0^3),(7^3) ifadelerinin her biridir.
            int basPow = 1;
            for (int i = 1; i <= numberOfDigits; i++) {
                basPow *= basValue;
            }
            result += basPow;
            temp /= 10;

        }

        if (result == number) {
            System.out.println(number + " sayısı bir Armstrong sayısıdır.");
        } else {
            System.out.println(number + " sayısı bir Armstrong sayısı değildir.");
        }
        temp = number;

        int basSum = 0;

        while (temp != 0) {
            basValue = temp % 10;
            basSum += basValue;
            temp /= 10;
        }

        System.out.println(number + " sayısının basamakları toplamı: " + basSum);


    }
}
