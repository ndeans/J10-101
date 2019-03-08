package operations;

import java.util.HashMap;

/**
 * CRUD Map : Demonstration of HashMaps
 * @author ndeans
 *
 */
public class CrudMap<K,V> {

	HashMap<K, V> map = new HashMap<K, V>();
	HashMap<K, V> exp = new HashMap<K, V>();
	
	public void start() {
		map = null;
		exp = null;
	}
	
	public void put(K key, V value, long duration) {
		
		long ctime = System.currentTimeMillis();
		long etime = ctime + duration;
		
		map.put(key, value);
		exp.put(key, etime);
		
		
	}
	
	public V get(K key) {
		
		String timer = exp.get(key);
		
		if (System.currentTimeMillis() < timer) {
			return map.get(key);
		}
		else {
			return null;
		}
		
	}
	
	
}
