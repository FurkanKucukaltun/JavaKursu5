package Gun07;

public class _13_StringReplaceAll {
    public static void main(String[] args) {
        //ReplaceAll: replace gibi çalışıyor. farkı kriter (regex) verilebiliyor
        //regex: regular expression / düzenli ifadeler
        
        String text="merhaba dunya";

        System.out.println("text = " + text); // orjinal

        //System.out.println("text.replaceAll(\"[abn]\",\"_\") = " + text.replaceAll(" ","_"));
        //String txt=text.replaceAll(" ","_");
        System.out.println("text.replaceAll(\"[abn]\",\"_\") = " + text.replaceAll("[abn]",""));

        //a ve bve n leri _ yap // Merh__ Dü_y_123

        System.out.println("text.replaceAll([\"A-Z\"],\"_\") = " + text.replaceAll("[A-Z]","_"));
        //A dan Zye kadar büyük harfleri _ yap //  _erhaba _ünya

        System.out.println("text.replaceAll([\"0-9\"]) = " + text.replaceAll("[0-9]",""));
        // rakamları sil // Merhaba Dünya

        System.out.println("text.replaceAll(\"[^0-9]\",\"\") = " + text.replaceAll("[^0-9]",""));
        // Rakamların dışındakileri sil // 123

        System.out.println("boşluk+ilkharf = " + text.replaceAll("[^{ }[a-z])]",""));

    }
}
