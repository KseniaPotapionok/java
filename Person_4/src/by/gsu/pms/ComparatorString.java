package by.gsu.pms;

import java.util.Comparator;

public class ComparatorString implements Comparator<Person> {

	public ComparatorString() {
		super();
	}

	public int compare(Person arg0, Person arg1) {

		return  arg0.getSurname().compareTo(arg1.getSurname()) ;
	}
}
