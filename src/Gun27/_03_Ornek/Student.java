package Gun27._03_Ornek;

import java.util.ArrayList;

public class Student {
    String name;
    int MaxSaat;
    ArrayList<Lesson> dersleri = new ArrayList<>();

    public void dersEkle(Lesson ders) { // property leri kullandığı için normal metoddur, static değil yani


        int suAnToplamSaat = 0;

        for (Lesson d : dersleri)

            suAnToplamSaat += d.dersSaati;


        if (suAnToplamSaat + ders.dersSaati <= MaxSaat)
            dersleri.add(ders);
        else System.out.println(ders.dersAdi + ": Kredi sınırı aşıldı.");


    }

    public void aldigiDersleriYaz() {
        System.out.println("\n**Transkript**");
        System.out.println("Sayın = " + name);
        System.out.println("Aldığınız dersler aşağıdadır.");
        for (Lesson d : dersleri)
            System.out.println(d.dersAdi + " " + d.dersSaati);

    }

    public static void universiteKurallari(){

        System.out.println("Kural1 : Çaysız ve üzümsüz gelme");
        System.out.println("Kural2 : Uykunu mutlaka al");
        System.out.println("Kural3 : Herzaman dinç dinamik ol");
        System.out.println("Kural4 : Başta verdiğini kararı UNUTMA!");
        System.out.println("Kural5 : Biz imkansızlıkları, inş aşacağız");
    }
}
