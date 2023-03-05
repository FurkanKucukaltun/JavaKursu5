package Gun37._02_Soru;

public class Swallow extends Animal implements IFlying{


    @Override
    public String food() {
        return "yemek yiyor";
    }

    @Override
    public String fly() {
        return "uçuyor";
    }
}
