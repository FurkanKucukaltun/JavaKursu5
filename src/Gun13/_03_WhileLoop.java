package Gun13;

import java.util.Scanner;

public class _03_WhileLoop {
    public static void main(String[] args) {
        // girilen 5 sayını toplamının sonucunu yazdırınız

        int toplam=0;
        int sayac=1;

        while(sayac<5) {

            Scanner oku= new Scanner(System.in);
            System.out.print(sayac+".sayi=");
            int sayi= oku.nextInt();

            toplam = toplam + sayi;

            sayac++;
        }

        System.out.println("toplam"+toplam);

    }
}
