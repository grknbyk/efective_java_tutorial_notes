package _10_shallow_copy_and_deep_copy;


public class Test {
	
	public static void main(String[] args) {
		
		
		// Shallow Copy
		// copy the reference
		// so the both object will point the same memory address
		// if you change one of them, the other one will be changed too
		Stack st = new Stack();
		Stack st1 = st;
		
		System.out.println(st == st1);
		
	
		// Deep Copy
		// copy the value
		// so the both object will point the different memory address
		// if you change one of them, the other one will not be changed
		Stack stc = new Stack();
		stc.stackName = "furkan";
		
		Stack stc2 = new Stack();
		stc2.stackName = stc.stackName;

		// if we want to use deep copy, we need to implement Cloneable interface
		// and override clone method
		// checkout the Stack.java main method
		
	
	}

}
