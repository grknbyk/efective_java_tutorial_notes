package _3_singleton_design_patterns;

public interface Cache <F,S>{

	public void put(F key, S value);
	public S get(F key);
	
}
