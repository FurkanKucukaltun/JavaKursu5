package Gun17;

public class _03_StringTrim {
    public static void main(String[] args) {
        //trim: string in başındaki ve sonundaki boşlukları siler

        String text= "       Merhaba Dünya        ";
        System.out.println("text = ->  " + text +"<-" ) ;
        System.out.println("text = ->" + text.trim()+"<-");
    }
}
