package Gun12;

import java.util.Scanner;

public class _01_JavaRandom {
    public static void main(String[] args) {
        // 0-5 arası gibi sayılar ürettik hep sıfırdan başladı
        // 4-9 arası nasıl ürettirirdim
        // yöntem : önce aralık kadar normal üret (9-4) yani 0-5 arası
        // ürettirilmiş olan sayıya min sayıyı ekle, ürettirilmiş sayı + 4
        // (int)(Math.Random*(max-min))+min

        // Girilen max ve min aralığında random sayı ürettiriniz

        Scanner oku= new Scanner(System.in);
        System.out.println("min=");
        int min= oku.nextInt();

        System.out.println("max=");
        int max= oku.nextInt();

        int rndSayi= (int)(Math.random()*(max-min)) + min;
        System.out.println("rndSayi = " + rndSayi);


    }
}
