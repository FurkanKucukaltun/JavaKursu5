package Gun38._01_Abstract;


    // 2si bir arada =>1 interface+ 1 parent class= abstract class.
    // Interface 'e artık ihtiyacımız kalmıyor. Örnek olması için interface klasörde saklandı

public abstract class BinekOto {
    private String marka;
    private int uretimyili;
    private int vitesAdedi;

    public BinekOto(String marka, int uretimyili, int vitesAdedi) {
        this.marka = marka;
        this.uretimyili = uretimyili;
        this.vitesAdedi = vitesAdedi;
    }

    abstract int HizlanmaSuresi();

    @Override
    public String toString() {
        return "BinekOto{" +
                "marka='" + marka + '\'' +
                ", uretimyili=" + uretimyili +
                ", vitesAdedi=" + vitesAdedi +
                '}';
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getUretimyili() {
        return uretimyili;
    }

    public void setUretimyili(int uretimyili) {
        this.uretimyili = uretimyili;
    }

    public int getVitesAdedi() {
        return vitesAdedi;
    }

    public void setVitesAdedi(int vitesAdedi) {
        this.vitesAdedi = vitesAdedi;
    }
}
