package Gun06;

import java.util.Scanner;

public class _01_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan Cadde, Sokak , PostaKodu(int) ve ülke şeklinde
        // adres bilgisi alarak yazdırınız.

        Scanner strng=new Scanner(System.in);  //string okumaları için
        Scanner intg=new Scanner(System.in);  // int okumaları için

        System.out.print("cadde=");
        String cadde=strng.next();

        System.out.print(  "sokak=");
        String sokak=strng.next();

        System.out.print("posta kodu=");
        int pstkod=intg.nextInt();

        System.out.print("Ülke=");
        String ulke=strng.next();

        System.out.println("adres="+cadde+"  "+sokak+"   "+pstkod+"   "+ulke);


    }
}
