// Nama file: DiskonLambda.java
// Penulis  : Zidan Rafindra Utomo
// NIM      : 24060121130051
// Deskripsi: Mengimplementasikan lambda pada interface IDiskon

interface IDiskon {
    public double hitungDiskon(double harga);
}


public class DiskonLambda {
    public static void main(String[] args){
        // tanpa lambda
        IDiskon diskonMerdeka = new IDiskon(){
            public double hitungDiskon(double harga){
                return harga - harga * 0.3;
            }
        };
        // dengan lambda
        IDiskon diskonHariRaya = (harga) -> harga - (harga * 0.4);
        // dengan lambda dengan blok statement
        IDiskon diskonNatal = (harga) -> {
            double diskon = harga - (harga * 0.1);
            return diskon;
        };
        // memanggil method
        System.out.println("Harga setelah diskon merdeka: " + diskonMerdeka.hitungDiskon(100000.00));
        System.out.println("Harga setelah diskon hari raya: " + diskonHariRaya.hitungDiskon(100000.00));
        System.out.println("Harga setelah diskon natal: " + diskonNatal.hitungDiskon(100000.00));
    }
}
