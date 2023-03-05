package Gun05;

import java.util.Scanner;

public class _03_Ornek {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        System.out.print("adiniz ve soyadınız="); // ekrana neyin girileceğini yazdık, bilgilendirme
        String adsoyad=oku.nextLine(); //okuma işlemi bu noktada yapılıyor.
        System.out.println("adsoyad = " + adsoyad);

    }
}
