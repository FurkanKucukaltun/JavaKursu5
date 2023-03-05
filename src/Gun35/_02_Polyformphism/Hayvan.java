package Gun35._02_Polyformphism;

public class Hayvan {
    private String name;

    public Hayvan(String name) {
        this.name = name;
    }

    public void ses() {
        System.out.println(" ses çıkardı ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hayvan{" +
                "name='" + name + '\'' +
                '}';
    }
}
