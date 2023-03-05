package Gun43;

import java.time.LocalDate;
import java.time.Month;

public class _03_JavaTryCatch {
    public static void main(String[] args) {
        System.out.println("program çalışmaya basladı");

        try { // dene, hatanın başladığı yerin üstine konur
            LocalDate tarih = LocalDate.of(2023, Month.FEBRUARY, 30);
        } // hata olduğu zaman programı kırma
        catch (Exception ex)
        // ex isimli değişkende oluşan hataların bilgisi atanıyor
        { // hata olduğunda yapılması istenenler buraya yazılıyor
            System.out.println("hata oluştu lütfen tekrar deneyiniz");
            System.out.println("tüm hata mesajı: "+ex);
            System.out.println("hatanın açıklaması: "+ex.getMessage());
            //kendine hata mesajını mail atabilirsin
            // log tutma: program nasıl çalışıyor
        }
        System.out.println("program bitti");

    }
}
