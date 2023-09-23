package _23_unchecked_warnings_suppresswarnings;

import java.util.Arrays;

public class TestDrive {

	static int size = 0;
	static Object[] elements;

	public static void main(String[] args) {

	}

	public <T> T[] toArray1(T[] a){
		if (a.length < size) {
			// This cast is correct but it warns unnecessarily!
			T[] result = (T[]) Arrays.copyOf(elements, size, a.getClass());
			return result;
		
		} else {
				a[size] = null;
			return a;
		}
	}

	// if we sure that warning is unnecessary, we can suppress it
	// with @SuppressWarnings("unchecked") annotation
	// it is better to give a comment to explain why we suppress it
	public <T> T[] toArray2(T[] a) {
		if (a.length < size) {
			// This cast is correct because the array we're creating
			// is of the same type as the one passed in, which is T[].
			@SuppressWarnings("unchecked")
			T[] result = (T[]) Arrays.copyOf(elements, size, a.getClass());
			return result;
		} else {
			a[size] = null;
			return a;
		}
	}

}
