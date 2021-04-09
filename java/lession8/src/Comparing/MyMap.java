package Comparing;

public class MyMap<K, V> {
	private K key;
	private V values;

	public MyMap(K key, V values) {
		super();
		this.key = key;
		this.values = values;
	}


	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValues() {
		return values;
	}

	public void setValues(V values) {
		this.values = values;
	}

}
