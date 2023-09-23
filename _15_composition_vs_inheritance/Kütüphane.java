package _15_composition_vs_inheritance;

import java.util.List;

public class Kütüphane {

	private final List<Kitap> kitaplar;

	public Kütüphane(List<Kitap> kitaplar) {
		// TODO Auto-generated constructor stub
		this.kitaplar = kitaplar;
	}

	public List<Kitap> kütüphanedekiTümKitaplar() {
		return kitaplar;
	}

}
