package Gun05;

import java.util.Scanner;

public class _01_JavaScanner {
    public static void main(String[] args) {

        Scanner okuyucu= new Scanner(System.in);
//      tipi    adı     yeni okuyucu (klavyeden-konsoldan)
        System.out.print("sayi giriniz=");
        int sayi=okuyucu.nextInt(); // kursar bekliyor sayı girişi için
        //rakam girilip entra basıldığında değeri alıp sayıya atıyor

        System.out.println("sayi = " + sayi);

        Scanner nnn=new Scanner(System.in);
        System.out.println("deger = ");
        int mmm=nnn.nextInt();
        System.out.println("mmm = " + mmm);

    }
}
