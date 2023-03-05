package Gun29._03_Protected.iki;

import Gun29._03_Protected.bir.Doctor;

public class HastaneIstanbul {
    public static void main(String[] args) {
        Doctor dok2 =new Doctor("Mehmet"); // public Doctor constructor sayesinde çalıştı
        dok2.hastaneAd="İstanbul Hastanesi";  // hastane adı public

        // Doctor dok2= new Doctor();
        // default consstructor
        // sadece kendi paketi ulaşır

    }
}
