package _22_raw_types;

import java.util.ArrayList;
import java.util.List;

public class TestDrive {
	
	public static void main(String[] args) {
		
		List<String> isimListesi = new ArrayList<>();
		isimListesi.add("Furkan");
		isimListesi.add("James");
		
		
		String isimAl = isimListesi.get(1);
		
		System.out.println(isimAl);
	}

}
