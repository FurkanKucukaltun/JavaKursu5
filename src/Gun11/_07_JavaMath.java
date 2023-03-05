package Gun11;

import java.util.Scanner;

public class _07_JavaMath {
    public static void main(String[] args) {
        //  Math.max yöntemi ile girilen 3 sayıdan büyük olanını bulunuz

        Scanner oku= new Scanner(System.in);
        System.out.println("a=");
        int a= oku.nextInt();
        System.out.println("b=");
        int b= oku.nextInt();
        System.out.println("c=");
        int c= oku.nextInt();

        //1. yontem

        System.out.println("a ve b den büyük olanı = " + Math.max(a, Math.max(b,c) ));

        //2. yontem
        int enb = Math.max(a,b);
        enb=Math.max(enb,c);
        System.out.println("enb = " + enb);


    }

}
