package Gun25._04_Soru;


import java.util.ArrayList;
import java.util.Scanner;

public class NotDefteri {
    public static void main(String[] args) {
        // Ogretmen için not defteri programı yapılma isteniyor.
        // Her ogrencının okulNo(int), tamAdi(String) ve notu(int) vardır.
        // Öğretmenden 20 öğrenci için bu bilgileri alınız.
        // bütün öğrencileri bir metodda yazdırınız.
        // sınıfın not ortalamasını yine bir metodda yazdırınız.
        // gerekli Class(lar) için ayrı dosya açınız

        Scanner okustr = new Scanner(System.in);
        Scanner okuint = new Scanner(System.in);

        ArrayList<Ogrenci> snf=new ArrayList<>();

        for (int i = 0; i < 20; i++) {

            Ogrenci ogr = new Ogrenci();

            System.out.print("okul no : "); ogr.okulNo = okustr.nextInt();
            System.out.print("Tam Adı : ");ogr.tamAdi = okustr.nextLine();
            System.out.print("Notu : ");ogr.notu = okuint.nextInt();

            snf.add(ogr);
        }

        bilgileriYazdir(snf);
        ortalama(snf);
    }

    public static void bilgileriYazdir ( ArrayList<Ogrenci> snf){

        for (Ogrenci ogr:snf)
        {
            System.out.println("oku no= " + ogr.okulNo);
            System.out.println("Tam Adı = " + ogr.tamAdi);
            System.out.println("Notu = " + ogr.notu);

        }
    }

    public static void ortalama (ArrayList<Ogrenci> snf){

        int toplam=0;

        for (Ogrenci ogr:snf) {
            toplam=toplam+ogr.notu;
        }
        System.out.println("ort" + (toplam/snf.size()));

    }
}
