package Gun19;

public class _05_JavaMethod {

    // buraya metodlar yazılabilir


    public static void main(String[] args) { // diğer metodları buradan çağıracağız
        Math.max(5,6); // birşeyler verilmiş, geriye değer alınıyor
        Math.random(); // veri almıyor, sadece veri verir

        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");

        merhabaYaz(); // kullanımı kolay, çağırılması kolay tekrar tekrar kullanabilirsin
        merhabaYaz(); // mainin daha kolay anlaşılabilir olur.
        merhabaYaz(); // fonksiyonu çağırma şekli

    }

    public static void merhabaYaz(){ // ÖNEMLİ: bu kendine başına çalışmıyor main tarafından çağırırsan çalışır

        System.out.println("Merhaba Dünya");

    }


    // buraya metodlar yazılabilir

}
