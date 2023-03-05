package Gun05;

import java.util.Scanner;

public class _07_Ornek {
    public static void main(String[] args) {
        /*
        Scanner oku=new Scanner(System.in);

        System.out.print("kisa kenar= ");
        int kisaknr=oku.nextInt();
        System.out.print("uzun kenar = " );
        int uzunknr= oku.nextInt();
        int cevre=(2*kisaknr)+(2*uzunknr);
        int alan= kisaknr*uzunknr;
        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);

         */

        Scanner okuu=new Scanner(System.in);
        System.out.print("kısa kenar =");
        int kk=okuu.nextInt();
        System.out.print("uzun kenar =");
        int uk=okuu.nextInt();
        int cvr=2*kk+2*uk;
        System.out.println("cvr = " + cvr);


    }
}
