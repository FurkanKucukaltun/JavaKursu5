package Gun35._01_Final.method;

public class AraclarMain {
    public static void main(String[] args) {

        Araclar a1=new Araclar("opel");
        System.out.println("a1 = " + a1);

        // Araçlar class ında toString metodu final olduğu için Uçaklar classında çağırılamadı.
        // bu yüzden main class da arazlar classından obje oluşturuldu
    }
}
