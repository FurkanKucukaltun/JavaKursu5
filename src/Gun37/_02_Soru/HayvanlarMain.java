package Gun37._02_Soru;

import Gun33._02_Inheritance.Ordek;

import java.util.ArrayList;
import java.util.Arrays;

public class HayvanlarMain {
    public static void main(String[] args) {

        Swallow kirlangic=new Swallow();
        Cat kedi=new Cat();
        Shark kopekbaligi=new Shark();
        Duck ordek=new Duck();

        ArrayList<Animal>hayvanlar=new ArrayList(Arrays.asList(kirlangic,kedi,kopekbaligi,ordek));
        for (Animal a:hayvanlar) {
            System.out.println(a.getClass().getSimpleName());
            if(a instanceof Swallow){
                System.out.println(((Swallow)a).food());
                System.out.println(((Swallow)a).fly());
            } else
                if (a instanceof Cat){
                    System.out.println(((Cat)a).food());}
            else
                if (a instanceof Shark){
                    System.out.println(((Shark)a).food());
                    System.out.println(((Shark)a).swim());}
            else
                if (a instanceof Duck){
                    System.out.println(((Duck)a).food());
                    System.out.println(((Duck)a).swim());
                    System.out.println(((Duck)a).fly());}
            System.out.println("*********************************");

        }
    }
}
