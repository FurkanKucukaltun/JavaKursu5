package _01_ODEV._013_OOP_Abstract._01_Soru;

public class Lions extends Cats{
    @Override
    public void talk() {
        System.out.println("Lion is talking");
    }

    @Override
    public void walk() {
        super.walk();
    }
}
