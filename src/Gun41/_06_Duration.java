package Gun41;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _06_Duration {
    public static void main(String[] args) {
        // Duration: hem localtime hem de LocalDateTime arasındaki farkı verir

        // LocalTime
        LocalTime dersBaslangıc=LocalTime.of(19,0,0);
        LocalTime dersbitis=LocalTime.of(22,0,0);

        Duration gunlukDersSuresi=Duration.between(dersBaslangıc,dersbitis);
        System.out.println("gunlukDersSuresi = " + gunlukDersSuresi);
        System.out.println("toHours() = " + gunlukDersSuresi.toHours()); // farkın toplam ssat hali
        System.out.println("toMinutes() = " + gunlukDersSuresi.toMillis()); // farkın toplam milisaniye hali
        System.out.println("toMinutes() = " + gunlukDersSuresi.toMinutes()); // farkın toplam dakika hali

        // LocalDateTime
        LocalDateTime from= LocalDateTime.of(2023,1,1,0,0);
        LocalDateTime to=LocalDateTime.now();  // bugün

        Duration farkzaman=Duration.between(from,to);
        System.out.println("farkzaman = " + farkzaman);
        System.out.println("farkzaman.toDays() = " + farkzaman.toDays());  // farkın toplam dunu
        System.out.println("farkzaman.toHours() = " + farkzaman.toHours()); // farkın toplam saati
        System.out.println("farkzaman.toMinutes() = " + farkzaman.toMinutes()); // farkın toplam dakikası

    }
}
