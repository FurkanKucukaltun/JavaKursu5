package Gun26._03_Ornek;

public class Ornek {

    // 1-Adım :Rectangle isminde ayrı bir dosyada olmak üzere sınıf yazınız.
    //         (properties, fields, özellik, eleman, items) : width, length
    // 2-Adım :Çevre bulmak üzere Cevre isminde bir metod yazınız.
    // 3-Adım :Dikdörtgenin alanını bulan Alan isimli bir metod yazınız.
    // 4-Adım :1 tane nesne ye deger vererek metodların sonuçları yazdırınız.

    public static void main(String[] args) {

        Rectangle dikdortgen=new Rectangle();

        dikdortgen.width=5;
        dikdortgen.length=4;

       dikdortgen.Cevre();
       dikdortgen.Alan();


    }
}
