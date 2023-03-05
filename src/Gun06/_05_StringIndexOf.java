package Gun06;

public class _05_StringIndexOf {
    public static void main(String[] args) {
        // hafrflerin oda numaları 0dan başlar: index

        String cumle="Merhaba Dünya";
        //Dnin indexi kaç
        //Mnin indexi kaç
        //verilen karaktelerin string içerisindeki indexi verir

        System.out.println("cumle.indexOf(M) = " + cumle.indexOf("M")); //0
        System.out.println("cumle.indexOf(a) = " + cumle.indexOf("a")); //4
        System.out.println("cumle.indexOf(ha) = " + cumle.indexOf("ha")); //3
        System.out.println("cumle.indexOf(  ) = " + cumle.indexOf(" ")); //7
        System.out.println("cumle.indexOf(A) = " + cumle.indexOf("A")); //-1 //yoktur demek
        System.out.println("cumle.indexOf(a,5) = " + cumle.indexOf("a",5)); //6

    }
}
