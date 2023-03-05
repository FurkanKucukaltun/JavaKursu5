package Gun34._04_Protected.Paket1;

public class P1Hayvan {

    public String ad; // Her paketten her yerden erişilebiliyor
    int yas; //defoult: sadece bulunduğu pakettekiler erişebilir
    protected String cins; //defoult gibi, diğer paketlerden erişilemez (extend yapılma durumu hariç)
    private String renk; // sadece bulunduğu classdan erişilebilir
}