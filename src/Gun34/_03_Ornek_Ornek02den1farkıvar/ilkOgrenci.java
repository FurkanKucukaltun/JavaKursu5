package Gun34._03_Ornek_Ornek02den1farkıvar;

public class ilkOgrenci extends Ogrenci {
    private String klup;

    private static int sayac = 1;

    public ilkOgrenci(String isim, OkulTipi okl, String klup) {
        super(isim, okl, sayac++);
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
