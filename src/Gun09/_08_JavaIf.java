package Gun09;

import java.util.Scanner;

public class _08_JavaIf {
    public static void main(String[] args) {
        // Kullanıcının 2 kez gireceği şifresinin aynı olduğunu
        // AYNI veya DEĞİL şeklinde cevaplayınız.  (confirm new password)

        Scanner oku=new Scanner(System.in);
        System.out.println("Şifre giriniz=");
        String sifre1= oku.nextLine();
        System.out.println("Şifreyi tekrar giriniz=");
        String sifre2=oku.nextLine();

        if (sifre2.equals(sifre1))
            System.out.println("aynı");

        if (!sifre2.equals(sifre1))
            System.out.println("değil");

    }
}
