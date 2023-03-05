package Gun10;

import java.util.Scanner;

public class _04_MantiksalIfadeler {
    public static void main(String[] args) {
        // mantıksal ifadeler
        // && ve işaretimiz (shit-6)
        // || veya işaretimiz (altGr <)

        // girilen sayı pozitif ve tek ise ekrana uygun sayı girildi yaz
        // değilse uygun sayı girilmedi yazdır

        Scanner oku=new Scanner(System.in);
        System.out.println("sayi=");
        int sayi=oku.nextInt();

        // hem tek hem pozitif  -> sayi%2==1 && sayi>0

        if (sayi%2==1 && sayi>0)
            System.out.println("uygun sayı girildi");
        else
            System.out.println("uygun sayı girilmedi");




    }
}
