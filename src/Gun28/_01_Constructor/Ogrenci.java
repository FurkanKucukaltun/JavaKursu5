package Gun28._01_Constructor;

public class Ogrenci {
    int id;
    String ad;
    String soyad;
    int sinifi;

    public Ogrenci(){ // yapıcı metodlar: Constructor metod
        System.out.println("nesne oluşturldu");
    } // nesne oluşturken yapmak istediklerin için burayı kullan

    public Ogrenci(int id,String ad,String soyad,int sinifi){ // yapıcı metod
        this.id=id; // this.id= class ın id si ,  id: local değişken parametre
        this.ad=ad;
        this.soyad=soyad;
        this.sinifi=sinifi;
    }

    public Ogrenci(int id,String ad, String soyad){ //yapıccı metodlar:

        this(id,ad,soyad,0); // this öğrenci metodunun kendisi

//        this.id=id; // this.id= class ın id si ,  id: local değişken parametre
//        this.ad=ad;
//        this.soyad=soyad;
//        this.sinifi=sinifi;
    }
}
