package Gun09;

import java.util.Scanner;

public class _02_JavaIf {
    public static void main(String[] args) {
        // Girilen bir sayının negatif mi , pozitif mi olduğunu yazdırınız.
        // Sıfır ise sıfır yazdırınız.


        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayi giriniz=");
        int sayi= oku.nextInt();

        if (sayi<0)
            System.out.println("negatif");

        if (sayi>0)
            System.out.println("pozitif");

        if (sayi==0)
            System.out.println("sayi=0");

    }
}
