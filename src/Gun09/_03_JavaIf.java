package Gun09;

import java.util.Scanner;

public class _03_JavaIf {
    public static void main(String[] args) {
        // Girilen iki sayıdan büyük olanını değerini ekrana yazdırınız,
        // eşit ise eşit yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("1. sayiyi giriniz=");
        int sayi= oku.nextInt();
        System.out.print("2. sayiyi giriniz=");
        int sayi2= oku.nextInt();

        if (sayi>sayi2)
            System.out.println("büyük olan="+sayi);

        if (sayi2>sayi)
            System.out.println("sayi2 = " + sayi2);

        if (sayi2==sayi)
            System.out.println("sayılar eşittir.");
    }

    public static class _07_JavaIf {
        public static void main(String[] args) {
            // Girilen bir cümledeki küçük veya büyük a harfinin olup olmadığı yazdırınız
            // VAR ve YOK şeklinde

            Scanner oku=new Scanner(System.in);
            System.out.print("Cümle giriniz=");
            String cumle=oku.nextLine();

            if (cumle.toLowerCase().contains("a"))
                System.out.println("Evet");

            if (!cumle.toLowerCase().contains("a"))
                System.out.println("Hayır");
        }
    }
}
