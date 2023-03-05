package Gun25._02_Soru;


import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        // Bir okulda kayıt programı için Ogrenci bilgilerini alan modül
        // yazılacaktır. Ogrenci ye ait bilgiler (adi, soyadi, sinifi ve adres) vardır.
        // bu yapıyı oluşturunuz.
        // Daha sonra 3 tane öğrenci bilgilerini kullanıcıdan alarak doldurunuz.

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

        for (Ogrenci ogr:snf)  //ArrayList olduğu için fori ile de yapılabilir
        {
            // System.out.println("ogr = " + ogr); // bu şekilde bir çıktı alınamaz
            System.out.println("ogr.ad = " + ogr.ad);
            System.out.println("ogr.soyad = " + ogr.soyad);
            System.out.println("ogr.sinif = " + ogr.sinif);
            System.out.println("ogr.adres = " + ogr.adres);
        }

    }
}

class Ogrenci {
    String ad;
    String soyad;
    int sinif;
    String adres;

}

