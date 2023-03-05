package Gun28._02_Constructor;

import Gun28._01_Constructor.Ogrenci;

public class Kitapci {
    // Book class yazınız.fields: name,publishYear,author.
    // 3 adet Consructor ekleyiniz.
    // Kitapların özelliklerini tek bir satırda yazdıran bir metod ekleyiniz.
    // 3 adet kitabı farklı constructor la oluşturup, mainde yazdırınız.

    public static void main(String[] args) {

        Book kitap1=new Book();
        kitap1.name="Harry Potter";
        kitap1.author="JK Rowling";
        kitap1.publishYear=1997;
        System.out.println("kitap1 = " + kitap1);
        System.out.println("kitap1.publishYear = " + kitap1.publishYear);

        Book kitap2= new Book("yüzükler",1954,"JRR Tolkien");
        Book kitap3= new Book("üzümve çay",2000);

        System.out.println("kitap1 = " + kitap1);
        System.out.println("kitap2 = " + kitap2);
        System.out.println("kitap3 = " + kitap3);

    }


}
