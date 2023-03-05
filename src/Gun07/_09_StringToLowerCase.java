package Gun07;

public class _09_StringToLowerCase {
    public static void main(String[] args) {
        // toLowerCase: stringi küçük harfe çevirir
        
        String text="Merhaba Dünya";
        System.out.println("orjinal hali text = " + text);
        System.out.println("text.toLowerCase() = " + text.toLowerCase());

        System.out.println("me veya ME ile başlıyor mu?= " + text.toLowerCase().startsWith("me"));
    }
}
