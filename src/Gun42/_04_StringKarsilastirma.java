package Gun42;

public class _04_StringKarsilastirma {
    public static void main(String[] args) {
        // Stringlerde neden == yerine equal kullanılmalıdır?
        String cumle1="Bugün hava çok güzel";
        String cumle2="Bugün hava çok güzel";

        if(cumle1==cumle2)
            System.out.println("cumle1 cumle2 ye eşit");
        else
            System.out.println("cumle1 cumle2 ye eşit DEĞİL");

        if(cumle1.equals(cumle2))
            System.out.println("cumle1 cumle2 ye eşit");
        else
            System.out.println("cumle1 cumle2 ye eşit DEĞİL");

        //***********Referans tiplerde ise durum ***********//
        // scanner ile ekrandan okunduğunda aşağıdaki gibi oluyor

        String cumle3=new String("Bugün hava çok güzel");
        String cumle4=new String("Bugün hava çok güzel");

        if(cumle3==cumle4)  // adresleri karşılaştırır
            System.out.println("cumle3 cumle4 ye eşit");
        else
            System.out.println("cumle3 cumle4 ye eşit DEĞİL");

        if(cumle3.equals(cumle4)) // değerleri aynı mı
            System.out.println("cumle3 cumle4 ye eşit");
        else
            System.out.println("cumle3 cumle4 ye eşit DEĞİL");

    }
}
