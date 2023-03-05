package Gun06;

import sun.security.util.Length;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {
        
       // Girilen bir stringin son harfini yazınız

        Scanner oku=new Scanner(System.in);

        System.out.println("Bir cümle giriniz");
        String cumle=oku.nextLine();

        int uzunluk=cumle.length();
        char sonharf=cumle.charAt(uzunluk-1);
        System.out.println("sonharf = " + sonharf);

    }
}
