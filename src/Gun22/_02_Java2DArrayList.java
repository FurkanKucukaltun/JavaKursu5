package Gun22;

import java.util.ArrayList;

public class _02_Java2DArrayList {
    public static void main(String[] args) {
        int sayi=5;  // tek bir rakam tutabilen bir değişken
        int [] dizi= new int[20]; // 20 adet sayı saklayabilen bir değişken, uzunluğu sabit
        int [][] tablo= new int[20][2]; // 20*2 lik sayı saklayabilen değişken, sabit uzunluklu

        ArrayList<Integer> liste=new ArrayList<>(); // istenildiği kadar sayı eklenebilen uzunluğu değişken

        //***************************//

        // bir sınıf bu sınıfda 20kişi var ve bunların 3 dersi olsun. öğrencilerin bu 3 derse ait notlarını
        // nasıl bir değişkende saklayabilirsin

        ArrayList<Integer> matnotlari=new ArrayList<>();
        ArrayList<Integer> fiznotlari=new ArrayList<>();
        ArrayList<Integer> kimnotlari=new ArrayList<>();

        matnotlari.add(50);
        matnotlari.add(70);
        matnotlari.add(80);

        fiznotlari.add(30);
        fiznotlari.add(40);

        kimnotlari.add(60);
        kimnotlari.add(70);
        kimnotlari.add(90);
        kimnotlari.add(80);

        // ArrayList in ArrayList ini nasıl yaparım?

        ArrayList<ArrayList<Integer>> notlarlistesi=new ArrayList<>();
        notlarlistesi.add(matnotlari);
        notlarlistesi.add(fiznotlari);
        notlarlistesi.add(kimnotlari);

        notlarlistesi.get(0); // mat notları
        int matbirnot=notlarlistesi.get(0).get(0); // mat notlarının ilkini aldım

        System.out.println("notlarlistesi.get(0) = " + notlarlistesi.get(0)); // mat notları
        System.out.println("notlarlistesi.get(1) = " + notlarlistesi.get(1));// fiz notları
        System.out.println("notlarlistesi.get(2) = " + notlarlistesi.get(2));// kim notları

        // yukarıdakinin yerine bir for dongusu nasıl kullanırız
        for (int i = 0; i < notlarlistesi.size(); i++) { // 0,1,2
            System.out.println("notlarlistesi = " + notlarlistesi.get(i));
        }

        // *************** satır sütun yazdırma **********//

        for (int i = 0; i < notlarlistesi.size(); i++) { // i satırları j sütunları temsil ediyor
            for (int j = 0; j < notlarlistesi.get(i).size(); j++) { // dzilerde notlar[i].length şeklinde
                System.out.print("notlarlistesi = " + notlarlistesi.get(i).get(j)+"\t"); //notlar[i].[j]
            }
            System.out.println();
        }

    }

}
