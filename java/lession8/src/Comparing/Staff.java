package Comparing;

public class Staff<K, V> extends MyMap<K, V> {
	private K id;
	private V name;

	public Staff(K key, V values) {
		super(key, values);
	}

	public K getId() {
		return id;
	}

	public void setId(K id) {
		this.id = id;
	}

	public V getName() {
		return name;
	}

	public void setName(V name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Staff [id=" + id + ", name=" + name + "]";
	}

}
