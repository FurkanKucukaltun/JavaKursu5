package Gun36._06_Interface;

public class Dikdortgen implements IHesapla {

    @Override
    public double cevre(double kisakenar, double uzunkenar) {
        return 2*(kisakenar+uzunkenar);
    }

    @Override
    public double alan(double kisakenar, double uzunkenar) {
        return (kisakenar*uzunkenar);
    }
}
