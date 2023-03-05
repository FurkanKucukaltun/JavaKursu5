package Gun39._01_OOP_Soru;

public class MainHayvan {
    public static void main(String[] args) {

        Kedi cat=new Kedi("bitter",false,"mart2020");
        System.out.println(cat);

        // hayvan class ında to String in içine aşağıdaki metodlar eklendiği için bunlara gerek kalmadı
//        cat.yiyecegi();
//        cat.yemekMiktari();
//        cat.sesi();
//        cat.gunlukUykuSuresi();

        Kartal eagle=new Kartal("kartal",true,"subat2021");
        System.out.println(eagle);

        // hayvan class ında to String in içine aşağıdaki metodlar eklendiği için bunlara gerek kalmadı
//        eagle.yiyecegi();
//        eagle.yemekMiktari();
//        eagle.sesi();
//        eagle.gunlukUykuSuresi();

    }
}
