package Gun20;

public class _06_JavaMethod {
    public static void main(String[] args) {
        int s1=4;
        int s2=12;
        int s3=34;
        int s4=45;

        int sonuc1=toplamBul("ismet",s1,s2); // !!!parantez içinde olmasına reğmen metod içinde String değer kullanımadı
        int sonuc2=toplamBul("mehmet",s1,s2,s3);
        int sonuc3=toplamBul("ali",s1,s2,s3,s4);

        //parametreler aynı tip sadece miktarları farklı
        // bu tip durumlar için bir kolaylık sağlanmış.

        System.out.println("sonuc1 = " + sonuc1);
        System.out.println("sonuc2 = " + sonuc2);
        System.out.println("sonuc3 = " + sonuc3);


//        TODO: Bizim 3 tane saatimiz vardır.  //methodlarla da yapılabilir ama yapmadım
//            * bir tanesi tam doğru çalışıyor,
//            * bir tanesi her saatte 20 dk geri kalıyor.
//            * bir tanesi her saate 15 dk ileri gidiyor.
//            Bu 3 saatte saat 16 da çalışmaya başlıyorlar.
//            Bu saatler kaç saat ve dakika sonra tekrar
//            aynı saati gösterirler aynı anda.   */


        int dakika = 1;
        boolean deger = true;
        while (deger) {
            double a =  dakika% (24 * 60);
            double b =  (dakika * 75 / 60)% (24 * 60);
            double c =  (dakika * 40 / 60)% (24 * 60);


            if (a == b && b == c) {
                System.out.println("doğru geçen toplam dakika : " + dakika);
                deger = false;
            }
            dakika++;
        }
        int saat = dakika / 60; // geçen toplam saat=288
        int kalanDk = (dakika-1) % 60; //saat bazında geçen dakika=1

        System.out.println("toplam " + saat + " saat " + kalanDk + " dakika geçmiştir.");

        double gun = dakika / (24 * 60);
        System.out.println(gun + " tam gün geçmiştir.");


    }

    // gelen kaç sayı olursa olsun hepsini al dizi şeklinde metoda al
    // ... ile ilgili 2 kural var
    // 1- bir metodda parametre olarak sadece 1 tane alabilir
    // 2- her zaman son parametre olmalı

    public static int toplamBul(String isim, int... sayilar){ // kaç sayı gelirse gelsin onları dizişeklinde alıyor

        int toplam=0;

        for (int i = 0; i < sayilar.length; i++) {
            toplam=toplam+sayilar[i];
        }

        return toplam;
    }





}
