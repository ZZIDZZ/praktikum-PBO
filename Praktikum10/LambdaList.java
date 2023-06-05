import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args){
        ArrayList<String> mahasiswaList = new ArrayList<String>();

        // memasukkan elemen ke dalam ArrayList
        mahasiswaList.add("John Doe");
        mahasiswaList.add("John Mackzine");
        mahasiswaList.add("Jono");

        // lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> {
            System.out.println(nama);
        });

    }
}
