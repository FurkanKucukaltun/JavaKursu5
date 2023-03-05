package Gun30._02_FinalVariables.Ornek2;

import java.util.Scanner;

public class Soru {
    public static void main(String[] args) {
        // Sabitler isimli bir Class da sabit bir şekilde
        // bir gündeki saat sayısı, bir saatdaki dakika sayısı ve
        // bir dakikadaki saniye sayısını tanımlayınız.
        // mainde kullanıcıdan gun, saat, dakika alarak toplam
        // saniyeyi bulunuz.

        int gun=0;  // değerinin başlangıç değerinden emin olurum, best practice.
        int saat=0;
        int dakika=0;

        Scanner oku=new Scanner(System.in);
        System.out.println("Gun= "); gun= oku.nextInt();
        System.out.println("Saat= "); saat= oku.nextInt();
        System.out.println("Dakika= "); dakika= oku.nextInt();

        // 1. Yöntem

        int toplamSaniye=
                gun
                   *Sabitler.gundekisaat
                   *Sabitler.saattekidakika
                   *Sabitler.dakikadakisaniye
                +saat
                    *Sabitler.saattekidakika
                    *Sabitler.dakikadakisaniye
                +dakika
                    *Sabitler.dakikadakisaniye;

        System.out.println("toplamSaniye = " + toplamSaniye);

        //2. Yöntem
        System.out.println("Sabitler.hesapla(gun,saat,dakika) = "
                            + Sabitler.hesapla(gun,saat,dakika));
    }
}
