package Gun32._03_Encapsulation;

public class Ogrenci {
    //  1- fieldları ad, soyad, yas olan bir Ogrenci sınıfı tanımlayınız.
    private String ad;
    private String soyad;
    private int yas;

    private int id;

    static int idSayac=1;

    public Ogrenci(String ad, String soyad, int yas) {
        setAd(ad);
        setSoyad(soyad);
        setYas(yas);
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                ", id=" + id +
                '}';
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        if (ad.length()<25)
           this.ad = ad;
        else
            System.out.println("yanlıs ad yazdınız");
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        if (soyad.length()<25)
            this.soyad = soyad;
        else
            System.out.println("yanlıs soyad yazdınız");
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
     this.yas=yas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}

