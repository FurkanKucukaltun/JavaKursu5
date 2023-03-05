package _02_Alistirma;

import java.util.Scanner;

public class _05_ {
    public static void main(String[] args) {

        // todo: bir dongu ile 5 tane rasgele buldurunuz
        // todo: fakat bir bulunan tekrar bulunmasın

        // 5 tv kanalı ismini bir diziye doldurunuz.
        // Daha sonra rndom olarak bir tanesini seçip ekrana seçileni yazıdırnız.


        String[] tvkanal = {"trt", "atv", "kanald", "fox", "habertürk"};

        for (int j = 1; j <tvkanal.length ; j++) {
            tvkanal=removeWord(tvkanal);

        }
    }

    public static String[] removeWord(String[] tvkanal) {
        String[] aztvkanal = new String[tvkanal.length - 1];

        for (int j =0; j <tvkanal.length ; j++) {

            int rastgele = (int) (Math.random() * tvkanal.length);
            int indexLess = 0;

            for (int i = 0; i < aztvkanal.length; i++) {
                if (i == rastgele) {
                    System.out.println(tvkanal[i]);
                } else if (i != rastgele) {
                    aztvkanal[indexLess] = tvkanal[i];
                    indexLess++;
                }
            }

        }
        return aztvkanal;

    }


}

