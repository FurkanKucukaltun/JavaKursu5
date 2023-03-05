package Gun36._06_Interface;

public class Main {
    public static void main(String[] args) {
//        Kare, Dikdortken sınıflarından oluşacak bir geometri programı
//        yapılmak isteniyor.bunların ayrı ayrı , fakat ortak metodlarının
//        (cevresi() ve alani() )zorunlu olabilmesi için gerekli yapıyı kurunuz ve yazınız.
//        2 nesne için de main de değer vererek , sonuçlarını yazdırınız.

        Kare k=new Kare();

        System.out.println("cevresi = " + k.alan(4));
        System.out.println("alanı = " + k.cevre(4));

        Dikdortgen d=new Dikdortgen();

        System.out.println("alanı = " + d.alan(4,6));
        System.out.println("cevresi = " + d.cevre(4,6));


    }
}
