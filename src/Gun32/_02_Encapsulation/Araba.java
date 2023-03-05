package Gun32._02_Encapsulation;

public class Araba {

    //(Renk, Model, MotorHacmi,KapiSayisi

    private String Renk;
    private int Model;
    private double MotorHacmi;
    private int KapiSayisi;

    public Araba(){

    }

    public Araba(String renk, int model, double motorHacmi, int kapiSayisi) {
//        Renk = renk;
//        Model = model;
//        MotorHacmi = motorHacmi;
//        KapiSayisi = kapiSayisi;  // bu değerleri verirsen encapsulation calısmaz ve hatalı bilgi girilebilir
        setRenk(renk);
        setModel(model);
        setMotorHacmi(motorHacmi);
        setKapiSayisi(kapiSayisi);
    }

    @Override
    public String toString() {
        return "Araba{" +
                "Renk='" + Renk + '\'' +
                ", Model=" + Model +
                ", MotorHacmi=" + MotorHacmi +
                ", KapiSayisi=" + KapiSayisi +
                '}';
    }

    public String getRenk() {
        return Renk;
    }

    public void setRenk(String renk) {
        Renk = renk;
    }

    public int getModel() {
        return Model;
    }

    public void setModel(int model) {
        if (model>1952 && model<2023)
            this.Model=model;
        else
            System.out.println("hatalı model");

    }

    public double getMotorHacmi() {
        return MotorHacmi;
    }

    public void setMotorHacmi(double motorHacmi) {
        MotorHacmi = motorHacmi;
    }

    public int getKapiSayisi() {
        return KapiSayisi;
    }

    public void setKapiSayisi(int kapiSayisi) {
        if (kapiSayisi>2 && kapiSayisi<6)
            this.KapiSayisi=kapiSayisi;
        else
            System.out.println("hatalı Kapi Sayisi");

    }




    // MANUEL OLARAK YAZDIGIMIZ KOD

//    void setrenk(String Renk){
//
//        if (Renk.length()<25)
//            this.Renk=Renk;
//        else
//            System.out.println("hatalı Renk");
//    }
//
//    String getRenk()
//    {
//        return this.Renk;
//    }
//
//
//    void setModel(int Model){
//
//        if (Model>1952 && Model<2023)
//            this.Model=Model;
//        else
//            System.out.println("hatalı model");
//    }
//
//    int getModel()
//    {
//        return this.Model;
//    }
//
//
//    void setMotorHacmi(double MotorHacmi){
//
//        if (MotorHacmi>1.0 && MotorHacmi<5.0)
//            this.MotorHacmi=MotorHacmi;
//        else
//            System.out.println("hatalı Motor Hacmi");
//    }
//
//    double getMotorHacmi()
//    {
//        return this.MotorHacmi;
//    }
//
//
//
//    void setKapiSayisi(int KapiSayisi){
//
//        if (KapiSayisi>2 && KapiSayisi<6)
//            this.KapiSayisi=KapiSayisi;
//        else
//            System.out.println("hatalı Kapi Sayisi");
//    }
//
//    int getKapiSayisi()
//    {
//        return this.KapiSayisi;
//    }

}
