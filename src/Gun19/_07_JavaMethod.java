package Gun19;

import java.util.Scanner;

public class _07_JavaMethod {
    public static void main(String[] args) {

        tekmiCiftmi(55);
        tekmiCiftmi(60);

        // kullancıdan sayı alarak onu tek mi çift mi yazdıralım
        tekmiCiftmiOku();
    }

    public static void tekmiCiftmi(int sayi){

        if (sayi%2==0)
            System.out.println("çift");
        else
            System.out.println("tek");
    }
    public static void tekmiCiftmiOku(){
        Scanner oku=new Scanner(System.in);
        System.out.print("sayı giriniz= ");
        int sayi= oku.nextInt();

        tekmiCiftmi(sayi);
    }
}
