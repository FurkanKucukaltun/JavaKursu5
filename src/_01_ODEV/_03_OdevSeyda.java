package _01_ODEV;

import java.util.Scanner;

public class _03_OdevSeyda {
    public static void main(String[] args) {

        //S1 I love java** olan bir String oluşturun.
        //Bu cümlenin toplam karakter sayısını yazdırın.

        
        String s1="i love java";
        System.out.println("uzunluk= " + s1.length());
        
        /*
        S2
        **Sprint planning** olan bir String oluşturun.
        Bu dizenin toplam karakter sayısını yazdırın.
         */
        String s2="Sprint Planning";

        System.out.println("karakter uzunluk= " + s2.length());
        
        /*
        S3
        **apple** olan bir String oluşturun.
        String'in içinde **app** olup olmadığını doğrula.
         */
        String s3="apple";
        System.out.println("app var mı= " + s3.contains("app"));

        /*
        S4
        **orange** kelimesinden oluşan bir String oluşturun.
        String'in **Apple**'a eşit olup olmadığını doğrulayın. 
         */
        String s4="orange";
        System.out.println("eşit mi= " + s4.equals("Apple"));

        /*
        S5
        **apple**  olan  bir String oluşturun.
        String'in **apple**'a eşit olup olmadığını doğrulayın.
        Büyük harf veya küçük harf önemli değildir.
         */
        String s5="aPPle";
        System.out.println("apple a eşit mi= " + s5.toLowerCase().equals("apple"));

        /*
        S6
        **Florida** kelimesinden bir String oluşturun.
        Florida kelimesinin içindeki, sadece 'o' harfinin bulunduğu indexini yazdırın. 
         */
        String s6="Florida";
        System.out.println("'o' nun indexi nedir= " + s6.indexOf("o"));

        /*
        S7
        **Thank you** olan bir String oluşturun.
        Thank you içindeki, sadece 'y' harfinin bulunduğu konumu yazdırın.
         */
        String s7="Thank you";
        System.out.println("y'nin konumu= " + s7.indexOf("y"));

        /*
        S8
        **Main method** oluşturun.
        **Mouse** değerinde bir String oluştur.
        Mouse String'inin 3. sırasındaki karakteri yazdırın.
         */
        String s8= "Mouse";
        System.out.println("3. karakter= " + s8.charAt(3));

        /*
        S9
        **paper** olan bir String oluşturun.
        String'i büyük harfe çevirin ve yazdırın.
        örn: apple > APPLE
         */
        String s9="paper";
        System.out.println("büyük yaz= " + s9.toUpperCase());

        /*
        S10
        **OraNge** olan bir String oluşturun.
        String'i küçük harfe çevirin ve yazdırın.
        örn: APPLE > apple
         */
        String s10="OraNge";
        System.out.println("küçük yaz= " + s10.toLowerCase());

        /*
        S11
        **New Jersey** olan bir String oluşturun.
        String'i büyük harfe çevirin ve yazdırın
         */

        String s11="New Jersey";
        System.out.println("büyük yaz = " + s11.toUpperCase());

        /*
        S12
        **New York** olan bir String oluşturun.
        String'i küçük harfe çevirin ve yazdırın.
         */
        String s12="New York";
        System.out.println("küçük yaz= " + s12.toLowerCase());

        /*
        S13
        **PADDLE** olan bir String oluşturun.
        String'i küçük harfe çevirin ve yazdırın.
         */
        String s13="PADDLE";
        System.out.println("s13.toLowerCase() = " + s13.toLowerCase());
        

        //ÖZEL SORULAR
        //1- Ayrı ayrı girilen ad ve soyadı aralarında bir boşluk koyarak birleştiriniz.
        Scanner oku=new Scanner(System.in);
        System.out.print("adınız=" );
        String ad=oku.next();
        System.out.print("soyadınız=");
        String soyad=oku.next();

        System.out.println("ad ve soyad= "+ ad.concat(" ").concat(soyad));
        
        //2- Girilen bir kelimenin boş(Blank) olup olmadığını yazdırınız
        Scanner oku1=new Scanner(System.in);
        System.out.print("Bir kelime giriniz=");
        String os2=oku1.nextLine();
        System.out.println("boş mu= " + os2.isEmpty());

        //3- girilen bir cümledeki A harfi sayısını bulunuz.(Büyük küçük harf ayrımı olmadan)
        Scanner oku2=new Scanner(System.in);
        System.out.print("Bir cümle giriniz= ");
        String os3= oku2.nextLine();
        String os31=os3.toLowerCase().replaceAll("[^a]","");
        System.out.println("a harfinin sayısı = " +os31.length() );

        //4- girilen bir kelimenin ilk ve son harfini bulunuz.
        Scanner oku3=new Scanner(System.in);
        System.out.print("Bir kelime giriniz= ");
        String os4=oku3.next();
        System.out.println("ilk ve son harf= " + os4.charAt(0)+" , "+os4.charAt(os4.length()-1));

        //5- girilen bir cümledeki ilk kelimeyi yazdırınız
        Scanner oku4=new Scanner(System.in);
        System.out.print("Bir cümle giriniz = ");
        String os5=oku4.nextLine();
        System.out.println("ilk kelime = " + os5.substring(0,os5.indexOf(" ")));

        //6- girilen en az 3 kelimelik bir cümledeki ilk iki kelimeyi yazdırınız
        Scanner oku5=new Scanner(System.in);
        System.out.print("Bir cümle giriniz = ");
        String os6=oku5.nextLine();
        String os61=os6.replaceFirst(" ","");
        System.out.println("ilk iki kelime= " + os6.substring(0, os6.indexOf(" ")) + "  "
                + os6.substring(os6.indexOf(" ")+1,os61.indexOf(" ")+1));

        //7- Girilen bir cümlede kaç kelime olduğunuz bulunuz
        Scanner oku6=new Scanner(System.in);
        System.out.print("Bir cümle giriniz = ");
        String os7=oku6.nextLine();
        String os71=os7.replaceAll("[a-z]","").replaceAll("[A-Z]","");
        System.out.println("os71 = " + (os71.length()-1));


        //8- Girilen bir cumledeki kelimelerin ilk harflerini yazdırınız
        Scanner oku7 = new Scanner(System.in);
        System.out.print("cumleyi giriniz: ");
        String cumleGirdisi = oku7.nextLine();
        System.out.println("ilk harfler: " + cumleGirdisi.replaceAll("\\B\\S",""));
        System.out.println("ilk harfler: " + cumleGirdisi.replaceAll("^[ ][a-zA-Z0-9]",""));


        //9- 3 kelimelik ismi olan kişinin ad , 2.ad ve soyadını A.E.Y. şeklinde yazınız.
        Scanner oku8=new Scanner(System.in);
        System.out.print("Bir cümle giriniz = ");
        String os9=oku8.nextLine();
        System.out.println("os9 = "  + os9.charAt(0) + ", "+ os9.charAt(os9.indexOf(" ")+1)+", "
                +os9.charAt(os9.lastIndexOf(" ")+1));



    }
}
