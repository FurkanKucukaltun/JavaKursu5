package Gun28._01_Constructor;

public class  Okul {
    public static void main(String[] args) {
        
        // 1. yol
        Ogrenci ogr1=new Ogrenci(); // nesne oluşma anı

        ogr1.id=1; // özelliklerinin değerlerini veriyorum
        ogr1.ad="zahid";
        ogr1.soyad="agah";
        ogr1.sinifi=1;
        
        //2. yol
        Ogrenci ogr2=new Ogrenci(2,"zahid","agah",5);
        System.out.println("ogr2.ad = " + ogr2.ad);

        // 3. Yol
        Ogrenci ogr3= new Ogrenci(2,"ayşe","bayrak");

//    mühendisin arabayı çizdiği kağıttaki modeller: class, tipin adı, türün adı
//        buna bakarak yapılmış araba ise nesne, araba üretilirken yapılan işlemlerin
//        yapıldığı metod ise Constructor yani yapıcı metodlar
    }
}
