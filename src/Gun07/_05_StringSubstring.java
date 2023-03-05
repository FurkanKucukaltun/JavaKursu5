package Gun07;

public class _05_StringSubstring {
    public static void main(String[] args) {
        //Stringin belli bir bölümünü alma işini yapar
            //     0123456789
        String s1="Merhaba arkadaşlar";

        String parca1=s1.substring(3,9);  // 3 nolu index dahil, 9 dahil değilzx
        System.out.println("parca1 = " + parca1);


        String parca2=s1.substring(8,15);
        System.out.println("parca2 = " + parca2);

        String parca3=s1.substring(8); //verilenden başlayıp sonuna kadar alır
        System.out.println("parca3 = " + parca3);
    }
}
