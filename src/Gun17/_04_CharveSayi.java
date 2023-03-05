package Gun17;

public class _04_CharveSayi {
    public static void main(String[] args) {

        // Harf ve rakam eşleştirme tablosuna ascii tablosu denir.

        /*0->
        1->
        .
        .
        .
        65->A
        66->B
        .
        .
        .
        97->a
        .
        .
        255*/

        int sayi = 65;

        System.out.println("sayi = " + sayi);
        char harf = (char) sayi;
        System.out.println("harf = " + harf);

        sayi = 97;
        harf = (char) sayi;
        System.out.println("harf = " + harf);

        for (int i = 0; i <= 255; i++) {
            harf = (char) i;
            System.out.println(i + " .harf = " + harf);

        }
        char h='a';
        int b=(int) h;
        System.out.println("b = " + b);
    }
}
