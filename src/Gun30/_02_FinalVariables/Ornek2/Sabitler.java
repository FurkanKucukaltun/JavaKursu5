package Gun30._02_FinalVariables.Ornek2;

public class Sabitler {

    final static int gundekisaat=24; //değişmeyen değer olduğu için final sadece bir tane olduğu için static yazdık
    final static int saattekidakika=60; //değişmeyen değer olduğu için final sadece bir tane olduğu için static yazdık
    final static int dakikadakisaniye=60; //değişmeyen değer olduğu için final sadece bir tane olduğu için static yazdık


    public static int hesapla(int gun, int saat, int dakika) {

    int toplamSaniye =
            gun
            *gundekisaat
            *saattekidakika
            *dakikadakisaniye
            +saat
            *saattekidakika
            *dakikadakisaniye
            +dakika
            *dakikadakisaniye;

    return toplamSaniye;
    }
}
