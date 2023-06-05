// Nama file: BangunDatarGenericTest.java
// Penulis  : Zidan Rafindra Utomo
// NIM      : 24060121130051
// Deskripsi: Kelas BangunDatarGenericTest untuk menguji kelas BangunDatarGeneric

public class BangunDatarGenericTest
{
	public static void main(String[] args)
	{
		// instansiasi object
		Lingkaran l = new Lingkaran(2);
		BangunDatarGeneric <Lingkaran> bdg = new BangunDatarGeneric <Lingkaran>();
		
		// memanggil method
		bdg.set(l);

		// menampilkan output
		System.out.println("Keliling Lingkaran: " + bdg.hitungKeliling());
		System.out.println("Tipe Generic: " + bdg.get().getClass().getName());
	}
}