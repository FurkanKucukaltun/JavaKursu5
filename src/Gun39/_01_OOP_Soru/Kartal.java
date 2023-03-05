package Gun39._01_OOP_Soru;

public class Kartal extends Hayvan{
    public Kartal( String isim, boolean vahsi, String dogumTarihi) {
        super( isim, vahsi, dogumTarihi);
    }


    @Override
    public void yiyecegi() {
        System.out.println(getIsim() + " hayvan yer");

    }

    @Override
    public void yemekMiktari() {
        System.out.println(getIsim()+" 500 gr yer");

    }

    @Override
    public void gunlukUykuSuresi() {
        System.out.println(getIsim()+" günde 8 saat uyur");

    }

    @Override
    public void sesi() {
        System.out.println(getIsim()+ " cik cik der");

    }
}
