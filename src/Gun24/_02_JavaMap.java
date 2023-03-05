package Gun24;

import java.util.HashMap;
import java.util.Map;

public class _02_JavaMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hm=new HashMap<>();
        hm.put(1001,"Ismet Temur");
        hm.put(1002,"Zahid Kucuk");
        hm.put(2001,"Agah Kucuk");
        hm.put(5001,"Seyda Kucuk");
        hm.put(1002,"Furkan Kucuk");

        System.out.println("hm.keySet() = " + hm.keySet());  // anahtarları verir
        System.out.println("hm.values() = " + hm.values()); // değerleri verir
        System.out.println("hm = " + hm);

        for (Integer k :hm.keySet())
        {
            System.out.print(k+"\t");
        }
        System.out.println();

        for (String v:hm.values())
        {
            System.out.print( v+"\t");
        }
        System.out.println();

        for (Map.Entry<Integer,String> kv :hm.entrySet())
        {
            //System.out.println( kv.getKey());
            //System.out.println( kv.getValue());
            System.out.println( kv.getKey()+" "+kv.getValue());  // ikisinin beraber yazım şekli
        }


    }
}
