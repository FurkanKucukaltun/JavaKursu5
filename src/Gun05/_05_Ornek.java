package Gun05;

import java.util.Scanner;

public class _05_Ornek {
    public static void main(String[] args) {
        Scanner okuint=new Scanner(System.in);

        System.out.print("sayi1 = ");
        int sayi1=okuint.nextInt();
        System.out.print("sayi2= " );

        int sayi2=okuint.nextInt();
        int toplam=sayi1+sayi2;
        System.out.println("toplam = " + toplam);
    }
}
