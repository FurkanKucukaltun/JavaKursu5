package Gun32._02_Encapsulation;

import Gun32._01_Encapsulation.Kisi;

import java.util.Scanner;

public class ArabaMain {
    public static void main(String[] args) {
        // Bir araba nesnesi oluşturulmak isteniyor. fields(Renk, Model, MotorHacmi,KapiSayisi)
        // Bu nesnenin verilerini OOP kurallarına uygun olarak verip alınız.
        // Main de 1 tane nesne oluşturup bunu kontrol ediniz.

        Scanner oku=new Scanner(System.in);
        System.out.println("Model giriniz: ");

        Araba araba1=new Araba();
        araba1.setRenk("Siyah");
        araba1.setModel(oku.nextInt());
        araba1.setMotorHacmi(1600);
        araba1.setKapiSayisi(4);
        System.out.println("araba1 = " + araba1);

        Araba araba2=new Araba("mavi",2030,1600,4); // model yılı yanlış girildiği için hata verir
        System.out.println("araba2 = " + araba2);


        // KURAL: genel yazılım kuralıdır.
        // bütün değişkenler private yapılır.
        // yani Kapsulleme ile kullanılır.
        // Eğer gerekiyorsa private kaldırılır.

    }
   
}
