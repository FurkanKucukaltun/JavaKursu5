package _01_ODEV;

import java.util.Arrays;

public class _06_Odev_Diziler {
    public static void main(String[] args) {
        // 1- Bu String'i oluşturun. "Removes white space from both ends of a string"
        //String'deki kelime sayısını yazdırınız.

        String cumle = "Remove white space from both ends of a string.";
        int sayac = 0;
        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) == ' ')
                sayac++;
        }
        System.out.println("i = " + (sayac + 1));

        // 2- Bir String oluşturun : "Hello World" Stringi tersten yazdırın ve print edin.
        //_Cevap böyle olmalı :  "dlroW olleH"_
        String cumle1 = "Hello World";
        for (int i = (cumle1.length() - 1); i >= 0; i--) {
            System.out.print(cumle1.charAt(i));
        }

        // 3- İnt Array oluştur ve elemanları   : 25,30,30,35,100  ...... Array in elemanlarının toplamını yazdır.
        //Cevap 220 olmalı.

        int[] Array = {25, 30, 30, 35, 100};
        int toplam = 0;
        for (int i = 0; i < Array.length; i++) {
            toplam = toplam + Array[i];
        }
        System.out.println("toplam = " + toplam);

        // 4- int Array oluşturun. Elemanları : 13, 15,14,16,16 ...... Arrayin elemanlarını yazdırın.

        int[] Array1 = {13, 15, 14, 16, 16};
        for (int i = 0; i < Array1.length; i++) {
            System.out.println("Array1 = " + Array1[i]);
        }

        // 5- String array  oluşturun ve elemanları: "new jersey" , "new york", "boston","California"
        //Array'daki eleman sayısını yazdırınız. // Cevap 4 olmalı.

        String[] Array2 = {"new jersey", "new york", "boston", "California"};
        System.out.println("Eleman sayısı= " + Array2.length);

        // 6- String Array (Dizi) oluşturunuz. Elemanları : Apple, Orange , Babana, Kiwi
        //Array'leri tüm elemanları yazdırınız.

        String[] Array3 = {"Apple", "Orange", "Banana", "Kiwi"};
        for (int i = 0; i < Array3.length; i++) {
            System.out.println((i + 1) + ". eleman: " + Array3[i]);
        }

        // 7- int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4 ..... Array'in ortalamasını alınız.

        int toplam1 = 0;

        int[] Array4 = {12, 14, 21, 23, 10, 4};
        for (int i = 0; i < Array4.length; i++) {
            toplam1 = toplam1 + Array4[i];
        }
        int ort = toplam1 / Array4.length;
        System.out.println("ort = " + ort);

        // 8- int Array oluşturun ve elemanları : 5,6,8,12,14,19 ..... Eğer sayı çiftse topla, tekse çıkar.
        // **Örneğin:**
        // **-5 + 6 + 8 + 12 + 14 - 19 = 16** ........... Toplamlarını yazdırın.

        int toplam2 = 0;
        int[] Array5 = {5, 6, 8, 12, 14, 19};
        for (int i = 0; i < Array5.length; i++) {
            if (Array5[i] % 2 == 1)
                Array5[i] *= (-1);
            toplam2 = toplam2 + Array5[i];
        }
        System.out.println("toplam = " + toplam2);

        // 9- int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        //Arraydaki en büyük 2. elemanı yazdıran bir program yazın.

        int[] Array6 = {15, 25, 22, 18, 30};
        Arrays.sort(Array6);
        System.out.println("Array6 = " + Array6[(Array6.length - 2)]);

        // 2. yöntem

        int[] Array61 = {15, 25, 22, 18, 30};
        int enb = 0;
        int enb2 = 0;
        for (int i = 0; i < Array6.length; i++) {
            if (enb < Array6[i])
                enb = Array6[i];
        }
        for (int i = 0; i < Array6.length; i++) {
            if (enb2 < Array61[i] && Array61[i] < enb)
                enb2 = Array61[i];
        }

        System.out.println("enb2 = " + enb2);


        // 10- int Array oluşturun ve elemanları : 14 , 19 , 5 , 21 ..... En küçük (minimum) sayıyı yazdırınız.

        int[] Array10 = {14, 19, 5, 21};
        Arrays.sort(Array10);
        System.out.println("En küçük= " + Array10[0]);

        // 2. yöntem

        int[] Array101 = {14, 19, 5, 21};
        int enk = Array101[0];

        for (int i = 0; i < Array101.length; i++) {
            if (enk >= Array101[i])
                enk = Array101[i];
        }
        System.out.println("En küçük sayı = " + enk);

        // 11- int Array oluşturun ve elemanları : 12,2,5,15,8 ............ En büyük değeri yazdırınız.

        int[] Array11 = {12, 2, 5, 15, 8};
        Arrays.sort(Array11);
        System.out.println("En büyük= " + Array11[Array11.length - 1]);

        // 2. yöntem

        int[] Array111 = {12, 2, 5, 15, 8};
        int enb1 = 0;
        for (int i = 0; i < Array111.length; i++) {
            if (enb < Array111[i])
                enb = Array111[i];
        }
        System.out.println("En büyük sayı = " + enb1);

        // 12- String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        //Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        // Eğer aitse "true" çevirin.  Loops (döngüler) kullanın.


        String[] Array12 = {"Apple", "Orange", "Banana", "Pineapple"};
        boolean aitmi = false;

        for (int i = 0; i < Array12.length; i++) {
            if (Array12[i].equals("Apple"))
                aitmi = true;
            break;

        }
        System.out.println("aitmi = " + aitmi);


        // 2. yöntem

        String[] Array121 = {"Apple", "Orange", "Banana", "Pineapple"};
        Arrays.sort(Array121);
        System.out.println("Apple elemanının bu Array'a ait mi?= " + Arrays.binarySearch(Array121, "Apple"));

        // 13- Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        // $ işaretlerini kaldırın ve sayıları toplayın. ........ Sayıların toplamını yazdırın.

        String Arrey13 = "$12 $23 $10 $2 $5 $2";
        String[] yeniArry = (Arrey13.replace("$", "")).split(" ");
        int toplam13 = 0;
        for (int i = 0; i < yeniArry.length; i++) {
            toplam13 = toplam13 + (Integer.parseInt(yeniArry[i]));
        }
        System.out.println("toplam = " + toplam13);


    }
}
