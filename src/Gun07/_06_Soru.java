package Gun07;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {
       // Tek seferde girilen bir ad soyadın adını ve soyadını ayırıp ayrı ayrı yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("ad ve soyad giriniz=");
        String advsoyad= oku.nextLine();

        System.out.println("ad =" + advsoyad.substring(0,advsoyad.indexOf(" ")));
        System.out.println("soyad =" + advsoyad.substring(advsoyad.indexOf(" ")+1));

    }
}
