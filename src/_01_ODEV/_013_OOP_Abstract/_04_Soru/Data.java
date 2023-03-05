package _01_ODEV._013_OOP_Abstract._04_Soru;

public abstract class Data {

    abstract double getArea();
    final double pi=3.14;
     private int radius;
     private int length;
     private int width;

    public Data( int length, int width) {
        setLength(length);
        setWidth(width);
    }

    public Data(int radius) {
        setRadius(radius);
    }


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

}
