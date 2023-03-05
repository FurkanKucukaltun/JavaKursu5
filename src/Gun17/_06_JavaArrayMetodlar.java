package Gun17;

import java.util.Arrays;

public class _06_JavaArrayMetodlar {
    public static void main(String[] args) {

        //Burada en çok kullanılan sort ve toString

        String[] isimler={"agah","zeynep","seyda","furkan","zahid"};

        //diziyi string olarak direk yazdırır

        System.out.println("isimler = " + Arrays.toString(isimler));
        //dizi sıralama
        Arrays.sort(isimler);
        System.out.println("isimler = " + Arrays.toString(isimler)); // harf sırasına göre yazdırır

        //diziler eşit mi?
        int[] a={1,8,3,54};
        int[] b={1,8,3,54};
        int[] c={1,8,2,54};

        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a,b)); //true
        System.out.println("Arrays.equals(a,c) = " + Arrays.equals(a,c));//false

        Arrays.sort(c); // sayı bazlı dizi sıralaması
        System.out.println("Arrays.toString(c) = " + Arrays.toString(c)); //küçükten büyüğe yazdırır

        //sadece sortlu dizilerde çalışır (sıralı dizilerde)... sadece içerip içermediğini bulur(contains gibi çalışır)
        //var ise pozitif bir değer verir, yoksa negatif. herhangi bi indexOf değeri verir hangisi olduğunu bilemezsin
        //çok kullanılan birşey değil.
        System.out.println("Arrays.binarySearch() = " + Arrays.binarySearch(b,3));// Sıralı olmadığı için (-) veriyor
        Arrays.sort(b);
        System.out.println("Arrays.binarySearch() = " + Arrays.binarySearch(b,3));



    }
}
