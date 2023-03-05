package Gun39._01_OOP_Soru;

public class Kedi extends Hayvan{
    public Kedi(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }


    @Override
    public void yiyecegi() {
        System.out.println(getIsim()+" kedi maması yer");

    }

    @Override
    public void yemekMiktari() {
        System.out.println(getIsim()+" 250gr mama yer");

    }

    @Override
    public void gunlukUykuSuresi() {
        System.out.println(getIsim()+" günde 12 saat uyur");

    }

    @Override
    public void sesi() {
        System.out.println(getIsim()+" miyavlar");

    }
}
