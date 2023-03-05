package Gun11;

public class _08_JavaRandom {
    public static void main(String[] args) {
        // Math.Random() : double sayı üretir. 0-0,9999999 arası üretir


        double rndSayi= Math.random();
        System.out.println("rndSayi = " + rndSayi);

        // 0-6 arası üretsin
        // 6 ile çarparım
        // 0-5,99999999
        // int çevirirsem 0-5

        int rndTamsayi = (int)(Math.random()*6);
        System.out.println("rndTamsayi = " + rndTamsayi);


    }
}
