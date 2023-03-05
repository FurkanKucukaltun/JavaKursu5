package Gun17;

import java.util.Arrays;
import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        //10 elemanlı bir diziyi random olarak doldurduktan sonra kullanıcının gireceği bir rakamı arattırınız.
        //Bu rakam var ise indexini yazdırınız

        // Math.Random -> 0-0.99  -> 10 * 0-0.9999 -> 0-9 arası çıkar

        int[] dizi = new int[10];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 11);

        }
        System.out.println(Arrays.toString(dizi));

        Scanner oku = new Scanner(System.in);
        System.out.println("bir rakam giriniz:");
        int arananrakam = oku.nextInt();

        boolean bulundu=false;

        for (int i = 0; i < dizi.length; i++) {
            if(dizi[i]==arananrakam){
                bulundu=true;
                System.out.println("bulundu index="+i);
            }
        }

        if(!bulundu){
            System.out.println("bulunamadı");
        }

    }
}
