package Gun38._02_Abstract;

public class Dikdortgen extends Sekil{

    private double kisakenar;
    private double uzunkenar;

    public Dikdortgen(double kisakenar, double uzunkenar) {
        setKisakenar(kisakenar);
        setUzunkenar(uzunkenar);
    }

    @Override
    public double alan() {
        return this.kisakenar*this.uzunkenar;
    }

    @Override
    public double cevre() {
        return 2*(this.kisakenar+this.uzunkenar);
    }

    public double getKisakenar() {
        return kisakenar;
    }

    public void setKisakenar(double kisakenar) {
        this.kisakenar = kisakenar;
    }

    public double getUzunkenar() {
        return uzunkenar;
    }

    public void setUzunkenar(double uzunkenar) {
        this.uzunkenar = uzunkenar;
    }
}
