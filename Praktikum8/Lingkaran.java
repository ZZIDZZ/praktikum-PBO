// Nama file: Lingkaran.java
// Penulis  : Zidan Rafindra Utomo
// NIM      : 24060121130051
// Deskripsi: Kelas Lingkaran

public class Lingkaran extends BangunDatar
{
	private double jejari;
	
	public Lingkaran(double jejari)
	{
		this.jejari = jejari;
	}
	
	public double hitungKeliling()
	{
		return 2 * jejari * 3.14;
	}
}