package Gun32._03_Encapsulation;

import java.util.ArrayList;

public class Okul {
    //  4- okul isimli bir class tanımlayınız, fieldları okulAd, kontenjan,
    //     ArrayList cinsinden Öğrencileri olsun.

    private String okulAd;
    private int kontenjan;
    private ArrayList<Ogrenci> ogrenciler=new ArrayList<>();


    public Okul(){

    }

    public Okul(String okulAd, int kontenjan) {
        setOkulAd(okulAd);
        setKontenjan(kontenjan);;
    }

    public String getOkulAd() {
        return okulAd;
    }

    public void setOkulAd(String okulAd) {
        this.okulAd = okulAd;
    }

    public int getKontenjan() {
        return kontenjan;
    }

    public void setKontenjan(int kontenjan) {
        this.kontenjan = kontenjan;
    }

    public ArrayList<Ogrenci> getOgrenciler() {
        return ogrenciler;
    }

    public void setOgrenciler(ArrayList<Ogrenci> ogrenciler) {
        this.ogrenciler = ogrenciler;
    }
}
