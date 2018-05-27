import java.util.Arrays;
import java.util.Scanner;

import by.gsu.pms.ComparatorInt;
import by.gsu.pms.ComparatorString;
import by.gsu.pms.Person;
import by.gsu.pms.Serelizator;

public class Runner {

	public static void main(String[] args) throws Exception {
		int num;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		num = input.nextInt();
		Person persones[] = new Person[num];
		for(int i=0; i<num;i++) {
			System.out.println("Enter the surname: ");
			String surname = input.next();
			System.out.println("Enter the age: ");
			int age = input.nextInt();
			System.out.println("Enter the sex: ");
			String sex = input.next();
			persones[i] = new Person(surname, age, sex);
		}


		input.close();
		
		Serelizator.serialize(persones);
		persones = Serelizator.deSerialize();
				
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

		for (Person person : persones) {
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
