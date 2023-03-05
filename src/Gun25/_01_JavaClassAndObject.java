package Gun25;

public class _01_JavaClassAndObject {

    // metodların yazıldığı yer

    public static void main(String[] args) { // başla
        // ana programın yazıldığı ve çalıştığı yer
        int sayi=5;

        Araba benimarabam = new Araba();  // Araba tür, tip adı, benimarabam nesne
        benimarabam.marka="BMW";
        benimarabam.renk="beyaz";
        benimarabam.motorhacmi=1600;
        benimarabam.yili=2022;

        System.out.println("benimarabam.marka = " + benimarabam.marka);
        System.out.println("benimarabam.renk = " + benimarabam.renk);
        System.out.println("benimarabam.motorhacmi = " + benimarabam.motorhacmi);
        System.out.println("benimarabam.yili = " + benimarabam.yili);

    } //dur

    // metodların yazıldığı yer

}

// class-tiplerin yazıldığı yer
class Araba{

    String renk;
    int yili;
    String marka;
    int motorhacmi;

}
