package _3_singleton_design_patterns;

public class DefineSingleton {
	
	public static DefineSingleton ds = new DefineSingleton();
	
	private DefineSingleton() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static DefineSingleton getInstance()
	{
		return ds;
	}
	
	

}
