import java.util.*;

public class LambdaListTugas {
    public static void main(String[] args){
        // inisiasi objek hashmap bernama mahasiswaMap
        Map<String, String> mahasiswaMap = new HashMap<String, String>();

        // memasukkan elemen ke dalam mahasiswaMap dengan key NIM dan value Nama
        mahasiswaMap.put("24060121130051", "Zidan Rafindra Utomo");
        mahasiswaMap.put("24060121130052", "John Mackzine");
        mahasiswaMap.put("24060121130053", "Jono");

        // lambda untuk menampilkan mahasiswaMap
        mahasiswaMap.forEach((nim, nama) -> {
            System.out.println(nim + " : " + nama);
        });
    }
}
