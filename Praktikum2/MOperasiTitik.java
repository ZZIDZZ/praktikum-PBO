// MOperasiTitik.java
// Penulis  : Zidan Rafindra Utomo
// NIM      : 24060121130051
// Deskripsi: Main class operasi titik

class MOperasiTitik{
	public static void main(String[] args){
		Titik t;
		OperasiTitik operasiTitik;
		t = new Titik(10.1,2);
		operasiTitik = new OperasiTitik();
		
		System.out.println("Titik \nx: "+t.getAbsis()+"\ny: "+t.getOrdinat());
		operasiTitik.refleksiX(t);
		System.out.println("Titik setelah refleksi sumbu X \nx: "+t.getAbsis()+"\ny: "+t.getOrdinat());
		operasiTitik.refleksiY(t);
		System.out.println("Titik setelah refleksi sumbu Y \nx: "+t.getAbsis()+"\ny: "+t.getOrdinat());
	}
}