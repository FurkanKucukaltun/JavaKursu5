package Gun42;

public class _01_StringBufferAndStringBuilder {
    public static void main(String[] args) {

        String cumle="";

        cumle=cumle+"Bugün"; // + işareti stringlerde birleştirme yapar
        cumle=cumle+"hava";
        cumle=cumle+"çok soğuk";

        System.out.println("cumle = " + cumle);
        System.out.println("cumle.concat(\"fakat dün sıcaktı\") = " + cumle.concat("fakat dün sıcaktı"));
        System.out.println("cumle = " + cumle);

        cumle=cumle.concat("fakat dün sıcaktı");
        System.out.println("cumle = " + cumle);

        // ****************StringBuilder***************//

        StringBuilder cumle2=new StringBuilder();
        cumle2.append("Bugün");
        cumle2.append(" hava");
        cumle2.append(" soğuk");

        System.out.println("cumle2 = " + cumle2);

        //************************** +, concat, StringBuilder 3 modelin hızı test edilecek ********//

        long starTime=System.currentTimeMillis();
        String test1="";
        for (int i = 0; i < 10000; i++) {
            test1=test1+"merhaba";
        }
        System.out.println("+ için geçen süre = " + (System.currentTimeMillis()-starTime));

        starTime=System.currentTimeMillis();
        String test2="";
        for (int i = 0; i < 10000; i++) {
            test2=test2.concat("merhaba");
        }
        System.out.println("concat için geçen süre = " + (System.currentTimeMillis()-starTime));


        starTime=System.currentTimeMillis();
        StringBuilder str=new StringBuilder();
        for (int i = 0; i < 10000; i++) {
           str.append("merhaba");
        }
        System.out.println("StringBuilder için geçen süre = " + (System.currentTimeMillis()-starTime));

        // Performans testi sonucu :
        // eğer 3 kadar ekleme işlemi olacaksa + kullanılır, pratik olduğu için
        // ancak daha fazla ekleme olacaksa 10 adede kadar concat kullanılabilir
        // Eğer çok fazla String işlemleri yapacaksak bunun için
        // performansı oldukça iyi olan StringBuilder kullanılır.
        // yapısı gereği hızlı çalışır.

        System.out.println("*************************\n\n");
        //************** StringBuildrı biraz yakından tanıyalım **********//
        StringBuilder sb=new StringBuilder();
        sb.append("Bugün");
        sb.append(" hava");
        sb.append(" güzel");
        System.out.println("sb = " + sb);
        System.out.println("sb.length() = " + sb.length());
        sb.append(4);
        System.out.println("sb = " + sb);

        sb.reverse(); // string i tersine çevirir
        System.out.println("sb = " + sb);
        sb.reverse();
        System.out.println("sb = " + sb);

        sb.delete(0,5); // (index)0 dahil, 5 hariç olmak üzere siler
        System.out.println("sb = " + sb);

        sb.deleteCharAt(3); // sadece belirtilen index deki karakteri siler
        System.out.println("sb = " + sb);

        sb.insert(0,"bugün"); // 5nolu index e kelimeyi ekle: araya ekleme
        System.out.println("sb = " + sb);

        sb=new StringBuilder("Bugün hava çok soğuk"); // sıfırlandı ve ilk değer atandı
        System.out.println("sb = " + sb);

        sb.replace(3,8,"bu"); // verilen aralığı "bu" stringle değiştirdi
        System.out.println("sb = " + sb);

        String strSb=sb.toString(); //stringe çevirildi

        StringBuffer sBuffer=new StringBuffer(); // tamamen StringBuffer ile aynı
        // tek farkı, paralel çalışan yazılımlarda, StringBuffer kullanılır.

    }
}
