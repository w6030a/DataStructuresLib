package map;

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary<K,V> {
	boolean appendable;
	HashMap<K,ArrayList<V>> hashMap = new HashMap<K,ArrayList<V>>();
	
	public Dictionary(boolean appendable) {
		this.appendable = appendable;
	}
	
	public Dictionary<K,V> add(K key, V value) {
		if(!hashMap.containsKey(key))
			hashMap.put(key, new ArrayList<V>());
		
		if(appendable) 
			hashMap.get(key).add(value);
		else
			hashMap.get(key).set(0, value);
			
		return this;
	}
	
	public void remove(K key) {
		hashMap.remove(key);
	}
	
	public boolean remove(K key, V value) {
		if(hashMap.get(key) == null)
			throw new RuntimeException(String.format("Object not found for key: %s", key));
		
		return hashMap.get(key).remove(value);
	}
}
