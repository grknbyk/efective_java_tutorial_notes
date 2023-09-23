package _13_encapsulation;

public class Test {
	
	public static void main(String[] args) {
		
		Futbol fb = new Futbol("FenerBahce", 35);
		
		fb.setTakımOyuncuSayısı(-35);
		
		
		Time t = new Time(10, 11);
		
		
		
	}
	
	
	
}

/*
Yararları:
 * 	// 1-> Doğrudan erişilebilirliği kes
	// 2-> verilerimde kontrol sağlıyorum.
	// 3-> Read only
	// 4-> write only
	
	// 5-> Data hiding..
 */
