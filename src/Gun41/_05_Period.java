package Gun41;

import java.time.LocalDate;
import java.time.Period;

public class _05_Period {
    // periyod 2 tarih arasındaki farkı gösterir
    // localDate ler için kullanılır
    public static void main(String[] args) {
        LocalDate dogumTarihi=LocalDate.of(1990,11,5);
        LocalDate bugun=LocalDate.now();

        Period fark= Period.between(dogumTarihi,bugun);
        System.out.println("fark = " + fark);
        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getDays() = " + fark.getDays());

        System.out.println(fark.getYears()+" yaşındasınız");

        //***********************************************

        Period period3gun=Period.ofDays(3);
        Period period3ay=Period.ofMonths(3);

        System.out.println("period3gun = " + period3gun);
        System.out.println("period3ay = " + period3ay);

        LocalDate ucGunSonra=bugun.plus(period3gun);
        System.out.println("ucGunSonra = " + ucGunSonra);

        LocalDate ucAySonra=bugun.plus(period3ay);
        System.out.println("ucAySonra = " + ucAySonra);

        //***************************************
        // Kursun bitiş tarihini bulunuz 6 ay-31 ekim 2022
        LocalDate kursunBaslangıc=LocalDate.of(2022,10,31);
        Period kursSure=Period.ofMonths(6);
        LocalDate kursBitis=kursunBaslangıc.plus(kursSure);

        System.out.println("kursBitis = " + kursBitis);
        System.out.println("kursBitis.getDayOfWeek() = " + kursBitis.getDayOfWeek());

        //**********************************
        // kursun bitmesine ne kadar süre kaldı
        Period nekadarSureKaldi=Period.between(bugun,kursBitis);
        System.out.println("nekadarSureKaldi = " + nekadarSureKaldi);

        //**********************************
        // kurs ne kadar süredir devam ediyor
        Period suanakadarDevamSuresi=Period.between(kursunBaslangıc,bugun);
        System.out.println("suanakadarDevamSuresi = " + suanakadarDevamSuresi);

    }


}
