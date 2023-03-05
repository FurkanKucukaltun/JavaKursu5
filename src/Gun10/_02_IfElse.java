package Gun10;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        // Girilen vize(%50) ve final(%50) notunu okuyarak ortalamayı bulunuz
        // ortalama 60 dan büyük-eşit ise geçtiniz, tebrikler yazdırınız, değilse
        // bütünlemeye kaldınız şeklinde yazdırınız.

        Scanner oku= new Scanner(System.in);
        System.out.print("vize=");
        int vize= oku.nextInt();
        System.out.println("final=");
        int finnal= oku.nextInt();
        int ort= (vize+finnal)/2;
        if (ort>=60)
            System.out.println("geçtiniz, tebrikler");
        else
            System.out.println("bütünlemeye kaldınız");

        // süslü parantes kuralı : sadece 1 satır (;) çalışacak ise zorunlu değil
        // birden fazla ise zorunlu. her zaman koyulabilir, hiç bir mahsuru yok.

    }
}
