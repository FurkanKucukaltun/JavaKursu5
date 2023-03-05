package Gun07;

public class _11_StringReplace {
    public static void main(String[] args) {
        //replace : bir string içerisindeki karakterleri verilenle değiştirir hepsini.
        
        String text="Merhaba Dünya";
        System.out.println("text = " + text);
        System.out.println("text.replace(a,e) = " + text.replace("a","e")); // Merhebe Dünye
        System.out.println("text.replace(ba) = " + text.replace("ba","de")); //Merhade Dünya
        System.out.println("text.replace(Dünya,java) = " + text.replace("Dünya","java")); // Merhaba java
        System.out.println("text.replace(a,'') = " + text.replace("a","")); //Merhb Düny
        
        
    }
}
