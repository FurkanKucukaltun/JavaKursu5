package _01_ODEV;

import java.util.Scanner;

public class _05_Odev_While_DoWhile_For_break_continue {
    public static void main(String[] args) {

        //  1- 0 ile 100 arasındaki bütün çift sayıları yazdırabileceğiniz bir kod yazınız. _Not: 0 ve 100 dahildir._

        for (int sayi=0;sayi<=100;sayi++)
        {if(sayi%2==0)
            System.out.print(" " + sayi);
        }

        System.out.println();
        // 2. Yöntem
        int sayiCift = 0;
        do {
            if (sayiCift % 2 == 0)
                System.out.print(" " + sayiCift);
            sayiCift++;
        } while (sayiCift <= 100);

        System.out.println();



        //  2- 0 ile 100 arasındaki bütün tek sayıları yazdırabileceğiniz bir kod yazınız.
        int sayiTek = 0;
        do {
            if (sayiTek % 2 == 1)
                System.out.print(" " + sayiTek);
            sayiTek++;
        } while (sayiTek <= 100);

        System.out.println();
        //  3- # 100'den 0'a kadar bütün tek sayıları yazdırınız.

        //99-97-95.... `/ 100 ve 0 dahil değildir.`
        for (int i = 99; i >= 1; i--) {
            if (i % 2 == 1)
                System.out.print(" " + i);
        }
        System.out.println();
        //  4- #  İlk 10 doğal sayının toplamını hesaplamak için bir kod yazın.

        //İlk 10 doğal sayı: 1,2,3,4,5,6,7,8,9,10`
        int toplam = 0;
        int k = 1;
        do {
            toplam = toplam + k;
            k++;
        } while (k <= 10);
        System.out.println("toplam = " +toplam);

        System.out.println();

        // 2. Yöntem
        int toplam1=0;
        for (int i=1;i<=10;i++)
        {
            toplam1=toplam1+i;
        }
        System.out.println("toplam1 = " + toplam1);

        System.out.println();
        // 5- **0 ile 100** arasındaki sayıları kapsayan bir kod yazınız.

        //  Bu kod bu sayıların tek mi çift mi olduğunu belirleyebilecek bir kod olmalı.

        //  Eğer sayı çift sayıysa;  **This number is even and number is 0**

        //Eğer sayı tek sayıysa;

        //**This number is odd and number is 1** yazdırmalıdır.

       /* `Sonuç böyle olmalıdır.`

        This number is even and number is 0
        This number is odd and number is 1
        This number is even and number is 2
        This number is odd and number is 3
*/

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.println("This number is even and number is " + i);
            else
                System.out.println("This number is odd and number is " + i);

        }


        // 6- # 0 ile 100 arasındaki hem 5'e, hem de 4'e bölünebilen bütün sayıları yazdırınız.
        //`Sonuç bu şekilde olmalıdır.`
        /*
        0
        20
        40
        60
        80
        100*/

        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0 && i % 4 == 0)
                System.out.println(i);


        }


        // 7- Uzunluk ve genişliğini yazan kişinin belirlediği # bütünü oluşturabileceğiniz bir kod yazınız.

        /*        _örn:

        _length(uzunluk): 7_

        _width(genişlik): 5_

        _Output:_

#####

#####

#####

#####

#####

#####

#####*/

        Scanner oku = new Scanner(System.in);
        System.out.print("length giriniz:");
        int length = oku.nextInt();
        System.out.print("width giriniz:");
        int width = oku.nextInt();

        for (int i = 0; i < length; i++) {
            for (int j = 1; j <= width; j++)
                System.out.print("#");

            System.out.println();
            System.out.println();

        }


        //8-  _Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız._

        /*Sonuç böyle olmalıdır.

                 *
               * *
             * * *
           * * * *
         * * * * *    */

        for (int i=1; i<=5; i++) {
            for(int j=i; j<=9-i;j++) {
                System.out.print(" ");
            }
            for (int m=1; m<=i; m++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }





        // 9- _Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız._

        /*  Sonuç böyle olmalıdır;

              *
             * *
            * * *
           * * * *
          * * * * *

           */

        for (int i=1; i<=5; i++) {
            for(int j=i; j<=5;j++) {
                System.out.print(" ");
            }
            for (int l=1; l<=i; l++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }

        //10 - do while loop kullanınız. 0 ile 30 arasındaki bütün çift sayıları yazdırınız.

        int x=0;
        do {
            if(x%2==0)
                System.out.print(" " + x);

            x++;

        }while(x<=30);

    }
}
