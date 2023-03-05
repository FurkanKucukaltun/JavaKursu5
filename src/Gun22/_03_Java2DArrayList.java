package Gun22;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_Java2DArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> matnotlari=new ArrayList<>();
        ArrayList<Integer> fiznotlari=new ArrayList<>();
        ArrayList<Integer> kimnotlari=new ArrayList<>();

        matnotlari.add(40);
        matnotlari.add(50);
        matnotlari.add(60);

        fiznotlari.add(30);
        fiznotlari.add(40);

        kimnotlari.add(70);
        kimnotlari.add(80);
        kimnotlari.add(90);
        kimnotlari.add(100);

        // ArrayList in ArrayList ini nasıl yaparım?

        ArrayList<ArrayList<Integer>> notlarlistesi=new ArrayList<>();
        notlarlistesi.add(matnotlari);
        notlarlistesi.add(fiznotlari);
        notlarlistesi.add(kimnotlari);

        // Soru 1:
        //  Notları ekrana ders adlarını bir ArrayListten alarak her dersin adını ve notlarını
        //  her bir satıra yazdırınız
        //  Matematik : 40 50 60
        //  Fizik : 30 40
        //  Kimya : 70 80 90 100

        ArrayList<String> dersler=new ArrayList<>();
        dersler.add("Matematik");
        dersler.add("Fizik");
        dersler.add("Kimya");



        for (int i = 0; i < notlarlistesi.size(); i++) {

            System.out.print(dersler.get(i)+" : ");

            for (int j = 0; j < notlarlistesi.get(i).size(); j++) {

                System.out.print( notlarlistesi.get(i).get(j)+"\t");
            }
            System.out.println();
        }

        // Soru 2:
        // kullanıcıdan istediği dersin no sunu alarak (0-mat, 1- fizik: 2-kimya)
        // sadece istediği dersin notlarını bir metod da yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("ders nosu: ");
        int dersNo= oku.nextInt();

        listealma(notlarlistesi, dersNo);

        // Soru 3 :
        // Yukarıda verilen derse ait not otlamasını ve geçen sayısını bir metodda yazdırınız.

        dersOrtVeGecenMikBul(notlarlistesi, dersNo);

    }


    // Soru 2:

    public static void listealma (ArrayList<ArrayList<Integer>>notlarlistesi, int dersNo){

          for (int j = 0; j < notlarlistesi.get(dersNo).size(); j++) {

                System.out.print( notlarlistesi.get(dersNo).get(j)+"\t");
            }

    }

    // Soru 3:

    public static void dersOrtVeGecenMikBul(ArrayList< ArrayList<Integer> > notlarListesi, int dersNo){

        int toplam=0;
        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {
            toplam+=notlarListesi.get(dersNo).get(i);
        }

        int ort= toplam/notlarListesi.get(dersNo).size();

        int gecenMik=0;
        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {
            if (notlarListesi.get(dersNo).get(i)>= ort)
                gecenMik++;
        }

        System.out.println("ort = " + ort);
        System.out.println("gecenMik = " + gecenMik);
    }



}
