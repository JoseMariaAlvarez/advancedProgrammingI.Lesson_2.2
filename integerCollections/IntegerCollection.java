package integerCollections;

public abstract class IntegerCollection {
	protected int numElems = 0;
	
	abstract public void insert(int pos, int elem);
	abstract public void remove(int pos);
	abstract public int maximum();
	abstract public boolean contains(int elem);
	public boolean isEmpty() {return numElems == 0;}
	public int size() {return numElems;}
}