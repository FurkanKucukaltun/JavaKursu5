package _01_ODEV._013_OOP_Abstract._03_Soru;

import java.util.Scanner;

public class Apple extends Phone{


    @Override
    void options(String a,String b) {


//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Seçiminiz :");
//        int secim = scan.nextInt();

        if(a.equalsIgnoreCase("64 GB") & b.equalsIgnoreCase("5.5 inch"))
            Phone.cart.add("$750");
        else if (a.equalsIgnoreCase("64 GB") & b.equalsIgnoreCase("6.5 inch"))
            Phone.cart.add("$850");
        else if (a.equalsIgnoreCase("128 GB") & b.equalsIgnoreCase("5.5 inch"))
            Phone.cart.add("$950");
        else if (a.equalsIgnoreCase("128 GB") & b.equalsIgnoreCase("6.5 inch"))
            Phone.cart.add("$1200");

    }
}
