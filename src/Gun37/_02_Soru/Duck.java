package Gun37._02_Soru;

public class Duck extends Animal implements IFlying,ISwimming{

    @Override
    public String food() {
        return "yemek yiyor";
    }

    @Override
    public String fly() {
        return "uçuyor";
    }

    @Override
    public String swim() {
        return "yüzüyor";
    }
}
