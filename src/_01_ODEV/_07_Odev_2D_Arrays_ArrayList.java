package _01_ODEV;

import java.util.ArrayList;

public class _07_Odev_2D_Arrays_ArrayList {
    public static void main(String[] args) {

        //        1- Şu şekilde olan bir 2D int Array'î oluşturunuz.  [{2,3,2} , {4,1,5} , {7,2,5}]
//          Bütün 2'leri 6'yla değiştirin. Array'i yazdırınız.

        int[][] array1={{2,3,2} , {4,1,5} , {7,2,5}};
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if (array1[i][j]==2)
                    array1[i][j]=6;
            }
        }

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j]+" ");
            }
            System.out.println();
        }


//        2- Şu şekilde olan bir 2D int Array'i oluşturunuz.  [{5,2,1} , {10,2,3,6} , {1,2}]
//           2D array'de olan elemanları toplayınız. toplamı yazdırınız. Sonuç 32 olmalıdır.

        int[][] array2={{5,2,1} , {10,2,3,6} , {1,2}};
        int toplam=0;
        for (int i = 0; i <array2.length ; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                toplam=toplam+array2[i][j];

            }
        }
        System.out.println("toplam = " + toplam);


//        3- Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
//        [{"new jersey","atlanta","ohio"} ,
//        {"Pittsburgh" ,"ohio","new york","ohio"} ,
//        {"ohio","new york"}]
//       Bütün ohio'ları Florida'yla değiştiriniz. Array'i yazdırınız.

        String[][] array3 = {{"new jersey", "atlanta", "ohio"},
                {"Pittsburgh", "ohio", "new york", "ohio"},
                {"ohio", "new york"}};

        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                if (array3[i][j].equalsIgnoreCase("ohio"))
                    array3[i][j] = "Florida";
            }
        }
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++){
                System.out.print(array3[i][j]+" "); }

            System.out.println();
        }


//        4- Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
//        Store all the elements in one arraylist and print the arraylist
//        Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
//                Örnek:
//              Girdi:
//              [[ 1, 2, 3 ], [ 4, 5, 6 ], [ 7, 8, 9 ]]
//              Çıktı: [1,2,3,4,5,6,7,8,9]

        int[][] array4={{ 1, 2, 3 },  { 4, 5, 6 },  { 7, 8, 9 }};
        ArrayList<Integer> array41=new ArrayList<>();
        int uzunluk=0;
        for (int i = 0; i <array4.length ; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                array41.add(uzunluk,array4[i][j]);
                uzunluk++;
            }
        }
        System.out.println("çıktı = " + array41);


//        5- ismi getCount() olan bir method oluşturun. Parametre olarak bir String ArayList  ve  bir tane String
//        Return tipi int olmalı. ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
//          Örneğin;
//        ArrayList = Orange , Kiwi , Peach , Banana , Orange
//        String Orange:
//        Count = 2 olmalı. (Orange 2 kez yazılmış)

        ArrayList<String> list5=new ArrayList<>();
        list5.add("Orange");list5.add("Kiwi");list5.add("Peach");list5.add("Banana"); list5.add("Orange");
        int count=getCount (list5,"Orange");
        System.out.println("count = " + count);


//        6- getSum() isminde bir method oluşturun. Parametresi ArrayList olmalı. Return tipi int olmalı.
//          ArrayList teki tüm sayıları birbiri ile toplayın. return olarak toplam sonucu döndürün.
//                Örneğin;
//        Arraylist = 1,2,3,4,5
//        return 15 olmalı

        ArrayList<Integer> list6=new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            list6.add(i);}
        int toplam6=getSum(list6);
        System.out.println("toplam = " + toplam6);


//        7- getLength() isminde bir method oluşturun. Parametre olarak String ArrayList.  Return tipi Integer ArrayList.
//          ArrayList içindeki her bir Stringin uzunluğunu bulunuz.  Tüm elementlerin uzunluğunu döndürün.
//        Örneğin;
//        ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
//        Tüm Stringlerin uzunluklarını yazdırın;
//        cevap: 10 ,  8 , 4 , 7 , 6 olmalı

        ArrayList<String> list7=new ArrayList<>();
        list7.add("New jersey");list7.add("New york");list7.add("Florida");list7.add("Boston");
        ArrayList<Integer> kelimeuzunlugu=getLength(list7);
        System.out.println("kelimeuzunlugu = " + kelimeuzunlugu);


//        8- İsmi changelnArraylist() olan bir method oluşturun. Parametre olarak String ArrayList, String s1, String s2
//        Arraylist'te s1'i s2 olarak değiştirin. Return String arrayList.
//          Örneğin;
//        Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
//        s1 = blue
//        s2 = yellow
//        Tüm blue 'ları yellow'a dönüştürün.
//        cevap: "yellow" , "red" , "yellow" , "red" , "yellow"

        ArrayList<String> liste8=new ArrayList<>();
        liste8.add("yellow");liste8.add("red");liste8.add("blue");liste8.add("red");liste8.add("blue");
        ArrayList<String> kelimedegis=changelnArraylist(liste8,"blue","yellow");
        System.out.println("cevap = " + kelimedegis);

    }

    // 5. soru
    public static int getCount(ArrayList<String> a5, String s5) {

        int count=0;
        for (int i = 0; i < a5.size(); i++) {
            if (a5.get(i).equalsIgnoreCase(s5))
                count++;
        }
        return count;
    }

    // 6. soru

    public static int getSum(ArrayList<Integer> l6){
        int toplam=0;
        for (int i = 0; i < l6.size(); i++) {
            toplam=toplam+l6.get(i);
        }
        return toplam;
    }

    // 7. soru

    public static ArrayList<Integer> getLength(ArrayList<String> al7){

        ArrayList<Integer> al7length=new ArrayList<>();

        for (int i = 0; i < al7.size(); i++) {
            al7length.add(al7.get(i).length());
        }
        return al7length;
    }

    // 8. soru

    public static ArrayList<String> changelnArraylist(ArrayList<String> al8,String s1, String s2){

        for (int i = 0; i < al8.size(); i++) {
            if (al8.get(i).equals(s1)){
                al8.set(i,s2);}
        }
        return al8;
    }


}

