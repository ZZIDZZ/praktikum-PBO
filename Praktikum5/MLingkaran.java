// MLingkaran.java 4/3/2023
// Penulis  : Zidan Rafindra Utomo
// NIM      : 24060121130051
// Deskripsi: implementasi luas lingkaran
import java.util.Scanner;

 public class MLingkaran{
	public static void main(String[] args){
		Scanner scanJariJari = new Scanner(System.in);
		System.out.print("Masukkan jari-jari lingkaran : ");
		double jariJari = scanJariJari.nextDouble();
		Lingkaran l = new Lingkaran(jariJari);
		System.out.println("Luas lingkaran dengan "+ "jari-jari " + jariJari + " luasnya: "+l.hitungLuas());
	}
 }
  