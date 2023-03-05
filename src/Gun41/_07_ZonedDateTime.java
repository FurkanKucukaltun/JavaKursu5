package Gun41;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class _07_ZonedDateTime {
    public static void main(String[] args) {
        // Başka zaman bölgelerinin (Time Zone) zaman bilgisini alma

        ZonedDateTime zat=ZonedDateTime.now();
        // su anda benim bulunduğum default zamanı verdi

        System.out.println("zat = " + zat);
        Set<String> zamanBolgeleri= ZoneId.getAvailableZoneIds();
        for (String z: zamanBolgeleri) {
           if(z.toLowerCase().contains("ıst"))
            System.out.println("z = " + z);

        }

        ZoneId zoneIdParis=ZoneId.of("Europe/Paris");
        ZonedDateTime zoneLondon=ZonedDateTime.now(zoneIdParis);
        System.out.println("zoneLondon = " + zoneLondon);
    }
}
