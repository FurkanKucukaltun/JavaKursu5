package _01_ODEV;

import java.util.Arrays;
import java.util.Scanner;

public class _08_Odev_Metodlar {
    public static void main(String[] args) {
        // 1-Ismi randomNum olan bir method oluşturun. Parametre olarak int max almalı.
        // Bu method, 0 ile max arasında random bir değer döndürmelidir. Random numarayı döndürünüz.

        Scanner oku1 = new Scanner(System.in);
        System.out.print("değer giriniz= ");
        int max = oku1.nextInt();
        randomNum(max);

//        2-"OrtaKelime" isminden bir method oluşturun. Bu method String'i parametre olarak almalı.
//           Cümle veya dizelerde ortada bulunan kelimeleri bulmalı. Ortadaki kelimeyi return yapınız.
//           Örnek: Ben Java'yı seviyorum.
//           print : Java'yı
//           Örnek2: Java'yı kolayca öğreniyorum.
//           print: kolayca

        Scanner oku2 = new Scanner(System.in);
        System.out.print("cumle giriniz= ");
        String cumle2 = oku2.nextLine();
        String ortKelime=OrtaKelime(cumle2);
        System.out.println("Ortadaki kelimeler = " + ortKelime);


//        3- reverseString isminde bir method oluşturun. Bu method bir String'i parametre olarak alsın.
//           Ve bu method, girilen String'i tersten yazsın. Terste yazılmış halini yazdırınız.
//              Örn: String = "Java'yı Seviyorum."
//              Print: .muroyiveS ıy'avaJ

        Scanner oku3 = new Scanner(System.in);
        System.out.print("cumle giriniz= ");
        String cumle3 = oku3.nextLine();
        System.out.print("Kelimelerin tersten yazılışı = ");
        reverseString(cumle3);

//        4- adı  reverseWord olan bir method oluşturun. Bu methodun String olarak bir parametresi olmalıdır.
//           Ve bu cümledeki kelimelerle tersine çevirmeli. Ters halini yazdırın.
//                Örnek 1 :
//        Dize: Java yazın
//        dönüş şöyle olmalıdır:  yazın Java

        Scanner oku4 = new Scanner(System.in);
        System.out.print("cumle giriniz= ");
        String cumle4 = oku4.nextLine();
        reverseWord(cumle4);


//        5-EvenOddNums isminde bir method oluşturun. Bu yöntem String olan bir parametreyi kabul etsin.
//           Bu String'de 1234567890 gibi 10 haneli sayılar olacak. Sayıların her basamağını alın ve basamak çiftse
//           toplayın, tekse çıkartın. Toplam sonucu yazdırın.
//          İpucu:Sayılar işlemleri yapabilmeniz için, basamakları tam sayıya dönüştürmeniz gerekiyor.
//             For example Örnek:
//              String =  "6678421312"
//              6+6-7+8+4+2-1-3-1+2
//              sonuç 16 olmalı

        Scanner oku5 = new Scanner(System.in);
        System.out.print("cumle giriniz= ");
        String nums5 = oku5.nextLine();
        EvenOddNums(nums5);

//
//
//        6- Girilen bir diziyi tersten yazdıran bir metod yazınız.
        Scanner oku = new Scanner(System.in);
        String[] dizi = new String[5];
        for (int i = 0; i < dizi.length; i++) {
            System.out.print("dizi elemanı= ");
            dizi[i] = oku.nextLine();
        }
        terstenyaz(dizi);


//        7-powerOfThree isminde bir method oluşturun. Parametre olarak int. Return tipi boolean
//          Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
//           Örnek 1:
//          Girdi: 27
//          Çıktı: true
//           Açıklama: 333 =27
//          Sonuç= true

        Scanner oku7 = new Scanner(System.in);
        System.out.print("sayi giriniz= ");
        int nums = oku7.nextInt();
        boolean ucunkati=powerOfThree(nums);
        System.out.println("ucunkati = " + ucunkati);


//        8- append adında bir method oluşturun. Parametre olarak iki int array  oluşturun.
//          ve ikinci array'in değerlerini ilk array'in sonuna ekleme sonucunu içeren yeni bir array döndürün.
//          Örneğin, ilk array {2, 4, 6}  ve ikinci array {1, 2, 3, 4, 5} elemanlarına sahip ise,
//          Bunu döndürmelidir:
//          {2, 4, 6, 1, 2, 3, 4, 5}.

        int []array1 = {2,4,6};
        int []array2 = {1,2,3,4,5};
        append(array1,array2);


//        9- isUnique adında bir method oluşturun. Parametre olarak int array alır. Ve bu dizideki değerlerin
//        benzersiz olup olmadığını gösteren bir boolean değeri döndürür (benzerlik yoksa true, var ise false).
//          örneğin, list isminde bir array'imiz varsa,
//           int[] list = {3, 8, 12, 2, 9, 17, 43, -8, 46, 203, 14, 97, 10, 4};
//           Bu listede yinelenen eleman olmadığı için sonuç true dönmelidir.
//           int[] list = {4, 7, 2, 3, 9, 12, -47, -19, 308, 3, 74};
//           Bu listede eleman 3, iki tane olduğu için sonuç false dönmelidir.

        int[] list = {3,55, 12, 44, 9, 17, 43, -8, 46, 203, 14, 97, 10, 4};

        isUnique(list);

    }

