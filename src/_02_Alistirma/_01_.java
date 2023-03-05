package _02_Alistirma;

import java.util.Arrays;
import java.util.Scanner;

public class _01_ {
    public static void main(String[] args) {


        // 13- Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        // $ işaretlerini kaldırın ve sayıları toplayın. ........ Sayıların toplamını yazdırın.

        String dolar="$12 $23 $10 $2 $5 $2";
        String[] dgrdolar=(dolar.replace("$","")).split(" ");
        int toplam=0;
        for (int i = 0; i < dgrdolar.length; i++) {
            toplam = toplam + (Integer.parseInt(dgrdolar[i]));
        }
        System.out.println("toplam = " + toplam);


    }
}
