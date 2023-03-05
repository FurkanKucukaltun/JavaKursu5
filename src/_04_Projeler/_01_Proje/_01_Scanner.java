package _04_Projeler._01_Proje;

import java.util.Scanner;

public class _01_Scanner {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Lütfen isminizi giriniz: ");
        String isim= oku.nextLine();
        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();

        System.out.print(isim+" hosgeldin, soyismini girer misin? : ");
        String soyisim= oku.nextLine();
        soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase();

        System.out.print(isim + " " + soyisim + " isminiz doğru ise devam etmek için'Y' tuşuna basınız...: " );
        boolean dogrumu=false;
        do {

            String harf=oku.nextLine();
            if (!harf.equalsIgnoreCase("y"))
                System.out.print("Tercihinizi dogru yapmadiniz...Lutfen tekrar deneyin...: ");
            else if (harf.equalsIgnoreCase("y")) {
                dogrumu=true;
                System.out.println("Isim ve Soyisminiz sisteme basarili bir sekilde kayit edilmistir...");
            }
        }while(dogrumu==false);

        System.out.print("Lutfen kullanici adnizi belirleyin...: ");
        String username= oku.nextLine();

        boolean sifre=false;
        do {

            System.out.print("Lutfen sifrenizi belirleyiniz...: ");
            String sifre1= oku.nextLine();
            System.out.print("Sifrenizi tekrar giriniz...: ");
            String sifre2= oku.nextLine();

            if (!sifre1.equals(sifre2))
                System.out.println("Yanlis veya hatali bir sifre girdiniz, lutfen tekrar deneyin...: ");

            else
                sifre=true;
        }while(sifre==false);

        System.out.println("Tebrikler... " + username + " kullanici adiyla sisteme kayit oldunuz...");

    }


}
