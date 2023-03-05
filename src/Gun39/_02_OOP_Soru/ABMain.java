package Gun39._02_OOP_Soru;

public class ABMain {
    public static void main(String[] args) {
        A a=new A();
        System.out.println("A.mesaj = " + A.mesaj);  // A den marhaba

        B b=new B();
        System.out.println("A.mesaj = " + A.mesaj); // B den marhaba

        A a2=new A();
        System.out.println("A.mesaj = " + A.mesaj); // B den marhaba
    }
}
