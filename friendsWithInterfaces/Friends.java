package friendsWithInterfaces;
import java.util.ArrayList;
import java.util.Arrays;

public class Friends {
	ArrayList<Person> people;
	
	public Friends(ArrayList<Person> people) {
		this.people = people;
	}
	
	public ArrayList<Person> getPeople() {
		return people;
	}
	
	public ArrayList<Person> filter(Predicate pred) {
		ArrayList<Person> friendsFiltered = new ArrayList<>();
		for(Person p : people) {
			if (pred.test(p)) {
				friendsFiltered.add(p);
			}
		}
		return friendsFiltered;
	}
}
