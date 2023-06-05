// Nama file: MapTest.java
// Penulis  : Zidan Rafindra Utomo
// NIM      : 24060121130051
// Deskripsi: Kelas MapTest

import java.util.*;

public class MapTest
{
	public static void main(String[] args)
	{
		// membuat objek map
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		// memasukkan elemen ke dalam map
		map.put(1, "Satu");
		map.put(2, "Dua");
		
		// mengambil elemen berdasarkan kunci
		System.out.println(map.get(1));
		
		// menghapus elemen berdasarkan kunci
		Set<Integer> key = map.keySet();
	}
}