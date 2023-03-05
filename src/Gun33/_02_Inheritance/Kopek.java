package Gun33._02_Inheritance;

public class Kopek extends Hayvan{
    public Kopek(String renk, int kilo, String cinsi) {
        super(renk, kilo, cinsi);
    }

//    public void konustu(){
//        System.out.println("Havladı."); // kendisinde olduğu için mainde bunu kullanır. yoksa parent dakini kullanır
//
//    }

    // 2 . yöntem. kolay yontem  // generate -> override metodu

    @Override
    public void konustu() {
       // super.konustu();
        System.out.println("havladı");
    }
}
