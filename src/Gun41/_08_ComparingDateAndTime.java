package Gun41;

import Gun39._05_OOP_Soru.Borsh;

import java.time.LocalDate;

public class _08_ComparingDateAndTime {
    public static void main(String[] args) {
        LocalDate bugun=LocalDate.now();
        LocalDate dun=bugun.minusDays(1);

        Boolean sonraMi=bugun.isAfter(dun);  // bugün dünden sonra mı
        System.out.println("sonraMi = " + sonraMi);

        Boolean onceMi=bugun.isBefore(dun);  // bugün dünden önce mı
        System.out.println("onceMi = " + onceMi);

        boolean esitMi=bugun.isEqual(dun);  // bugün düne eşit mı
        System.out.println("esitMi = " + esitMi);

        boolean artikyilmi=bugun.isLeapYear();  // bu yıl artık yıl mı
        System.out.println("artikyilmi = " + artikyilmi);
    }
}
