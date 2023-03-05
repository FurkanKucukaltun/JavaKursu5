package _01_ODEV._013_OOP_Abstract._04_Soru;

public class Rectangle extends Data{


    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    double getArea() {
        return this.getLength()*this.getWidth();
    }
}
