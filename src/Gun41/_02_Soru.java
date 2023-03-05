package Gun41;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _02_Soru {
    public static void main(String[] args) {

        // Canlı dijital saat yapınız

        while(true){
        DateTimeFormatter f=DateTimeFormatter.ofPattern("kk:mm:ss");
        LocalTime saat= LocalTime.now();
        Bekle(1);
        System.out.print("\r"+ saat.format(f)); }
    }
    public static void Bekle(int sn){

        try {
            Thread.sleep(1000*sn); // ms beklediği
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }




}
