package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _03_Java2DArrays {
    public static void main(String[] args) {
        // Günün Sorusu :  3x2 lik bir diziyi kullanıcıdan sayı alarak
        // doldurduktan sonra sadece tek elemenlarını tek boyutlu bir
        // diziye atayınız.

        int [][] tablo = new int[3][2];
        Scanner oku= new Scanner(System.in);

        // burası okuma işlemi
        int tekMik=0;
        for (int satir = 0; satir < tablo.length; satir++) {
            for (int sutun = 0; sutun < tablo[satir].length; sutun++) {
                System.out.print("sayı giriniz=");
                tablo[satir][sutun]= oku.nextInt();

                if (tablo[satir][sutun]%2!=0)
                    tekMik++;

            }
        }
        System.out.println(Arrays.deepToString(tablo)); // 2 boyutlu dizileri dizelere dönüştürüp yazdırır

        int [] teklerDizisi=new int[tekMik]; // teklerin miktarı kadar bir dizi tanımlandı
        tekMik=0;
        for (int satir = 0; satir < tablo.length; satir++) {
            for (int sutun = 0; sutun < tablo[satir].length; sutun++) {
                if (tablo[satir][sutun]%2!=0){
                    teklerDizisi[tekMik]=tablo[satir][sutun];
                    tekMik++;
                }
            }
        }
        System.out.println(Arrays.toString(teklerDizisi));

    }
}
