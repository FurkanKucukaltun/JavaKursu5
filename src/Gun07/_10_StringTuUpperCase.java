package Gun07;

import java.util.Locale;

public class _10_StringTuUpperCase {
    public static void main(String[] args) {
        //ToUpperCase: string büyük harfe çevirir

        String text="Merhaba dünya";
        System.out.println("orjinal text = " + text);
        System.out.println("büyük text= " + text.toUpperCase());

        System.out.println("me veya ME ile mi başlıyor= " + text.toUpperCase().startsWith("ME")); //True


    }
}
