package _3_singleton_design_patterns;

import java.util.HashMap;
import java.util.Map;

public enum CacheSingleton implements Cache{
	INSTANCE;

	private Map<Object, Object> map = new HashMap<Object, Object>();
	
	 public void put(Object key, Object value) 
	 {
		 map.put(key, value);
	 }

	 public Object get(Object key) 
	 {
		 return map.get(key);
	 }
	
	 public void testFunction()
	 {
		 System.out.println("Test function of CacheSingleton was called.");
	 }
}
