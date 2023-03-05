package Gun17;


import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        // Kullanıcının gireceği bir cumlede kaç kelime olduğunu bulunuz
        // Bu gun hava cok guzel -> 5
        // for döngüsüyle yapalım

        Scanner oku=new Scanner(System.in);
        System.out.println("Bir cümle giriniz: ");
        String cumle=oku.nextLine();
        int sayac=0; // boşluk sayısı

        for (int i = 0; i <cumle.length() ; i++) {
            if(cumle.charAt(i)==' ')
            sayac++;
        }
        System.out.println("kelime sayısı= " + (sayac+1));

    }
}
