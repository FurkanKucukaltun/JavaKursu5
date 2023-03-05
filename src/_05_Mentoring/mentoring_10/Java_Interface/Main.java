package _05_Mentoring.mentoring_10.Java_Interface;

import _05_Mentoring.mentoring_10.Java_abstract.Daire;
import _05_Mentoring.mentoring_10.Java_abstract.Dikdortgen;

public class Main {
    public static void main(String[] args) {

        // Interface, bir classın davranışını belirtmek için kullanılan soyut bir türdür
        // Interface body olmayan metodlarıyla kendisini implement eden child classlar için şablon/planlama olarak kullanılır
        // Bir classbirden fazla interface implement edebilir

        Dikdortgen dikdortgen=new Dikdortgen("mavi",12,5);
        System.out.println(dikdortgen);

        Daire  daire = new Daire("fuşya",3 );
        System.out.println(daire);

    }
}
