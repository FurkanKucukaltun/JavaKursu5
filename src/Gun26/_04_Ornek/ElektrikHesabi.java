package Gun26._04_Ornek;

public class ElektrikHesabi {
    int toplamTuketim=0;
    double birimFiyat=0.7;
    double fatura=0;

    public void tuketimEkle(int aylikTüketim){
        toplamTuketim+=aylikTüketim;
    }
    public void toplamTuketimYaz(){
        System.out.println("toplamTuketim = " + toplamTuketim);
    }

    public void faturaTaz(String isim){
        double toplamTutar=toplamTuketim*birimFiyat;
        System.out.println("****************************");
        System.out.println("          Faturanız");
        System.out.println("****************************");
        System.out.println("isim = " + isim);
        System.out.println("Toplam Tuketim = " + toplamTuketim);
        System.out.println("Toplam Tutar = " + Math.round(toplamTutar));
        System.out.println("****************************");



    }
}
