package Gun06;

public class _03_StringCharAt {
    public static void main(String[] args) {

        //istenilen noktaki karakteri verir
        // karakterlerin sırası 0dan başlar ve buna index denir

        String cumle="Merhaba Dünya"; // Length 13 ama karakterlerin odası 0-12 dahil

        char ilkharf=cumle.charAt(0); //0 indexteki karakteri ver
        System.out.println("ilkharf = " + ilkharf);
    }
}
