package _04_Projeler._03_Proje;

import java.util.ArrayList;

public class Customer {

    public String username;
    public String password;

    public ArrayList<Account> accounts = new ArrayList<>();

    public void hesaplar (Account hesap){

        accounts.add(hesap);

    }

}
