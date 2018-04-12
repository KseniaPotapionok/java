
import java.util.Scanner;

import by.gsu.pms.Person;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Runner {

	public static void main(String[] args) throws Exception {
		
		//создание цепи потоков с потоком вывода объекта в конце
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the surname: ");
		String surname = scan.next();
		System.out.println("Enter the age: ");
		int age = scan.nextInt();
		System.out.println("Enter the sex: ");
		String sex = scan.next();
		scan.close();
		
		Person persones = new Person(surname, age, sex);
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Persone.txt"));
		out.writeObject(persones);
		out.flush();
		out.close();
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("Persone.txt"));
		Person per = (Person)in.readObject();
		System.out.println(per.toString());
		in.close();
		
		/*final Person[] persones = new Person[10];

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

*/
		
		
//		
//		for (int i = 0; i < persones.length; i++) {
//			System.out.println(persones[i]);
//		}
//
//		System.out.println("=================================");
//
//		Arrays.sort(persones, new ComparatorInt());
//		for (int i = 0; i < persones.length; i++) {
//			System.out.println(persones[i]);
//		}
//
//		System.out.println("=================================");
//		
//		Arrays.sort(persones, new ComparatorString());
//		for (int i = 0; i < persones.length; i++) {
//			System.out.println(persones[i]);
//		}
//
//		System.out.println("=================================");

		/*int man = 0;

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
		System.out.println("Mean ages it all persons = " + summAges / persones.length + "years");*/
	}

}
