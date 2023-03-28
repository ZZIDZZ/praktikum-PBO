// MainTitik.java
// Penulis  : Zidan Rafindra Utomo
// NIM      : 24060121130051
// Deskripsi: Main Kelas Titik 
class MainTitik{
	public static void main (String[] args){
		Titik T;
		T = new Titik(10.1, 2);
		System.out.println("x: ");
		System.out.println(T.getAbsis());
		System.out.println("y: ");
		System.out.println(T.getOrdinat());
	}
}