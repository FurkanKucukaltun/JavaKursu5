package _02_Alistirma;


import java.util.ArrayList;
import java.util.Arrays;

public class _02_ {
    public static void main(String[] args) {

        terstensirala(ulkeekle());
        }

        public static ArrayList<String > ulkeekle(){
            ArrayList<String>ulkeler = new ArrayList<>(Arrays.asList("Turkiye","Almanya","Fransa","Kanada","Italya"));
            System.out.println("ulkeler = " + ulkeler);
            return ulkeler;
        }
        public static void terstensirala(ArrayList<String>ulkeler) {

            for (int i = (ulkeler.size()-1); i >=0 ; i--) {
                 System.out.print(ulkeler.get(i));
            }

        }

    }

