// Titik.java
// Penulis  : Zidan Rafindra Utomo
// NIM      : 24060121130051
// Deskripsi: Kelas persegi panjang inherited from poligon

package org.bangundatar;
import org.poligon.Poligon;

public class BujurSangkar extends Poligon{
	private double s;
	public BujurSangkar(double s){
		this.s = s;
	}
	public double hitungLuas(){
		return (s*s);
	}
	public double getPanjangSisi(){
		return this.s;
	}
	public void printInfo(){
		System.out.println("Luas: " + this.hitungLuas());
	}
}
