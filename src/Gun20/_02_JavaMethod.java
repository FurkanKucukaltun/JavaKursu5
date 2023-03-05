package Gun20;

import java.util.Scanner;

public class _02_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcının gireceği 2 sayıdan büyük olanını bulma işlemini bir metodda
        // yaptıktan sonra main de yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("1. sayı=");
        int sayi1= oku.nextInt();

        System.out.print("2. sayı=");
        int sayi2= oku.nextInt();


        int enb= buyuguBul(sayi1,sayi2);
        System.out.println("enb = " + enb);
    }
    public static int buyuguBul(int a, int b){

       // 1. yöntem
//        int donecek;
//
//        if(a>b)
//            donecek=a;
//        else
//            donecek=b;
//
//        return donecek;

        // 2. yöntem
        return a>b ? a : b;

        //3. yöntem
//        if(a>b)
//            return a;
//        else
//            return b;
    }
}
