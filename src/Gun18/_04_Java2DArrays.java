package Gun18;

import java.util.Scanner;

public class _04_Java2DArrays {
    public static void main(String[] args) {
        // 2 ye 3 lük bir tabloyu kullanıcıdan sayı alarak doldurunuz
        // daha sonra ayrı bir döngü de en büyük sayıyı bulunuz.

        // burası okuma işlemi
        Scanner oku = new Scanner(System.in);
        int [][] tablo= new int[2][3];

        for (int satir = 0; satir < 2; satir++) {
            for (int sutun = 0; sutun < 3; sutun++) {
                System.out.print("Sayi giriniz= ");
                tablo[satir][sutun]= oku.nextInt();
            }
        }

        // burası yazma işlemi

        for (int satir = 0; satir < 2; satir++) {
            for (int sutun = 0; sutun < 3; sutun++) {
                System.out.println("tablo = " + tablo[satir][sutun]+"\t");
            }
            System.out.println();
        }


        // en buyuk bulma işlemi
        int enb=tablo[0][0];

        for (int satir = 0; satir < 2; satir++) {

            for (int sutun = 0; sutun < 3; sutun++){

                if (tablo[satir][sutun] >enb);
                    enb=tablo[satir][sutun];
            }
        }
        System.out.println("enb = " + enb);


    }
}
