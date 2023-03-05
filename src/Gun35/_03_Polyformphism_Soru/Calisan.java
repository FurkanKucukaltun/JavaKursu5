package Gun35._03_Polyformphism_Soru;

public class Calisan extends Kisi{

    // 2-Calisan isimli  ad, soyad, görevi , departmanı olan bir sınıf yazınız.

    private String departmani;

    public Calisan(String ad, String soyad, String gorevi,String departmani) {
        super(ad, soyad, gorevi);
        setDepartmani(departmani);
    }

//    @Override
//    public void kimlikBelgesi() {
//        System.out.println("çalısan belgesi formu oluşturuldu");
//    }

    public String getDepartmani() {
        return departmani;
    }

    public void setDepartmani(String departmani) {
        this.departmani = departmani;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "departmani='" + departmani + '\'' +
                "} " + super.toString();
    }
}
