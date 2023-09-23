package _71_serialization_readObject_instanceControl_readResolve_enumTypes;

import java.io.Serializable;
import java.util.Arrays;

public class Elvis implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final Elvis INSTANCE = new Elvis();

	private Elvis() {
	}

	private String[] favoriteSongs = { "Hound Dog", "Heartbreak Hotel" };

	public void printFavorites() {
		System.out.println(Arrays.toString(favoriteSongs));
	}

	private Object readResolve() {
		return INSTANCE;
	}
	
}
