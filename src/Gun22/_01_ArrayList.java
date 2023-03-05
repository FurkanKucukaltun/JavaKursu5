package Gun22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class _01_ArrayList {
    public static void main(String[] args) {
        // ArrayList Collection grubunun bir elemanı
        // Array i sıralarken Arrays.sort u kullandığımız gibi,
        // ArrayList i Collection metodlarını kullanacağız.

        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(50);
        sayilar.add(5);
        sayilar.add(456);
        sayilar.add(45);
        sayilar.add(3);

        System.out.println("sayilar = " + sayilar);

        // Sıralama işlemi
        Collections.sort(sayilar);
        System.out.println("sayilar = " + sayilar);

        // Tersine çevir
        Collections.reverse(sayilar);
        System.out.println("sayilar = " + sayilar);

        //Max ve min eleman bulma
        System.out.println("max = " + Collections.max(sayilar));
        System.out.println("min = " + Collections.min(sayilar));

        // Bütün elemanları set etme (replace etmek)
        Collections.fill(sayilar, 0); // bütün elemanlara 0 atar
        System.out.println("sayilar = " + sayilar);

        //replace
        Collections.replaceAll(sayilar, 0, 5); // 0 lara 5 atadı
        System.out.println("sayilar = " + sayilar);

        //tanımlarken değer atama
        int[] dizi = {2, 3, 4, 5}; //dizilerde direk bu şekilde değer ataması yapabiliyoruz
        ArrayList<Integer> liste = new ArrayList<>(Arrays.asList(3, 4, 5, 6));
        System.out.println("liste = " + liste);
        ArrayList<String> strliste = new ArrayList<>(Arrays.asList("ahmet", "mehmet", "zahid", "agah"));
        System.out.println("strliste = " + strliste);

        //2. yöntem
        ArrayList<Integer> liste2 = new ArrayList<>();
        Collections.addAll(liste2, 2, 3, 4, 5, 6);

        // diziyi direk ArrayList e nasıl atarım
        Integer[] dizi2 = {2, 3, 4, 5};
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(dizi2));
        System.out.println("list3 = " + list3);

        // int -> sadece sayı saklayabilen primite(basit) tip
        // Integer -> hem sayı saklıyor hem de kendine özgü metodları var

        //************************************************************//


        // Array i ArrayListe dönüştürebiliriz

        String[] arr = {"Java", "Python", "C++"};

        // 1.yöntem
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list1);

        // 2.yöntem
        ArrayList<String> list2 = new ArrayList<>();

        for (String i : arr) {
            list2.add(i);
        }
        System.out.println("listeye atılmış hali: " + list2);

        //************************************************

        // ArrayListi Arraye dönüştürelim.

        ArrayList<String> diller = new ArrayList<>(Arrays.asList("Java", "Python", "C++"));


        String[] arr1 = new String[diller.size()];

        //1.yöntem
        // diller.toArray(arr1); // diziye döndürmüş olduk.  ************ONEMLI***********
        // System.out.println("dizi hali: " + Arrays.toString(arr1));

        //2.yöntem
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = diller.get(i);
        }
        System.out.println("ikinci yöntem ile atama: " + Arrays.toString(arr1));


    }
}
