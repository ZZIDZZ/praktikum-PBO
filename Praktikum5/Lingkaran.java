// Lingkaran.java 4/3/2023
// Penulis  : Zidan Rafindra Utomo
// NIM      : 24060121130051
// Deskripsi: kelas implementasi IArea berupa luas lingkaran

//mengambil konstanta yang ada di kelas java.lang.Math
 import static java.lang.Math.PI;
 
class Lingkaran implements IArea{
	private double jariJari;
	
	public Lingkaran(double r){
		jariJari = r;
	}
	
	public double hitungLuas(){
		return PI*jariJari*jariJari;
	}
}
 
 