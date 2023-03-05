package Gun18;

public class _03_Java2DArrays {
    public static void main(String[] args) {
        // 2 ye 3 lük bir tabloyu random 100 e kadar sayılarla doldurunuz
        // bütün doldurma işlemi bittikten sonra
        // sonrasında yazdırınız ve kaç tane tek sayı olduğunu bulunuz

        int [][] tablo = new int[2][3];
        for (int satir = 0; satir < 2; satir++) {
            for (int sutun = 0; sutun < 3; sutun++) {
                tablo[satir][sutun] = (int)(Math.random()*101);
                }
            }
        int sayac=0;

        for (int satir = 0; satir < 2; satir++) {
            for (int sutun = 0; sutun < 3; sutun++) {
                System.out.print(tablo[satir][sutun]+ "\t");
                if (tablo[satir][sutun] % 2 == 1)
                    sayac++;

            }
            System.out.println();
        }
        System.out.println("tek sayı miktarı = " + sayac);
    }
}
