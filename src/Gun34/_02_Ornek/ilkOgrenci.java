package Gun34._02_Ornek;

import java.util.ArrayList;
import java.util.Arrays;

public class ilkOgrenci extends Ogrenci {
    private String klup;


    public ilkOgrenci(String isim, OkulTipi okl, String klup) {
        super(isim, okl);
        setKlup(klup);
    }

    public String getKlup() {
        return klup;
    }

    public void setKlup(String klup) {
        this.klup = klup;
    }

    @Override
    public String toString() {
        return "ilkOgrenci{" +
                "klup='" + klup + '\'' +
                "} " + super.toString();
    }
}
