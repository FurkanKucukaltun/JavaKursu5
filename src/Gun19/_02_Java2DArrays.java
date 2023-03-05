package Gun19;

import java.util.Arrays;

public class _02_Java2DArrays {
    public static void main(String[] args) {
        int [][] tablo = {  // 5 satır: 0,1,2,3,4
                {25,55},// 0. satır
                {234,22,33},// 1. satır
                {4,2,999,45,56,66},// 2. satır
                {42,12,9},// 3. satır
                {4} // 4. satır
        };

        System.out.println("satır miktarı = " + tablo.length);
        System.out.println("0. satırdaki sutun sayısı = " + tablo[0].length);
        System.out.println("1. satırdaki sutun sayısı = " + tablo[1].length);
        System.out.println("2. satırdaki sutun sayısı = " + tablo[2].length);
        System.out.println("3. satırdaki sutun sayısı = " + tablo[3].length);
        System.out.println("4. satırdaki sutun sayısı = " + tablo[4].length);

        // yazdırma bölümü
        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                System.out.print(tablo[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(tablo)); // !!! ONEMLI !!! 2D dizileri dizelere dönüştürüp yazdırır

    }
}
