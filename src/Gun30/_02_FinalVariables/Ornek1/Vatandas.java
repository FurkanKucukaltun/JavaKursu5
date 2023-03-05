package Gun30._02_FinalVariables.Ornek1;

public class Vatandas {
    String isim;
    final int tcNo; // final -> değiştirilemez
    // yani sadece 1 kez veri atama şansı var.

    static int tcNoSayac=1;

    public Vatandas(String isim) {
        this.isim = isim;
        this.tcNo=tcNoSayac++;
        // final değişkenlerine sadece 1 kez veri atanabilir.
        // o da ya tanımlarken, ya da Constructor da
    }

    @Override
    public String toString() {
        return "Vatandas{" +
                "isim='" + isim + '\'' +
                ", tcNo=" + tcNo +
                '}';
    }
}
