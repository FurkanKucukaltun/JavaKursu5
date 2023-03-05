package Gun10;

import java.util.Scanner;

public class _03_IfElse {
    public static void main(String[] args) {

        // Girilen bir sayının tek mi çift mi olduğunu yazdırınız.

        Scanner oku= new Scanner(System.in);
        System.out.println("sayi=");
        int sayi= oku.nextInt();
        if (sayi%2==0)
            System.out.println("sayi çift");
        else
            System.out.println("sayi tek");

    }
}
