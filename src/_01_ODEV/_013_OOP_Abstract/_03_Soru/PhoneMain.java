package _01_ODEV._013_OOP_Abstract._03_Soru;

import java.util.Scanner;

public class PhoneMain {
    public static void main(String[] args) {

        System.out.println("******* Apple Options *******");
        System.out.println("1. 64 GB ve 5.5 inch ");
        System.out.println("2. 64 GB ve 6.5 inch ");
        System.out.println("3. 128 GB ve 5.5 inch ");
        System.out.println("4. 128 GB ve 6.5 inch ");
        System.out.println("***********************");


        Scanner oku = new Scanner(System.in);
        System.out.print("Hafıza seçeneği : ");
        String str1 = oku.nextLine();
        System.out.print("Ekran boyutu : ");
        String str2 = oku.nextLine();

        Apple apple = new Apple();
        apple.options(str1, str2);

        System.out.println("******* Samsung Options *******");
        System.out.println("1. 256 GB ve 5.5 inch ");
        System.out.println("2. 256 GB ve 7.5 inch ");
        System.out.println("3. 512 GB ve 5.5 inch ");
        System.out.println("4. 512 GB ve 6.5 inch ");
        System.out.println("***********************");

        System.out.print("Hafıza seçeneği : ");
        String str3= oku.nextLine();
        System.out.print("Ekran boyutu : ");
        String str4= oku.nextLine();

        Samsung samsung=new Samsung();
        samsung.options(str3,str4);

        System.out.println("toplam borcunuz : "+Phone.getsum(Phone.cart)+" $");

    }
}
