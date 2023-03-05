package Gun25._03_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {

        Scanner okustr = new Scanner(System.in);
        Scanner okuint = new Scanner(System.in);
        ArrayList<Ogrenci> snf=new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            Ogrenci ogr = new Ogrenci();
            System.out.print("öğrencinin adı : "); ogr.ad = okustr.nextLine();
            System.out.print("öğrencinin soyadı : ");ogr.soyad = okustr.nextLine();
            System.out.print("öğrencinin sınıfını : ");ogr.sinif = okuint.nextInt();
            System.out.print("öğrencinin adresi : ");ogr.adres = okustr.nextLine();

            snf.add(ogr);
        }

        for (Ogrenci ogr:snf)
        {
            System.out.println("ogr.ad = " + ogr.ad);
            System.out.println("ogr.soyad = " + ogr.soyad);
            System.out.println("ogr.sinif = " + ogr.sinif);
            System.out.println("ogr.adres = " + ogr.adres);
        }
    }
}
