package _01_ODEV._013_OOP_Abstract._04_Soru;


public class Circle extends Data{


    public Circle(int radius) {
        super(radius);
    }

    @Override
    double getArea() {

        return pi*this.getRadius()*this.getRadius();
    }
}
