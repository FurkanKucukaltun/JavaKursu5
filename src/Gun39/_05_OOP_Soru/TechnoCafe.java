package Gun39._05_OOP_Soru;

import Gun34._02_Ornek.LiseOgrencisi;
import Utility.MyFunc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TechnoCafe {
    public static void main(String[] args) {

        List<IFood> siparisler=new ArrayList<>();
        Scanner oku=new Scanner(System.in);

        int secim=0;
        do{
            menu();
            secim= oku.nextInt();

            switch (secim){
                case 1 :
                    AdanaKebap ak=new AdanaKebap();
                    siparisler.add(ak);
                    break;
                case 2 :
                    IFood lh=new Lahmacun();
                    siparisler.add(lh);
                    break;

                case 3 :
                    IFood bo=new Borsh();
                    siparisler.add(bo);
                    break;

                case 4 :
                    Palov pa=new Palov();
                    siparisler.add(pa);
                    break;
            }

        }while (secim<5);

        System.out.println("Alınan Siparişler");
        for (IFood f:siparisler) {
            System.out.println(f.getClass().getSimpleName());
        }
        System.out.println("siparişleriniz hazırlanıyor");
        MyFunc.Bekle(2);  // utility classından çağırdık
        double toplam=0;
        for (IFood f:siparisler) {
            TechnoKitchen.hazirla(f);
            toplam+=f.ucret();
        }

        System.out.println("toplam ücret= "+toplam);

    }
    public static void menu(){
        System.out.println("*******Menü******"+
                        "\n1-Adana Kebap (55 TL)"+
                "\n2-Lahmacun (33 TL)"+
                "\n3-Borsh (33 TL)"+
                "\n4-Palov (44 TL)"+
                "\n5-Tamam"+
                "\nSeçiminiz : ");

    }
}
