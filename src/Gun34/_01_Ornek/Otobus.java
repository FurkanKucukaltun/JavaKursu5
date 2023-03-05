package Gun34._01_Ornek;

public class Otobus extends Arac{

    private int yolcuKapasitesi;

    public Otobus(String renk, int motorHacmi, String marka, int yolcuKapasitesi) {
        super(renk, motorHacmi, marka);
        setYolcuKapasitesi(yolcuKapasitesi);
    }

    public int getYolcuKapasitesi() {
        return yolcuKapasitesi;
    }

    public void setYolcuKapasitesi(int yolcuKapasitesi) {
        this.yolcuKapasitesi = yolcuKapasitesi;
    }

    @Override
    public String toString() {

        return "Arac{" +
                "renk='" + getRenk() + '\'' +
                ", motorHacmi=" + getMotorHacmi() +
                ", marka='" + getMarka() + '\'' +
                ", yolcu kapasitesi="+yolcuKapasitesi+
                '}';
    }
 // return getRenk()+"\n"+getMotorHacmi()+"\n"+getMarka()+"\n"+ this.yolcuKapasitesi; // yada getYolcuKapasiteside yapabiliriz

}
