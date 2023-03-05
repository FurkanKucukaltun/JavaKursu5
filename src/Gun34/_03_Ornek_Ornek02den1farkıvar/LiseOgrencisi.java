package Gun34._03_Ornek_Ornek02den1farkıvar;

public class LiseOgrencisi extends Ogrenci {

    private String brans;
    private static int sayac = 1;


    public LiseOgrencisi(String isim, OkulTipi okl, String brans) {
        super(isim, okl, sayac++);
        setBrans(brans);
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    @Override
    public String toString() {
        return "LiseOgrencisi{" +
                "brans='" + brans + '\'' +
                "} " + super.toString();
    }
}
