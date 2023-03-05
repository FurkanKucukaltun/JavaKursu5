package Gun04;

public class _04_NarrowingCasting {
    public static void main(String[] args) {

        double oran=3.2;
        int sayi=5;

        sayi= (int)oran;  //tehlikeli işlem yapıyorsun, bundan dolayı challenger patladı.
                    //değerlere bak, eğer oluşan veri kaybını farkındaysan ve kabulunse bana bunu bilerek
                    // yaptığını göster.

        System.out.println("sayi = " + sayi);
        /**************************************************/

        byte kisak=5;
        byte uzunk=7;

        byte cevre=(byte) (kisak+kisak+uzunk+uzunk); //Toplam INT durumunda.  inti byte atamaya çalışıyorsun
                                                    //eğer veri kaybı olmayacağından eminsen bana yazarak göster (byte)

        //yada bu şekil yazılır
        int cevre2= kisak+kisak+uzunk+uzunk;
        System.out.println("cevre = " + cevre);
        System.out.println("cevre2 = " + cevre2);


    }
}
