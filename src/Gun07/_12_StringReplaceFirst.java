package Gun07;

public class _12_StringReplaceFirst {
    public static void main(String[] args) {
        //replaceFirst : bir string içerisindeki karakterleri verilenle sadece ilkini değiştirir.


        String text="Merhaba Dünya";
        System.out.println("text = " + text);
        System.out.println("text.replacefirst(a,e) = " + text.replaceFirst("a","e")); // Merheba Dünya
        System.out.println("text.replacefirst(ba) = " + text.replaceFirst("ba","de")); //Merhade Dünya
        System.out.println("text.replacefirst(Dünya,java) = " + text.replaceFirst("Dünya","java")); // Merhaba java
        System.out.println("text.replacefirst(a,'') = " + text.replaceFirst("a","")); //ilk a silindi //Merhba Dünya
    }
}
