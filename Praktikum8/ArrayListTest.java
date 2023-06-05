// Nama file: ArrayListTest.java
// Penulis  : Zidan Rafindra Utomo
// NIM      : 24060121130051
// Deskripsi: Kelas ArrayListTest sebagai main class untuk menguji ArrayList

import java.util.ArrayList;

public class ArrayListTest
{
	public static void main(String[] args)
	{
		// membuat objek ArrayList
		ArrayList<String> strings = new ArrayList<String>();
		
		// memasukkan elemen ke dalam ArrayList
		strings.add("Praktikum");
		strings.add("Collection");
		strings.add("dan Generics");
		
		// menghapus elemen dari ArrayList
		strings.remove("Praktikum");
		
		// mengubah elemen dalam ArrayList
		for(String s: strings)
		{
			System.out.print(s + " ");
		}
	}
}