// Nama file: Car.java
// Penulis  : Zidan Rafindra Utomo
// NIM      : 24060121130051
// Deskripsi: Kelas Car
public class Car extends Vehicle {
    void callRent(int distance, float price){
        float fare = distance*price;
        fare = fare - 100.00f;
        System.out.println("Total cost: " + fare);
    }
}
