package _04_Projeler._04_Proje.Veritabani;
import _04_Projeler._04_Proje.Modeller.Calisanlar.Calisan;

import java.util.ArrayList;

public class Calisanlar {


    // Buradaki calisanList static cünkü proje calismaya basladiği anda oluşması lazım. Bunu bir veritabani
    // gibi görebiliriz. Calisanlarimizin hepsi bu liste icerisinde yer alacak.
    private static ArrayList<Calisan> calisanList = new ArrayList<>();

    // Calisanlari almak icin basit bir getter method
    public static ArrayList<Calisan> getCalisanList() {
        return calisanList;
    }

    // Bir çalışan eklemek için gerekli method.
    public static void addACalisan(Calisan calisan) {
        calisanList.add(calisan);
    }


    // Bir çalışan silmek için gerekli method.
    public static void deleteACalisanWithId(String calisanId) {
        for (int i = 0; i <calisanList.size() ; i++) {
            if (calisanList.get(i).getCalisanId().equalsIgnoreCase(calisanId)){
                calisanList.remove(i);
            }
        }
    }

    // Departman kodu verilerek, konsola sadece o departmanda calisanlari yazdirmak için
    public static void printDepartmandakiCalisanlar(String departmanKodu) {
        for (Calisan calisan : getCalisanList()) { // getCalisanList() yerine calisanList yazılabilirdi
            if (calisan.getDepartman().getDepartmanKodu().equalsIgnoreCase(departmanKodu)) {
                System.out.println(calisan);
            }
        }
    }

        // Calisanlari konsola yazdirmak için
        public static void printCalisanlar () {
            for (Calisan calisan : calisanList) { // calisanList yerine getCalisanList() yazılabilirdi
                System.out.println(calisan);
            }
        }

    }
