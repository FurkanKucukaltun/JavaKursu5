package Gun27._01_Ornek;

import java.util.ArrayList;

public class JavaStaticveNonStaticMetodlar {
    public static void main(String[] args) {

        int sayi=346;
        String strSayi=String.valueOf(sayi);
        System.out.println("strSayi = " + strSayi);
        int intSayi=Integer.parseInt(strSayi);
        System.out.println("intSayi = " + intSayi);

        Utility ut=new Utility();
        String strSayi2=ut.getString(sayi);
        System.out.println("strSayi2 = " + strSayi2);

        String strSayi3=Utility.getString2(sayi);
        System.out.println("strSayi3 = " + strSayi3);

    }
}
