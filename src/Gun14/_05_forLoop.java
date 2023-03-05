package Gun14;

import java.util.Scanner;

public class _05_forLoop {
    public static void main(String[] args) {
        // Girilen bir sayıya(dahil) kadar olan sayıların çarpımını bulunuz
        // 2. bölüm=çarpım değeri 100ü geçtiğinde işlem sonlansın

        Scanner oku = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi = oku.nextInt();
        int carpim = 1;

        for (int i = 1; i <= sayi; i++)
        {
            carpim = carpim * i;
            if (carpim >= 10000) {
                System.out.println("break çalıştı");
                break;
            }
        }
        System.out.println("carpim = " + carpim);


    }
}
