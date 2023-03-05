package Gun24;

import java.util.HashMap;
import java.util.Map;

public class _03_JavaMap {
    public static void main(String[] args) {
        // Bir kartvizit uygulamasını 2 kişi için yapınız

        HashMap<String,String > uKartVizit=new HashMap<>();
        uKartVizit.put("isim","Ugur Yılmaz");
        uKartVizit.put("email","ugur@gmail.com");
        uKartVizit.put("adres","Çekmeköy/İstanbul");
        uKartVizit.put("telefon","0506847698");

        System.out.println("uKartVizit = " + uKartVizit);

        System.out.println("uKartVizit.get(isim) = " + uKartVizit.get("isim"));
        System.out.println("uKartVizit.get(telefon) = " + uKartVizit.get("telefon"));


        HashMap<String,String > aKartVizit =new HashMap<>();
        aKartVizit.put("isim","Ayşe Bayrak");
        aKartVizit.put("email","ayse@gmail.com");
        aKartVizit.put("adres","Şişli/İstanbull");
        aKartVizit.put("telefon","0506455597644");

        HashMap<String,HashMap<String,String > > kartvizitler=new HashMap<>();

        kartvizitler.put("ugur",uKartVizit);
        kartvizitler.put("ayse",aKartVizit);

        System.out.println("KartVizit.get(ugur) = " + kartvizitler.get("ugur"));
        System.out.println("KartVizit.get(ayse) = " + kartvizitler.get("ayse"));

        // ayse nin adresi
        System.out.println("Ayse nin adresi = " + kartvizitler.get("ayse").get("adres"));

        // sadece emailler
        for (Map.Entry<String,HashMap<String,String >> kv:kartvizitler.entrySet())
        {
            System.out.println("emailler = " + kv.getValue().get("email"));
        }

    }
}
