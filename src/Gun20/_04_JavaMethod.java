package Gun20;

import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {
        //Kullanıcının gireceği 2 sayının toplamını
        //bir fonksiyonda buldurup, bunun sonucunu main de yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("1. sayı=");
        int sayi1= oku.nextInt();
        System.out.print("2. sayı=");
        int sayi2= oku.nextInt();
        int toplam=toplama(sayi1,sayi2);
        System.out.println("toplam = " + toplam);
    }
    public static int toplama (int s1, int s2){

        return s1+s2;
    }

}
