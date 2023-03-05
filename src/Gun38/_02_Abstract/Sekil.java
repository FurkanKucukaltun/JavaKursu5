package Gun38._02_Abstract;

public abstract class Sekil {

//    2- Bu classın Alan ve cevre abstract metodları ve içinde Alan ve cevre nin sonucu olan toString somut metodu,
//        sekilin adını veren getName somut metodu ve ciz isimli somut metodlarını ekleyiniz.

    private String name;
    public abstract double alan();  //soyut - abstract
    public abstract double cevre(); //soyut

    public void ciz(){  // somut
        System.out.println(name+"isimli şekil çizildi");
    }

    @Override
    public String toString() {
        return "Sekil:" +
                "\nisim='" + name +'\''+
                "\nalan='" + alan() +'\''+
                "\ncevre='" + cevre() +'\''+
                "\n";
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
