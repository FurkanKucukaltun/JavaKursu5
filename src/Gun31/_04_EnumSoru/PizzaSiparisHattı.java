package Gun31._04_EnumSoru;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PizzaSiparisHattı {

    // Bir pizza sipariş hattı yapılmak isteniyor.
    // Kullanıcıya Pizza için 1-Small,2-Medium,3-Large, 4-Goster
    // seçeneklerini bir menü şeklinde vererek, verdiği pizzaları
    // bir ARRAYLIST e atınız.
    // Goster (4) ü seçtiğinde her pizzadan kaçar tane sipariş
    // verdiğini bir metodda yazdırınız.
    // todo: her pizza için ücret belirleyerek toplam fiyatu yazdırınız

    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        ArrayList<Pizza>siparisler=new ArrayList<>();

        int secim=0;
        do{
            //menu
            menu();
            secim=oku.nextInt();
            // scannerla secim alalım
            //secilen pizza Arrayliste ekleyelim
            switch (secim){
                case 1: // small
                    Pizza sp=new Pizza(PizzaSize.SMALL);
                    siparisler.add(sp);
                    break;
                case 2: // medium
                    Pizza mp=new Pizza(PizzaSize.MEDIUM);
                    siparisler.add(mp);
                    break;
                case 3: // large
                    Pizza lp=new Pizza(PizzaSize.LARGE);
                    siparisler.add(lp);
                    break;
                case 4: siparisYazdir(siparisler);
                    // eğer 4 ü seçerse arraylist i bir metoda gönder
                    // arada hangi pizzadan kaç sipariş verdiğini  olduğunu gösterir
                    break;

            }while (secim<=4);



            //eğer 4 ü seçerse arraylist İ BİR METODA GÖNDER
            // orada hangi pizzadan kaç sipariş verildiğini göster

        }while(secim<=4);

    }

    public static void menu(){
        System.out.println("**********Pizza Menu************");
        System.out.println("1 - Small");
        System.out.println("2 - Medium");
        System.out.println("3 - Large");
        System.out.println("4 - İşleme Al - Sipariş Göster");
        System.out.println("5 - Çıkış");
        System.out.println("Seçiminiz : ");
    }
    public static void siparisYazdir(ArrayList<Pizza>siparisler){

        int s=0, m=0, l=0;

        for (Pizza p:siparisler) {
            if(p.size==PizzaSize.SMALL) s++;
            else
                if (p.size==PizzaSize.MEDIUM) m++;
            else
                if(p.size==PizzaSize.LARGE) l++;
        }
        System.out.println("*****Siparişleriniz******");
        System.out.println("Small Pizza Count = "+s);
        System.out.println("Medium Pizza Count = "+m);
        System.out.println("Large Pizza Count = "+l);
    }
}
