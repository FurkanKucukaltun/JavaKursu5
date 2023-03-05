package Gun04;

public class _06_Ornek2 {
    public static void main(String[] args) {
        // Kişinin ağırlığını double, boyunu int olarak değerler veriniz.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazrınız.
        // vucut kıtle ındexını de bularak yazdırınız ( kg/ boy*boy)

        double kilo=55;
        double boy=1.63;
        double vctktlendx=kilo/(boy*boy);

        System.out.println("boyunuz = " + boy);
        System.out.println("kilonuz = "   + kilo);

        //yada
        System.out.println("boyunuz = " + boy+" " +"kilonuz=" +kilo);
        System.out.println("vctktlendx = " + vctktlendx);


    }
}
