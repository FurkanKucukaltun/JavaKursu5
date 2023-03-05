package Gun34._04_Protected.Paket1;

public class P1Main {
    public static void main(String[] args) {
        P1Hayvan p1h=new P1Hayvan();
        p1h.ad="Karakedi"; // public; erişildi
        p1h.cins="Tekir"; // protected erişildi
        p1h.yas=2; // default; erişildi
        // p1h.renk ; private, sadece kendi classından


    }
}
