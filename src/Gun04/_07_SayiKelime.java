package Gun04;

public class _07_SayiKelime {
    public static void main(String[] args) {
        //şu ana kadar, sayilari birbirine çevirdik
        //yazilarin rakamlara çevrilmesi, rakamların yazıya çevrilmesi var

        String ad="İsmet";
        String kelimeSayi="65"; // string halde, toplama gibi bir işleme giremez


        int sayiDeger= Integer.parseInt(kelimeSayi); // sayiya dönüşür

        int toplam=sayiDeger+sayiDeger;
        System.out.println("toplam = " + toplam);

        // toplam şu anda int yani sayi , bunu String nasıl dönüştürüm
        String strToplam= Integer.toString(toplam); // String e dönüştürür
        System.out.println("strToplam = " + strToplam);

        int _1degersayi= Integer.parseInt(kelimeSayi);
        System.out.println("_1degersayi = " + _1degersayi);
        String strToplam1= Integer.toString(toplam);
        System.out.println("strToplam1 = " + strToplam1);


    }
}
