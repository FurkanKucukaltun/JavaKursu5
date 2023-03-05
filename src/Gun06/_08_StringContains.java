package Gun06;

public class _08_StringContains {
    public static void main(String[] args) {
        // contins=bir stringin içerisinde karakterlerin olup olmadığını boolean cinsinden söyle
        //true veya false

        String cumle = "Merhaba Dünya";
        boolean varmi = cumle.contains("a");
        System.out.println("varmi = " + varmi);

        //direktte yapabilirsiniz

        System.out.println("a varmı=" + cumle.contains("a"));

        System.out.println("ya varmı=" + cumle.contains("ya"));
        System.out.println("k varmı=" + cumle.contains("k"));
    }
}
