package Gun19;

import java.util.Arrays;

public class _01_Java2DArrays {
    public static void main(String[] args) {
        int [][] tablo = {
                {3, 25,55},
                {234,22,33}
        }; // 2 satırı 3 sütun

        System.out.println("satırın uzunlugu = " + tablo.length); // 2 // satır sayısı
        System.out.println("0. satırın oda sayısı = " + tablo[0].length); // 3, sutun uzunluğu
        System.out.println("1. satırın oda sayısı = " + tablo[1].length); // 3 sütun uzunluğu

        for (int i = 0; i < tablo.length; i++) {

            // ilgili satırdaki sutun uzunluğu

            for (int j = 0; j < tablo[i].length; j++) {
                System.out.print(tablo[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(tablo));
    }
}
