package friendsWithoutInterfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Person [] people = {
				new Person("John", 25), new Person("Mary", 32),
				new Person("Martha", 28), new Person("Jules", 33),
				new Person("William", 29), new Person("Justin",25) };

		Friends friends = new Friends(new ArrayList<Person>(List.of(people)));

		ArrayList<Person> ps1 = friends.beginsWith("Ma");
		System.out.println("Begins with Ma: " + ps1);
		
		ArrayList<Person> ps2 = friends.olderThan(28);
		System.out.println("Older than 28: " + ps2);

		ArrayList<Person> ps3 = friends.youngerThan(27);
		System.out.println("Younger than 27: " + ps3);
		
	}
}
