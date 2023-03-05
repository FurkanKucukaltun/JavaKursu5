package Gun34._02_Ornek;

public class Ogrenci {


    private final int id;
    private String isim;
    private OkulTipi okl;

    private static int sayac = 1;

    public Ogrenci(String isim, OkulTipi okl) {
        this.id = sayac++;
        setIsim(isim);
        setOkl(okl);
    }


    public int getId() {
        return id;
    }


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public OkulTipi getOkl() {
        return okl;
    }

    public void setOkl(OkulTipi okl) {
        this.okl = okl;
    }

    public static int getSayac() {
        return sayac;
    }

    public static void setSayac(int sayac) {
        Ogrenci.sayac = sayac;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", okl=" + okl +
                '}';
    }
}
