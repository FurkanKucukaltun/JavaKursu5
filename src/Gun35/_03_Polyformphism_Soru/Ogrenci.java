package Gun35._03_Polyformphism_Soru;

public class Ogrenci extends Kisi{
    // 1-Ogrenci isimli  ad , soyad, görevi , subesi olan bir class yazınız

    private String subesi;

    public Ogrenci(String ad, String soyad, String gorevi,String subesi) {
        super(ad, soyad, gorevi);
        setSubesi(subesi);
    }

//    @Override
//    public void kimlikBelgesi() {
//        System.out.println("öğrenci belgesi formu oluşturuldu");
//    }

    public String getSubesi() {
        return subesi;
    }

    public void setSubesi(String subesi) {
        this.subesi = subesi;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "subesi='" + subesi + '\'' +
                "} " + super.toString();
    }
}
