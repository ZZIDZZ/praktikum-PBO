// Titik.java
// Penulis  : Zidan Rafindra Utomo
// NIM      : 24060121130051
// Deskripsi: Kelas segitiga inherited from poligon

package org.bangundatar;
import org.poligon.Poligon;

public class Segitiga extends Poligon{
	private double a, t;
	public Segitiga(double a, double t){
		this.a = a;
		this.t = t;
		this.jumlahSisi = 3;
	}
	public double hitungLuas(){
		return (a * t)/2;
	}
	public void printInfo(){
		System.out.println("Sisi segitiga: "+this.getJumlahSisi() + "\ndengan luas: " + this.hitungLuas());
	}
}
