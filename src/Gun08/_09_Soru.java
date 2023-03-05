package Gun08;

import java.util.Scanner;

public class _09_Soru {
    public static void main(String[] args) {
        // girilen bir cümledeki ilk kelimeyi yazdırınız
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir cümle giriniz=");
        String kelm= oku.nextLine();
        System.out.print("İlk kelime= " + kelm.substring(0,kelm.indexOf(" ")));


    }
}
