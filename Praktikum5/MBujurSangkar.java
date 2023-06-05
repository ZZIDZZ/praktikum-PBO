// MBujurSangkar.java 4/3/2023
// Penulis  : Zidan Rafindra Utomo
// NIM      : 24060121130051
// Deskripsi: implementasi luas bujur sangkar
 import java.util.Scanner;
 
 class MBujurSangkar{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		BujurSangkar bs = new BujurSangkar();
		System.out.print("Masukkan sisi bujur sangkar : ");
		double sisi = scan.nextDouble();
		System.out.println("Bujur sangkar dengan sisi "+sisi+
					" luasnya: "+bs.hitungLuas(sisi));
	}
 }
 
 
 