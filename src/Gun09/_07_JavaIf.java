package Gun09;

import java.util.Scanner;

public class _07_JavaIf {
    public static void main(String[] args) {

        // Girilen bir cümledeki küçük veya büyük a harfinin olup olmadığını yazdırınız
        // VAR veya YOK diye

        Scanner oku=new Scanner(System.in);
        System.out.print("cümle yazınız=");
        String cumle=oku.nextLine();


        if(cumle.toLowerCase().contains("a"))
            System.out.println("EVET");
        if(!cumle.toLowerCase().contains("a"))
            System.out.println("HAYIR");
    }
}
