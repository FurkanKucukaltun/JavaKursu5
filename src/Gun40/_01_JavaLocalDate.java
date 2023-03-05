package Gun40;

import sun.util.resources.LocaleData;

import javax.jws.soap.SOAPBinding;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class _01_JavaLocalDate {
    public static void main(String[] args) {
        // localdate sadece gun ay yıl bilgisini tutar.

        LocalDate tarih=LocalDate.now();

        System.out.println("tarih = "+tarih);
        System.out.println("tarih.getYear() = " + tarih.getYear());
        System.out.println("tarih.getMonthValue() = " + tarih.getMonthValue());
        System.out.println("tarih.getDayOfMonth() = " + tarih.getDayOfMonth());
        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek());
        System.out.println("tarih.getDayOfWeek().getValue() = " + tarih.getDayOfWeek().getValue());
        System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear());


        // kendisindeki hazır formatlara bakalım

        System.out.println("ISO_DATE = " + tarih.format(DateTimeFormatter.ISO_DATE));
        System.out.println("SHORT = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("MEDIUM = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("LONG = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG))); //FULL ve LONG AYNI OZELLİĞİ GÖSTERDİ
        System.out.println("FULL = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        System.out.println("******************************");

        System.out.println("FULL Almanya gösterimi = ");
        System.out.println("FULL = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMAN)));
        System.out.println("Almanya gösterimi OLMAYINCA = "+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));

        // Lokalizasyon tanımlaması
        // en-US :  birincisi DİLİ, ikincisi ÜLKEYİ temsil ediyor. Amerikan İngilizcesi
        // en_UK : UK İngilizcesi
        // fr-CA : Kanada fransızcası
        // en-CA : Kanada ingilizcesi
        // tr-TR :

        Locale[] kullanilabilirLokaller= Locale.getAvailableLocales();
        for (Locale l:kullanilabilirLokaller) {

            if(l.getDisplayCountry().toLowerCase().contains("chi")){
            System.out.print("Dil = " + l.getDisplayLanguage());
            System.out.print(" Ülke = " + l.getDisplayCountry());
            System.out.print(", = " + l.getDisplayLanguage());
            System.out.println(", = " + l.getDisplayCountry());}

        }
        Locale lokalCince=new Locale("zh","CN");
        System.out.println("FULL Çince gösterimi = \n"+
                tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(lokalCince)));

        System.out.println("\n *************İstediğim formatta göster**********");
        // istediğim formatta gösterim

        System.out.println("tarih = " + tarih);

        DateTimeFormatter ozalFormat1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("tarih dd/MM/yyyy = " + tarih.format(ozalFormat1));

        DateTimeFormatter oz2=DateTimeFormatter.ofPattern("d.M.yy");
        System.out.println("d.M.yy = " + tarih.format(oz2));

        DateTimeFormatter oz3=DateTimeFormatter.ofPattern("EEEE dd/MM/yyyy");
        System.out.println("tarih EEEE dd/MM/yyyy = " + tarih.format(oz3));

        DateTimeFormatter ozelFormat4=DateTimeFormatter.ofPattern("EE dd.MM.yyyy");
        System.out.println("tarih EE dd.MM.yyyy: "+tarih.format(ozelFormat4));

        System.out.println("Ozel format ve loalizasyon EEEE dd.MM.yyyy: "+tarih.format(oz3.withLocale(Locale.UK)));

        DateTimeFormatter ozelFormat5=DateTimeFormatter.ofPattern("MMMM dd.MM.yyyy");
        System.out.println("tarih MMMM dd.MM.yyyy: "+tarih.format(ozelFormat5));

        System.out.println("\n**************");
        // kendimiz  bir tarihi nasıl set edebiliriz oluşturabiliriz// int sayi=5

        LocalDate tarih1= LocalDate.of(2000,5,20);
        LocalDate tarih2= LocalDate.of(1999, Month.MARCH,12);
        System.out.println("tarih2.format(ozalFormat1) = " + tarih2.format(ozalFormat1));
        
        



    }
}
