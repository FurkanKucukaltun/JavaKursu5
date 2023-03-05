package Gun33._03_Inheritance;

public class GenelMudur extends Calisan{

    //  GenelMudur isimli bir classı Calisan sınıfından türetip, extra field olarak tazminat ekleyiniz.
    //  GenelMudur classında maasHesaplaya tazminat da ekleyiniz.

    private int tazminat;

    public GenelMudur(String isim, int maas, double maasKatSayisi, int tazminat) {
        super(isim, maas, maasKatSayisi);
        setTazminat(tazminat);
    }

    @Override
    public double maashesapla() {
        return super.maashesapla()+getTazminat();

    }

    public int getTazminat() {
        return tazminat;
    }

    public void setTazminat(int tazminat) {
        this.tazminat = tazminat;
    }

    @Override
    public String toString() {
        return "GenelMudur{" +
                "isim='" + getIsim() + '\'' +
                ", maas=" + getMaas() +
                ", maasKatSayisi=" + getMaasKatSayisi() +
                ", verilecek maaş=" + maashesapla() +
                "tazminat=" + tazminat +
                '}';
    }
}
