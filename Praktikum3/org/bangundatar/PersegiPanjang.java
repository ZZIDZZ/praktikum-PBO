package org.bangundatar;
import org.poligon.Poligon;

public class PersegiPanjang extends Poligon{
	private double s;
	public PersegiPanjang(double s){
		this.s = s;
		this.jumlahSisi = 4;
	}
	public double hitungLuas(){
		return (s*s);
	}
	public void printInfo(){
		System.out.println("Sisi PersegiPanjang: "+this.getJumlahSisi() + "\ndengan luas: " + this.hitungLuas());
	}
}
