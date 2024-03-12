package friendsWithInterfaces;
public class BeginsWith implements Predicate {

	private String s;

	public BeginsWith(String s) {
		this.s = s;
	}

	public boolean test(Person p) {
		return p.name().startsWith(s);
	}

}