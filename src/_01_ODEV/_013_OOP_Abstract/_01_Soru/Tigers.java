package _01_ODEV._013_OOP_Abstract._01_Soru;

public class Tigers extends Cats{
    @Override
    public void talk() {
        System.out.println("Tiger is talking");
    }

    @Override
    public void walk() {
        super.walk();
    }
}
