package Gun28._04_Constructor;

public class Bankalar {
    public static void main(String[] args) {
        // Bir banka class ı tanımlayınız.
        // 3 adet field ekleyiniz.(adi, subeSayisi, kurulusYili)
        // 3 adet constructor ekleyin.
        // toString metodu oluşturun.
        // 3 tane nesne oluşturup mainde yazdırınız.

        Banka Banka1= new Banka("Yapıkredi",456,1958);
        Banka Banka2= new Banka("Garanti",456);
        Banka Banka3= new Banka();
        Banka Banka4=new Banka("vakıf",5,1911);

        System.out.println("Banka1 = " + Banka1);
        System.out.println("Banka2 = " + Banka2);
        System.out.println("Banka3 = " + Banka3);


    }
}
