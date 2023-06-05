// Nama file: MySQLPersonDAO.java
// Penulis  : Zidan Rafindra Utomo
// NIM      : 24060121130051
// Deskripsi: Kelas MySQLPersonDAO untuk menyimpan data person ke database MySQL
import java.sql.*;

public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception {
        // mengambil atribut nama dari objek person
        String nama = person.getNama();
        // membuat koneksi, nama dan password disesuaikan
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pbo", "root", "ganteng2020");
        //  kerjakan query
        String query = "INSERT INTO person (nama) VALUES ('" + nama + "')";
        // tampilkan query
        System.out.println(query);
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(query);
        // tampilkan hasil query apabila berhasil
        System.out.println("Berhasil menyimpan person dengan nama: " + nama);
        // tutup koneksi
        conn.close();


    }
}
