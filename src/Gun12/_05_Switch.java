package Gun12;

import java.util.Scanner;

public class _05_Switch {
    public static void main(String[] args) {
        // Daha önce cözdüğünüz hesap makinesi sorusunu switch case ile çözünüz

        Scanner oku=new Scanner(System.in);

        System.out.print("1. tam sayı=");
        int sayi1= oku.nextInt();
        System.out.print("2. tam sayı=");
        int sayi2= oku.nextInt();

        System.out.println("Toplama için T");
        System.out.println("Çıkartma için Ç");
        System.out.println("Çarpma için P");
        System.out.println("Bölme için B");
        System.out.print("Seçiminiz =");
        Scanner okuu=new Scanner(System.in);
        String secim=okuu.nextLine();



        switch (secim.toUpperCase()) {
            case "T":
                System.out.println("toplam=" + (sayi1 + sayi2));
                break;
            case "Ç":
                System.out.println("Farkı=" + (sayi1 - sayi2));
                break;
            case "P":
                System.out.println("Çarpma=" + (sayi1 * sayi2));
                break;
            case "B":
                System.out.println("Bölme=" + ((double)(sayi1 / sayi2)));
                break;

            default:
                System.out.println("yanlış seçim yaptınız"); //case dekilerin dışında ise

        }


    }
}
