package _16_inheritance_things_to_pay_attention;

//Class whose constructor invokes an overridable method. NEVER DO THIS! (Page 95)
public class Super {
	// Broken - constructor invokes an overridable method
	public Super() {
		overrideMe();
	}

	
	public void overrideMe() {
	
	}

}