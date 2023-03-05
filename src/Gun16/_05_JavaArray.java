package Gun16;

import java.util.Scanner;

public class _05_JavaArray {
    public static void main(String[] args) {
        // 5 tv kanalı ismini bir diziye doldurunuz.
        // Daha sonra rndom olarak bir tanesini seçip ekrana seçileni yazıdırnız.


        //kuullanıcadan alın deseydi bu şekil
        Scanner oku = new Scanner(System.in);
        String[] tv = new String[5];
        for (int i = 0; i < tv.length; i++) {
            System.out.println("bir tv ismi giriniz:");
            tv[i] = oku.nextLine();
        }
            int tvrandm=(int)(Math.random()*5);
        System.out.println("tvrandm = " + tv[tvrandm]);



        // 2. yöntem // hocanın yöntemi

        String[] tvler={"trt","atv","kanald","fox","habertürk"};

        int rastgele=(int)(Math.random()*tvler.length); //5e kadar 5 dhil değil

        System.out.println("Rastgele seçilen tv= " + tvler[rastgele]);





        // TODO : gunun sorusu : bir döngü ile 5 tane rastgele buldurunuz
        // TODO: fakat bir bulduğunu tekrar bulmasın









    }
}
