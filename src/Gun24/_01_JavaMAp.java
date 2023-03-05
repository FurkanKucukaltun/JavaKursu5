package Gun24;

import java.util.HashMap;

public class _01_JavaMAp {
    public static void main(String[] args) {
        // Set -> HashSet, LinkedHashSet, TreeSet
        // Map -> HashMAp, LinkedHashMap, TreeMap
        // Map = Anahtar + Set -> Anahtarlı Set

        // anahtarın tipi Integer, değerin tipi String olsun
        HashMap<Integer, String> hm=new HashMap<>();
        hm.put(1001,"Ismet Temur");
        hm.put(1002,"Zahid Kucuk");
        hm.put(2001,"Agah Kucuk");
        hm.put(5001,"Seyda Kucuk");
        hm.put(1002,"Furkan Kucuk");

        System.out.println("hm = " + hm);
        System.out.println("hm.get(2001) = " + hm.get(2001));
        System.out.println("hm.get(2001) = " + hm.get(5001));

        System.out.println("hm.containsKey(2001) = " + hm.containsKey(2001));  // true
        System.out.println("hm.containsKey(12) = " + hm.containsKey(12));  // false

        System.out.println("hm.keySet() = " + hm.keySet());  // anahtarları verir
        System.out.println("hm.values() = " + hm.values()); // değerleri verir

        hm.remove(5001);  // yazılan objeyi siler. key value yazılabiliyor
        System.out.println("hm = " + hm);

        System.out.println("hm.size() = " + hm.size());  // boyutunu verir

        hm.clear();
        System.out.println("hm = " + hm);





    }
}
