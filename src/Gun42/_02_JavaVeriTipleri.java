package Gun42;

import java.util.Arrays;

public class _02_JavaVeriTipleri {
    public static void main(String[] args) {
        // primitive (ilkel) tipler: short, byte, long,float, boolean
        int sayi1=5;
        int sayi2=10;

        sayi1=sayi2;  // sayi1=10 // iştlenen değerler atandı
        sayi1=34;  // yine ayrı ayrı kalır
        sayi2=45;

        // Referans Tipler : classlar, diziler, arrayler, nesneler
        int[] dizi1= {1,2,3,4};
        int[] dizi2= {5,6};
        System.out.println("Arrays.toString(dizi1) = " + Arrays.toString(dizi1));
        System.out.println("Arrays.toString(dizi2) = " + Arrays.toString(dizi2));

        dizi1=dizi2;
        System.out.println("Arrays.toString(dizi1) = " + Arrays.toString(dizi1));  //5,6
        System.out.println("Arrays.toString(dizi2) = " + Arrays.toString(dizi2));  //5,6

        dizi1[0]=67;
        System.out.println("Arrays.toString(dizi1) = " + Arrays.toString(dizi1));  //67,6
        System.out.println("Arrays.toString(dizi2) = " + Arrays.toString(dizi2));  //67,6

        dizi2[0]=55;
        System.out.println("Arrays.toString(dizi1) = " + Arrays.toString(dizi1));  //55,6
        System.out.println("Arrays.toString(dizi2) = " + Arrays.toString(dizi2));  //55,6

        // Nesne Tipler: NULL alabillen ilkel tip
        // String , Integer, Double, Long

        String ad1="mehmet";
        String ad2="ismet";
        // Referans  ama davranışı ilkel

        ad1=ad2;
        System.out.println("ad1 = " + ad1);  // ismet farklı kutucuk
        System.out.println("ad2 = " + ad2); // ismet farklı kutucuk

        ad1="Ali";
        System.out.println("ad1 = " + ad1);  // Ali
        System.out.println("ad2 = " + ad2); // ismet

    }
}
