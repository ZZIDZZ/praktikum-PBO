// OperasiTitik.java
// Penulis  : Zidan Rafindra Utomo
// NIM      : 24060121130051
// Deskripsi: Kelas operasi titik 

class OperasiTitik{
	private double y;
	private double x;

	public OperasiTitik(){
	}
	private Titik refleksiSumbuX(Titik a){
		y=a.getOrdinat();
		y *= (-1);
		a.setOrdinat(y);
		return a;
	}
	private Titik refleksiSumbuY(Titik a){
		x=a.getAbsis();
		x *= (-1);
		a.setAbsis(x);
		return a;
	}
	public Titik refleksiX(Titik titik){
		return refleksiSumbuX(titik);
	}
	public Titik refleksiY(Titik titik){
		return refleksiSumbuY(titik);
	}
}