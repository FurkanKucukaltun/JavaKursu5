package Gun24;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class _04_JavaMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hm= new HashMap<>();
        hm.put(9,"tilki");
        hm.put(2,"kedi");
        hm.put(30,"köpek");
        hm.put(11,"kuş");
        hm.put(4,"kurt");
        System.out.println("hm = " + hm);  // hızlı çalışmak için kendisine göre sıralar

        // 2. gösterim

        Map<Integer,String> hm2= new HashMap<>();   // Map lerden HashMap
        hm2.put(9,"tilki");
        hm2.put(2,"kedi");
        hm2.put(30,"köpek");
        hm2.put(11,"kuş");
        hm2.put(4,"kurt");
        System.out.println("hm2 = " + hm2);  // hızlı çalışmak için kendisine göre sıralar

        //****************************************************//
        //****************************************************//

        LinkedHashMap<Integer,String> lhm= new LinkedHashMap<>();
        lhm.put(9,"tilki");
        lhm.put(2,"kedi");
        lhm.put(30,"köpek");
        lhm.put(11,"kuş");
        lhm.put(4,"kurt");
        System.out.println("lhm = " + lhm);  // eklendiği soraya göre sıralar


        // 2. gösterim

        Map<Integer,String> lhm2= new LinkedHashMap<>();   // Map lerden LinkedHashMap
        lhm2.put(9,"tilki");
        lhm2.put(2,"kedi");
        lhm2.put(30,"köpek");
        lhm2.put(11,"kuş");
        lhm2.put(4,"kurt");
        System.out.println("lhm2 = " + lhm2);  // eklendiği soraya göre sıralar


        //****************************************************//
        //****************************************************//

        TreeMap<Integer,String> tm= new TreeMap<>();
        tm.put(9,"tilki");
        tm.put(2,"kedi");
        tm.put(30,"köpek");
        tm.put(11,"kuş");
        tm.put(4,"kurt");
        System.out.println("tm = " + tm);  // her zaman sıralı KEY e göre kendinden sortlu


        // 2. gösterim

        Map<Integer,String> tm2= new TreeMap<>();   // Map lerden TreeMap
        tm2.put(9,"tilki");
        tm2.put(2,"kedi");
        tm2.put(30,"köpek");
        tm2.put(11,"kuş");
        tm2.put(4,"kurt");
        System.out.println("tm2 = " + tm2);  // her zaman sıralı KEY e göre kendinden sortlu




    }
}
