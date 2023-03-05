package Gun10;

import java.util.Scanner;

public class _07_IfElse {
    public static void main(String[] args) {

        // yan yana aralarında bir boslukla girilen 2 int sayının
        // birbirine eşit olup olmadığını bulunuz
        // 45 67


        Scanner oku= new Scanner(System.in);
        System.out.print("sayilari bir boşluk alarak giriniz=");
        String sayi= oku.nextLine();

        String sayi1= sayi.substring(0,sayi.indexOf(" "));
        String sayi2= sayi.substring(sayi.indexOf(" ")+1);
        int sayi1dgr= Integer.parseInt(sayi1);
        int sayi2dgr= Integer.parseInt(sayi2);
        if (sayi1dgr==sayi2dgr)
            System.out.println("sayılar eşit");
        else System.out.println("sayılar eşit değil");





    }
}
