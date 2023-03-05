package Gun34._03_Ornek_Ornek02den1farkıvar;

public class Okul {
    public static void main(String[] args) {

        // 1- Ogrenci isimli id,isim ve tipi(ENUM ILK,ORTA,LISE)  olan bir class oluşturunuz.
        // 2- LiseOgrencisi adında  Ogrenci sınıfından bir sınıf üretiniz, field: brans (String,  MF,TM)
        // 3- İlkOgrencisi adında  Ogrenci sınıfından bir sınıf üretiniz,  filed: klup  (String SATRANC, TIYATRO ..)
        // 4- Okul isimli mainde 3 adet farklı tipte öğrenci oluşturunuz,
        // 5- Oluşturuken her öğrenciye, kendi okul tipinden sayac tanımlansın

        LiseOgrencisi lo1 = new LiseOgrencisi("Şeyda", OkulTipi.LISE, "MF");
        System.out.println("1. Ogrenci: " + lo1);
        LiseOgrencisi ogr2 = new LiseOgrencisi("Furkan", OkulTipi.LISE, "TM");
        System.out.println("2. Ogrenci: " + ogr2);
        ilkOgrenci io = new ilkOgrenci("zahid-agah", OkulTipi.ILK, "satranc");
        System.out.println("3. Ogrenci: " + io);

    }
}
