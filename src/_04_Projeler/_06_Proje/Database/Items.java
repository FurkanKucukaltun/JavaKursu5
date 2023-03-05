package _04_Projeler._06_Proje.Database;

public class Items {

    /*

        Item class ını bir veritabanı olarak düşünebiliriz fakat burada bir static method kullanmak yerine satın alınmak
    istenen ürüne göre işlem yapacağız. Örneğin satın alınmak istenen ürün bir telefon ise bize o telefon için bir ücret
    döndürecek ve bu ücreti user in bakiyesine ekliyeceğiz.

     */

    //---------------------------------------------------------------------------------------

    /*

        Bir method oluşturalım ve adına "ItemName" diyelim,
            Tipi: static
            Return tipi: double
            Parametre: String türünden bir itemName almalı

        Eğer ki itemName:
            "Rose teddy bear" ise 30,
            "Iphone max" ise 850.23,
            "laptop mouse" ise 23.50,
            "Monitor" ise 90.23,
            "charger" ise 43.20,
            "hdmi cable" ise 5.90,
            "mug" ise 30
        değerlerini döndürmeli

     */


    public static double ItemName(String itemName) {

        double price=0.0;
        if (itemName.equalsIgnoreCase("Rose teddy bear"))
            price = 30.0;
        else if (itemName.equalsIgnoreCase("Iphone max"))
            price = 850.23;
        else if (itemName.equalsIgnoreCase("laptop mouse"))
            price = 23.50;
        else if (itemName.equalsIgnoreCase("Monitor"))
            price = 90.23;
        else if (itemName.equalsIgnoreCase("charger"))
            price = 43.20;
        else if (itemName.equalsIgnoreCase("hdmi cable"))
            price= 5.90;
        else if (itemName.equalsIgnoreCase("mug"))
            price=30.0;


        return price;
    }


    /*

        Bir method oluşturalım ve adına "colorPrice" diyelim,
            Tipi: static
            Return tipi: double
            Parametre: String türünden bir color almalı

        Eğer ki color:
            "Red" ise 10,
            "Blue" ise 6,
            "Black" ise 4,
            "White" ise 2
        değerlerini döndürmeli

     */

    public static double colorPrice(String color) {

        double price=0.0;
        if (color.equalsIgnoreCase("Red"))
            price = 10.0;
        else if (color.equalsIgnoreCase("Blue"))
            price = 6.0;
        else if (color.equalsIgnoreCase("Black"))
            price = 4.0;
        else if (color.equalsIgnoreCase("White"))
            price = 2.0;

        return price;
    }



    /*

        Bir method oluşturalım ve adına "customText" diyelim,
            Tipi: static
            Return tipi: double
            Parametre: String türünden bir text almalı

        Eğer ki text:
            10 karakterden uzun ise 5,
            10 karakterden kısa veya eşit ise 3
        değerlerini döndürmeli

     */

    public static double customText(String text) {

        double price=0.0;
        if (text.length()>10)
            price=5.0;
        else if (text.length()<=10)
            price=3.0;

        return price;
    }


}



