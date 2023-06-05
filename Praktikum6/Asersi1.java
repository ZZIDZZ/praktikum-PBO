// Asersi1.java 4/3/2023
// Penulis  : Zidan Rafindra Utomo
// NIM      : 24060121130051
// Deskripsi: Program untuk menunjukkan asersi

import java.util.Scanner;
public class Asersi1{
 public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
  System.out.print("Masukkan nilai x: ");
  int x = scan.nextInt();
  if(x>0){
    System.out.println("x bilangan positif");
  }else{
    assert(x<0):"ada kesalahan kode";
	System.out.println("x bilangan negatif");
  }
 }
}