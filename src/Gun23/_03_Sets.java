package Gun23;

import java.util.HashSet;
import java.util.Iterator;

public class _03_Sets {
    public static void main(String[] args) {
        HashSet<String> renkler=new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Red");
        renkler.add("RED");

        // Ekrana yazdırma
        System.out.println("renkler = " + renkler);

        // ekrana tek tek nasıl yazdırırım. hiç bir şekilde sıra GARANTİ ETMEZ
        for (String eleman : renkler) { // sıra garanti değil
            System.out.println("eleman = " + eleman);
        }

//        // for each ile ilgili bir örnek olarak eklendi
//
//        int [] dizi ={1,2,3,6,5,4,8};
//        for (int sayi:dizi) {
//            System.out.println("sayi = " + sayi);
//        }


        // set in kendi sırası nasıl ise onun aynısını verir
        Iterator gösterge=renkler.iterator();
        while (gösterge.hasNext())  // sıradaki eleman var ise
        {
            System.out.println("gösterge.next() = " + gösterge.next());
            // .Next göstergenin gösterdiği elemanı temsil ediyor
        }



    }
}
