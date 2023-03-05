package Gun37._01_Soru;

import java.util.ArrayList;
import java.util.Arrays;

public class CarMain {
    public static void main(String[] args) {

        TeslaCar tesla1=new TeslaCar("MODEL S",1000.00);

        ToyotaPrius toyota1=new ToyotaPrius("Prius",1300.00);

        Bus bus1=new Bus("MAN",3500.00);
 
        ArrayList<Vehicle>araclar=new ArrayList<>(Arrays.asList(tesla1,toyota1,bus1));

        for (Vehicle a:araclar) {
            System.out.println(a.getClass().getSimpleName()); // class ın adını verir

            System.out.println("a.getModel() = " + a.getModel());
            System.out.println("a.getEngine() = " + a.getEngine());

            if(a instanceof TeslaCar){
                System.out.println(((TeslaCar)a).changeBattery());
                System.out.println(((TeslaCar)a).drive());}
            else
                if(a instanceof ToyotaPrius){
                System.out.println(((ToyotaPrius)a).changeOil());
                System.out.println(((ToyotaPrius)a).changeBattery());
                System.out.println(((ToyotaPrius)a).drive());
            }
            else
                if(a instanceof Bus){
                System.out.println(((Bus)a).changeDiesel());
                System.out.println(((Bus)a).drive());
            }
        }

    }
}
