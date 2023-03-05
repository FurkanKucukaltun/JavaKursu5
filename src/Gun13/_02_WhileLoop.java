package Gun13;

public class _02_WhileLoop {
    public static void main(String[] args) {
        // Ekrana 5 kez merhaba yazdırınız

        int sayac=0;

        while(sayac<5){ // iken yap: şartı yazıyoruz, dönme şartı

            // her döndükçe yapılacaktır

            System.out.println(sayac+"merhaba");

            sayac++;

        }
        System.out.println("program bitti");

    }
}
