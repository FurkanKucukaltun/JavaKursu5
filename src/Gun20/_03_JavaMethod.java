package Gun20;

import java.util.Scanner;

public class _03_JavaMethod {
    public static void main(String[] args) {
        // kullanıcının gireceği bir sayıya kadar olan sayıların çarpımını (faktöryel)
        //bir fonksiyonda buldurup, bunun sonucunu main de tek mi çift mi olduğunu yazdırınız.

        Scanner oku= new Scanner(System.in);
        System.out.print("sınır sayi giriniz=");
        int sinir= oku.nextInt();

        int fakt=faktoriyel(sinir);
        System.out.println("fakt = " + fakt);

        if (fakt%2==0)
            System.out.println("sayiların çarpımı çift");
        else
            System.out.println("sayiların çarpımı tek");


    }
    public static int faktoriyel(int a) {


        int carpim = 1;
        for (int i = 1; i <= a; i++) {
            carpim = carpim * i;
        }
        return carpim;


    }
}
