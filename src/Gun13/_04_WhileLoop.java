package Gun13;

import java.util.Scanner;

public class _04_WhileLoop {
    public static void main(String[] args) {
        //girilen 20 sayıdan sadece pozitif olanların toplamını yazdırınız

        int sayac=1;
        int toplam= 0;


        while (sayac<20) {

            Scanner oku=new Scanner(System.in); // scanner while döngüsünün dışında da olabilir
            System.out.print("sayi=");
            int sayi= oku.nextInt();

            if (sayi>0);
            toplam=toplam+sayi;

            sayac++;

        }
        System.out.println("toplam = " + toplam);

    }
}
