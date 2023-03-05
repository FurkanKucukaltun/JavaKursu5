package _01_ODEV._013_OOP_Abstract._02_Soru;

import com.sun.org.apache.xpath.internal.operations.Div;

import java.util.Scanner;

public class MAIN_02SORU {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("1. sayi = ");
        int sayi1= oku.nextInt();
        System.out.print("2. sayi = ");
        int sayi2= oku.nextInt();

        Sum sm=new Sum();
        System.out.println("toplam = " + sm.calculating(sayi1,sayi2));

        Substract sub=new Substract();
        System.out.println("çıkarma = " + sub.calculating(sayi1,sayi2));

        Multiply mp=new Multiply();
        System.out.println("çarpma = " + mp.calculating(sayi1,sayi2));

        Divide dv=new Divide();
        System.out.println("bölme = " + dv.calculating(sayi1,sayi2));

    }
}
