package org.main;
import org.bangunruang.Kubus;
import org.bangundatar.BujurSangkar;


public class MainKubus {
    public static void main(String[] args){
        BujurSangkar bs = new BujurSangkar(10.1);
		Kubus kubus = new Kubus(bs);
        System.out.println("Volume: " + kubus.hitungVolume() + "\nLuas alas: " + kubus.hitungLuasAlas());
	}
}
