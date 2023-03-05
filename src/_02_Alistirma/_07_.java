package _02_Alistirma;

import java.util.*;

public class _07_ {
    public static void main(String[] args) {

        // soru : verilen bir string deki her harfin kaç defa tekrar ettiğini bulan bir method yazınız

        String str= "merhaba dünya";
        harfsay(str);

    }

    public static void harfsay(String str){

        str=str.toLowerCase();  // büyük küçük harf ayrımı yapmamak için

        HashMap<Character,Integer> map=new HashMap<>();

        for (Character ch:str.toCharArray()) {
            if (map.containsKey(ch))
                map.put(ch, map.get(ch)+1);
            else{
                map.put(ch,1);
            }
        }

        for (Map.Entry<Character,Integer> each:map.entrySet() ) {
            System.out.println(each.getKey()+ " "+each.getValue());
        }

    }

}