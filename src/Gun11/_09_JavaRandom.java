package Gun11;

import java.util.Scanner;

public class _09_JavaRandom {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışnız
        // kullanıcı bilirse tebrikler yazdırınız.


        Scanner oku=new Scanner(System.in);
        System.out.println("üretilecek sayi sınırı=");
        int sinir= oku.nextInt();

        int tutulanSayi= (int)(Math.random()*sinir);

        System.out.println("tahmininiz=");
        int tahmin= oku.nextInt();

        if (tahmin==tutulanSayi)
            System.out.println("tebrikler");
        else
            System.out.println("bilemediniz");

         /*

        boolean true1 = true;
        boolean true2 = true;
        boolean false1 = false;
        boolean false2 = false;

        System.out.println( true1 && false1 );
        System.out.println( true1 && false1 );
        System.out.println( false1 && true1 );
        System.out.println(false && true || true);



        boolean true1 =  true;
        boolean true2 = true;
        boolean false1 = false;
        boolean false2 = false;

        System.out.print( (true1 || true2)+" ");
        System.out.print( (true1 || false1)+" " );
        System.out.print( false1 || false2 );



        String x= "    hfhfhfh kfkfkfkf  ";

        System.out.println(x.trim());




        byte x = 0;
        int y= x++;
        System.out.println("y = " + y);

          */





    }
}
