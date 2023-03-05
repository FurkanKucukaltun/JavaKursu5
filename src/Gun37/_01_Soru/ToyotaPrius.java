package Gun37._01_Soru;

public class ToyotaPrius extends Vehicle implements IGas,IElectric{

    public ToyotaPrius(String model, Double engine) {
        super(model, engine);
    }


    @Override
    public String changeBattery() {
        return "ömür boyu kullan";
    }

    @Override
    public String changeOil() {
        return "bir depo ile 300 km gidebilir";
    }

    @Override
    public String drive() {
        return "ilk 3 km elektrik ile gider";
    }
}

