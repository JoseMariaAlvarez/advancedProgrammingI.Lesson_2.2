package friendsWithInterfaces;
public class YoungerThan implements Predicate {

	private int n;

	public YoungerThan(int n) {
		this.n = n;
	}

	public boolean test(Person p) {
		return p.age() <= n;
	}

}