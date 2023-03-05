package Gun29._02_PrivateErisim;

public class Calisan {

        int id;                 // default
        String name;            // default
        String surname;         // default
        private String password; //private
        // sadece bulunduğu class dan erişim izni var


        public void sifreAta (String sifre){

            // sifreyi kontrol ederk atayacağım
            if (sifre.length() < 8) {
                System.out.println("zayıf şifre");
            } else {
                this.password = sifre;
                System.out.println("Şifre başarıyla atandı");
            }
        }

        public void sifreGoster(){
            System.out.println("*****"+password.substring(4));
        }



}
