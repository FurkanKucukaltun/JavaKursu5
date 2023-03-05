package Gun38._03_Abstract;

public class YemekDunyasi {
    // Ekteki şekle göre Class ları oluşturup
    // YemekDunyasi isimli mainde birer nesne olşturup yazdırınız
    public static void main(String[] args) {
         Baklava b=new Baklava();
         b.setName("Baklava");
         b.madeIn();
         b.taste();

         GreekSalad g=new GreekSalad();
         g.setName("Greek Salad");
         g.madeIn();
         g.taste();

         CheeseCake c=new CheeseCake();
         c.setName("Cheese cake");
         c.madeIn();
         c.taste();

         SezarSalad s=new SezarSalad();
         s.setName("Sezar salata");
         s.madeIn();
         s.taste();


    }
}
