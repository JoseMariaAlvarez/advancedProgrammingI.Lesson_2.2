package integerCollections;

public class DynamicIntegerCollection  
extends IntegerCollection {

	static protected class Node { 
		int datum;
		Node next;

	}

	private Node first;

	public DynamicIntegerCollection() {}

	public void insert(int p, int e) {}
	public void remove(int p) {}
	public int maximum() {return 0;}
	public boolean contains(int e) {return false;}
	public String toString() {return null;}
	public void add(IntegerCollection sec){}
}