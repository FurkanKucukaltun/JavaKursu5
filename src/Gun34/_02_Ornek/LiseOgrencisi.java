package Gun34._02_Ornek;

public class LiseOgrencisi extends Ogrenci {

    private String brans;

    public LiseOgrencisi(String isim, OkulTipi okl, String brans) {
        super(isim, okl);
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
