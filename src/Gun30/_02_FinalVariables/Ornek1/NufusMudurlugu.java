package Gun30._02_FinalVariables.Ornek1;

public class NufusMudurlugu {
    public static void main(String[] args) {

        Vatandas v1=new Vatandas("Ismet");
        Vatandas v2=new Vatandas("Seyda");
        Vatandas v3=new Vatandas("Furkan");

        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println("v3 = " + v3);

        //v1.tcNo=456
        // fiqnal değişkenlerine sadece 1 kez veri atanabilir.
        // o da ya tanımlarken, ya da Constructor da

        final double pi=3.14;
        // pi=5;  // yeni değer tanımlanamadı!!! sonradan değiştirilemez

    }
    //     final : değer atandıktan sonra değiştirilmeyi engelliyor
//         bu sebeple, hem sabit değerler için, hem de sonradan
//         değişmesini istemediğimiz değerler için kullanılır
//         static sayac ise: her yeni nesne oluşturulduğunda
    //     yeni artan değer almasını sağlıyor
}
