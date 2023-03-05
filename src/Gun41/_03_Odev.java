package Gun41;

import java.time.LocalTime;

public class _03_Odev
{
    public static void main(String[] args) {

        // TODO : // Alınan saati geriye doğru saniye saniye saydırınız.

        LocalTime saat1=LocalTime.of(7,34,45);
        // period plus&minus metodu eksili yapılacak

        Bekle(1);

    }

    public static void Bekle(int sn){

        try {
            Thread.sleep(1000*sn); // ms beklediği
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
