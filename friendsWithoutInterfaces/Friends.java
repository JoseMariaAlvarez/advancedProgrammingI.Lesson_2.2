package friendsWithoutInterfaces;
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

	public ArrayList<Person> olderThan(int n) {
		ArrayList<Person> friendsOlderThan = new ArrayList<>();
		for(Person p : people) {
			if (p.age() >= n) {
				friendsOlderThan.add(p);
			}
		}
		return friendsOlderThan;
	}

	public ArrayList<Person> youngerThan(int n) {
		ArrayList<Person> friendsYoungerThan = new ArrayList<>();
		for(Person p : people) {
			if (p.age() <= n) {
				friendsYoungerThan.add(p);
			}
		}
		return friendsYoungerThan;
	}

	public ArrayList<Person> beginsWith(String s) {
		ArrayList<Person> beginsWithPeople = new ArrayList<>();
		for(Person p : people) {
			if (p.name().startsWith(s)) {
				beginsWithPeople.add(p);
			}
		}
		return beginsWithPeople;
	}


	public ArrayList<Person> contains(String s) {
		ArrayList<Person> friendsThatContains = new ArrayList<>();
		for(Person p : people) {
			if (p.name().contains(s)) {
				friendsThatContains.add(p);
			}
		}
		return friendsThatContains;
	}
}
