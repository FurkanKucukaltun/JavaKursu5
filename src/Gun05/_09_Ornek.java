package Gun05;

import java.util.Scanner;

public class _09_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan ağırlığını double, boyunu double olarak alınız.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazrınız.
        // vucut kıtle ındexını de bularak yazdırınız ( kg/ boy*boy)
        Scanner oku=new Scanner(System.in);

        System.out.print("kilonuz=");
        double kilo= oku.nextDouble();
        System.out.print("boyunuz=");
        double boy=oku.nextDouble();
        System.out.println("boyunuz="+boy+ " " +"kilonuz="+kilo);
        double vki=kilo/(boy*boy);
        System.out.println("vki = " + vki);

    }
}
