package Gun09;

import java.util.Scanner;

public class _06_JavaIf {
    public static void main(String[] args) {
        // Girilen bir cümlede a harfinin geçip geçmediğini
        // bulunuz geçiyor ise EVET, geçmiyor ise HAYIR yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir cümle giriniz=");
        String cumle= oku.nextLine();

        if (cumle.contains("a")==true)
            System.out.println("evet");

        if (cumle.contains("a")==false)
            System.out.println("hayır");

        // yada
        if (!cumle.contains("a")) //! işareti değilse/yoksa demek
            System.out.println("hayır");
        // 2. yol
        if(cumle.indexOf("a")!=-1)
            System.out.println("evet");

        if (cumle.indexOf("a")==-1)
            System.out.println("hayır");

        //3. yol
        boolean varmi=cumle.contains("a");
        if (varmi==true)
            System.out.println("evet");
        if (varmi==false)
            System.out.println("hayır");


    }
}
