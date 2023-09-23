package _53_minimize_local_variable_scope;

public class TestDrive {
	
	public static void main(String[] args) {
		
		// dont do this **********

//		Iterator<Element> i = c.iterator();
//		while(i.hasNext()) {
//		  doSomething(i.next());
//		}
//
//		Iterator<Element> i2 = c2.iterator();
//		while(i.hasNext()) {
//		  doSomethingElse(i2.next());
//		}

		
		// do this **********
		
//		for (Iterator<Element> i = c.iterator; i.hasNext();) {
//			Element e = i.next();
//			// Do something with e and i
//		}
//
//		for (Iterator<Element> i2 = c2.iterator(); i2.hasNext();) {
//			Element e2 = i2.next();
//			// Do something with e2 and i2
//		}
		
	}

}
