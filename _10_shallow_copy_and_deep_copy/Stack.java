package _10_shallow_copy_and_deep_copy;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack implements Cloneable {
	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	public String stackName;

	public String getStackName() {
		return stackName;
	}

	public void setStackName(String stackName) {
		this.stackName = stackName;
	}

	public Stack() {
		this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
	}

	public void push(Object e) {
		ensureCapacity();
		elements[size++] = e;
	}

	public Object pop() {
		if (size == 0)
			throw new EmptyStackException();
		Object result = elements[--size];
		elements[size] = null; // Eliminate obsolete reference
		return result;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	// Ensure space for at least one more element.
	private void ensureCapacity() {
		if (elements.length == size)
			elements = Arrays.copyOf(elements, 2 * size + 1);
	}

	// Overriding clone method for deep copy ////
	// @Override
	// public Stack clone() {
	// try {
	// Stack result = (Stack) super.clone();
	// result.elements = elements.clone();
	// return result;
	// } catch (CloneNotSupportedException e) {
	// throw new AssertionError();
	// }
	// }



	// To see the difference between shallow copy and deep copy
	// try to comment out the clone method and run the main method
	// then try to uncomment the clone method and run the main method
	public static void main(String[] args) throws CloneNotSupportedException {

		Stack stack = new Stack();

		String[] numaralar = { "1", "2", "3", "4" };
		for (String arg : numaralar)
			stack.push(arg);

		Stack copy = (Stack) stack.clone();

		while (!stack.isEmpty())
			System.out.print(stack.pop() + " ");

		System.out.println();

		while (!copy.isEmpty())
			System.out.print(copy.pop() + " ");
	}
}