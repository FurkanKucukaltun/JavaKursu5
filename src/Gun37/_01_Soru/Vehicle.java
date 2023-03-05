package Gun37._01_Soru;


public class Vehicle {

    private String model;
    private Double engine;

    public Vehicle(String model, Double engine) {
        setModel(model) ;
        setEngine(engine);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getEngine() {
        return engine;
    }

    public void setEngine(Double engine) {
        this.engine = engine;
    }
}
