package _01_ODEV._013_OOP_Abstract._04_Soru;

import java.util.Scanner;

public class MAIN_04 {

    public static void main(String[] args) {
        Circle cr=new Circle(5);
        System.out.println("Circle Area = " + cr.getArea());
        Rectangle rc=new Rectangle(4,6);
        System.out.println("Rectangle Area = " + rc.getArea());
    }
}
