package Gun43;

import java.util.Scanner;

public class _06_ThrowExample {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.println("yeni şifre oluşturma");
        System.out.println("yeni şifreniz:");
        String newPassword=oku.nextLine();

        if(newPassword.length()<8){
            System.out.println("lütfen Dikkat");
            System.out.println("şifre en az 8 karakter olmalı");
            //log tutma
        }
        if(newPassword.length()>15){
            System.out.println("lütfen Dikkat");
            System.out.println("şifre en fazla 15 karakter olmalı");
            //log tutma
        }




    }



}
