package Gun34._04_Protected.Paket2;

import Gun34._04_Protected.Paket1.P1Hayvan;

public class P2Main {
    public static void main(String[] args) {

        P1Hayvan p1h=new P1Hayvan();
        p1h.ad="Köpek";
        // p1h.yas  ?? ulaşılamadı; default
        // p1h.cins ?? protected; erişilemedi

        P2Kedi p2h=new P2Kedi("pamuk","tekir"); //protected a P2Kedi extend edildiği için erişilebildi

    }
}
