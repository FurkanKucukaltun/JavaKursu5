package Gun28._02_Constructor;

public class Book {
    String name;
    int publishYear;
    String author;

    public Book(){

    }

    public Book (String name,int publishYear,String author){
       // this(name,publishYear,author);
        this.name=name;
        this.publishYear=publishYear;
        this.author=author;
    }

    public Book (String name,int publishYear){
        this(name,0,"");
//        this.name=name;
//        this.publishYear=publishYear;
//        this.author=author;
    }

    public String toString(){

        return name+" "+author+" "+publishYear;
    }

}
