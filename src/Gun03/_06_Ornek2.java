package Gun03;

public class _06_Ornek2 {
    public static void main(String[] args) {
        // Ornek Soru : yarıcapı(r) verilen bir dairenin cevresini ve alanını bulunuz
        // alan= pi*yaricap*yaricap    cevre = 2*pi*yaricap     " pi=3.14 "

        double yaricap=4;

        double alan = 3.14 * yaricap * yaricap;
        double cevre =  2 * 3.14 * yaricap;

        System.out.println("cevre = "+ cevre);
        System.out.println("alan = " + alan);

        double radious = 5;
        double cvr = 2*3.14*radious;
        System.out.println("cvr = " + cvr);

    }
}
