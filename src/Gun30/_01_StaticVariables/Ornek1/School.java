package Gun30._01_StaticVariables.Ornek1;

public class School {
    public static void main(String[] args) {

        Studentt ogr1=new Studentt(1, "Ismet Temur");
        Studentt ogr2=new Studentt(2, "mehmet Temur");
        Studentt ogr3=new Studentt(3, "ahmet Temur");
        // problem: hem id yi takip etmek zorundayım
        // hem de hata olasılığı yüksek

        Studentt ogr10=new Studentt("Ismet Temur");
        Studentt ogr11=new Studentt("beyza demir");
        Studentt ogr12=new Studentt("mehmet Temur");

        System.out.println("ogr10 = " + ogr10);
        System.out.println("ogr11 = " + ogr11);
        System.out.println("ogr12 = " + ogr12);


    }
}
