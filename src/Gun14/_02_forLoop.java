package Gun14;

public class _02_forLoop {
    public static void main(String[] args) {
        // 0dan 5e kadar olan sayıları ekrana yazdırınız
        // kaç kere döneceği belli değilse while, döngü sayısı belliyse for
        // mesela kullanıcı 0 degerini girene kadar dedigimizde while, 1 le 5 arasında ki sayıların ...
        // diye devam ederse for gibi yani
        int i=0;
        while (i<=5)
        {
            System.out.println("w_i = " + i);
            i++;
        }

        System.out.println();
        // for döngüsü
        for(i=0;i<=5;i++)
            System.out.println("f_i = " + i);


/*

        1- Başı belli, sonu belli,
                yani kaç adım döneceği belli ve artış miktarı
        belli ise bu FOR döngüsüdür.

        2- Kaç kere döneceği belli değil ise
                (kullanıcı 0 değeri girene kadar)
        WHILE döngüsüdür.

        3-While döngüsünde döngü kontrolü işlemden sonra
        ise DO-WHILE dongusudur.*/
    }
}
