package Gun14;

import java.util.Scanner;

public class _08_continue {
    public static void main(String[] args) {
        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // şekilde yazdırınız, boşlukları yazmasın.

        Scanner oku = new Scanner(System.in);
        System.out.println("bir kelime giriniz=");
        String klm = oku.nextLine();

        for (int i = 0; i < klm.length(); i++) {
            if (klm.charAt(i) == ' ')
                continue;

            System.out.println(klm.charAt(i));

        }


    }
}
