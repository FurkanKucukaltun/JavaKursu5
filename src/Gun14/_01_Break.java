package Gun14;

import java.util.Scanner;

public class _01_Break {
    public static void main(String[] args) {
        // girilen bir sayının, 2 aynı sayının carpımına
        // eşit olup olmadığını bulunuz.

        // 4 girdim -> 2*2 bu tam karedir.
        // 5 girdim -> değildir.
        // 9 girdim -> 3*3
        Scanner oku=new Scanner(System.in);
        System.out.println("Sayı giriniz");
        int sayi= oku.nextInt();
        int sayac=0;
        int arananrakam=0;
        while (sayac<sayi)
        {
            //System.out.println("sayac="+sayac);
            if(sayac*sayac==sayi) //0*0==4, 1*1==4, 2*2==4
            {
                System.out.println("tam kare");
                arananrakam=sayac;
                System.out.println("arananrakam = " + arananrakam);
                break;
                // çalıştığında döngüden çıkar
            }

            sayac++;

        }
        if (arananrakam==0)
            System.out.println("tam kare değildir");

        // 2. Yöntem

        Scanner oku1=new Scanner(System.in);
        System.out.println("Sayı giriniz");
        int sayi1= oku1.nextInt();

        int sayac1=0;
       boolean tmKare=false;

        while (sayac1<sayi1)
        {
            System.out.println("sayac="+sayac1);


            if(sayac1*sayac1==sayi1) //0*0==4, 1*1==4, 2*2==4
            {
                tmKare=true;
                System.out.println("tam karedir");
                break;
                // çalıştığında döngüden çıkar
            }

            sayac1++;

        }
        if (tmKare==false)
            System.out.println("tam kare değildir");



    }
}
