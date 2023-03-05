package Gun35._03_Polyformphism_Soru;

public class Kisi {
    private String ad;
    private String soyad;
    private String gorevi;

    public Kisi(String ad, String soyad, String gorevi) {
        this.ad = ad;
        this.soyad = soyad;
        this.gorevi = gorevi;
    }



    @Override
    public String toString() {
        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", gorevi='" + gorevi + '\'' +
                '}';
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getGorevi() {
        return gorevi;
    }

    public void setGorevi(String gorevi) {
        this.gorevi = gorevi;
    }

    public static void kimlikBelgesi(Kisi gelenKisi){
        System.out.println("\n******* Kimlik Belgesi*******");
        System.out.println("ad =" + gelenKisi.ad);
        System.out.println("soyad = "+gelenKisi.soyad);
        System.out.println("görevi = "+ gelenKisi.gorevi);

        if (gelenKisi instanceof Ogrenci)
            System.out.println("Şubesi ="+(((Ogrenci) gelenKisi).getSubesi()));
        else if(gelenKisi instanceof Calisan)
            System.out.println("Departmanı ="+((Calisan)gelenKisi).getDepartmani());
    }
}
