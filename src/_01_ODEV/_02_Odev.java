package _01_ODEV;

import java.util.Scanner;

public class _02_Odev {
    public static void main(String[] args) {
        //1- Bir String oluşturun. Konsol'a isminizi girin.İsminizi yazdırın.
        Scanner ad = new Scanner(System.in);
        System.out.print("isminiz = ");
        String isim = ad.next();
        System.out.println("isim = " + isim);

        //2- Bir int oluşturun.Konsol'a herhangi bir sayı giriniz.Bu sayıyı yazdırın.
        Scanner sayi1 = new Scanner(System.in);
        System.out.print("sayi giriniz = ");
        int sayi_1 = sayi1.nextInt();
        System.out.println("sayi_1 = " + sayi_1);

        //3- Bir String oluşturun.Konsol'a sevdiğiniz bir meyveyi yazın.O meyveyi yazdırınız.
        Scanner meyve = new Scanner(System.in);
        System.out.print("sevdiğiniz meyvenin adını giriniz = ");
        String favori_meyve = meyve.nextLine();
        System.out.println("favori_meyve = " + favori_meyve);

        //4- Bir int oluştur.Konsol'a arabanızdaki kapı sayısını girin.Bu int'i yazdırın.
        Scanner kapi = new Scanner(System.in);
        System.out.print("arabanızdaki kapı sayisini giriniz = ");
        int kapi_sayisi = kapi.nextInt();
        System.out.println("kapi_sayisi = " + kapi_sayisi);

        //5- Bir String oluştur.Konsol'a 10 sene önceki yaşadığın şehri yazın.Bu String'i yazdırın.
        Scanner sehir = new Scanner(System.in);
        System.out.print("on sene önceki yaşadığın şehrin adı nedir? = ");
        String sehir_adi = sehir.nextLine();
        System.out.println("sehir_adi = " + sehir_adi);

        //6- Bir string oluşturunuz.Doğum gününüzü konsola giriniz.String'i yazdırınız.
        Scanner dgm_gunu = new Scanner(System.in);
        System.out.print("Dogum Gününüz = ");
        String dogum_gunu = dgm_gunu.nextLine();
        System.out.println("dogum_gunu = " + dogum_gunu);

        //7- Bir boolean oluşturunuz.Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
        // Varsa True , yoksa False olarak  konsoldan cevap veriniz.Boolean'ı yazdırınız.
        Scanner bnk_hsp = new Scanner(System.in);
        System.out.print("Bir Banka Hesabınız Var mı ? =");
        Boolean banka_hesabı = bnk_hsp.nextBoolean();
        System.out.println("banka_hesabı = " + banka_hesabı);

        //8- Bir byte oluşturunuz.Konsola kg cinsinden bir ağırlık yazınız.Byte'ı yazdırınız.
        Scanner weight = new Scanner(System.in);
        System.out.print("ağırlık giriniz = ");
        byte agirlik = weight.nextByte();
        System.out.println("agirlik = " + agirlik);

        //9- Bir float oluşturunuz.Konsola boyunuzu giriniz.Float'ı yazdırınız.
        Scanner boy = new Scanner(System.in);
        System.out.print("boyunuzu giriniz = ");
        float boyunuz = boy.nextFloat();
        System.out.println("boyunuz = " + boyunuz);


    }
}
