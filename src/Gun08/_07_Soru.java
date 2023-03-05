package Gun08;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        // kullanıcının gireceği 2 sayının birbirine
        // eşit mi olup olmadığını yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("1. sayi giriniz=");
        int a= oku.nextInt();
        System.out.print("2. sayi giriniz=");
        int b=oku.nextInt();
        System.out.println("eşit mi = " + (a==b));

        //ya da

        boolean esitmi=(a==b);
        System.out.println("esit mi = " + esitmi);



    }
}
