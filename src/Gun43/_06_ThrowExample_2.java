package Gun43;

import java.util.Scanner;

public class _06_ThrowExample_2 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("yeni şifre oluşturma");
        System.out.println("yeni şifreniz:");
        String newPassword=oku.nextLine();

        try {
            if (newPassword.length() < 8) { // bu mesaj ile suni hata oluştur
                throw new Exception("şifre en az 8 karakter olmalı");

            }
            if (newPassword.length() > 15) { // bu mesaj ile suni hata oluştur
                throw new Exception("şifre en fazla 15 karakter olmalı");
            }
        }
        catch (Exception ex)
        {
          // hatalar bir yere toplanıp, hepsi için yapılması gereken işlemler
          // bir arada burada yapılabilir. mesela log tutma gibi
            System.out.println("lütfen Dikkat");
            System.out.println(ex.getMessage());
            // log tutma

        }
    }
}
