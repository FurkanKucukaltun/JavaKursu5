package Gun12;

import java.util.Scanner;

public class _02_IfElseIf {
    public static void main(String[] args) {
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.println("1. tam sayı=");
        int sayi1= oku.nextInt();
        System.out.println("2. tam sayı=");
        int sayi2= oku.nextInt();

        System.out.println("Toplama için T");
        System.out.println("Çıkartma için Ç");
        System.out.println("Çarpma için P");
        System.out.println("Bölme için B");
        System.out.println("Seçiminiz =");
        Scanner okuu=new Scanner(System.in);
        String secim=okuu.nextLine();

        // merdivenli if, ladder if

        if (secim.equalsIgnoreCase("T"))
            System.out.println("toplam=" + (sayi1+sayi2));
        else
            if (secim.equalsIgnoreCase("Ç"))
                System.out.println("Farkı=" + (sayi1-sayi2));
            else
                if (secim.equalsIgnoreCase("P"))
                    System.out.println("Çarpma=" + (sayi1*sayi2));
                else
                    if (secim.equalsIgnoreCase("B"))
                        System.out.println("Bölme=" + (sayi1/sayi2));
                    else
                        System.out.println("yanlış seçim yaptınız");



    }
}
