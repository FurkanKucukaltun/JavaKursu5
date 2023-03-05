package Gun27._03_Ornek;

import org.w3c.dom.ls.LSException;

public class Soru {
    // Bir Üniversitede öğrencilere ders kaydı yapılacaktır.
    // 1- Lesson : fields : name, saat (1-10 arasında değer alıyor).
    // 2- Student: fields : name, maxSaat, dersleri adında derslerini listesini tutacak bir liste.
    // 3- 3 adet ders oluşturunuz.
    // 4- 1 adet öğrenci tanımlayınız alabileceği maxCredit si 10 olsun.
    // 5- Bu öğrencinin ders listesine açılmış dersleri ekleyiniz.
    //    ders eklerken max alabileceği Saati geçmemeli, geçerse
    //    uyarı versin, alabileceğiniz max Saati doldu şeklinde.
    // 6- Unıversıte kurallarını yazdıran 2 maddelik bir not yazdıran metod ekleyinız.en basta
    //    yazdırınız.
    public static void main(String[] args) {

        Student.universiteKurallari();

        Lesson ders1 = new Lesson();
        ders1.dersAdi = "Algoritma";
        ders1.dersSaati = 4;

        Lesson ders2 = new Lesson();
        ders2.dersAdi = "Java";
        ders2.dersSaati = 4;

        Lesson ders3 = new Lesson();
        ders3.dersAdi = "Test Tools";
        ders3.dersSaati = 3;


        Student ogr = new Student();
        ogr.name = "İsmet Temur";
        ogr.MaxSaat = 10;
        ogr.dersEkle(ders1);
        ogr.dersEkle(ders2);
        ogr.dersEkle(ders3);
        ogr.aldigiDersleriYaz();


    }
}
