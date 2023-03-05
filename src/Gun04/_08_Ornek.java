package Gun04;

public class _08_Ornek {
    public static void main(String[] args) {
        // String olarak verilen 2 adet bağış parasının toplamını yazıdırnız.
        String bagis1="1000";
        String bagis2="5000";

        int intbagis1=Integer.parseInt(bagis1);
        int intbagis2=Integer.parseInt(bagis2);

        int toplamBagis=intbagis1+intbagis2;
        System.out.println("toplamBagis = " + toplamBagis);


        String bgs1="2520";
        String bgs2="3000";

        int dgrbgs1=Integer.parseInt(bgs1);
        int dgrbgs2=Integer.parseInt(bgs2);
        double tplm= dgrbgs1+dgrbgs2;
        System.out.println("tplm = " + tplm);


    }
}
