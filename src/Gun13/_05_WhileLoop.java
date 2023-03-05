package Gun13;

import java.util.Scanner;

public class _05_WhileLoop {
    public static void main(String[] args) {
        // 100 e kadar olan sayıların toplamını bulunuz


        int toplam=0;
        int sayi=1;

        while(sayi<=100) {


            toplam = toplam + sayi;

            sayi++;
        }

        System.out.println("toplam"+toplam);
    }
}
