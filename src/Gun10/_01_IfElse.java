package Gun10;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        // Girilen bir öğrenci notuna göre 50 den büyük eşit ise geçtiniz
        // küçük ise kaldınız yazdırınız

        Scanner oku= new Scanner(System.in);
        System.out.println("notu giriniz=");
        int orgNot=oku.nextInt();

        //1. Yöntem (önceki)
        if(orgNot>=50)
            System.out.println("Geçtiniz");

        if(orgNot<50)
            System.out.println("Kaldınız");

        //2. Yöntem olması gereken

        if (orgNot >= 50) {// herzaman tek bir kontrol yapar : baklava dilimi
            System.out.println("Geçtiniz");  // evet
            System.out.println("tebrikler");
        }
        else { // değilse yapılacaklar
            System.out.println("Kaldınız");  // hayır
        }

    }
}
