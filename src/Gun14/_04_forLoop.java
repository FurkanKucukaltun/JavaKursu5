package Gun14;

import java.util.Scanner;

public class _04_forLoop {
    public static void main(String[] args) {

        //Kullanıcının gireceği bir rakama kadar olsn sayıların toplamını yazınız

        Scanner oku=new Scanner(System.in);
        System.out.println("bir rakam giriniz=");
        int rakam= oku.nextInt();;

        int toplam=0;
        for (int i=0; i<=rakam; i++)
            toplam=toplam+i; //toplam+=i
        System.out.println("toplam = " + toplam);
    }
}
