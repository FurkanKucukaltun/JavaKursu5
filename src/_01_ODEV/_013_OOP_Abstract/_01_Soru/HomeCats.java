package _01_ODEV._013_OOP_Abstract._01_Soru;

public class HomeCats extends Cats{
    @Override
    public void talk() {
        System.out.println("Home Cat is talking");
    }

    @Override
    public void walk() {
        super.walk();
    }
}
