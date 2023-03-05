package Gun08;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {
        // girilen bir sayının tek sayı olup olmadığını yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz=");
        int a= oku.nextInt();
        System.out.println("Tek sayı mı?= " + (a%2==1));
    }
}
