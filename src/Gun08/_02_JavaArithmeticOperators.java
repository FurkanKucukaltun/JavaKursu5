package Gun08;

public class _02_JavaArithmeticOperators {
    public static void main(String[] args) {
        int sayac=0;

        sayac=sayac+1;
        sayac++;
        ++sayac;

        sayac=sayac-1;
        sayac--;
        --sayac;

        System.out.println("sayac = " + sayac); //0

        int toplam=5+sayac; //5 olur
        System.out.println("toplam = " + toplam); //5
        System.out.println("sayac = " + sayac);  //0

        toplam=5+sayac++; // toplam 5+sayac, sonra sayac0sayac+1 //toplam=5 , sayac=1 olur
        System.out.println("toplam = " + toplam); //5
        System.out.println("sayac = " + sayac);  //1

        toplam=5+ ++sayac;
        System.out.println("toplam = " + toplam); //7
        System.out.println("sayac = " + sayac); //2


        //ÖZET: ++ lar sağda ise önce işlem sonra artış
        //      ++lar solda ise önce artış sonra işlem


    }
}
