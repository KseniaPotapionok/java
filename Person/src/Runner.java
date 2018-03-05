
import java.util.Arrays;

import by.gsu.pms.ComparatorInt;
import by.gsu.pms.ComparatorString;
import by.gsu.pms.Person;

public class Runner {

	public static void main(String[] args) {

		final Person[] persones = new Person[10];

		persones[0] = new Person("Potapionok", 20, "girl");
		persones[1] = new Person("Korotkevich", 23, "boy");
		persones[2] = new Person("Gladchenko", 19, "girl");
		persones[3] = new Person("Artemenko", 20, "boy");
		persones[4] = new Person("Afonina", 19, "girl");
		persones[5] = new Person("Karaban", 21, "boy");
		persones[6] = new Person("Petrova", 19, "girl");
		persones[7] = new Person("Kuchin", 25, "boy");
		persones[8] = new Person("Voitova", 19, "girl");
		persones[9] = new Person("Gorodniy", 30, "boy");

		for (int i = 0; i < persones.length; i++) {
			System.out.println(persones[i]);
		}

		System.out.println("=================================");

		Arrays.sort(persones, new ComparatorInt());
		for (int i = 0; i < persones.length; i++) {
			System.out.println(persones[i]);
		}

		System.out.println("=================================");
		
		Arrays.sort(persones, new ComparatorString());
		for (int i = 0; i < persones.length; i++) {
			System.out.println(persones[i]);
		}

		System.out.println("=================================");

		int man = 0;

		for (final Person person : persones) {
			if (person.getSex() == "boy") {
				++man;
			}
		}

		System.out.println("Number of men = " + man);
		System.out.println("=================================");

		int summAges = 0;
		for (final Person person : persones) {
			summAges += person.getAge();

		}
		System.out.println("Mean ages it all persons = " + summAges / persones.length + "years");
	}

}
