package Gun43;

public class _05_TryCatchFinally {
    public static void main(String[] args) {
        long startTime=0;
        String str="";

        try{
            startTime=System.currentTimeMillis();
            System.out.println("Hatadan önceki kısım.");
            char ilkHarf=str.charAt(0);
            System.out.println("Hatadan sonraki kısım.");
            // hata olma olasılığının olduğu kodlar
        }
        catch(Exception ex){
            System.out.println("catch bloğu çalıştı.");
            // hata olduğunda yapılacaklar
        }
        finally { // hata olsada çalışır ,  olmasda çalışacak kısım, bu bölümün yukarıdaki süreçle
            // olduğunu göstermek için finally içinde yazılır

            long gecenSure=System.currentTimeMillis()-startTime;
            System.out.println("gecenSure = " + gecenSure);
            System.out.println("try-catch bloğu ile ilgili son yapılacaklar");
        }
        System.out.println("diğer çalışan kodlar");
        System.out.println("Program sonu");

    }
}
