package Gun11;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        // Girilen bir sayını pozitif, negatif veya sıfır olduğunu yazdırınız.
        Scanner oku= new Scanner(System.in);
        System.out.println("sayi=");
        int sayi= oku.nextInt();
        if (sayi<0)
            System.out.println("negatif");
        else if (sayi==0)
            System.out.println("sayı sıfırdır");
        else
            System.out.println("pozitif");

        //2. yontem
        /*

        Scanner oku= new Scanner(System.in);
        System.out.println("sayi=");
        int sayi= oku.nextInt();

        if (sayi<0)
            System.out.println("negatif");

        else

            if (sayi==0)
            System.out.println("sayı sıfırdır");

            else
            System.out.println("pozitif");

         */







    }
}
