package _18_contant_class_and_usage_of_interface;


public class TestDrive {
	
	// java.io.ObjectStreamConstants
	
	public static void main(String[] args) {
		
		DenemeSınıf ds = new DenemeSınıf();
		
		// burda UcmaYetisi uy için sadece bu interface implemente eden sınıfların referanslarını tutabiliriz.
		// örnek
		UcmaYetisi uy2 = new Güvercin();
		UcmaYetisi uy = new Papağan();
		uy.ucuyorum();

		// fakat tavuk uçamaz. bu yüzden uy3 referansı ile tavuk sınıfının referansını tutamayız.
		//UcmaYetisi uy3 = new Tavuk();
		
		Kus ks = new Kus();
		ks.cikSesi();
		
	
	}
	
	
}
