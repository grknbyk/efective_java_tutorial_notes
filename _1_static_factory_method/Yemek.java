package _1_static_factory_method;


public class Yemek {
	
	String name;

	

	public static Yemek soğukYemek(String name)
	{
		// Soğuk yemek
		return new Dondurma();
	}
	
	public static Yemek sıcakYemek(String name)
	{
		return new Pide();
	}

}
