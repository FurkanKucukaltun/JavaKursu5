package Gun37._02_Soru;

public class Shark extends Animal implements ISwimming{

    @Override
    public String food() {
        return "yemek yiyor";
    }

    @Override
    public String swim() {
        return "yüzüyor";
    }
}
