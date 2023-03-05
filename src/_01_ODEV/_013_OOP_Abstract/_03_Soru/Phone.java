package _01_ODEV._013_OOP_Abstract._03_Soru;

import java.util.ArrayList;

public abstract class Phone {
    static ArrayList<String> cart=new ArrayList<>();

    public static int getsum(ArrayList<String> cart){

        int toplam=0;
        for (String a : cart) {
            int digit = (int) Integer.parseInt(a.replaceAll("[^0-9]", ""));
            toplam += digit;

           }
        return toplam;
    }

    abstract void options(String a, String b);

}
