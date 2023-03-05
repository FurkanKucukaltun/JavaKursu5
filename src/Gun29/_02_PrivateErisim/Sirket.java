package Gun29._02_PrivateErisim;

import Gun29._01_ClassErisim.PublicErisim;

public class Sirket {
    public static void main(String[] args) {
        Calisan cal1=new Calisan();
        cal1.id=1;
        cal1.name="agah";
        cal1.surname="zahid";
        // cal1.password="1234";
        // private kendi paketinden bile çağrılamaz !!!

        cal1.sifreAta("1234");
        cal1.sifreAta("M4146_sdff4");
        cal1.sifreGoster();

    }
}
