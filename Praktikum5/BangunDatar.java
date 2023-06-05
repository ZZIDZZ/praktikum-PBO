// BangunDatar.java 4/3/2023
// Penulis  : Zidan Rafindra Utomo
// NIM      : 24060121130051
// Deskripsi: kelas abstrak, berisi abstraksi bangun datar
 
 public abstract class BangunDatar{
	protected double luas;
	
	public abstract double hitungLuas(double sisi);
	
	public void setLuas(double l){
		luas = l;
	}
	
	public double getLuas(){
		return luas;
	}
 } 
 
 
 
 