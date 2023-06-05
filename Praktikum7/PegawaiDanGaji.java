// Nama file: PegawaiDanGaji.java
// Penulis  : Zidan Rafindra Utomo
// NIM      : 24060121130051
// Deskripsi: Kelas PegawaiDanGaji yang berisi kelas Pegawai, Manajer, Programmer, dan Payroll serta main method
class Pegawai {
    private String nama;
	private int gajiPokok = 5000000;
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public void tampilData() {
		System.out.printf("Nama : %s, Gaji Pokok : %d \n",
				this.nama,this.gajiPokok);
	}
}

class Manajer extends Pegawai {
    private int tunjangan = 700000;
	
	public Manajer(String nama) {
		this.setNama(nama);
	}
	
	public void tampilData() {
		super.tampilData();
		System.out.printf("Tunjangan : %d \n", this.tunjangan);
	}
}

class Programmer extends Pegawai {
    private int bonus = 450000;
	
	public Programmer(String nama) {
		this.setNama(nama);
	}
	
	public void tampilData() {
		super.tampilData();
		System.out.printf("Bonus : %d \n", this.bonus);
	}
}

class Payroll {
    public void cetakGaji(Pegawai pegawai){
        pegawai.tampilData();
    }
}

public class PegawaiDanGaji{
    public static void main(String[] args){
        Pegawai pegawai = new Programmer("John Doe");
		Pegawai pegawai2 = new Manajer("Richard Roe");
		Pegawai pegawai3 = new Manajer("Lug");
		
		Payroll payroll = new Payroll();
		payroll.cetakGaji(pegawai);
		payroll.cetakGaji(pegawai2);
		payroll.cetakGaji(pegawai3);
    }
}