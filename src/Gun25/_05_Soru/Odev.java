package Gun25._05_Soru;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        // Bir bordro programı yapılmak isteniyor.
        // Her calisanin bordroNo(int), tamAdi(String) ve maasi(int) vardır.
        // Kullanıcıdan 20 calisan için bu bilgileri alınız.
        // Bir metodda bütün calisanlar yazdırınız.
        // Bir metodda maas ortalamasını yazdırınız.
        // Bir metodda en fazla ve en az maas alanların isimlerini yazdırınız.

        Scanner okuInt= new Scanner(System.in);
        Scanner okuStr= new Scanner(System.in);
        ArrayList<Bilgiler> bordro=new ArrayList<>();
        ArrayList<Integer> maasBilgileri=new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            Bilgiler cls=new Bilgiler();

            System.out.print("bordroNo : "); cls.bordroNo=okuInt.nextInt();
            System.out.print("tamAdi : "); cls.tamAdi=okuStr.nextLine();
            System.out.print("maasi : "); cls.maasi=okuInt.nextInt();

            bordro.add(cls);
            maasBilgileri.add(cls.maasi);
        }


        yazdirma(bordro);
        ortalama(bordro);
        max(maasBilgileri);
        min(maasBilgileri);


    }
    public static void yazdirma (ArrayList<Bilgiler> a){

        for (Bilgiler b: a)
        {
            System.out.println("Bordro no : "+ b.bordroNo );
            System.out.println("Tam adı : "+b.tamAdi);
            System.out.println("Maaş : "+b.maasi);
        }
    }



    public static void ortalama (ArrayList<Bilgiler> a){ // Bir metodda maas ortalamasını yazdırınız.

        int toplam=0;

        for (Bilgiler b: a)
        {
            toplam=toplam+b.maasi;
        }
        System.out.println("ortalama maaş = " + toplam/a.size());
    }

    public static void max (ArrayList<Integer> a){ // Bir metodda en fazla  alanın simlerini yazdırınız.

        System.out.println("max= "+Collections.max(a));

        // 2. yöntem

//        int enb=0;
//
//        for (Bilgiler b: a)
//        {
//            if(b.maasi>enb)
//                enb=b.maasi;
//        }
//        System.out.println("en fazla maaş = " + enb);
    }

    public static void min (ArrayList<Integer> a){ // Bir metodda en az maas alanın simlerini yazdırınız.

        System.out.println("min= "+Collections.min(a));

    }
}
