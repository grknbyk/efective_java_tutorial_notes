package _71_serialization_readObject_instanceControl_readResolve_enumTypes;

import java.util.*;

//Enum singleton - the preferred approach - Page 311
public enum ElvisE {
	INSTANCE;

	private String[] favoriteSongs = { "Hound Dog", "Heartbreak Hotel" };

	public void printFavorites() {
		System.out.println(Arrays.toString(favoriteSongs));
	}
	
}
