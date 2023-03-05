package Gun33._03_Inheritance;

public class SirketMain {
    public static void main(String[] args) {
        // SirketMain diye yazacağınız main in olduğu yerde, 1 calısan ve 1 GenelMüdür tanımlayarak,
//        maaşları hesaplatıp, bordroyu yazdırınız.



        Calisan cls1=new Calisan("Furkan",5000,0.7);
        System.out.println("cls1 = " + cls1);
        System.out.println("******BORDRO*******");
        System.out.println("Isim() = " + cls1.getIsim());
        System.out.println("Maas() = " + cls1.getMaas());

        GenelMudur gm=new GenelMudur("seyda",50000,0.7,100000);

        System.out.println("gm = " + gm);
        System.out.println("******BORDRO*******");
        System.out.println("Isim() = " + gm.getIsim());
        System.out.println("Maas() = " + gm.getMaas());
        System.out.println("gm.getTazminat() = " + gm.getTazminat());

    }
}
