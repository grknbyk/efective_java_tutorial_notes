package _5_dependency_injection;

public class YazıAnaliziSingleton {
	
	private final static Sözlük sözlük = new Sözlük("İngilizce");
	public static YazıAnaliziSingleton INSTANCE = new YazıAnaliziSingleton();
	
	private YazıAnaliziSingleton() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean isValid()
	{
		return true;
	}

}
