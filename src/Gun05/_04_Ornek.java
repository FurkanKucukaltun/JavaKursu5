package Gun05;

import java.util.Scanner;

public class _04_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan Adını ve soyadını ayrı ayrı okutarak alıp
        // birlikte ekrana yazdırnız.

        Scanner oku=new Scanner(System.in);
        System.out.print("adınız =");
        String ad=oku.next();
        System.out.print("soyadınız=");
        String soyadi=oku.next();
        System.out.println("ad ve soyad= "+ad +" "+ soyadi);

        Scanner Add=new Scanner(System.in);
        System.out.print("adınız = ");
        String Ad=Add.nextLine();
        System.out.print("soyadınız = ");
        String Soyad=Add.nextLine();
        System.out.println("Adınız ve Soyadınız = "+Ad +" " + Soyad);

    }
}
