package Gun21;

import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {

        // dizi, array : boyut sayısı belli, sonradan değiştirilemez
        int [] dizi=new int[5]; // array  elemanlı boyutu sonradan değiştirilemiyor

        // boyutu dinamik olsun, eleman ekledikçe uzasın, sildikçe kısalsın
        // ArrayList: boyutunu başta vermene bile gerek yok, boyutu başlangıçta 0
        // eleman ekledikçe artar, sildikçe kısalır.

        ArrayList<Integer> integerList=new ArrayList<>();
        ArrayList<String> stringList=new ArrayList<>();
        ArrayList<Double> doubleList=new ArrayList<>();

        ArrayList<String> isimler=new ArrayList<>();
        System.out.println("isimler = " + isimler);

        isimler.add("ahmet"); // uzunluk 1
        isimler.add("metin"); // uzunluk 1
        isimler.add("agah"); // uzunluk 1
        isimler.add("zahid"); // uzunluk 1


        System.out.println("isimler = " + isimler);
        System.out.println("isimler.size() = " + isimler.size());

        isimler.add(1,"muhammed"); // verilen index e ekleniyor, diğerleri sona doğru 1 index kayıyor
        System.out.println("isimler = " + isimler);

        boolean varmi= isimler.contains("metin"); // var mi
        System.out.println("varmi = " + varmi);     // true

        isimler.set(1,"zafer"); // verilen index deki elemanı değiştiriyor, replace yapıyor, kaydırma yok
        System.out.println("isimler = " + isimler);

        isimler.remove("metin"); // değere göre siler
        System.out.println("isimler = " + isimler);

        isimler.remove(1); // rakam verildiğinde index kabul ediyor ve ona göre siliyor
        System.out.println("isimler = " + isimler);
        // !!! ONEMLI !!! isimler.remove((Object)(1)); deseydik index 1 i değil rakam olan 1'i silerdi.

        int indexofAgah= isimler.indexOf("agah");
        System.out.println("indexofAgah = " + indexofAgah);

        String ilkeleman=isimler.get(0);  // verilen indexdeki değeri verir
        System.out.println("ilkeleman = " + ilkeleman);

        isimler.clear(); // her şeyi temizliyor
        System.out.println("isimler = " + isimler);



    }
}
