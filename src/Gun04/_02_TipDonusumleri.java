package Gun04;

public class _02_TipDonusumleri {
    public static void main(String[] args) {
        byte ogrnot1=98;
        byte ogrnot2=98;
        byte ogrnot3=100;
        byte ogrnot4=98;

        int toplam=ogrnot1;  //byte --> int atayınca sıkıntı çıkarmadı (GENİŞLETME)
        // çünkü byte için ayrılan alan zaten intin içine sığar, sığdığı için kabul ederim
        //veri kaybı olma ihtimali hiç yok

        ogrnot1= (byte)toplam; //int-->byte atayınca dur bakalım dedi (DARALTMA)
        //büyük hafıza ayrılmış bir alanı,küçük hafıza ayrılmış alana atama işlemi var.
        //veri kaybı ihtimali var.


    }



}
