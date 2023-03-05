package Gun08;

public class _01_JavaAritmeticOperators {
    public static void main(String[] args) {

        int a=9;
        int b=5;

        System.out.println("Toplama işlemi = ");
        System.out.println("a+b = " + (a+b));

        System.out.println("Çıkarma işlemi");
        System.out.println("a-b = "+ (a-b)  );

        System.out.println("Çarpma işlemi");
        System.out.println("a*b = "+ (a*b)  );

        System.out.println("bölme işlemi");
        System.out.println("a/b = "+ (a/b)  );

        // normal sonuc 1.8 , fakat tam sayının tam sayıya bölümünde küsürat atılır.
        // bu sebeple sonuc 1 olur, yuvarlama yapmaz.  çünkü int/int
        // tam sonuç istersen bir tanesini double çevirmen yeterli

        System.out.println("(double)a/b =" + ((double)a/b)); //küsüratlı yazmak için double

        System.out.println("modül işlemi");
        System.out.println("a%b = "+ (a%b)  ); //4
        System.out.println("b%a = "+ (b%a)  ); //5





    }
}
