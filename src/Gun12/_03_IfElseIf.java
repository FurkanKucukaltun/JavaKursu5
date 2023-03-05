package Gun12;

import java.util.Scanner;

public class _03_IfElseIf {
    public static void main(String[] args) {
        // Soru : Kullanıcıdan  Fizik:90   şeklinde not bilgisini alınız.
        // >= 90 için A
        // >= 80 için B
        // >= 70 için C
        // >= 60 için D
        // >= 40 için E
        // < 40 için F yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("Fizik:90 şeklinde not girişi");
        System.out.println("not giriniz=");
        String not=oku.nextLine();

        String not1=not.substring(not.lastIndexOf(":")+1);
        int not2= Integer.parseInt(not1);

        // 2. yazım şekli
        // int not2= Integer.parseInt(not.substring(not.lastIndexOf(":")+1);

        // 3. yontem
       // int not2= Integer.parseInt(not.replaceAll("[^0-9]","")); // 0-9 dışındakileri sil

        if (not2>=90)
            System.out.println("A aldınız");
        else
            if (not2>=80)
                System.out.println("B aldınız");
            else
                if (not2>=70)
                    System.out.println("C aldınız");
                else
                    if (not2>=60)
                        System.out.println("D aldınız");
                    else
                        if (not2>=50)
                            System.out.println("E aldınız");
                        else
                            System.out.println("F aldınız");

    }
}
