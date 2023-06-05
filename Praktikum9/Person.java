// Nama file: Person.java
// Penulis  : Zidan Rafindra Utomo
// NIM      : 24060121130051
// Deskripsi: Kelas Person

public class Person {
    // deklarasi atribut
    private int Id;
    private String nama;
    
    // constructor
    public Person(int Id, String nama){
        this.Id = Id;
        this.nama = nama;
    }
    //overloading constructor
    public Person(String nama){
        this.nama = nama;
    }

    // getter
    public int getId(){
        return this.Id;
    }

    public String getNama(){
        return this.nama;
    }

    // setter
    public void setId(int Id){
        this.Id = Id;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
}
