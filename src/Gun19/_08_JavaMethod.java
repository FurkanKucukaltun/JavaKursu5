package Gun19;

import java.util.Arrays;

public class _08_JavaMethod {
    public static void main(String[] args) {
        // mainde 20 elemanlı bir diziyi tanımlayınız, daha sonra bir fonksiyona
        // göndererek random 100 e kadar olan sayılarla dodurunuz. ve aynı fonksiyonda
        // yazdırınız.


        int[]dizi=new int[20];
        elemanyazdir(dizi); //!!! dikkat metodu çağırdığımız da yazdırma işleminde metod içerisindeki dizi adını verdi.
    }

    public static void elemanyazdir(int[] sayilar ){

        for (int i = 0; i < 20; i++) {
            sayilar[i]=(int)(Math.random()*100);
        }

        System.out.println("sayilar =" + Arrays.toString(sayilar));
    }
}
