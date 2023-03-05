package Gun19;

import java.util.Scanner;

public class _09_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcıdan 5 elemanlı bir diziyi doldurduktan sonra,
        // dizinin en küçük, en büyük elemanını ve
        // ortalamasını ayrı fonksiyonlarda bulup yazdırınız

        int[] dizi=new int[5];
        Scanner oku=new Scanner(System.in);
        for (int i = 0; i < dizi.length; i++) {
            System.out.print("diziyi doldurunuz:");
            dizi[i]=oku.nextInt();
        }
        enKucuk(dizi);
        enBuyuk(dizi);
        ortalama(dizi);
    }


    public static void enKucuk(int[] sayi){
        int enk=sayi[0];
        for (int i = 0; i < sayi.length; i++) {
            if (sayi[i]<enk)
                enk=sayi[i];
        }
        System.out.println("en küçük = " + enk);
    }

    public static void enBuyuk(int[] dizi){
        int enb=dizi[0];
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]>enb)
                enb=dizi[i];
        }
        System.out.println("en büyük = " + enb);


    }


    public static void ortalama(int[] dizi){

        int toplam=0;
        for (int i = 0; i < dizi.length; i++) {
            toplam=toplam+dizi[i];
        }
        int ort=toplam/dizi.length;
        System.out.println("ortalama = " + ort);



    }
}
