package org.bangunruang;
import org.bangundatar.BujurSangkar;

public class Kubus{
	private BujurSangkar sisi;
	public Kubus(BujurSangkar sisi){
		this.sisi = sisi;
	}
	public double hitungVolume(){
		double panjangSisi = sisi.getPanjangSisi();
		return panjangSisi * panjangSisi * panjangSisi;
	}
	public double hitungLuasAlas(){
		double panjangSisi = sisi.getPanjangSisi();
		return panjangSisi * panjangSisi;
	}
}
