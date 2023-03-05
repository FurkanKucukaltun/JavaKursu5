package Gun38._02_Abstract;

//        1- içinde name field ı olan Sekil isimli bir Abstract Class yazınız.
//        2- Bu classın Alan ve cevre abstract metodları ve içinde Alan ve cevre nin sonucu olan toString somut metodu,
//        sekilin adını veren getName somut metodu ve ciz isimli somut metodlarını ekleyiniz.
//        3- Bu sınıftan Dikdörtgen ve Daire isimli 2 class oluşturunuz.
//        4- Bunlardan birer örnek main metodunda çalıştırınız.

public class Soru {
    public static void main(String[] args) {
        Daire daire = new Daire(5);
        Dikdortgen dikdortgen = new Dikdortgen(12, 9);

        daire.setName("Yeni Daire");
        daire.ciz();
        System.out.println(daire);

        System.out.println("**************************");

        dikdortgen.setName("Yeni dikdörtgen");
        dikdortgen.ciz();
        System.out.println( dikdortgen);

    }
}
