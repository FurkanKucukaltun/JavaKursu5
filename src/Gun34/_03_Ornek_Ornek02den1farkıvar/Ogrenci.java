package Gun34._03_Ornek_Ornek02den1farkıvar;

public class Ogrenci {


    private final int id;
    private String isim;
    private OkulTipi okl;


    public Ogrenci(String isim, OkulTipi okl, int id) {
        setIsim(isim);
        setOkl(okl);
        this.id = id;
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


    @Override
    public String toString() {
        return "Ogrenci{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", okl=" + okl +
                '}';
    }
}
