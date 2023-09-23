package _5_dependency_injection;

public class Sözlük {
	
	private String dil;
	
	public Sözlük(String dil) {
		// TODO Auto-generated constructor stub
		this.dil = dil;
	}
	
	public static Boolean isValid()
	{
		return true;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return dil;
	}

}
