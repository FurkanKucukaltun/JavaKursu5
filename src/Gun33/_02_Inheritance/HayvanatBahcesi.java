package Gun33._02_Inheritance;

import com.sun.org.apache.xpath.internal.operations.Or;

public class HayvanatBahcesi {
    public static void main(String[] args) {
        //    Bir hayvanat bahçesi için bir program yazılmak isteniyor.
//    Kediler için (renk,kilo,cinsi)
//    kopekler için (renk,kilo, cinsi)
//    yılanlar için renk, kilo, cinsi, uzunluk)
//    ordek için (renk, kilo, cinsi, kanatAcikligi)
//    bütün hayvanların konustu metodu vardır.

        Kopek kopek1=new Kopek("beyaz",35,"Golden");

        kopek1.konustu();

        Kedi kedi1=new Kedi("siyah",5,"ankara kedisi");

        kedi1.konustu();

        Ordek ordek1=new Ordek("yeşil",2,"gövel",90);
        ordek1.konustu();

        Yilan yilan=new Yilan("siyah",1,"kobra",200);

    }
}