    // 1. soru

    public static void randomNum(int deger) {

        int maks = (int) (Math.random() * deger);
        System.out.println("maks = " + maks);
    }

    // 2. soru

    public static String OrtaKelime(String cumle2) {

        String ortacumle = cumle2.substring(cumle2.indexOf(" "), cumle2.lastIndexOf(" "));
        return ortacumle;
    }

    // 3. soru

    public static void reverseString(String cumle) {

        for (int i = (cumle.length() - 1); i >= 0; i--) {
            System.out.print(cumle.charAt(i));
        }
    }


    // 4. soru

    public static void reverseWord(String cumle4) {

        String[] cml = cumle4.split(" ");
        for (int i = (cml.length - 1); i >= 0; i--) {
            System.out.print(cml[i] + " ");
        }

    }

    // 5. soru

    public static void EvenOddNums(String nums) {

        int num = Integer.parseInt(nums);
        int toplam = 0;
        int birler;
        for (int i = 0; i < nums.length(); i++) {
            birler = num % 10;
            if (birler % 2 == 1)
                birler = birler * (-1);
            toplam = toplam + birler;
            num /= 10;
        }
        System.out.println("toplam = " + toplam);
    }

    // 6. soru

    public static void terstenyaz(String [] cumle6) {

        for (int i = (cumle6.length - 1); i >= 0; i--) {
            System.out.print(cumle6[i] + " ");
        }

    }

    // 7. soru

    public static boolean powerOfThree (int sayi7) {

        boolean ucunkuvveti=true;

        do {
            if(sayi7 % 3 != 0){
                ucunkuvveti=false;
            }
            sayi7=sayi7/3;
        }while(sayi7>=3);

        return ucunkuvveti;
    }

    // 8. soru

    public static void append (int[]arr1, int[] arr2) {

        int[] arr3= new int[arr1.length+arr2.length];

        for (int j = 0; j < arr1.length; j++) {
            arr3[j]=arr1[j];
        }
        int k=0;
        for (int i = arr1.length; i < arr3.length; i++) {
            arr3[i]=arr2[k];
            k++;
        }
        System.out.println(Arrays.toString(arr3));

    }

    // 9. soru

    public static int [] isUnique (int[]arr9) {

        boolean unique=false;
        int uniq=0;
        for (int i = 0; i < arr9.length; i++) {
            for (int j = i+1; j < arr9.length; j++) {
                if(arr9[i]==arr9[j])
                    uniq++;
            }
        }
        if (uniq==0)
            unique=true;
        System.out.println("unique = " + unique);
        System.out.println("uniq = " + uniq);
        return (arr9);

    }
    }

