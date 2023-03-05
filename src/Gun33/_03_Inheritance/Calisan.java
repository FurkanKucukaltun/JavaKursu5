package Gun33._03_Inheritance;

public class Calisan {
//       Calisan isminde bi class tanımlayınız properties/fields(isim, maas, maasKatSayisi(int))
//        consructor ve maashesapla Metodu(maas*maasKatSayisi) ekleyiniz. toString metodu ekleyiniz.

    private String isim;
    private int maas;
    private double maasKatSayisi;

    public Calisan(String isim, int maas, double maasKatSayisi) {
        setIsim(isim);
        setMaas(maas);
        setMaasKatSayisi(maasKatSayisi);
    }

    public double maashesapla(){

        return maas*maasKatSayisi;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public double getMaas() {
        return maashesapla();
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public double getMaasKatSayisi() {
        return maasKatSayisi;
    }

    public void setMaasKatSayisi(double maasKatSayisi) {
        this.maasKatSayisi = maasKatSayisi;
    }




    @Override
    public String toString() {
        return "Calisan{" +
                "isim='" + isim + '\'' +
                ", maas=" + maashesapla() +
                ", maasKatSayisi=" + maasKatSayisi +
                ", verilecek maaş=" + maashesapla() +
                '}';
    }
}
