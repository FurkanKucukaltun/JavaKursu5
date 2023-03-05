package Gun10;

import java.util.Scanner;

public class _08_IfElse {
    public static void main(String[] args) {
        // yan yana aralarında bir boslukla girilen 3 int sayının
        // toplamlarının sonucunun tekmi çift mi olduğunu bulunuz
        // 45 67 123

        Scanner oku= new Scanner(System.in);
        System.out.print("sayilari bir boşluk alarak giriniz=");
        String sayi= oku.nextLine();


        String sayi1= sayi.substring(0,sayi.indexOf(" "));
        String sayi2= sayi.substring(sayi.indexOf(" ")+1,sayi.lastIndexOf(" "));
        String sayi3= sayi.substring(sayi.lastIndexOf(" ")+1);
        int sayi1dgr= Integer.parseInt(sayi1);
        int sayi2dgr= Integer.parseInt(sayi2);
        int sayi3dgr= Integer.parseInt(sayi3);
        if ((sayi1dgr+sayi2dgr+sayi3dgr)%2==0)
            System.out.println("sayıların toplamı çift");
        else System.out.println("sayıların toplamı çift değil");

    }
}
