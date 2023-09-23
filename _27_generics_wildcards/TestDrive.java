package _27_generics_wildcards;

import java.util.ArrayList;
import java.util.List;

public class TestDrive {

	public static void main(String[] args) {

		// PECS
		// Producer extend - Consumer super

		// classes:
		// class A, // class B extends A, // class C extends B
		// produce - extend >> this way, from upper class to lower class
		// consume - super << this way, from lower class to upper class

		// if we dont use wildcards, we can use only one type
		// List<Object> obje1 = new ArrayList<String>(); // compile error
		// but with wildcards, we can use more than one type
		// List<? extends Object> obje1 = new ArrayList<String>(); // no compile error
		// comment out and try both of them

		// producer - extends : we can use upper class and its subclasses
		List<? extends A> list;
		list = new ArrayList<A>();
		list = new ArrayList<B>();
		list = new ArrayList<C>();
		list = new ArrayList<D>();

		// consumer - super : we can use lower class and its superclasses
		List<? super B> list2;
		list2 = new ArrayList<A>();
		list2 = new ArrayList<B>();
		// list2 = new ArrayList<C>(); compile error
		// because C is not superclass of B

	}

}
