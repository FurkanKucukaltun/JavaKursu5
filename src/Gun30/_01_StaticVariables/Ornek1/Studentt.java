package Gun30._01_StaticVariables.Ornek1;

public class Studentt {

    int id;
    String fullName;
    static int sayac=1; // sen bitanesin
    // static olmadan her zaman 1 ile başlıyordu
    // static olduğunda artık bir tane olduğundan değerini korudu ve hep 1 tane arttı
    // tüm nesnelere ait olan bilgileri veya sayac gibi işlemler için static kullanılır.


    public Studentt(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public Studentt(String fullName) {
        this.id=sayac++; // önce var olan değer veriliyor, sonra artıyor
        this.fullName = fullName;
    }



    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
