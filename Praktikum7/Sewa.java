// Nama file: Sewa.java
// Penulis  : Zidan Rafindra Utomo
// NIM      : 24060121130051
// Deskripsi: Kelas Sewa sebagai main class untuk menguji kelas Vehicle, Car, dan Bus
public class Sewa {
    // main class

    public static void main(String[] args){
        // instansiasi object
        Vehicle vehicle = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();
        // memanggil method
        vehicle.callRent(10, 10000.00f);
        mobil.callRent(10, 10000.00f);
        bis.callRent(10, 10000.00f);
    }
}
