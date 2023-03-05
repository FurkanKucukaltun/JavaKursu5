package Gun35._03_Polyformphism_Soru;

public class Main {
    public static void main(String[] args) {
        // 3-Yukarıdaki sınıflardan oluşturacağınız 2 adet nesne için de geçerli
        //  olacak kimlik belgesi formu oluşturan tek bir metod yazınız.

       // Calisan cls1=new Calisan("ahmet","kucuk","muhendis","arge");
       // Ogrenci ogr1=new Ogrenci("Zahid","agah","ogrenci","mf");

        Calisan kisi1=new Calisan("ahmet","kucuk","muhendis","arge");
        Ogrenci kisi2=new Ogrenci("Zahid","agah","ogrenci","mf");

        Kisi.kimlikBelgesi(kisi1);
        Kisi.kimlikBelgesi(kisi2);

    }
}
