package Comparing;

import java.security.PublicKey;

public class Phone<K,V>extends MyMap<K, V>{

	public Phone(K key, V values) {
		super(key, values);
		
	}
	public V getPhone() {
		return super.getValues();
	}
}
