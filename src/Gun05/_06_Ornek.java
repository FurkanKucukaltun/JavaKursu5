package Gun05;

import java.util.Scanner;

public class _06_Ornek {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        System.out.print("kenar uzunlugu = " );
        int knr= oku.nextInt();
        int cevre=4*knr;
        int alan=knr*knr;
        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);


    }
}
