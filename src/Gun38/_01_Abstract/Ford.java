package Gun38._01_Abstract;

public class Ford extends BinekOto {
    public Ford(String marka, int uretimyili, int vitesAdedi) {
        super(marka, uretimyili, vitesAdedi);
    }

    @Override
    int HizlanmaSuresi() {
        return 0;
    }
}
