package Gun39._01_OOP_Soru;

public abstract class Hayvan {
    //1- id(int) ,isim(String), vahsi(boolean), dogumTarihi (String) fieldları olan ve
    //   void yiyecegi, void yemekMiktari, void gunlukUykuSuresi ve void sesi isimlerinde abstract metodları,
    //   toString şeklinde normal metodu ve get ve set leri olan Hayvan isminde
    //   bir abstract class yazınız.

    private int id;
    private String isim;
    private boolean vahsi;
    private String dogumTarihi;
    private static int sayac=1;
    public abstract void yiyecegi();
    abstract public void yemekMiktari();
    abstract public void gunlukUykuSuresi();
    abstract public void sesi();



    public Hayvan( String isim, boolean vahsi, String dogumTarihi) {
        this.id = sayac++;
        this.isim = isim;
        this.vahsi = vahsi;
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {

        System.out.print("yiyeceği: "); yiyecegi();
        System.out.print("yemek miktarı: "); yemekMiktari();
        System.out.print("uyku süresi: "); gunlukUykuSuresi();
        System.out.print("sesi: "); sesi();

        return "Hayvan{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", vahsi=" + vahsi +
                ", dogumTarihi='" + dogumTarihi + '\'' +
                '}';
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

    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }
}
