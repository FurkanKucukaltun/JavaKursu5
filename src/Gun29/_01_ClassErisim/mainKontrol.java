package Gun29._01_ClassErisim;

public class mainKontrol {
    public static void main(String[] args) {
        PublicErisim pe=new PublicErisim();
        DefaultErisim de=new DefaultErisim();

        // DefaultErisim de=new DefaultErisim();     *********DIKKAT!!!********
        // başka pakette erişim denendi ancak çalışmadı

        // diğer paketten (paket birden) default belirteçli class'a erişilemez
        // yalnızca kendi paketindekiler erişebilir.
    }
}
