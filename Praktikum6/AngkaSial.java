// AngkaSial.java 4/3/2023
// Penulis  : Zidan Rafindra Utomo
// NIM      : 24060121130051
// Deskripsi: Program penggunaan exception pengenalan  klausa 'throw' dan 'throws'

import java.util.Scanner;
public class AngkaSial{
	
	public void cobaAngka(int angka) throws AngkaSialException{
		if(angka==13) {
			throw new AngkaSialException();
		}
		System.out.println(angka+" bukan angka sial"); // jika eksepsi terjadi line kode ini tdk dieksekusi
	}
	
	public static void main(String[] args){
		AngkaSial as = new AngkaSial();
		try{
			Scanner scan = new Scanner(System.in);
			System.out.println("Masukkan nilai angka (jangan input angka 13): ");
			int angka = scan.nextInt();
			as.cobaAngka(angka);
			System.out.println("Masukkan nilai angka (jangan input angka 13): ");
			angka = scan.nextInt();
			as.cobaAngka(angka);
			System.out.println("Masukkan nilai angka (jangan input angka 13): ");
			angka = scan.nextInt();
			as.cobaAngka(angka);
			as.cobaAngka(13);
			as.cobaAngka(12);
		}catch(AngkaSialException e){  // jika eksepsi terjadi line kode ini dieksekusi
			//method getMessage() telah ada pada kelas "Exception"
			System.out.println(e.getMessage()); 
			System.out.println("hati-hati memasukkan angka!!!");
		}
	}
 }
