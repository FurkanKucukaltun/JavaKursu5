package Gun27._02_Ornek;

public class Soru {
    public static void main(String[] args) {
        // Math sınıfndaki metodlarıdan 5 tanesini
        // kendi isimlendirmenizle ayrı bir sınıfta yazarak,
        // (kendi metodunuzun içinde Math.fonksiyonlarını kullanabilirsiniz)
        // mainden nesne oluşturmadan direk kullanılmasını sağlatacak örnek
        // kullanımlarını yazınız.

        int max=Matemetik.getmax(4,6);
        int min=Matemetik.getmin(5,6);
        int rnd=Matemetik.getRandom(10);
        double usSonuc=Matemetik.getUsal(5,6);
        double kareKok=Matemetik.getKarekok(6);

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("kareKok = " + kareKok);
        System.out.println("usSonuc = " + usSonuc);
        System.out.println("rnd = " + rnd);



    }
}
