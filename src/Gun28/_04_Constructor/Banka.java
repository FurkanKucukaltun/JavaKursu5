package Gun28._04_Constructor;

public class Banka {
    String adi;
    int SubeSayis;
    int Kurulusyili;

    public Banka() {
    }

    public Banka(String adi, int subeSayis, int kurulusyili) {
        this.adi = adi;
        this.SubeSayis = subeSayis;
        this.Kurulusyili = kurulusyili;
    }

    public Banka(String adi, int subeSayis) {
        this.adi = adi;
        this.SubeSayis = subeSayis;
    }


    @Override
    public String toString() {
        return "Banka{" +
                "adi='" + adi + '\'' +
                ", SubeSayis=" + SubeSayis +
                ", Kurulusyili=" + Kurulusyili +
                '}';
    }
}
