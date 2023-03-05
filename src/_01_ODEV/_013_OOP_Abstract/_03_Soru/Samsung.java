package _01_ODEV._013_OOP_Abstract._03_Soru;

import java.util.Scanner;

public class Samsung extends Phone{


    @Override
    void options(String a,String b) {

        if(a.equalsIgnoreCase("256 GB") & b.equalsIgnoreCase("5.5 inch"))
            Phone.cart.add("$1000");
        else if (a.equalsIgnoreCase("256 GB") & b.equalsIgnoreCase("7.5 inch"))
            Phone.cart.add("$1200");
        else if (a.equalsIgnoreCase("512 GB") & b.equalsIgnoreCase("5.5 inch"))
            Phone.cart.add("$1300");
        else if (a.equalsIgnoreCase("512 GB") & b.equalsIgnoreCase("6.5 inch"))
            Phone.cart.add("$1400");

    }

}
