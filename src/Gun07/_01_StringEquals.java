package Gun07;

public class _01_StringEquals {
    public static void main(String[] args) {
        //Equals: 2 stringin birbirine eşit olup olmadığnı kontrol eder
        //sonuç boolean
        
        
        String s1="Merhaba";
        String s2="MERHABA";
        
        boolean esitMi=s1.equals(s2);
        System.out.println("esitMi = " + esitMi);

        //yada
        System.out.println("s1.equals(s2) = " + s1.equals(s2));

        //yada
        System.out.println("s1.equals(Merhaba) = " + s1.equals("Merhaba"));
        
    }
}
