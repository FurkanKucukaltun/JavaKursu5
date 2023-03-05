package Gun23;

import java.util.*;

public class _05_Soru {
    public static void main(String[] args) {
        // 10 elemanlı bir diziyi random(10(dahil) a kadar olan sayılarla doldurduktan
        // sonra, tekrarlı değerleri olmayacak şekilde yeni bir diziye atınız.

        Integer [] dizi= new Integer[10];

        for (int i = 0; i < dizi.length; i++) {
            dizi[i]= (int)(Math.random()*11);
        }

        // 1. Yontem

        HashSet<Integer> hs= new HashSet<>();

        for (int i = 0; i < dizi.length; i++) {
            hs.add(dizi[i]);
        }

        System.out.println("hs = " + hs);
        System.out.println("dizi = " + Arrays.toString(dizi));

        // 2. Yöntem

        HashSet<Integer> hs2=new HashSet<>(Arrays.asList(dizi));
        System.out.println("hs2 = " + hs2);

        //3. yöntem

        HashSet<Integer> hs3=new HashSet<>();
        Collections.addAll(hs3,dizi);
        System.out.println("hs3 = " + hs3);



    }
}
