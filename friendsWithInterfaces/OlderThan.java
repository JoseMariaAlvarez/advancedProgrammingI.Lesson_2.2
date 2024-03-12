package friendsWithInterfaces;
public class OlderThan implements Predicate {

	private int n;

	public OlderThan(int n) {
		this.n = n;
	}

	public boolean test(Person p) {
		return p.age() >= n;
	}

}