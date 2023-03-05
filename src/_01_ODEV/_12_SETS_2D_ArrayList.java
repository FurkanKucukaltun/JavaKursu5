package _01_ODEV;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class _12_SETS_2D_ArrayList {
    public static void main(String[] args) {
//       1-totalCount() isminde bir method oluşturun. Parametresi  'Integer Hashset' olmalı. HashSetteki eleman
//        sayısını alın. totalCount'u döndürün.
//        *Örnek:*
//                hashset ; 4,2,3,1,7 ***** cevap: 5
        HashSet<Integer> hs = new HashSet<>();
        hs.add(4);
        hs.add(5);
        hs.add(6);
        hs.add(7);
        hs.add(8);
        hs.add(9);
        hs.add(1);

        totalCount(hs);

//        2- changeSet() isminde bir method oluşturun. Parametre olarak bir String HashSet   ve  iki String
//        return hashset olmalı. Eğer HashSet String 1 e sahipse, String 1 ile String 2 yi değiştirin.
//          *ÖRNEK:*
//        hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
//        String 1 = *banana*
//        String 2 = *peach*
//          *CEVAP:* "peach" , "strawberry" , "kiwi" , "pineapple"

        HashSet<String> hs1 = new HashSet<>();
        hs1.add("banana");
        hs1.add("strawberry");
        hs1.add("kiwi");
        hs1.add("pineapple");
        String b = "banana";
        String c = "peach";
        System.out.println("hs1 = " + hs1);

        changeSet(hs1, b, c);

//        3- commonValues() isminde bir method oluşturun ve parametresi  2 tane hashset olmalı.
//        return tipi arraylist olmalı.
//          *ÖRNEĞİN:*
//        İlk Hashset : *"Germany"* , "England" , "South Africa" , *"Brazil" , "USA"*
//        İkinci  hashset  : *"Germany"* , "China" , *"Brazil"* , "France" ,  *"USA"*
//        Ortak değerleri ArrayListe ekleyiniz.
//        çıktı:  "Germany" , "Brazil" ,"USA"
//        ArrayListi yazdırınız.

        HashSet<String> hs31 = new HashSet<>();
        hs31.add("Germany");
        hs31.add("England");
        hs31.add("South Africa");
        hs31.add("Brazil");
        hs31.add("USA");
        HashSet<String> hs32 = new HashSet<>();
        hs32.add("Germany");
        hs32.add("China");
        hs32.add("Brazil");
        hs32.add("France");
        hs32.add("USA");

        commonValues(hs31, hs32);


//        4- removing() isminde bir method oluşturun. Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.
//          Eğer Stringler LinkedHashset 'in içinde varsa, sil. Return tipi linkedhashset
//
//                Örneğin,
//        linkedhashset : Germany , France , USA , Canada , Mexico , Brazil
//        String 1= Germany
//        String 2 = USA
//                *Germany ve USA 'i sil.*
//        Set'i döndür.

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Germany");
        lhs.add("France");
        lhs.add("USA");
        lhs.add("Canada");
        lhs.add("Mexico");
        lhs.add("Brazil");
        String bb = "Germany";
        String cc = "USA";

        removing(lhs, b, c);


//        5- 2D ArrayList: Bir tane 2d array [][]   oluşturun ve
//        elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
//        Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
//                *Örnek:*
//          *Girdi:*
//          [
//           [ 1, 2, 3 ],
//           [ 4, 5, 6 ],
//           [ 7, 8, 9 ]
//          ]
//          *Çıktı:* [1,2,3,4,5,6,7,8,9]


        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                al.add(array[i][j]);
            }
        }
        System.out.println("çıktı = " + al);

    }

    //1. soru
    public static void totalCount(HashSet<Integer> hs) {
        System.out.println("hs.size() = " + hs.size());
    }

    //2. soru
    public static HashSet<String> changeSet(HashSet<String> a, String b, String c) {

        Iterator gosterge = a.iterator();
        while (gosterge.hasNext()) {
            if (a.contains(b)) {
                a.remove(b);
                a.add(c);
            }
            break;
        }
        System.out.println("Yeni Liste = " + a);

        return a;

    }

    //3. soru
    public static ArrayList<String> commonValues(HashSet<String> a, HashSet<String> b) {

        HashSet<String> ortakElemanlar = new HashSet<>();
        ortakElemanlar.addAll(a);
        ortakElemanlar.retainAll(b);
        System.out.println("Ortak Elemanlar = " + ortakElemanlar);
        ArrayList<String> list = new ArrayList<>(ortakElemanlar);
        return list;
    }


    //4. soru
    public static LinkedHashSet<String> removing(LinkedHashSet<String> a, String b, String c) {

        if (a.contains(b))
            a.remove(b);
        if (a.contains(c))
            a.remove(c);
        System.out.println("Yeni Liste = " + a);


        return a;
    }
}
