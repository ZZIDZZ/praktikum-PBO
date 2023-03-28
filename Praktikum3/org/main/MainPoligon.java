// Titik.java
// Penulis  : Zidan Rafindra Utomo
// NIM      : 24060121130051
// Deskripsi: Main kelas poligon persegi panjang dan segitiga

package org.main;
import org.bangundatar.*;;

public class MainPoligon {
    public static void main(String[] args){
		BujurSangkar persegi = new BujurSangkar(10.1);
		Segitiga segitiga = new Segitiga(2, 4.5);
		persegi.printInfo();
		segitiga.printInfo();
	}
}
