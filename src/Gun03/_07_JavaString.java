package Gun03;

public class _07_JavaString {
    public static void main(String[] args) {
        String ad = "İsmet"; // String : kelime veya kelimeleri saklamak için kullanılır
        // sınırlarını " " ile belirlenir.

        String soyad = "Temur";

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
        System.out.println("ad ve soyad = " + ad + " " + soyad);
        // + lar burada stringleri yan yana yaz anlamında

        String tamAd = "ismet" + " " + "temur";
        System.out.println("tamAd = " + tamAd);

    }
}
