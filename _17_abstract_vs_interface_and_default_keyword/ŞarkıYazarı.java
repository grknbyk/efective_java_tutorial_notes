package _17_abstract_vs_interface_and_default_keyword;

public interface ŞarkıYazarı {
	
	public void şarkıYaz();
	
	default boolean şiirYazabiliyormusun()
	{
		
		return true;
	}

}
