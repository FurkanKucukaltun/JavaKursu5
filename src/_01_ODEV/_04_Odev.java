package _01_ODEV;

import java.util.Scanner;

public class _04_Odev {
    public static void main(String[] args) {


        // 1- Kullanıcının gireceği 20 sayıdan tek olanlarının toplamını bulunuz

        Scanner oku1 = new Scanner(System.in);
        int sayac1 = 0;
        int toplam1 = 0;

        while (sayac1 < 20) {

            System.out.print("sayi giriniz=");
            int sayi1 = oku1.nextInt();

            if (sayi1 % 2 == 1)
                toplam1 = toplam1 + sayi1;
            sayac1++;
        }

        System.out.println("toplam1 = " + toplam1);


        // 2- Kullanıcnın gireceği 20 sayıdan kaç tanesinin tek olduğunu bulunuz


        int sayac2 = 0;
        int teksayi2 = 0;

        while (sayac2 < 20) {
            Scanner oku2 = new Scanner(System.in);
            System.out.print("sayi giriniz=");
            int sayi2 = oku2.nextInt();

            if (sayi2 % 2 == 1)
                teksayi2++;
            sayac2++;
        }

        System.out.println("teksayi = " + teksayi2);


        // 3- Kullanıcnın gireceği bir sayıya kadar olan sayıların toplamını bulunuz.


        Scanner oku3 = new Scanner(System.in);
        System.out.print("sayi giriniz=");
        int sayi3 = oku3.nextInt();
        int sayac3 = 1;
        int toplam3 = 0;

        while (sayac3 <= sayi3) {

            toplam3 = toplam3 + sayac3;

            sayac3++;

        }
        System.out.println("toplam3 = " + toplam3);


        //  4- Kullanıcının gireceği 20 sayıdan 10 ile 30 arasındakilerinin toplamını bulunuz.

        int sayac4 = 0;
        int toplam4 = 0;

        while (sayac4 < 20) {
            Scanner oku4 = new Scanner(System.in);
            System.out.print("sayi giriniz=");
            int sayi4 = oku4.nextInt();

            if (sayi4 > 10 && sayi4 < 30)
                toplam4 = toplam4 + sayi4;
            sayac4++;
        }

        System.out.println("toplam1 = " + toplam4);


        //   5- 100'e kadar olan sayılardan kaç tanesinin birler basamağının 5 olduğunu bulunuz.


        int sayac5 = 5;
        int birlerbas5 = 0;

        while (sayac5 < 100) {


            if (sayac5 % 10 == 5)
                birlerbas5++;
            sayac5++;
        }

        System.out.println("birlerbas5 = " + birlerbas5);


        //   6- Bir sayı bulmaca oyunu yapılmak isteniyor bilgisayar 10-20 arasında bir sayı tutsun,
        //   kullanıcı bu sayıyı bulmaya çalışssın, Kullanıcının bu sayıyı bulmak için 3 hakkı olsun.
        //   3 hakkın sonunda da bilemez ise, bilemediniz yazıp tutulan sayıyı bildirsin. Eğer bilirse tebrikler yazsın.

        int sayi6 = (int) ((Math.random() * (10) + 10));

        int sayac = 1;

        while (sayac <= 3) {
            Scanner oku6 = new Scanner(System.in);
            System.out.print(sayac + ".tahmin=");
            int tahmin = oku6.nextInt();

            if (tahmin == sayi6)
                System.out.println("tebrikler bildiniz");

            sayac++;

        }
        System.out.println("bilemediniz, tutulan sayı = " + sayi6);


        // Mobil developer kursuna devam edecekler ve kendini zorlamak isteyen testerlar için

        //  7- Girilen 3 basamaklı bir sayının birler , onlar ve yuzler basamağını bulunuz.


        Scanner oku7 = new Scanner(System.in);
        System.out.print("3 basamaklı sayi giriniz=");
        int sayi7 = oku7.nextInt();
        int birlerBasamagi = sayi7 % 10;
        int onlarBasamagi = (sayi7 / 10) % 10;
        int yüzlerBasamagi = (sayi7 / 100) % 10;

        System.out.println("yüzlerBasamagi = " + yüzlerBasamagi);
        System.out.println("onlarBasamagi = " + onlarBasamagi);
        System.out.println("birlerBasamagi = " + birlerBasamagi);


        // 8- Girilen bir sayının kaç basamak olduğunu bulunuz.


        // 1. yöntem


        Scanner oku8 = new Scanner(System.in);
        System.out.print("sayi giriniz=");
        int sayi8 = oku8.nextInt();
        String strsayi8 = Integer.toString(sayi8);
        System.out.println("uzunluk = " + strsayi8.length());


        // 2. Yöntem


        Scanner oku81 = new Scanner(System.in);
        System.out.print("sayi giriniz=");
        int sayi81 = oku81.nextInt();
        int i = 0;

        do {

            i++;

        } while (((int) (sayi81 / Math.pow(10, i)) != 0));

        System.out.println("basamak sayısı = " + i);


        // 3. Yöntem


        Scanner oku82 = new Scanner(System.in);
        System.out.print("sayi giriniz=");
        int sayi82 = oku82.nextInt();
        int ii = 0;

        do {

            ii++;
            sayi82 /= 10;

        } while (sayi82 != 0);

        System.out.println("basamak sayısı = " + ii);


        //  9- Girilen bir sayının tersi olan sayıyı bulunuz yani 124 girildi ise 421 olan sayı elde edilecek.

        // 1. yöntem


        Scanner oku9 = new Scanner(System.in);
        System.out.print("sayi giriniz=");
        int sayi9 = oku9.nextInt();
        String strsayi9 = Integer.toString(sayi9);
        int j = (strsayi9.length() - 1);

        do {
            System.out.print(strsayi9.charAt(j));
            j--;

        } while (j >= 0);


        // 2. yöntem


        Scanner oku91 = new Scanner(System.in);
        System.out.print("sayi giriniz=");
        int sayi91 = oku91.nextInt();
        int terssayi = 0;

        do {
            int kalan = sayi91 % 10;
            terssayi = terssayi * 10 + kalan;
            sayi91 /= 10;
        } while ((sayi91 != 0));

        System.out.println("terssayi = " + terssayi);


        //  10- Girilen bir sayının tersi ile aynı olup olmadığını bulunuz. yani simetrik sayı mı?


        Scanner oku10 = new Scanner(System.in);
        System.out.print("sayi giriniz=");
        int sayi10 = oku10.nextInt();
        int sayi11 = sayi10 * 1;
        int tersSayi = 0;

        do {
            int kalan = sayi11 % 10;
            tersSayi = tersSayi * 10 + kalan;
            sayi11 /= 10;
        } while ((sayi11 != 0));

        System.out.println("sayi10 = " + sayi10);

        System.out.println("terssayi = " + tersSayi);


        if (sayi10 == tersSayi)
            System.out.println("sayi polindrom dur");
        else
            System.out.println("sayi polindrom değildir");


    }
}
