package by.gsu.pms;

import java.util. *;
public class ComparatorInt implements Comparator <Person> {
 
	public ComparatorInt(){
		super();
	}
	
	public int compare(Person arg0, Person arg1){
		
		return (int)(arg0.getAge() - arg1.getAge());
	}
}
