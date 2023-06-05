// AngkaSialException.java 4/3/2023
// Penulis  : Zidan Rafindra Utomo
// NIM      : 24060121130051
// Deskripsi: Eksepsi menolak angka 13

public class AngkaSialException extends Exception{
	public AngkaSialException(){
		super("jangan memasukkan angka 13 karena angka sial !!!");
	}
 }