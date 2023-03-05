package _01_ODEV;

import java.util.Scanner;

public class _02_ODEV_SEYDA {
    public static void main(String[] args) {
        //1- Bir String oluşturun. Konsol'a isminizi girin. İsminizi yazdırın.
        Scanner string=new Scanner(System.in);
        System.out.print("Adınız=");
        String isim=string.next();
        System.out.println("İsim = " + isim);

        //2- Bir int oluşturun.Konsol'a herhangi bir sayı giriniz.Bu sayıyı yazdırın.
        Scanner integer=new Scanner(System.in);
        System.out.print("sayi=");
        int sayi=integer.nextInt();
        System.out.println("Sayı = " + sayi);

        //3- Bir String oluşturun.Konsol'a sevdiğiniz bir meyveyi yazın.O meyveyi yazdırınız.
        System.out.print("sevdiğiniz bir meyveyi giriniz=");
        String meyve=string.next();
        System.out.println("Meyve = " + meyve);

        //4- Bir int oluştur.Konsol'a arabanızdaki kapı sayısını girin.Bu int'i yazdırın.
        System.out.print("Arabanızın kapı sayısını giriniz=");
        int KapiAdet =integer.nextInt();
        System.out.println("Kapı sayısı= " + KapiAdet);

        //5- Bir String oluştur.Konsol'a 10 sene önceki yaşadığın şehri yazın.Bu String'i yazdırın.
        System.out.print("10 sene önce yaşadığınız şehri giriniz= ");
        String onSeneOnce=string.next();
        System.out.println("10 sene önce yaşadığınız şehir " + onSeneOnce);

        //6- Bir string oluşturunuz.Doğum gününüzü konsola giriniz.String'i yazdırınız.
        System.out.print("Doğum tarihinizi giriniz= ");
        String dgmGunu=string.next();
        System.out.println("Doğum tarihiniz= " + dgmGunu);

        //7- Bir boolean oluşturunuz.Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
        // Varsa True , yoksa False olarak  konsoldan cevap veriniz.Boolean'ı yazdırınız.
        Scanner boo=new Scanner(System.in);
        System.out.print("Bir banka hesabınız var mı=");
        Boolean hsp=boo.nextBoolean();
        System.out.println("Hesaba sahip misiniz= " + hsp);

        //8- Bir byte oluşturunuz.Konsola kg cinsinden bir ağırlık yazınız.Byte'ı yazdırınız.
        Scanner BYT=new Scanner(System.in);
        System.out.print("kg cinsinden bir ağırlık= ");
        byte kg=BYT.nextByte();
        System.out.println("kg = " + kg);

        //9- Bir float oluşturunuz. Konsola boyunuzu giriniz. Float'ı yazdırınız.
        Scanner FLT=new Scanner(System.in);
        System.out.print("Boyunuz= ");
        float boy= FLT.nextFloat();
        System.out.println("boy = " + boy);

    }
}
