package integerCollections;

public class StaticIntegerCollection  
extends IntegerCollection {

	int[] sequence;

	public StaticIntegerCollection(int size) {
		sequence = new int[size];
	}

	public void insert(int p, int e) {}
	public void remove(int p) {}
	public int maximum() {return 0;}
	public boolean contains(int e) {return false;}
	public String toString() {return null;}
}
