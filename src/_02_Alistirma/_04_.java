package _02_Alistirma;

import java.util.Scanner;

public class _04_ {
    public static void main(String[] args) {
        // todo: bir dongu ile 5 tane rasgele buldurunuz
        //todo: fakat bir bulunan tekrar bulunmasın

        // 5 tv kanalı ismini bir diziye doldurunuz.
        // Daha sonra rndom olarak bir tanesini seçip ekrana seçileni yazıdırnız.



        String[] tvkanal = {"trt", "atv", "kanald", "fox", "habertürk"};
        //int rastgele = (int) (Math.random() * words.length); //5e kadar 5 dhil değil
        System.out.println("Rastgele seçilen tv= ");
        printWords(tvkanal);


        tvkanal=removeWord(tvkanal);

        System.out.println("Rastgele seçilen tv= ");
        printWords(tvkanal);
    }
    public static String[] removeWord(String[] tvkanal) {
        // make a new array that is one smaller
        String[]lessWords=new String[tvkanal.length-1];

        // ask the user which to remove
        Scanner oku= new Scanner(System.in);
        System.out.println("what word to remove= ");
        String wordToRemove=oku.nextLine();
        int indexLess=0;

        // copy the words that do not mach that input into new array
        for (int i = 0; i < tvkanal.length; i++) {

            if(!tvkanal[i].equalsIgnoreCase(wordToRemove)) {
                lessWords[indexLess] = tvkanal[i];
                indexLess++;
            }

        }

        // return it

        return lessWords;
    }

    public static void printWords(String[] tvkanal) {

        for (int i = 0; i < (tvkanal.length); i++) {
            System.out.println((i+1)+". kanal = " + tvkanal[i]);
        }


       // return printWords;

    }

}
